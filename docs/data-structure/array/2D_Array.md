# 2D Array

## Basic operations
### Traverse
- **By-row traversal**
  ```
  void traverseByRow(int[][] grid) {
     for (int i = 0; i < grid.length; i++) {
          for (int j = 0; j < grid[0].length; i++) {
              visit(grid[i][j]);
          }
      }
  }
  ```

- **Depth-first search (DFS)**
   - 2D array can be traversed by depth-first search starting from any cell.
   - Use serial numbers to identify different cells.
  ```
  int[] rowChange = {-1, 0, 1, 0};                    // The row    change for going up, left, down, and right
  int[] colChange = {0, -1, 0, 1};                    // The column change for going up, left, down, and right

  public int calculateIslandSize(int[][] grid, int row, int col, int RN, int CN) {
      Stack stack;
      Set   visitedSet;                                        // The set for recording all the visited cells

      stack.push(row * CN + col);                              // Push the current cell to the stack (Use serial number to identify this cell)
      visitedSet.add(row * CN + col);                          // Add the current cell to the visitedSet (Use serial number to identify this cell)

      while (stack.isEmpty() == false) {
          int serialNumber = stack.pop();
        
          int currentRow = serialNumber / CN;                  // Recover the row from the serial number
          int currentCol = serialNumber % CN;                  // Recover the column from the serial number
        
          for (int k = 0; k < 4; ++k) {                        // For current cell, there are 4 directions can go: up, left, down, right
              int nextRow = currentRow + rowChange[k],         // Get the row of the next cell to go
              int nextCol = currentCol + colChange[k];         // Get the column of the next cell to go
            
              if (!visitedSet.contains(nextRow * CN + nextCol) // Check the next cell has been visited or not
                  && 0 <= nextRow && nextRow < RN              // Check the next cell is in the grid or not (0 <= currentRow < RN, 0 <= currentCol < CN)
                  && 0 <= nextCol && nextCol < CN) {
                  stack.push(nextRow * CN + nextCol);          // Push the next cell into stack
                  visitedSet.add(nextRow * CN + nextCol);      // Push the next cell into visitedSet
              }
          }
      }
  }
  ```
