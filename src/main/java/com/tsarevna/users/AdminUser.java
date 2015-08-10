/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.users;

/**
 *
 * @author silaev
 */
public class AdminUser extends TsarevnaUser {

    public AdminUser() {
        setRole(Role.ADMIN);
    }

}
