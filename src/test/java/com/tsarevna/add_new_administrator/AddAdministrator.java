/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.add_new_administrator;



import com.tsarevna.pages.authorization_page.AuthorizationPage;
import com.uisteps.thucydides.run.Story;
import com.uisteps.thucydides.run.UserStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 *
 * @author silaev
 */
public class AddAdministrator extends UserStory {

    @Given("авторизоваться с правами root")
    public void auth() {
        user.open(AuthorizationPage.class).authorizationForm.loginField.sendKeys("hhjgkh");
    }

    @When("добавить администратора с параметрами: Имя <name>, Пароль <password>, Роль <role>")
    public void добавить_администратора_с_параметрами() {

    }
    
    @Then("в списке администраторов появился новый пользователь <name>")
    public void в_списке_администраторов_появился_новый_пользователь() {
    
}
    

}
