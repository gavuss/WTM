/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page;

import com.tsarevna.pages.tsarevna_page.navigation_block.NavigationBlock;
import com.uisteps.core.then.Then;
import com.uisteps.core.user.browser.pages.Root;
import com.uisteps.thucydides.user.browser.pages.Page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

/**
 *
 * @author silaev
 */
@Root
@DefaultUrl("")
public class AtmPage extends Page {

   @Step
    public Then<NavigationBlock> inNavigationBlock() {
        return then(NavigationBlock.class);
    }

}
