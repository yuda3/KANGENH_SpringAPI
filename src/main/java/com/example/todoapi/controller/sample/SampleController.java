package com.example.todoapi.controller.sample;

import com.example.todoapi.service.sample.SampleEntity;
import com.example.todoapi.service.sample.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/samples")
@RequiredArgsConstructor
public class SampleController {
    private final SampleService service;

    @GetMapping
    public SampleDTO index(){
        SampleEntity sampleEntity = service.find();
        return new SampleDTO(sampleEntity.getContent(), LocalDateTime.now());
    }

}
