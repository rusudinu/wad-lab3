package com.rusudinu.wad_lab3.demo.jpa;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/jpa")
public class JpaDemoController {

	private final DemoNoteService service;

	public JpaDemoController(DemoNoteService service) {
		this.service = service;
	}

	@PostMapping("/notes")
	public DemoNote create(@RequestBody DemoNoteRequest request) {
		return service.create(request.title(), request.body());
	}

	@GetMapping("/notes")
	public List<DemoNote> list() {
		return service.findAll();
	}
}
