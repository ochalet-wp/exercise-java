package com.company.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsParserTest {
  private RomanNumeralsParser romanNumeralsParser = new RomanNumeralsParser();

  @Test
  public void shouldReturn1ForI() {
    int result = romanNumeralsParser.parse("I");

    assertEquals(1, result);
  }
}
