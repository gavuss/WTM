/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.navigation_block.settings_dropdowm;

import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.Link;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy (css = "li.dropdown:nth-child(7)")
public class SettingsDropdownMenu extends UIBlock{
    
    @FindBy (css="a[href='#']")
    private Link settingsItemLink;
    private SettingsMenuItems settingsMenuItems;
    
    
}
