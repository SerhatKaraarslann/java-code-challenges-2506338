package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; 

public class StringCalculatorTest {
  
  @Test
  void testAdd()
  {
    Assertions.assertEquals(0, StringCalculator.add("") );
    Assertions.assertEquals(12, StringCalculator.add("3,4,5"));
    Assertions.assertEquals(15, StringCalculator.add("1,2,3,4,5") );

    System.out.println(StringCalculator.add("42,8"));
  }

  


}
