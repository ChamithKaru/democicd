package com.chamith.democicd;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * com.chamith.democicd - City.java
 *
 * @author Chamith Karunakalage {chamith.karunakalage@savantis.com}
 * @since May 31, 2020
 */

@Entity
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer code;
    String name;
    String description;

}
