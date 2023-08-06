# Online Course

## Errata

- The vehicles exercise is not particularly great. Craft a better one.
- Maze.jar -- ability to see when you've exited (exception?)
- Remove references to UAH VM.
- Course needs overhaul to modern versions in the lectures (screenshots, instructions, and new topics):
  - TBD
- Java added "modules" after this course was made. The course needs a lecture on modules and instructions on adding "maze.jar" and "vehicles.jar".

### Modules

When you create a new JavaProject, Eclipse will use "module" features by default. We look at modules later in the course, but for now be sure the "Create module-info.java file" checkbox is NOT CHECKED.

## Module 1 
### [01 Introduction](Topics/Introduction)

This all needs reworking. Reference parts of the syllabus, but do so vaguely so it can be updated going forward.

There is no longer a virutal lab machine. I'll show you how to install Java and Eclipse on your own computer.

GitHub reference to the course materials. Poke around the repo for examples and hints.

| Slide | Title | Needed Updates |
| ----- | ----- | -----          |
| 1     | Welcome                | `Rework` |
| 2     | About Your Instructor  | `Rework` |
| 3     | Syllabus               | `Rework` |
| 4     | Virtual Lab Machine and Course Instructions | `Rework/Remove` |

### [02 Eclipse](Topics/Eclise)

A lot of this need re-doing since Java, Eclipse, and Windows have changed looks over the years. The flow and info is good.

| Slide | Title |  Needed Updates |
| ----- | ----- |  -----          |
| 1 | Overview ||
| 2 | More Info | `Update first link to https://www.oracle.com/java/technologies/downloads/ Update 2nd link to https://www.eclipse.org/documentation/` |
| 3 | Runtime and Development (JRE and JDK) | `Update visual and audio version` |
| 4 | The Windows Path Command Prompt | `Leave this out. No need for command prompt.` |
| 5 | The Windows Path Environment Vars |`Update version to win 11`|
| 6 | Command Line Only ||
| 7 | Battle of the IDEs ||
| 8 | Features of an IDE: Highlighting ||
| 9 | Features of an IDE: Documentation Hints ||
| 10 | Features of an IDE: Fix Hints ||
| 11 | Features of an IDE: Project/File Management ||
| 12 | Features of an IDE: Debugger ||
| 13 | Eclipse in Particular ||
| 14-22 | UI Layout ||
| 23-24 | Workspaces and Projects ||
| 25 | Downloading Eclipse | `redo` |
| 26 | Installing Eclipse | `redo` |
| 27 | Launching Eclipse | `redo`|
| 28 | First Launch ||
| 29 | Workbench | `redo`|
| 30-32 | First project | `redo. talk about modules` |
| 33 | Your Turn ||

- [03,04 Routines](Topics/Routines)
  - 1: Overview
  - 2: More Info
  - 3: Instructions
  - 4: Routines (Methods, Functions)
  - 5: Routines: parameters
  - 6: Routines: return
  - 7: Routines: Other keyword attributes
  - 8: Calling Routines
  - 9: Class
  - 10: Class Variables
  - 11: Local Variables
  - 12: Passing Parameters
  - 13: Return Values
  - 14: Expressions
  - 15: Overloading
  - 16: Your Turn
  - Examples:
    - MacDonald Song
    - Headache Song
    - Factorial
- [05 Primitives](Topics/Primitives)
  - 1: Overview
  - 2: More Info
  - 3: Memory
  - 4: Built-ins (Primitives) 
  - 5: Constants
  - 6: Numeric Casts
  - 7: Basic Math Operations
  - 8-11: Bitwise Math
  - 12: Shortcuts
  - 13: Pre and Post Increment
  - 14: Math Functions
  - 15: Your Turn
- [06 Conditionals](Topics/Conditionals)
  - 1: Overview
  - 2: More Info
  - 3: The Compare Operators
  - 4: Logic Operations
  - 5: Flow Control
  - 6: Forward Jump: if/else
  - 7: Spacing Doesn't Matter
  - 8: Use Braces
  - 9-10: Nested if/else
  - 11: Ternary Operator
  - 12-14: switch 
  - 15: switch
  - 16: Variable scope
  - 17: Shortcircuit in Expressions
  - 18: Your Turn
