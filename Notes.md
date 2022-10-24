=============================\
**Method Naming Convention (09/12/2022)**
- "Type means 'domain'"
- CamelCase
- Java supports overloading methods
- Boxing and Unboxing
    - Convert primitive datatype into its object datatype.
- Arrays
    - Contiguous location of memory
    - Linear
    - Fixed size
    - 2 Dimensional arrays
- Object-Oriented Design Principles
- More on Classes
    - Nested Classes
    - Local Classes
    - Anonymous Classes

=============================\
**Java I/O (09/19/2022)**
- HW 1
- Problem - Code printed with line numbers
- Results: 2 positive test cases, 1 negative test case (invalid input)
- Java I/O Access
    1. java.io.File (Pre SE 7) - lots of limitations
    2. java.nio.File (SE 7) - re-architecture for big data
    3. java.nio2.File (SE 8) - further revision

    - File input always reads in bytes
        - `(-1)` means the end of the file has been reached
    - File output always writes in bytes
        - `fseek()`, used to append data to end of file
    - Stream: A stream is an abstract representation of an input or output device that is a source of, or destination for, data.
    - Buffer: A chunk of memory that holds data while being read or written. Flush when done ( `BufferedStream.flush` ).
    - Byte Stream: Contains binary data
    - Character Stream:
    - Input Stream (Audio, Files, Objects, Sequence of streams, ByteArray, Piped input stream)
        - ^^^ supports `read()` and `close()`.
    - Output Stream (Audio, Files, Objects, Sequence of streams, ByteArray, Piped output stream)
        - ^^^ supports `write()`, `close()`;
- Object Oriented Design
- Objects and Hierarchies
- IS_A relationship
- HAS_A relationship

=============================\
**Inheritance (09/26/2022)**
- Polymorphism
  - Compile time polymorphism
  - Runtime polymorphism
  - Late binding
  - Dynamic binding
  - Every nonstatic method in java is, by definition, *virtual*
  - `equals()`
  - `hashCode()`
  - abstract keyword
  - `final`, `finally{}`, `finalize()`
  - interfaces

=============================\
**Interfaces (10/3/2022)**
- Concept
  - Interfaces allow separate components to interact and receive information without revealing how that information is generated
  - Hospital departments example
- Anonymous Classes
  - Alonso Church - Lambda Calculus
  - Classes/functions made in line that only exist for the short time they are needed then removed from memory
- Exception Handling
  - Two types of bugs, syntactic and logic
  - Two types of exceptions: Synchronous and Asynchronous
  - Find the problem (**try** code but hit the exception)
  - Inform that an error has occurred (**throw** the exception)
  - Receive the error information (**catch** the exception)
  - Take corrective action (**handle** the exception)
  - Anticipated exceptions are called Checked Exceptions.
  - Unanticipated exceptions are Errors. (Unchecked exceptions)
  - Use try{}catch{} when using File IO for homework.
- Java Collections Framework
  - A list of well-defined interfaces for containers
    - Stack
    - Queue
    - Heap
    - Map
    - Hashmap
    - Priority Queue
    - Vector
    - ArrayList
    - Bulk Operations
    - Interface Array Operations

=============================\
**Java Collections Framework (10/10/2022)**
- Collections
  - Collections vs Maps
    - Collections are linear
  - Vectors (in mathematics)
    - Define a point in space. Have some parameters, IE: magnitude and direction
    - A = \[x1, y1]
    - Tensors are generalized vectors
  - Set
    - Group of unique items
  - Serializable collections.
  - Iterators
  - Collection is interface (1st Take Home Message)
  - Collections is a class you can use (2nd Take Home Message)
  - Bulk Methods / Operations
  - toArray: bridges between collections objects and older APIs
  - List - Linearly Ordered sequence of items
    - `List l1 = new ArrayList();` is the easiest to use
  - Queue: First in First Out
    - Use PriorityQueue for final assignment
    - `Queue q1 = new ArrayDeque();` is the easiest to use
  - Map: A non-linear collection of key value pairs. `<K, V>`
    - Lost of implementations
    - Hashmap
      - `Map m1 = new HashMap();`
    - Hashtable 
      - Pigeon Hole Principle
        - Squishing a space down to a small space (Naked space? Embedded space?)
        - Similar to Hashmap but more useful because of multithreading. Synchronizes input.
  - Logging
    - `private final static Logger LOGGER = Logger.getLogger(loggingTest.class.getName());`
    - `LoggingTest loggingTest = new LoggingTest();`
    - Singleton

=============================\
**Logging / EXAM ON 10/24/2022**
- Exam:
  - 3 total hours
  - Multiple Choice
    - 25 Questions, Only 1 Correct Answer
    - 2 point each 25 points total
  - Short Answer
    - 4 Questions. Be descriptive as possible
    - 5 points each, 20 total
  - Coding Questions
    - Two straightforward questions, one difficult question 
    - 10 points each, 30 total
- Creating a Logger
  - Using `System.out.println();` is resource intensive on the CPU.
  - Using `java.util.logging` simplifies all the printing functionality.
  - Singleton pattern: `private final static Logger LOGGER = Logger.getLogger(loggingTest.class.getName());`
    - Singleton pattern returns one memory address
    - *Static:* Means only one memory location.
  - Handlers
    - What is a stream?
      - Stream: Abstract representation?
      - Buffer: Memory buffer
  - Log manager
    - Hierarchical structure of Logger
- Unit Testing
  - Satisfiability Problem
  - JUnit - Testing framework
  - Mockito - Mock objects for testing
  - JTest - Static code analysis
  - "Extreme Programming" methodology
  - Fixture
    - *Setup* environment, variables etc
    - *tearDown* remove everything that was set up