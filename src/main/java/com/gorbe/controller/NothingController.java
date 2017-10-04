package com.gorbe.controller;

import com.gorbe.model.nothing_model.Quote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class NothingController {

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote quote(){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        System.out.println(quote.toString());
        return quote;
    }
}