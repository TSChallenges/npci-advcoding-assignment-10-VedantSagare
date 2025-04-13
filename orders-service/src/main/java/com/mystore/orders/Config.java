package com.mystore.orders;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Config {

    // TODO: YOUR CODE HERE to create a Load Balanced Bean for RestTemplate
	 @Bean
	    @LoadBalanced // This allows RestTemplate to use Eureka service discovery
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
}
