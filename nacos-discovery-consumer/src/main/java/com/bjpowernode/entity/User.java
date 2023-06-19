package com.bjpowernode.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

/**
 * @author:zouxf
 * @date 2023/1/10 8:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparator<User> {

    private String userName;

    private String password;

//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }

    @Override
    public int compare(User o1, User o2) {
        if (Integer.valueOf(o1.getUserName())>Integer.valueOf(o2.getUserName())){
            return 1;
        }
        return 0;
    }
}
