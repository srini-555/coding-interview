# Convert Absolute Path to Canonical Path

## Alias
- Leetcode (71): [Simplify Path](https://leetcode.com/problems/simplify-path/)

## Problem
- Convert an absolute path to canonical path
- Absolute path may contain
   - `..`: Refers to the directory up a level.
   - `.`: Refers to the current directory.
   - Multiple consecutive slashes (like `///`): Should be treated as a single slash (`/`).
- Canonical Path should follow the following rules
   - The path starts with a single slash `/`.
   - The path does not end with a trailing `/`
