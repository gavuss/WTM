/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.add_user;

import com.uisteps.thucydides.user.browser.pages.elements.Link;
import org.openqa.selenium.WebElement;

/**
 *
 * @author silaev
 */
public class LinkAddUserPage extends Link{

    public LinkAddUserPage(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public AddUserPage click() {
        super.click();
        return displayed(AddUserPage.class);
    }
    
    
}
