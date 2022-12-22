package com.haroon.lambda.invoker;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.haroon.lambda.model.Customer;
import reactor.core.publisher.Flux;

import java.util.List;


public interface CustomerLambdaInvoker {

    //'test' is the name of lambda function we want to invoke
    //The lambda function test is returning the List of Customer as json
    @LambdaFunction(functionName = "test")
    List<Customer> getCustomer();

}
