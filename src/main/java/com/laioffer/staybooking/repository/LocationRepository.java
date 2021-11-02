package com.laioffer.staybooking.repository;

import com.laioffer.staybooking.model.Location;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

//But similar to JpaRepository, LocationRepository also provides some basic query functions like find(), save() and delete(). But since our service needs to support search based on Geolocation, we need to implement the search function ourselves.
@Repository
public interface LocationRepository extends ElasticsearchRepository<Location, Long>, CustomLocationRepository {

}