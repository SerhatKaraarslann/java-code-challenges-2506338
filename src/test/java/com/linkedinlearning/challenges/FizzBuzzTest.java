package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzTest {

  @Test
  void testRenderFizzBuzzUntil()
  {
    var expected = """
        1
        2
        Fizz
        4
        Buzz
        Fizz
        7
        8
        Fizz
        Buzz
        11
        Fizz
        13
        14
        FizzBuzz """;
        var actual = FizzBuzz.renderFizzBuzzUntil(15);
        Assertions.assertEquals(actual,expected);
        System.out.println(actual);




  }

}
