package com.springrest.springrest.service;

import com.springrest.springrest.model.Tutorial;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface TutorialService {
    public ResponseEntity<List<Tutorial>> getAllTutorials(String title);

    public ResponseEntity<Tutorial> getTutorialById(String id);

    public ResponseEntity<Tutorial> createTutorial(Tutorial tutorial);

    public ResponseEntity<Tutorial> updateTutorial(String id,Tutorial tutorial);


    public ResponseEntity<HttpStatus> deleteTutorial( String id) ;


    public ResponseEntity<HttpStatus> deleteAllTutorials();


    public ResponseEntity<List<Tutorial>> findByPublished();


}
