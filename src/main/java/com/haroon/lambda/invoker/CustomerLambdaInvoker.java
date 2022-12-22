package com.haroon.lambda.invoker;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.haroon.lambda.model.Customer;
import reactor.core.publisher.Flux;


public interface CustomerLambdaInvoker {

    @LambdaFunction(functionName = "getCustomerFunc")
    Flux<Customer> getCustomer();

}
