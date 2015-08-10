/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsarevna.users;

import com.tsarevna.pages.authorization_page.AuthorizationPage;
import com.uisteps.thucydides.ThucydidesUtils;
import com.uisteps.thucydides.user.ThucydidesUser;

/**
 *
 * @author silaev
 */
public class TsarevnaUser extends ThucydidesUser {

    private String login;
    private String password;
    private Role role;

//конструктор, инициализирует переменные
    public TsarevnaUser(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public static TsarevnaUser getBy(Role role) {

        TsarevnaUser user = null;

        switch (role) {
            case ROOT:
                user = ThucydidesUtils.getNewStepLibrary(RootUser.class);
                break;
            case ADMIN:
                user = ThucydidesUtils.getNewStepLibrary(AdminUser.class);
                break;
            case OPERATOR:
                user = ThucydidesUtils.getNewStepLibrary(OperatorUser.class);
                break;
            default:
                throw new AssertionError("Cannot find class for role " + role);
        }
        return user.setRole(role);
    }
    
    public static TsarevnaUser getBy(Role role, String login, String password) {
        return getBy(role).setLogin(login).setPassword(password);
    }

    public TsarevnaUser() {
    }

    public void auth() {
        open(AuthorizationPage.class).authorize(getLogin(), getPassword());
    }

    public String getLogin() {

        if (login != null) {
            return login;
        } else {
            throw new AssertionError("Login is not set");
        }
    }

    public TsarevnaUser setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public TsarevnaUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public TsarevnaUser setRole(Role role) {
        this.role = role;
        return this;
    }

}
