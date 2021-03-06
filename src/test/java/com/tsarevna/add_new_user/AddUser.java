/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.add_new_user;

import com.tsarevna.pages.tsarevna_page.user.add_user.AddUserPage;
import com.tsarevna.pages.tsarevna_page.user.user_list.UserListPage;
import com.tsarevna.pages.tsarevna_page.user.user_list.user_table.UserTable;
import com.tsarevna.users.Role;
import com.tsarevna.users.RootUser;
import com.tsarevna.users.TsarevnaUser;
import com.uisteps.thucydides.run.Story;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 *
 * @author silaev
 */
public class AddUser extends Story {

    RootUser user;

    @Given("авторизоваться с правами root")
    public void auth(String role, String root_login, String root_password) {
        user = (RootUser) TsarevnaUser.getBy(Role.get(role), root_login, root_password);
        user.auth();
    }

    @When("добавить пользователя с парамтерами: ФИО <fio>, Псевдоним <nickName>")
    public void добавить_пользователя_с_парамтерами(String fio, String nickName) {
        verify
                .that(user.onDisplayed(UserTable.class).userList.isEmpty())
                .ifResultIsExpected("Пользователь будет добавлен")
                .ifElse("Измените имя пользователя");
        user.addUser(fio, nickName);

        //if (user.onDisplayed(UserTable.class).userList.isEmpty()) {
        //  user.addUser(fio, nickName);
        //} else {
        //user.onDisplayed(AddUserPage.class).containsError(error);
        //}
    }

    @Then("в списке пользователей появился новый пользователь <fio>")
    public void в_списке_пользователей_появился_новый_пользователь(String fio) {
        user.open(UserListPage.class).fillUserFilterForm(fio);

        verify
                .that(!user.onDisplayed(UserTable.class).userList.isEmpty())
                .ifResultIsExpected("Пользователь добавлен")
                .ifElse("Пользователь не добавлен");

    }

    @Then("отобразилась ошибка <error>")
    public void отобразилась_ошибка(String error) {
        verify
                .that(user.onDisplayed(AddUserPage.class).containsError(error))
                .ifResultIsExpected("Отобразилась ошибка (" + error + ")")
                .ifElse("Ошибка не отображается");
    }
}
