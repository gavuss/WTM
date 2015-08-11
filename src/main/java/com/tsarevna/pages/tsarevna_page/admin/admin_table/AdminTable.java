/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.pages.tsarevna_page.admin.admin_table;

import com.uisteps.thucydides.user.browser.pages.UIBlock;
import java.util.List;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author silaev
 */
@FindBy(css = "table")
public class AdminTable extends UIBlock{
    
    //public AdminTableHeadder adminTableHeadder;
    @FindBy(css = "tbody tr")
    public List<AdminItem> adminList;
}
