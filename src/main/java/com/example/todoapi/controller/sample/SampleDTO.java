package com.example.todoapi.controller.sample;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class SampleDTO {

    private final String content;
    private final LocalDateTime timestamp;
}
