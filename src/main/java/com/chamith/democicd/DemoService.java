package com.chamith.democicd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.chamith.democicd - DemoService.java
 *
 * @author Chamith Karunakalage {chamith.karunakalage@savantis.com}
 * @since May 31, 2020
 */

@Service
@Slf4j
public class DemoService {

    @Autowired
    CityRepository cityRepository;

    ResponseEntity getAllCities() {
        List<City> cities = cityRepository.findAll();
        return new ResponseEntity(cities, HttpStatus.OK);
    }

    ResponseEntity addCity(City city) {

        City newCity = new City();


        log.info("LOG {} {}  {}  {}", city.getId(), city.getCode(), city.getName(), city.getDescription());

        newCity.setId(null);
        newCity.setCode(city.getCode());
        newCity.setName(city.getName());
        newCity.setDescription(city.getDescription());

        newCity = cityRepository.save(newCity);

        return new ResponseEntity(newCity, HttpStatus.CREATED);


    }

}
