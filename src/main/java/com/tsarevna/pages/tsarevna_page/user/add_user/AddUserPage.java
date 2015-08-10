/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.add_user;

import com.tsarevna.pages.tsarevna_page.AtmPage;
import com.uisteps.thucydides.user.browser.pages.elements.TextBlock;
import java.util.List;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@DefaultUrl("/user/add")
public class AddUserPage extends AtmPage {

    public AddUserForm addUserForm;
    @FindBy(css = ".alert-danger")
    private List<TextBlock> errors;

    public boolean containsError(String error) {

        for (TextBlock err : errors) {
            // System.out.println("*************************************");
            // System.out.println(err.getWrappedElement().getText());
            if (err.getWrappedElement().getText().equals(error)) {
                return true;
            }
        }
        return false;
    }
}
