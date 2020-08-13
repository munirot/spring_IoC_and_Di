package com.niroth.mywebapp.configurations;


import com.niroth.mywebapp.repositories.models.Potato;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PotatoBean {

    @Bean
    public Potato getPotato(){
        return new Potato(1, "Cute potato", 6, 5, "German");
    }


}
