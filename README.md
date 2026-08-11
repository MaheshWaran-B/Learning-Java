# Learning-Java

A personal repository of Java programs written while learning core Java concepts — from basic I/O and arithmetic through conditionals, loops, and methods.

## 📁 Repository Structure

```
Learning-Java/
├── introduction/
│   ├── Basic/           # I/O, arithmetic, string formatting
│   └── Conditions/      # if-else, switch, loops, decision-making
├── Loops/                # for/while practice — factorial, Fibonacci, digit reversal
└── Methods/              # the four method signatures (return type × arguments)
```

## 📚 What's Covered

### `introduction/Basic/`
Fundamentals of reading input and doing arithmetic with `Scanner`:
- `sum.java`, `Findsum.java` — adding two numbers / a running sum
- `average.java` — average of two floats
- `Multiplication.java` — multiplication table for a given number
- `Calculate.java` — a basic calculator using `switch` on the operator
- `printing.java` — formatted output with `printf`
- `userinput.java` — reading mixed input types (name, register no., CGPA)

### `introduction/Conditions/`
Conditionals, loops, and decision logic:
- `Evenodd.java`, `PostiveNegative.java` — even/odd and sign checks
- `Greatesnum.java` — greatest of three numbers
- `Leapyear.java` — leap year check
- `Checkprimenum.java`, `Checkprime.java` — prime number check (fixed value vs. user input)
- `decision.java` — age-based eligibility logic (`if`/`else if` chain)
- `While.java`, `Dowhile.java`, `Infinitewhile.java`, `Nestedfor.java` — loop variants

### `Loops/`
- `Factorial.java` — factorial of a user-input number
- `Fibonaciiseries.java` — first *n* Fibonacci numbers
- `Reverse.java` — reverse the digits of a number
- `Sumofdigit.java` — sum of digits
- `Specialnum.java` — numbers equal to (digit sum + digit product) in a range
- `Firstloop.java` — basic `for` loop warm-up

### `Methods/`
The four method signatures, each demonstrated separately:
- `Type1.java` — return type, no arguments
- `Type2.java` — return type, with arguments
- `Type3.java` — no return type, with arguments
- `Type4.java` — no return type, no arguments
- `ReverseinMethod.java` — digit reversal refactored into a reusable method

## 🚀 Running a Program

Each file is a standalone `public class` with its own `main`. Compile and run individually, e.g.:

```bash
javac Loops/Factorial.java
java Loops.Factorial
```

(Compile from the repo root so the `package` declarations resolve correctly.)

## 🧹 Notes

- A `.gitignore` now excludes compiled `.class` files and `desktop.ini` from tracking.
