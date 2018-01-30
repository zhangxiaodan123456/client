package org.spring.springboot.service;

import java.util.List;

import org.spring.springboot.domain.City;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

@Component
public class CityDubboService {
	   @Reference(version = "1.0.0")
	   CityService cityService;

	    public List<City> findByName() {
	       List<City> list=cityService.findByName();
	        return list;
	    }
}
