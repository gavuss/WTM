/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.users;

import com.tsarevna.pages.tsarevna_page.user.UserPage;
import net.thucydides.core.annotations.Step;

/**
 *
 * @author silaev
 */
public class RootUser extends TsarevnaUser {

    public Exception ex;

    public RootUser() {
        setRole(Role.ROOT);
    }

    @Step
    public void addUser(String fio, String nickName) {
        try {
            open(UserPage.class)
                    .inNavigationBlock().then()
                    .openUserMenu().addUserItem.click()
                    .addUserForm.addUser(fio, nickName);
        }
        catch (Exception ex) {
            this.ex = ex;
        }
    }
}
