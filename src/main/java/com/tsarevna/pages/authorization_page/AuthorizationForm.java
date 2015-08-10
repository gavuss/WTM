/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.authorization_page;

import com.tsarevna.pages.tsarevna_page.dashboard_page.DashboardPage;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.Button;
import com.uisteps.thucydides.user.browser.pages.elements.TextField;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy (css = "form")
public class AuthorizationForm extends UIBlock{
    
    @FindBy(css = "#inputUsername")
    public TextField loginField;
    @FindBy(css = "#inputPassword")
    public TextField passwordField;
    @FindBy(css = "button")
    public Button enterButton;
    
    @Step
    public DashboardPage authorize(String root_login, String root_password) {
        loginField.enter(root_login);
        passwordField.enter(root_password);
        enterButton.click();
        return displayed(DashboardPage.class);

    }
    
}
