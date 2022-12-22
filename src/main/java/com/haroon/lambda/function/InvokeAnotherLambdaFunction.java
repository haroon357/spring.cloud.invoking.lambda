package com.haroon.lambda.function;

import com.haroon.lambda.model.Customer;
import com.haroon.lambda.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.function.Supplier;

@RequiredArgsConstructor
@Component(value = "invokeAnotherLambda")
@Slf4j
public class InvokeAnotherLambdaFunction implements Supplier<List<Customer>> {
    private final CustomerService customerService;
    @Override
    public List<Customer> get() {
        log.info("getting customers by invoking another lambda");

       List<Customer> customers = customerService.getCustomers();
       log.info("customerFlux count"+customers.size());
       return customers;
    }

}
