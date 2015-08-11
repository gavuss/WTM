/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.admin.add_admin;

import com.uisteps.thucydides.user.browser.pages.elements.Link;
import org.openqa.selenium.WebElement;

/**
 *
 * @author silaev
 */
public class LinkAddAdminPage extends Link{

    public LinkAddAdminPage(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public AddAdminPage click() {
        super.click();
        return displayed(AddAdminPage.class);
    }
    
}
