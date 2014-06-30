package woow.resources;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import javax.annotation.Resource;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import woow.domain.Bean;
import woow.services.Service;

@Controller
public class WOOWController {
	
	@Resource
	private Service service;
	
	@RequestMapping("beans/{name}")
	@ResponseBody
	public HttpEntity<Bean> getBean(@PathVariable String name){
		
		Bean bean = service.getBean(name);			
		bean.add( linkTo(methodOn(WOOWController.class).getBean(name)).withSelfRel() );
		
		return new ResponseEntity<Bean>(bean, HttpStatus.OK);
	}
}
