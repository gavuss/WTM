/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.navigation_block.settings_dropdowm;

import com.tsarevna.pages.tsarevna_page.admin.add_admin.LinkAddAdminPage;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy(css = ".dropdown-menu")
public class SettingsMenuItems extends UIBlock {

    //@FindBy(css = "a[href$='/admins']")
    //public LinkAdminListPage adminListItem;
    
    @FindBy(css = "a[href$='/addAdmin']")
    public LinkAddAdminPage addAdminItem;

}
