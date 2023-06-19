package com.bjpowernode.nacosdiscoveryconsumer.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Map;

/**
 * @author:zouxf
 * @date 2023/1/10 8:52
 */
public class User {


    private String userName;

    private String password;

    @NotEmpty
    private Map extend;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map getExtend() {
        return extend;
    }

    public void setExtend(Map extend) {
        this.extend = extend;
    }
}
