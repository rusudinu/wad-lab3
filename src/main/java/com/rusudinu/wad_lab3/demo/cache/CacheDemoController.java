package com.rusudinu.wad_lab3.demo.cache;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/cache")
public class CacheDemoController {

	private final CacheDemoService service;

	public CacheDemoController(CacheDemoService service) {
		this.service = service;
	}

	@GetMapping("/value")
	public String value(@RequestParam String key) {
		return service.cachedValue(key);
	}

	@DeleteMapping("/value")
	public void evict(@RequestParam String key) {
		service.evict(key);
	}
}
