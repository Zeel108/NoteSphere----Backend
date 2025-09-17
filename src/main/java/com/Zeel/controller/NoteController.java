package com.Zeel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Zeel.entity.NotesEntity;
import com.Zeel.repository.NotesRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // allow React
public class NoteController {
		
		@Autowired
		NotesRepository notesRepository;
		
		@GetMapping("/notes")
		public ResponseEntity<List<NotesEntity>> readNotes () {
			return new ResponseEntity<List<NotesEntity>>(notesRepository.findAll(), HttpStatus.OK);
		}
		
		@PostMapping("/createnote")
		public ResponseEntity<NotesEntity> newNote(@RequestBody NotesEntity notesEntity){
			
			return new ResponseEntity<NotesEntity>(notesRepository.save(notesEntity), HttpStatus.CREATED);
		}
		
		
		
		
	}





