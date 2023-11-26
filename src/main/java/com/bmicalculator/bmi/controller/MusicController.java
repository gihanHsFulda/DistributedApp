//author - Gihan Kaushal
//date - 2023-11-05
//Matriculation number - 1455441

package com.bmicalculator.bmi.controller;

import com.bmicalculator.bmi.MusicResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class MusicController {

    @GetMapping("/music")
    @ResponseBody
    public String getMusicData(@RequestParam("artist") String artist)
    {

        RestTemplate restTemplate = new RestTemplate();
        String baseUri = "https://itunes.apple.com/search";
        String apiUrl = UriComponentsBuilder
                .fromUriString(baseUri)
                .queryParam("term", artist)
                .build()
                .toUriString();

        // Make a GET request and retrieve the response

       return restTemplate.getForObject(apiUrl, String.class);



    }
}
