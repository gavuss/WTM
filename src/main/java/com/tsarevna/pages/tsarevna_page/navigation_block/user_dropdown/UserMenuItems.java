/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.navigation_block.user_dropdown;

import com.tsarevna.pages.tsarevna_page.user.add_user.LinkAddUserPage;
import com.tsarevna.pages.tsarevna_page.user.user_list.LinkUserListPage;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy(css = ".dropdown-menu")
public class UserMenuItems extends UIBlock {

    @FindBy(css = "a[href$='/user']")
    public LinkUserListPage userListItem;
    
    @FindBy(css = "a[href$='/add']")
    public LinkAddUserPage addUserItem;
    
    //@FindBy(css = "a[href$='/operations']")
    //public LinkOperationsListPage operaionListItem;
    
    //@FindBy(css = "a[href$='/hold']")
    //public LinkHoldListPage holdListItem;
    
    //@FindBy(css = "a[href$='/plastic']")
    //public LinkPlasticListPage plasticListItem;
    
    //@FindBy(css = "a[href$='/addPlastic']")
    //public LinkAddPlasticPage addPlasticItem;
    
    //@FindBy(css = "a[href$='/fingerprint']")
    //public LinkFingerprintListPage fingerprintListItem;
}
