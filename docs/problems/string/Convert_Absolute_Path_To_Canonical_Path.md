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
   - The path does not end with a trailing `/`.
   - The path does not have `..` and `.` and multiple consecutive slashes.

## Examples
- Example 1
   - Absolute path: `/home/`
   - Canonical path: `/home`
- Example 2
   - Absolute path: `/home//foo/`
   - Canonical path: `/home/foo`
- Example 3
   - Absolute path: `/a/./b/../../c/`
   - Canonical path: `/c`
- Example 4
   - Absolute path: `/d/a/./b/../../c/`
   - Canonical path: `/d/c`
