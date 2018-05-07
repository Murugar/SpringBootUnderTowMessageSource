package com.iqmsoft.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class RemoteMessageSource {

    private static final Map<String, String> dataBase = new HashMap<>();

    static {
        dataBase.put("test", "This is a test");
    }

    @Cacheable(value = "message", key = "#code")
    public String translate(String code) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        return dataBase.get(code);
    }
}
