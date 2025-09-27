# Assignment 1 – Divide and Conquer Algorithms

This project implements four classic divide-and-conquer algorithms in **Java** and provides basic testing, analysis of recurrences, and Git workflow.

---

## Implemented Algorithms

1. **MergeSort**
   - Divide into halves, recursive sort, linear merge.
   - Reusable buffer and cutoff for small arrays.
   - Complexity: `T(n) = 2T(n/2) + Θ(n) → Θ(n log n)`.

2. **QuickSort**
   - Randomized pivot selection.
   - Always recurse on the smaller partition (bounded depth).
   - Complexity: average `Θ(n log n)`, worst case `Θ(n²)`.

3. **Deterministic Select (Median-of-Medians)**
   - Group elements by 5, take median-of-medians as pivot.
   - Recurse only into the necessary partition.
   - Complexity: `T(n) = T(n/5) + T(7n/10) + Θ(n) → Θ(n)`.

4. **Closest Pair of Points (2D)**
   - Sort by x-coordinate, recursive split.
   - Check middle strip by y-order (≤7 neighbors).
   - Complexity: `T(n) = 2T(n/2) + Θ(n) → Θ(n log n)`.

---

## How to Run

Compile and execute:
```bash
javac Main.java
java -ea Main
```

The -ea flag enables assertions used in tests.

Testing
	•	MergeSort / QuickSort: validated on random and adversarial arrays; recursion depth bounded (QuickSort ≲ 2·log₂n).
	•	Select: result compared with Arrays.sort()[k] over multiple trials.
	•	Closest Pair: brute-force validation for small n (≤2000); efficient version used for larger inputs.

⸻

Metrics

Collected during execution:
	•	Execution time vs input size n.
	•	Recursion depth.
	•	Number of comparisons / allocations.

Results are exported to CSV and visualized with plots.
Theoretical asymptotics align with practice, but constants (cache effects, pivot randomness, buffer reuse) influence performance.

⸻

Git Workflow
	•	Branches
	•	main – stable releases (v0.1, v1.0).
	•	feature/mergesort, feature/quicksort, feature/select, feature/closest, feature/metrics.
	•	Commit Storyline
	•	init: project setup (maven, junit5, ci, readme)
	•	feat(metrics): counters, depth tracker, CSV writer
	•	feat(mergesort): implemented MergeSort + tests
	•	feat(quicksort): implemented QuickSort + tests
	•	refactor(util): partition, swap, shuffle
	•	feat(select): deterministic select (MoM5) + tests
	•	feat(closest): closest pair divide-and-conquer + tests
	•	docs(report): added recurrence analysis, initial plots
	•	fix: handled edge cases (duplicates, tiny arrays)
	•	release: v1.0

⸻

Summary

This assignment demonstrates safe recursion patterns in classical algorithms and compares theoretical analysis (Master Theorem, Akra–Bazzi) with experimental results.
Theory and measurements mostly align, with practical differences explained by constant factors and implementation details.
