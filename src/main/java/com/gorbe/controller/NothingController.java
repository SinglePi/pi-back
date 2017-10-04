package com.gorbe.controller;

import com.gorbe.model.nothing_model.Quote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NothingController {


    @RequestMapping("/text")
    public String text(@RequestParam(value="text", defaultValue=" ") String text) {
        return text;
    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public String quote(){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return quote.toString();
    }
}