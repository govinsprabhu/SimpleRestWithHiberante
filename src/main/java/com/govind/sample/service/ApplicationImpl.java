package com.govind.sample.service;

import com.govind.sample.payload.User;
import com.govind.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 609600403 on 10/03/2016.
 */

@Service
public class ApplicationImpl implements Application{
    @Autowired
    UserRepository userRepository;


    @Override
    public User getUser(int id) {
        System.out.println("Incoming id :"+id);
        return userRepository.findByUserId(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String name;
    String lastName;

    /*public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src\\main\\webapp\\WEB-INF\\context-appContext.xml");
        ApplicationImpl application = (ApplicationImpl) applicationContext.getBean("SampleSpring");
        System.out.println(application.getUser(1));
        System.out.println(application.getLastName());
    }*/
}
