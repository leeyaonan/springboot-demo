package com.leeyaonan.springbootdemo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @Author leeyaonan
 * @Date 2020/5/31 15:53
 */
@Component
public class String2IntArrayConverter implements Converter<String, int[]> {

    @Override
    public int[] convert(String s) {
        String[] strArr = s.split(",");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}
