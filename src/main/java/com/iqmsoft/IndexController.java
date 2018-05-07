package com.iqmsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @Autowired
    MessageSource messageSource;

    @GetMapping("/test")
    public String test() {

        return messageSource.getMessage("test", null, Application.FIXED_LOCALE);
    }
}
