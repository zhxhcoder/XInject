package com.zhxh.xinject.components;

import com.zhxh.xinject.MainActivity;
import com.zhxh.xinject.PerActivity;
import com.zhxh.xinject.module.ModuleA;
import com.zhxh.xinject.module.ModuleB;
import com.zhxh.xinject.module.MyModule;
import com.zhxh.xinject.module.MyModule2;

import java.util.Map;
import java.util.Set;

import dagger.Component;

/**
 * Created by zhxh on 2018/6/27.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class,modules ={MyModule2.class,ModuleB.class,ModuleA.class,MyModule.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
    Set<String> strings();
    Map<String, Long> longsByString();

    Map<MyModule2.MyEnum, String> StringsByMyEnum();
}
