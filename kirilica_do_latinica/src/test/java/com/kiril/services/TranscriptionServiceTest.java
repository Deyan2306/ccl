package com.kiril.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;


class TranscriptionServiceTest {

    private TranscriptionService transcriptionService;


    @Test
    public void TranscriptionService_latinToCyrlic_BaseCase() {
        String result = transcriptionService.latinToCyrlic("Tova beshe napisano na latinica.");
        Assertions.assertEquals("Това беше написано на латиница.", result);
    }

}