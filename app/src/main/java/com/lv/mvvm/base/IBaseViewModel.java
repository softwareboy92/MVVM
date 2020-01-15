package com.lv.mvvm.base;

import android.app.Activity;
import android.content.Context;

/**
 * 作者：created by albert on 2020-01-15 16:53
 * 邮箱：lvzhongdi@icloud.com
 *
 * @param
 **/
public interface IBaseViewModel {

    Context applicationContext();

    Activity context();

    void dettachView();
}
