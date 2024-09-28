package com.github.cluelessskywatcher.jenkinsexample.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/message")
	public Map<String, Object> getMessage() {
		Map<String, Object> map = new HashMap<>();
		map.put("message", "Hello World! New Commit!");
		return map;
	}
}
