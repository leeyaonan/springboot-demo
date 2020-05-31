package com.leeyaonan.springbootdemo.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * @Author leeyaonan
 * @Date 2020/5/31 15:52
 */
public class String2StringArrayConverter implements Converter<String, String[]> {

    @Override
    public String[] convert(String s) {
        return s.split(",");
    }
}