- [07,08 Loops](Topics/Loops)
  - 1: Overview
  - 2: More Info
  - 3-7: The while Loop
  - 8: The do Loop
  - 9: While vs Do
  - 10-11: break and continue
  - 12: for loops
  - 13: for defaults
  - 14: multiple for parts
  - 15: Your Turn
  - Examples:
    - Factorials
    - Relativity
    - Shifting
    - ASCII
    - isUpperCase
    - even/odd
    - do-while-false
    - nested loops
    - print even numbers
- Quiz 1
- [9 Ex1: HiLo and Solution](Topics/Exercise1_HiLo)
  - Helper functions for getInteger and getRandom `check better way for getInteger`

## Module 2
- [11 Structure](Topics/Structure)  
    - 1: Overview
    - 2: More Info
    - 3-4: Grouping Primititves
    - 5: Classes
    - 6: Using "new"
    - 7: Stack and Heap
    - 8: Dot operator - "follow pointer"
    - 9: Changing Pointers
    - 10-16: Garbage Collection
    - 17: Your Turn    
- [12, 13 More Structure](Topics/Structure) 
    - 1: Overview
    - 2: More Info
    - 11: Comparing Objects
    - 12: "null: Pointers
    - 13: Passing Pointers
    - 14: Object Composition
    - 15: Heap Defaults to 0
    - 16: Complex Example
    - 17: Your Turn
- Examples:
      - Points
      - Lines
      - Triangles
- [14,15 Objects](Topics/Objects)
    - 1: Overview
    - 2: More Info
    - 3-4: Data with Functions
    - 5-6: Together at Last
    - 7: Invoking Methods
    - 8-10: OO Concept: Encapsulation
    - 11: Permissions
    - 20: Benefit and Cost
    - 12-15: Constructors
    - 16: Initialization Inline
    - 17-18: Object Equality
    - 18: Your Turn
    - Examples:
      - Revisit Point
      - Revisit Line
      - Revisit Triangle
- [16,17 Arrays](Topics/Arrays)
    - 1: Overview
    - 2: More Info
    - 3: Indexing
    - 4: Arrays are Objects (heap)
    - 5: Array Bounds
    - 6: Inialization Lists
    - 7-8: Arrays of Pointers
    - 9: Arrays as Parameters
    - 10-14: Algorithms
    - 15: Array Tools
    - 16-18: Multidimensional Arrays
    - 19: In Passing
    - 20: Your Turn
    - Examples:
        - Tinkering with Arrays
        - Bubble Sort
        - Sorting Points
        - Multidimensional Arrays
- Quiz 2
- [Ex2: TicTacToe and Solution](Topics/Exercise2_TicTacToe)

## Module 3
- 20 Debugging
    - 1: Overview
    - 2: More Info
    - Debugging TicTacToe `Make sure this all looks the same`
    - 3: Your Turn
- 21 Packages and Jars `Update for modules -- make sure the box is unchecked`
    - 1: Overview
    - 2: More Info
    - 3: Packages Are Directories
    - 4: Packages
    - 5: Imports
    - 6: Nested Packages
    - 7-8: System Classes
    - 9: Static Imports
    - 10: Unique Package Names
    - 11: The "CLASSPATH"
    - 12: JAR Files `Make sure these are the same`
    - 13-14: Eclipse and Jars `Updates for modules`
    - 15: Your Turn
- 22, 23 Statics and Main
    - 1: Overview
    - 2: More Info
    - 3: .java and .class
    - 4: Static Blocks
    - 5: Static Initialization
    - 6: Instance Initialization
    - 7: Mains
    - 8: In Eclipse `Check this for new version`
    - 9: Mains Calling Mains
    - 10: Your Turn
    - Examples
        - Apache String Utils `Check this for new version`
        - Mains Tinkering
        - JAR tool `check eclipse visual`
- Quiz 3
- Ex3: MazeSolver and Solution
    - "maze.jar" `no on the desktop -- how to get it`

