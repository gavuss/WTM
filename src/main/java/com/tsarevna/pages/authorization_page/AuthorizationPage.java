/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.authorization_page;

import com.tsarevna.pages.tsarevna_page.dashboard_page.DashboardPage;
import com.uisteps.core.user.browser.pages.Root;
import com.uisteps.thucydides.user.browser.pages.Page;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.StepGroup;


/**
 *
 * @author silaev
 */
@Root
@DefaultUrl("")
public class AuthorizationPage extends Page{
    
    public AuthorizationForm authorizationForm;
    
    @StepGroup
    public DashboardPage authorize(String root_login, String root_password) {
        return authorizationForm.authorize(root_login, root_password);

    }
    
}
