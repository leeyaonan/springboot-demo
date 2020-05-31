package com.leeyaonan.springbootdemo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author leeyaonan
 * @Date 2020/5/31 15:40
 */
@Component
public class String2DateConverter implements Converter<String, LocalDateTime> {

    @Override
    public LocalDateTime convert(String s) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(s, dateTimeFormatter);
    }
}
