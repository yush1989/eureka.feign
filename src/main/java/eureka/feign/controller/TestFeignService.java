package eureka.feign.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import eureka.feign.service.FailureFeignService;

@FeignClient(name="test-client",fallback=FailureFeignService.class)
public interface TestFeignService {

	@RequestMapping(value="/name/{name}")
	public String getTest(@PathVariable("name") String name);
	
	@RequestMapping(value="/port")
	public String getPort();
}
