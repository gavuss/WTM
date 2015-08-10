/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.user_list;

import com.tsarevna.pages.tsarevna_page.user.UserPage;
import com.tsarevna.pages.tsarevna_page.user.user_list.user_table.UserTable;
import net.thucydides.core.annotations.Step;


/**
 *
 * @author silaev
 */

public class UserListPage extends UserPage{
    
    public UserFilterForm userFilterForm;
    public UserTable userTable;
    
    @Step
    public UserFilterForm fillUserFilterForm (String fio) {
        return userFilterForm.fill(fio);
    }
    
    
}
