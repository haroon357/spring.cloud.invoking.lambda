package com.haroon.lambda.invoker;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.haroon.lambda.model.Customer;
import reactor.core.publisher.Flux;

import java.util.List;


public interface CustomerLambdaInvoker {

    //'test' is the name of lambda function we want to invoke
    @LambdaFunction(functionName = "test")
    List<Customer> getCustomer();

}
