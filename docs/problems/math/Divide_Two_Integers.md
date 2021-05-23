# Divide Two Integers

## Alias
- Leetcode (29): [Divide Two Integers](https://leetcode.com/problems/divide-two-integers/)

## Problem
- Divide two integers and get the quotient without using multiplication, division, and mod operator.

## Solutions
- Solution 1: Substraction
   - Step 1: Convert both dividend and divisor to negetives
      - The reason why don't convert to positives
         - If dividend = -2147483648 (Integer.MIN_VALUE), then converting it to a positive number will behave differently depending on the language/compiler/interpreter you're using. This is because the positive form (2147483648) is outside of the 32-bit signed integer range.
   - Step 2: Count how many times the divisor has to be added to get the dividend. The count will be the quotient.
   - Step 3: Convert the quotient to positive number if needed.
         - The quotient will be negative.
         - If both dividend and divisor are all positive or all negative, we need to convert the quotient from negative to positive.
  ```java
  public int divide(int dividend, int divisor) {
      // Handle special cases
      if (dividend == Integer.MIN_VALUE) {
          if (divisor == -1) return Integer.MAX_VALUE;
          if (divisor == 1) return Integer.MIN_VALUE;
      }
      if (dividend == divisor) {
          return 1;
      }
      if (dividend == -divisor) {
          return -1;
      }

      /* We need to convert both numbers to negatives
       * for the reasons explained above.
       * Also, we count the number of negatives signs. */
      int negatives = 2;
      if (dividend > 0) {
          negatives--;
          dividend = -dividend;
      }
      if (divisor > 0) {
          negatives--;
          divisor = -divisor;
      }

      /* Count how many times the divisor has to be added
       * to get the dividend. This is the quotient. */
      int quotient = 0;
      while (dividend - divisor <= 0) {
          quotient--;
          dividend = dividend - divisor;
      }

      /* If there was originally one negative sign, then
       * the quotient remains negative. Otherwise, switch
       * it to positive. */
      if (negatives != 1) {
          quotient = -quotient;
      }
      return quotient;
  }
  ```
