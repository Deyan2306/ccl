package com.kiril.controllers;

import com.kiril.services.TranscriptionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class KirilControllers {

    private TranscriptionService transcriptionService;

    public KirilControllers(TranscriptionService transcriptionService) {
        this.transcriptionService = transcriptionService;
    }

    @PostMapping("/to_cyrillic")
    public ResponseEntity<String> latinToCyrillic(@RequestBody String text) {

        String translation = transcriptionService.latinToCyrlic(text);

        return translation != null
                ? new ResponseEntity<>(translation, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping("/to_latin")
    public ResponseEntity<String> cyrillicToLatin(@RequestBody String text) {

        String translation = transcriptionService.cyrlicToLatin(text);

        return translation != null
                ? new ResponseEntity<>(translation, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
