package com.zhxh.xinject.components;

import android.content.Context;
import android.location.LocationManager;

import com.zhxh.xinject.DemoApplication;
import com.zhxh.xinject.module.AndroidModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zhxh on 2018/6/25.
 */
@Singleton
@Component(modules = AndroidModule.class)
public interface ApplicationComponent {
    void inject(DemoApplication application);
    LocationManager getLocationManager();
    Context getContext();
}
