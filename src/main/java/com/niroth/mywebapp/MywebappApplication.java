package com.niroth.mywebapp;

import com.niroth.mywebapp.repositories.models.Potato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MywebappApplication implements CommandLineRunner {
    //hen we want to use the bean, we just use DI to inject it without creating it again
    //This is we call injection by annotation @Autowire (we can call it field injection)
    //There are two more types of injection (method and constructor)

    //========= uncomment this block to use field injection (not a recommended way ==============
    //@Autowired
    //private Potato potatoBean;


    //======== this block to use method injection ===========
    //private Potato potatoBean;
    //@Autowired
    //private void setPotatoBean(Potato potatoBean){
    //   this.potatoBean = potatoBean;
    //}

    //======== this block to use method injection ==========
    private Potato potatoBean;
    @Autowired
    public MywebappApplication(Potato potatoBean) {
        this.potatoBean = potatoBean;
    }


    public static void main(String[] args) {
        //if u wanna run code

        SpringApplication.run(MywebappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(potatoBean.toString());
    }
}

//The file call MyWebAppApplication is the main file or running file of this project
//It is important to keep the file in the root folder
//And other file or folder must be one level lower than this file
//For example u want to create a controller or service or repository or model