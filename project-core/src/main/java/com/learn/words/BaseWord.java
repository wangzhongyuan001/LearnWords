package com.learn.words;

import com.learn.annotation.WordMean;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/9/28
 */
public class BaseWord {

    public void getAllWord(Map<String,String> wordMap) {
        Class clazz = this.getClass();
        do {
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                WordMean annotation = f.getAnnotation(WordMean.class);
                String word = annotation.word();
                String desc = annotation.desc();
                wordMap.put(word,desc);
            }
            clazz = clazz.getSuperclass();
        } while (clazz != Object.class);
    }

}
