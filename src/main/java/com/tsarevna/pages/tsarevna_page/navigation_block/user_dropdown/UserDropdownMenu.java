/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.navigation_block.user_dropdown;

import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.Link;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy (css = "li.dropdown:nth-child(5)")
public class UserDropdownMenu extends UIBlock{
    
    @FindBy(css = "a[href='#']")
    private Link userItemLink;
    private UserMenuItems userMenuItems;
    
    @Step
    public UserMenuItems openUserMenu() {
        if (!userMenuItems.isDisplayed()){
            userItemLink.click();
        }
        return userMenuItems;
    }
}
