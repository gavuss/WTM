/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.add_user;

import com.tsarevna.pages.tsarevna_page.user.user_list.UserListPage;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.Button;
import com.uisteps.thucydides.user.browser.pages.elements.TextField;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy(css = "form")
public class AddUserForm extends UIBlock {

    @FindBy(css = "#inputFio")
    public TextField userFio;
    @FindBy(css = "#inputNickname")
    public TextField userNickname;
    @FindBy(css = ".btn")
    public AddButton addButton;

    @Step
    public AddUserForm fillAddUserForm(String fio, String nickName) {
        if (!fio.equals("null")) {
            userFio.enter(fio);
        }
        if (!nickName.equals("null")) {
            userNickname.enter(nickName);
        }

        return this;
    }

    @Step
    public UserListPage addUser(String fio, String nickName) {
        return fillAddUserForm(fio, nickName).addButton.click();
    }

    public static class AddButton extends Button {

        public AddButton(WebElement wrappedElement) {
            super(wrappedElement);
        }

        @Override
        public UserListPage click() {
            super.click();
            return displayed(UserListPage.class);
        }

    }
}
