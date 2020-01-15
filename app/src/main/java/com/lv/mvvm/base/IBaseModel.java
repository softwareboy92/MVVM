package com.lv.mvvm.base;

import android.app.Activity;
import android.content.Context;

/**
 * 作者：created by albert on 2020-01-15 16:54
 * 邮箱：lvzhongdi@icloud.com
 *
 * @param
 **/
public interface IBaseModel {

    //拿到ApplicationContext
    Context applicationContext();

    //拿到当前类的Context
    Activity context();
}
