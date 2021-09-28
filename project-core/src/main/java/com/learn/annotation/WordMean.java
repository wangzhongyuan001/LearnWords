package com.learn.annotation;

import java.lang.annotation.*;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/9/28
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface WordMean {
    String word();
    String desc();
}
