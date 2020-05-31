package com.chamith.democicd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * com.chamith.democicd - DemoController.java
 *
 * @author Chamith Karunakalage {chamith.karunakalage@savantis.com}
 * @since May 31, 2020
 */

@RestController
@Slf4j
@RequestMapping(value = "/demoapp", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping(value = "/getCities")
    public ResponseEntity getAllCities() {
     log.info("Get All cities is called...");
     return demoService.getAllCities();
    }



    @PostMapping(value = "/addCity", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addCity (@RequestBody City city) {
        log.info("Add city is called..");
        return demoService.addCity(city);
    }
}
