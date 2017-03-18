package br.com.unisal.frameworks.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;

@Controller
@RequestMapping(path={"/"}, consumes=MediaType.ALL_VALUE, produces=MediaType.TEXT_HTML_VALUE)
public class IndexController {

	@RequestMapping(method=RequestMethod.GET)
	public DeferredResult<String> getIndex(){
	
		final DeferredResult<String> result = new DeferredResult<String>();
		result.setResult("index/index");
		
		return result;
	}
}
