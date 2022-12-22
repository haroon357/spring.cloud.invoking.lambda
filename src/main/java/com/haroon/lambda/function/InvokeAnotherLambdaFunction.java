package com.haroon.lambda.function;

import com.haroon.lambda.model.Customer;
import com.haroon.lambda.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Component(value = "invokeAnotherLambda")
@Slf4j
public class InvokeAnotherLambdaFunction implements Supplier<Flux<Customer>> {
    private final CustomerService customerService;
    @Override
    public Flux<Customer> get() {
        log.info("getting customers by invoking another lambda");

       Flux<Customer> customerFlux = customerService.getCustomers();
       log.info("customerFlux count"+customerFlux.count());
       return customerFlux;
    }

}
