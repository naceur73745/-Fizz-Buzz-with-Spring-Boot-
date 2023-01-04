package com.example.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.fizzbuzz.ServiceBuzz;

@ExtendWith(MockitoExtension.class)
class ServiceBuzzTest {
    @InjectMocks
    private ServiceBuzz buzzService;

    @Test
    void itShouldReturnJSONObject() {
        int randomParameter = (int) (Math.random() * 10);
        ArrayList<String> result = buzzService.fizzBuzz(randomParameter);
        assertNotNull(result);
        assert (result.size() == randomParameter);

    }
}
