# LEET_CODES_QURS

A structured DSA practice repository — solving LeetCode problems topic-wise with Java implementations.

![Language](https://img.shields.io/badge/Language-Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Progress](https://img.shields.io/badge/Week%201-0%2F20%20Solved-orange?style=flat)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy%20%7C%20Medium-blueviolet?style=flat)

---

## Week 1 — DSA Cheatsheet

> 20 problems across 8 algorithm patterns. Updated weekly.

### Progress

| Status | Count |
|--------|-------|
| Solved | 0 |
| Pending | 20 |
| Total | 20 |

---

### Problem Sheet

#### Array Traversal (2 Problems)

| # | Problem | Difficulty | Status | Link |
|---|---------|------------|--------|------|
| 1 | Find Numbers with Even Number of Digits | Easy | Pending | [LeetCode #1295](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/) |
| 2 | Largest Number At Least Twice of Others | Easy | Pending | [LeetCode #747](https://leetcode.com/problems/largest-number-at-least-twice-of-others/) |

#### Prefix Sum (3 Problems)

| # | Problem | Difficulty | Status | Link |
|---|---------|------------|--------|------|
| 3 | Find Pivot Index | Easy | Pending | [LeetCode #724](https://leetcode.com/problems/find-pivot-index/) |
| 13 | Running Sum of 1d Array | Easy | Pending | [LeetCode #1480](https://leetcode.com/problems/running-sum-of-1d-array/) |
| 14 | Range Sum Query — Immutable | Easy | Pending | [LeetCode #303](https://leetcode.com/problems/range-sum-query-immutable/) |

#### Two Pointers (4 Problems)

| # | Problem | Difficulty | Status | Link |
|---|---------|------------|--------|------|
| 4 | Two Sum II — Input Array Is Sorted | Easy | Pending | [LeetCode #167](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) |
| 5 | Valid Palindrome | Easy | Pending | [LeetCode #125](https://leetcode.com/problems/valid-palindrome/) |
| 6 | Reverse String | Easy | Pending | [LeetCode #344](https://leetcode.com/problems/reverse-string/) |
| 7 | Squares of a Sorted Array | Easy | Pending | [LeetCode #977](https://leetcode.com/problems/squares-of-a-sorted-array/) |

#### Fixed Sliding Window (2 Problems)

| # | Problem | Difficulty | Status | Link |
|---|---------|------------|--------|------|
| 8 | Maximum Average Subarray I | Easy | Pending | [LeetCode #643](https://leetcode.com/problems/maximum-average-subarray-i/) |
| 9 | Defuse the Bomb | Easy | Pending | [LeetCode #1652](https://leetcode.com/problems/defuse-the-bomb/) |

#### Variable Sliding Window (3 Problems)

| # | Problem | Difficulty | Status | Link |
|---|---------|------------|--------|------|
| 10 | Minimum Size Subarray Sum | Medium | Pending | [LeetCode #209](https://leetcode.com/problems/minimum-size-subarray-sum/) |
| 11 | Longest Substring Without Repeating Characters | Medium | Pending | [LeetCode #3](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |
| 12 | Max Consecutive Ones III | Medium | Pending | [LeetCode #1004](https://leetcode.com/problems/max-consecutive-ones-iii/) |

#### Prefix Sum + HashMap (1 Problem)

| # | Problem | Difficulty | Status | Link |
|---|---------|------------|--------|------|
| 15 | Subarray Sum Equals K | Medium | Pending | [LeetCode #560](https://leetcode.com/problems/subarray-sum-equals-k/) |

#### Kadane's Algorithm (2 Problems)

| # | Problem | Difficulty | Status | Link |
|---|---------|------------|--------|------|
| 16 | Maximum Subarray | Medium | Pending | [LeetCode #53](https://leetcode.com/problems/maximum-subarray/) |
| 17 | Maximum Sum Circular Subarray | Medium | Pending | [LeetCode #918](https://leetcode.com/problems/maximum-sum-circular-subarray/) |

#### Sorting / HashSet (3 Problems)

| # | Problem | Difficulty | Status | Link |
|---|---------|------------|--------|------|
| 18 | Contains Duplicate | Easy | Pending | [LeetCode #217](https://leetcode.com/problems/contains-duplicate/) |
| 19 | Contains Duplicate II | Easy | Pending | [LeetCode #219](https://leetcode.com/problems/contains-duplicate-ii/) |
| 20 | 3Sum | Medium | Pending | [LeetCode #15](https://leetcode.com/problems/3sum/) |

---

## Algorithm Patterns — Quick Reference

### Array Traversal

```
Pattern:    Single/Double pass with tracking variables
Time:       O(n)
Space:      O(1)
Use when:   Finding extremes, counting, simple iteration
```

### Prefix Sum

```
Pattern:    prefix[i] = prefix[i-1] + nums[i]
Time:       O(n) build + O(1) query
Space:      O(n)
Use when:   Range sum queries, subarray sum problems
```

### Two Pointers

```
Pattern:    left = 0, right = n-1 → shrink toward center
Time:       O(n)
Space:      O(1)
Use when:   Sorted arrays, palindrome check, pair finding
```

### Fixed Sliding Window

```
Pattern:    window of size k → slide and update
Time:       O(n)
Space:      O(1)
Use when:   Fixed-size subarray/substring problems
```

### Variable Sliding Window

```
Pattern:    expand right, shrink left when constraint violated
Time:       O(n)
Space:      O(1)
Use when:   Find longest/shortest subarray with condition
```

### Prefix Sum + HashMap

```
Pattern:    map prefixSum → count, check (prefixSum - k) in map
Time:       O(n)
Space:      O(n)
Use when:   Count subarrays with sum = k
```

### Kadane's Algorithm

```
Pattern:    currentMax = max(nums[i], currentMax + nums[i])
Time:       O(n)
Space:      O(1)
Use when:   Maximum subarray sum problems
```

### Sorting + Two Pointers / HashSet

```
Pattern:    Sort first, then two pointers or use set for O(1) lookup
Time:       O(n log n) or O(n)
Space:      O(1) or O(n)
Use when:   Duplicate detection, triplet finding
```

---

## File Naming Convention

```
src/
├── Array_Traversal/
├── Prefix_Sum/
├── Two_Pointer_Approach/
├── Fixed_Sliding_Window/
├── Variable_Sliding_Window/
├── Prefix_Sum_HashMap/
├── Kadanes_Algorithm/
└── Sorting_HashSet/
```

---

## How to Update

1. Solve a problem on LeetCode
2. Create the Java file in the matching topic folder
3. Update the status: `Pending` → `Solved`
4. Update the progress counter at the top

---

*Last updated: Week 1 — DSA Practice Sheet*