## Module 4
- 26 Inheritance
    - 1: Overview
    - 2: More Info
    - 3: Reusing Implementation
    - 4: Extending Implementation
    - 5-6: Memory Footprint 
        - upcasts and downcasts 
        - instanceof
    - 7: OO Terminology
    - 8-9: Method Overrides
    - 10: Polymorphism
    - 11: Pointers and Data
    - 12: Your Turn
27 More Inheritance
    - 1: Overview
    - 2: More Info
    - 3: @Override
    - 4: super
    - 5-7: Chained Constructors
    - 8-9: Object
    - 10: toString
    - 11: Methods of Objects
    - 12: "final" and "protected"
    - 13-14: The Random Point
    - 15: Your Turn
- 28,29 Interfaces
    - 1: Overview
    - 2: More Info
    - 3: The Diamond of Death
    - 4: Purely Base Classes
    - 5: Abstract Classes
    - 6: Abstract Methods
    - 7: Abstraction Rules
    - 8: Diamond Solved?
    - 9: The "interface"
    - 10: Interfaces are Base Classes
    - 11: Default Methods
    - 12: Default Methods `Remove the "Java 8"`
    - 13: More Diamonds
    - 14: Needed for Lambdas `Remove Java 8`
    - 11: (misnumbered) Design Patterns
    - 12-13: (misnumbered) The "Decorator"
    - 14: (misnumbered) By Subclassing
    - 15: (misnumbered) By Composition
    - 16: (misnumbered) Wiring up at Runtime
    - 17: (misnumbered) Your Turn
    - Examples
      - Animals
      - Tree structure
- 30 Generics
  - 1: Overview
  - 2: More Info
  - 3: Dynamic List of Points
  - 4: Stubs
  - 5: Based on an Array
  - 6: Growing the Array
  - 7: Array Copy
  - 8: Left to the Student (remove, constructor, etc)
  - 9: General Solution
  - 10: Nasty Cast
  - 11-12: Generics
  - 13: Generics in Action
  - 14: Built-ins as Objects
  - 15: Boxing
  - 16: Automatic Boxing
  - 17: Your Turn
- 31 Collections
  - 1: Overview
  - 2: More Info
  - 3: The "java.util" Collections
  - 4: List of Objects
  - 5-10: Based on an Array
  - 11: ArrayList Properties
  - 12: Linked List
  - 13: Same Interface
  - 14: LinkedList Properties
  - 15: Your Turn
- 32 More Collections
  - 1: Overview
  - 2: More Info
  - 3: Iterators
  - 4: Using Iterators
  - 5: Collections
  - 6-7: compareTo(other)
  - 8: Maps
  - 9: HashMap
  - 10: Map Iterators
  - 11: Ad infinitum (nested collections)
  - 12: Your Turn
- 33 Collections Examples
  - Analyzer
- Quiz 4
- Ex4: Vehicles and Solution

## Module 5
- 36 Exceptions
    - 1: Overview
    - 2: More Info `Remove Java7`
    - 3: Reading a Line From Disk
    - 4: Error Checking
    - 5: Merging in Error Conditions
    - 6: No Return
    - 7: Two Return Paths
    - 8-9: Catching an Exception
    - 10: Bubbling up the Stack
    - 11: You MUST Deal with Exceptions
    - 12: Looking at an Exception
    - 13: Bubbling out of Main
    - 14-15: Finally
    - 16: Finally Woes `Java 7`
    - 17: Multiple Exceptions
    - 18: Multiple Catches `Java 7`
    - 19: Your own Exception Class
    - 20: Catching by Inheritance
    - 21: Runtime Exceptions
    - 22: Your Turn
- 37 Enumerations
    - 1: Overview
    - 2: More Info
    - 3: Ranges and Sets
    - 4: Roll Your Own
    - 5: The "enum"
    - 6-8: Using the "enum"
    - 9-10: Switches
    - 11-12: Extending the "enum"
    - 13: The "Coin" Example
    - 14: Your Turn
- 38,39 Strings
    
- 40,41,42 Streams
- 43 Inner and Anonymous Classes
- Quiz 5
- Ex5: MadLibs and Solution

## Module 6
- 46 Javadocs
- Time and Date
- Ex6: TicTacObject and Solution
