/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.navigation_block;

import com.tsarevna.pages.tsarevna_page.navigation_block.settings_dropdowm.SettingsDropdownMenu;
import com.tsarevna.pages.tsarevna_page.navigation_block.user_dropdown.UserDropdownMenu;
import com.tsarevna.pages.tsarevna_page.navigation_block.user_dropdown.UserMenuItems;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy(css = ".navbar")
public class NavigationBlock extends UIBlock {

      private UserDropdownMenu userDropdownMenu;
      private SettingsDropdownMenu settingsDropdownMenu;
              
      @Step
      public UserMenuItems openUserMenu() {
          return userDropdownMenu.openUserMenu();
      }
      
      
           
}
