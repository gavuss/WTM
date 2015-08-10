/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.user_list.user_table;

import com.tsarevna.pages.tsarevna_page.user.user_list.view_user.ViewUserLink;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.TextBlock;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy(css = "tbody tr")
public class UserItem extends UIBlock{
    
    @FindBy(css = "td:nth-child(1)")
    public TextBlock nickNameTextBlock;
    @FindBy(css = "td:nth-child(2)")
    public TextBlock fioTextBlock;
    @FindBy(css = "td:nth-child(3)")
    public TextBlock balanceTextBlock;
    @FindBy(css = "td:nth-child(4) a")
    public ViewUserLink viewUserLink;
}
