package com.sit;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "surname-service", url = "http://localhost:7072")
public interface FeignClientProxy {
	@RequestMapping("/getSurname")
	public String getSurName();
}
