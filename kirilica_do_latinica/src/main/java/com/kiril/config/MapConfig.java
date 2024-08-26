package com.kiril.config;

import com.kiril.config.initializers.ReversorInitializer;
import com.kiril.config.initializers.TranslatorInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MapConfig {

    @Bean
    public Map<Character, String> translator() {
        Map<Character, String> translator = new HashMap<>();
        TranslatorInitializer.initialize(translator);
        return translator;
    }

    @Bean
    public Map<String, Character> reversor() {
        Map<String, Character> reversor = new HashMap<>();
        ReversorInitializer.initialize(reversor);
        return reversor;
    }


}
