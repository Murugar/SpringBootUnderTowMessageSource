package com.iqmsoft.config;

import java.text.MessageFormat;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractMessageSource;


@Configuration
public class ConfigurationForMessageSource {

    @Bean
    public MessageSource messageSource() {

        return new AbstractMessageSource() {

            @Autowired
            RemoteMessageSource remoteMessageSource;

            @Override
            protected MessageFormat resolveCode(String code, Locale locale) {

                String message = remoteMessageSource.translate(code);

                return createMessageFormat(message, locale);
            }
        };
    }
}
