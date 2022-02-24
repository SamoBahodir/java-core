package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
//@EnableScheduling
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

   /* @Scheduled(fixedRate = 2000L)
    public void startRate() {
        System.out.println("Schedulet Ishlamoqda" + new Date());
    }
    @Scheduled(fixedDelay = 2000L)
    public void startdelay(){
        System.out.println("Delay Schedulet Ishlamoqda" + new Date());
    }*/
    @Scheduled(cron = "0 50 22 * * *")
    public void cronD(){
        System.out.println("Cron Ishlamoqda "+new Date());
    }
}
