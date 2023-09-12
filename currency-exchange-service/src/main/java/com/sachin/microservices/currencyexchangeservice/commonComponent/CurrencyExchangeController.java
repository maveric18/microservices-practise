package com.sachin.microservices.currencyexchangeservice.commonComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;
    
    @Autowired
    CurrencyExchangeRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to) {
    	CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
    	if(currencyExchange==null) {
    		throw new RuntimeException("Unable to find data for give details");
    	}
        String port = "local.server.port";
		currencyExchange.setEnvironment(environment.getProperty(port));
		
        return currencyExchange;
    }

}
