package com.chamith.democicd;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.chamith.democicd - CityRepository.java
 *
 * @author Chamith Karunakalage {chamith.karunakalage@savantis.com}
 * @since May 31, 2020
 */
public interface CityRepository extends JpaRepository<City, Integer> {
}
