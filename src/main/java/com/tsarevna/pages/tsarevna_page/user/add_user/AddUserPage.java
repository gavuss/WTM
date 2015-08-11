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

        String allErrorsFromElements = "";
        
        for (int index = 0; index < errors.size(); index++) {
            /*System.out.println("for cycle");
            System.out.println(errors.get(index).getWrappedElement().getText());
            System.out.println(error);*/
            
            if (index == 0) {
                allErrorsFromElements = errors.get(index).getWrappedElement().getText();
            } else {
                allErrorsFromElements += ", " + errors.get(index).getWrappedElement().getText();
            }
        }
        
        System.out.println(allErrorsFromElements);
        if (allErrorsFromElements.equals(error)) {
            return true;
        }
        return false;
    }
}
