/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.user_list;

import com.tsarevna.pages.tsarevna_page.user.user_list.user_table.UserTable;
import com.uisteps.thucydides.user.browser.pages.UIBlock;
import com.uisteps.thucydides.user.browser.pages.elements.TextField;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy(css = "#userDataTable_filter")
public class UserFilterForm extends UIBlock {

    @FindBy(css = "input[type='search']")
    public UserFilterFormTextField userFioNickName;

    @Step
    public UserFilterForm fill(String fio) {
        userFioNickName.enter(fio);
        return displayed(UserFilterForm.class);
    }

    public static class UserFilterFormTextField extends TextField {

        public UserFilterFormTextField(WebElement wrappedElement) {
            super(wrappedElement);
        }

      @Override
        public Object enter(String text) {
            if (text != null && !text.equals("null")) {
                super.enter(text);
            }
            return null;
        }
    }
    @Step
    public UserTable filterUser (String fio) {
        fill(fio);
        return displayed(UserTable.class);

}
}
