/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.admin.add_admin;

import com.tsarevna.pages.tsarevna_page.admin.admin_list.AdminListPage;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.Button;
import com.uisteps.thucydides.user.browser.pages.elements.TextField;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Select;

/**
 *
 * @author silaev
 */
@FindBy(css = "form")
public class AddAdminForm extends UIBlock {

    @FindBy(css = "#inputUsername")
    public TextField adminName;
    @FindBy(css = "#inputGroup")
    public Select adminRole;
    @FindBy(css = "#inputPassword")
    public TextField adminPassword;
    @FindBy(css = "#inputPasswordCheck")
    public TextField adminPasswordCheck;
    @FindBy(css = ".btn")
    public AddButton addButton;

    @Step
    public AddAdminForm fillAddAdminForm(String name, String role, String password, String passwordCheck) {
        if (!name.equals("null")) {
            adminName.enter(name);
        }
        if (!role.equals("null")) {
            adminRole.selectByVisibleText(role);
        }
        if (!password.equals("null")) {
            adminPassword.enter(password);
        }
        if (!passwordCheck.equals("null")) {
            adminPasswordCheck.enter(passwordCheck);
        }
        return this;
    }
    
    @Step
    public AdminListPage addAdmin(String name, String role, String password, String passwordCheck){
        return fillAddAdminForm(name, role, password, passwordCheck).addButton.click();
    }

    public static class AddButton extends Button {

        public AddButton(WebElement wrappedElement) {
            super(wrappedElement);
        }

        @Override
        public AdminListPage click() {
            super.click();
            return displayed(AdminListPage.class);
        }

    }
}
