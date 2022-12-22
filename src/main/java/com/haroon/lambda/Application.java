package com.haroon.lambda;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;
import com.haroon.lambda.invoker.CustomerLambdaInvoker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public CustomerLambdaInvoker customerLambdaInvoker() {
        return LambdaInvokerFactory.builder()
                .lambdaClient(AWSLambdaClientBuilder.standard()
                        //Please set correct region for the lambda
                        .withRegion("us-east-1").build())
                .build(CustomerLambdaInvoker.class);
    }
}