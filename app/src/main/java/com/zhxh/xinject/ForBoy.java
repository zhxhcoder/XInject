package com.zhxh.xinject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by zhxh on 2018/6/27.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForBoy {
}
