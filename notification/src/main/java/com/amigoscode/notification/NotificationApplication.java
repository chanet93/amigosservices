package com.amigoscode.notification;

import com.amigoscode.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages =
        {"com.amigoscode.notification",
         "com.amigoscode.amqp"})
@EnableEurekaClient
public class NotificationApplication {
    public static void main(String[] args) {

        SpringApplication.run(NotificationApplication.class,args);
    }
    //testing sending msg from the notification to the queue msg
//    @Bean
//    CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer,
//            NotificationConfig notificationConfig){
//        return args -> {
//              producer.publish(new Person("Ralph",1),
//                      notificationConfig.getInternalExchange(),
//                      notificationConfig.getInternalNotificationRoutingKeys());
//        };
//    }
//     record Person(String name, int age){}
}