package com.haroon.lambda.service;

import com.haroon.lambda.invoker.CustomerLambdaInvoker;
import com.haroon.lambda.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerLambdaInvoker customerLambdaInvoker;
    public List<Customer> getCustomers() {
        return customerLambdaInvoker.getCustomer();
    }
}
