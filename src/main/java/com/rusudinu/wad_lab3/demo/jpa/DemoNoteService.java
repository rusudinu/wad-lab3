package com.rusudinu.wad_lab3.demo.jpa;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DemoNoteService {

	private final DemoNoteRepository repository;

	public DemoNoteService(DemoNoteRepository repository) {
		this.repository = repository;
	}

	public DemoNote create(String title, String body) {
		return repository.save(new DemoNote(title, body));
	}

	public List<DemoNote> findAll() {
		return repository.findAll();
	}
}
