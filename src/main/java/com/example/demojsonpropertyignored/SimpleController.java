package com.example.demojsonpropertyignored;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.var;

@RestController
@RequestMapping("/api/demo")
public class SimpleController {

  @GetMapping
  public ResponseEntity<SimpleDto> get() {
    var body = SimpleDto.builder()
        .firstProperty("@JsonProperty")
        .secondProperty("Ignored")
        .build();
    return ResponseEntity.ok(body);
  }
}
