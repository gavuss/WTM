/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.user_list.user_table;

import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy(css="thead")
public class UserTableHeadder extends UIBlock{
    
    @FindBy(css="th:nth-child(1)")
    public SortButton nickNameSortButton;
    @FindBy(css="th:nth-child(2)")
    public SortButton fioSortButton;
    @FindBy(css="th:nth-child(3)")
    public SortButton balanceSortButton;
    
    public static class SortButton extends Button {

        public SortButton(WebElement wrappedElement) {
            super(wrappedElement);
        }

        @Override
        public UserTable click() {
            super.click();
            return displayed(UserTable.class);
        }

                
        
    }
    
}
