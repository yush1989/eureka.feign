package eureka.feign.service;

import org.springframework.stereotype.Service;

import eureka.feign.controller.TestFeignService;

@Service
public class FailureFeignService implements TestFeignService {

	@Override
	public String getTest(String name) {
		return "test-client getTest name is not available";
	}

	@Override
	public String getPort() {
		return "test-client getPort is not available";
	}

}
