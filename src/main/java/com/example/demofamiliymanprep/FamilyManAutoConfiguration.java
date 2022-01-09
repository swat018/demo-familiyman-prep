package com.example.demofamiliymanprep;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FamilyManAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public FamilyMan familyMan() {
        FamilyMan familyMan = new FamilyMan();
        familyMan.setName("swat018");
        return familyMan;
    }
}
