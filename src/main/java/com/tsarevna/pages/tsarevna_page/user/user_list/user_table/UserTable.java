/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.user.user_list.user_table;

import com.uisteps.thucydides.user.browser.pages.UIBlock;
import java.util.List;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */

@FindBy(css = ".table")
public class UserTable extends UIBlock {
    
    public UserTableHeadder userTableHeadder;
    public List<UserItem> userList;
    //public PagingBlock pagingBlock;
    
    public UserItem getUserByIndex (int index) {
        return userList.get(index);
    }
    
}
