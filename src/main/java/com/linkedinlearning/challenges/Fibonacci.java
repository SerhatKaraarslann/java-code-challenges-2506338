package com.linkedinlearning.challenges;

public class Fibonacci {
  
  static int fibonacci(int n)
  {
   if(n == 0)
   {
    return 0;
   }
    if(n == 1)
    {
      return 1;
    }
    else
       return fibonacci(n -1) + fibonacci(n-2);
  }


}
