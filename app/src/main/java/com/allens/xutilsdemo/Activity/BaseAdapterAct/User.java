package com.allens.xutilsdemo.Activity.BaseAdapterAct;

/**
 * Created by allens on 2017/6/21.
 */

public class User {
    public String name; //用户名
    public int headId;  //用户头像资源
    public String sex; //性别

    public User(String name, int headId, String sex) {
        super();
        this.name = name;
        this.headId = headId;
        this.sex = sex;
    }
}
