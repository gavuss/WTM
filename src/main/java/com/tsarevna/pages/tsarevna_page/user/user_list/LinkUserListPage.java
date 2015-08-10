/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.user_list;

import com.uisteps.core.user.browser.pages.Root;
import com.uisteps.thucydides.user.browser.pages.elements.Link;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 *
 * @author silaev
 */
@Root
@DefaultUrl("/user")
public class LinkUserListPage extends Link{

    public LinkUserListPage(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public UserListPage click() {
        super.click();
        return displayed(UserListPage.class);
    }
    
    
}
