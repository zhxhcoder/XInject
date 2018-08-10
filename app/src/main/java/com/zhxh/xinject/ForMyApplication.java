package com.zhxh.xinject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by zhxh on 2018/6/27.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ForMyApplication {
}
