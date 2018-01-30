package org.spring.springboot.control;

import java.util.List;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

@Controller
@RequestMapping("/test")
public class TestControl {
	@Reference(version = "1.0.0")
	@Autowired
    private CityDubboService cityService;
	 @RequestMapping("/find")
	    public String findOneCity(ModelMap model) {
	    	 List<City> list= cityService.findByName();
	    	 System.out.println(list.toString());
	    	 model.put("city", list.get(0));
	    	 return "wel";
	    }
}
