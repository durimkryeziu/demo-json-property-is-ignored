package com.example.demojsonpropertyignored;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SimpleDto {
  String firstProperty;
  @JsonProperty("secondProperty")
  String secondProperty;
}
