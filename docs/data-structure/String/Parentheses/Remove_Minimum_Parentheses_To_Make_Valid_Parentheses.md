# Remove Minimum Parentheses to Make Valid Parentheses

## Problem
- Remove the minimum number of parentheses so that the resulting parentheses string is valid.
- Return the valid parentheses string.

## Solutions
- Solution 1: Two pass string builder
  ```java
  public String removeMinParenthesesToMakeValid(String s) {
      StringBuilder sb = new StringBuilder();
      int openParenthesesCount = 0;
        
      // Remove extra ) at the beginning
      for (int i = 0; i < s.length(); i++) {
			    String current = s.substring(i, i+1);
            
          if (current.equals(")")) {
              if (openParenthesesCount == 0) {   // If the current is ) and there is no open parenthese
                  continue;                      // Ignore the current )
              } else {
                  sb.append(current);
                  openParenthesesCount--;
              }
          } else if (current.equals("(")) {
              sb.append(current);
              openParenthesesCount++;
          } else {
              sb.append(current);
          }
		  }
        
      // Remove extra ( at the end
      if (openParenthesesCount > 0) {
          while (openParenthesesCount > 0) {
              int index = sb.lastIndexOf("(");
              sb.deleteCharAt(index);
              openParenthesesCount--;
          }
      }
        
      return sb.toString();
  }
  ```
