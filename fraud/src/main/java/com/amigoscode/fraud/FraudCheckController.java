package com.amigoscode.fraud;

import com.amigoscode.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudCheckController{
   private final FraudCheckService fraudCheckService;

    //localhost:8080/api/v1/fraud-check/1
    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerID){

        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerID);
        log.info("fraud check request to customer {}", customerID);
        return new FraudCheckResponse(isFraudulentCustomer);

    }

}
