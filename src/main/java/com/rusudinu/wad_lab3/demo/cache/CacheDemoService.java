package com.rusudinu.wad_lab3.demo.cache;

import java.time.Instant;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheDemoService {

	@Cacheable(cacheNames = "demo-cache", key = "#key")
	public String cachedValue(String key) {
		return "value:" + key + ":" + Instant.now();
	}

	@CacheEvict(cacheNames = "demo-cache", key = "#key")
	public void evict(String key) {
	}
}
