package eureka.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@Autowired
	TestFeignService testFeignService;
	
	@RequestMapping(value="/test/{name}")
	public String getTest(@PathVariable("name") String name) {
		return testFeignService.getTest(name);
	}
	
	@RequestMapping(value="/index")
	public ModelAndView toIndex() {
		String port = testFeignService.getPort();
		return new ModelAndView("/html/index.html?port="+port);
	}
}
