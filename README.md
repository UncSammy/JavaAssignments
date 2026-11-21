# Calculator – GitHub Copilot Assignment

## Program idea

This small Java program demonstrates a calculator model that stores a running sum of non-negative integers. The `Calculator` class keeps the current total, allows the caller to add a number, reset the total, and read the current value. Negative input is rejected with an `IllegalArgumentException`.

## Calculator source code

```java
public class Calculator {
    private int value;

    // Resets the calculator's stored value to zero.
    public void reset() {
        value = 0;
    }

    // Adds a non-negative integer to the stored value.
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                "The calculator cannot add negative integers."
            );
        }

        value += number;
    }

    // Returns the current value.
    public int getValue() {
        return value;
    }
}
```

## How the class works

The `Calculator` class is the **model** in a simple MVC-style design. It stores the application's data and contains the rules for changing that data. It does not handle user input or print messages.

- `value` is a private field, so other classes cannot change the total directly.
- `reset()` sets the stored total to `0`.
- `add(int number)` checks the input first. If the number is negative, the method throws an `IllegalArgumentException`. Otherwise, it adds the number to `value`.
- `getValue()` returns the current total without changing it.

The `Main` class is only a temporary test program. It creates a calculator, adds `5`, `10`, and `3`, prints the result, and then demonstrates resetting the calculator.

## How GitHub Copilot was used

GitHub Copilot can be prompted in several ways when implementing `add(int number)`:

1. **Method signature only:** Write `public void add(int number) {` and allow Copilot's inline completion to suggest the validation and addition statements. Review the suggestion to ensure negative values are rejected.
2. **Signature and first line:** Start the method and type the validation condition, such as `if (number < 0)`. Let Copilot suggest the exception handling and addition statement. After accepting or adapting the suggestion, try expressing the addition with a different loop structure. A loop is not necessary for this task because one method call adds one integer; adding an artificial `for` or `while` loop would make the code less clear.
3. **Natural-language comment:** Add a comment such as `// Add a non-negative integer to the current total; reject negative input.` and let Copilot generate a method body. Check that the generated code actually enforces the requirement.

Copilot is an assistant rather than an authority: its suggestions should be read, tested, and edited. In this solution, the key requirement is that validation happens before the stored value is changed.

## Applicability to my coding style

For a small, clearly specified Java class like this, Copilot is useful for generating routine method bodies and reminding me of standard Java constructs such as `IllegalArgumentException`. It can help me get a first version working quickly. I would still prefer to understand the code and make the final design decisions myself.

Copilot is less useful when the task is so small that writing the method manually is faster than describing it in a prompt and reviewing the suggestion. It may also suggest unnecessary code, misunderstand a requirement, or produce code that compiles but does not handle every required case. Therefore, I would use it as a productivity aid, not as a replacement for my own reasoning and testing.

## Benefits and drawbacks of GitHub Copilot

**Benefits**
- Speeds up repetitive coding and produces useful starting points.
- Suggests syntax and standard library usage.
- Can generate alternative implementations from comments or partial code.
- Can help explain unfamiliar code and draft documentation.

**Drawbacks**
- Suggestions can be incorrect, incomplete, inefficient, or unnecessarily complex.
- The developer must verify behavior, edge cases, and security implications.
- Accepting code without understanding it can weaken learning and debugging skills.
- Generated explanations may be vague or inaccurate and often need editing.

## Test output

The temporary `Main` program should print:

```text
Sum: 18
After reset: 0
```

The negative-input requirement can be checked by calling `calculator.add(-1)`. That call should throw `IllegalArgumentException`.
