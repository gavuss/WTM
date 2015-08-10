/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.user_list.view_user;

import com.uisteps.thucydides.user.browser.pages.elements.Link;
import org.openqa.selenium.WebElement;

/**
 *
 * @author silaev
 */
public class ViewUserLink extends Link{

    public ViewUserLink(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public ViewUserPage click() {
        super.click();
        return this.displayed(ViewUserPage.class);
    }
    
    
}
