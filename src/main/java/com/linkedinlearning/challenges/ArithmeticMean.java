package com.linkedinlearning.challenges;

import java.util.Collection;

public class ArithmeticMean{


public static double mean(Collection<Integer> numbers)
{
  int sum = 0;

  for(int number : numbers)
  {
    sum += number;
  }

  return (double)sum/numbers.size();


}











}