package com.epam.courses.java.fundamentals.io.task4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Movie implements Serializable {
  public String name;
}