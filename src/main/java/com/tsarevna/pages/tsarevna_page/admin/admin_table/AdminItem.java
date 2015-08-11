/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.admin.admin_table;

import com.tsarevna.pages.tsarevna_page.admin.view_admin.ViewAdminLink;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.TextBlock;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy (css = "tbody tr")
public class AdminItem extends UIBlock{
    
    @FindBy (css = "td:nth-child(1)")
    public TextBlock loginTextBlock; 
    @FindBy (css = "td:nth-child(2)")
    public TextBlock roleTextBlock;
    @FindBy(css = "a")
    public ViewAdminLink viewAdminLink;
}
