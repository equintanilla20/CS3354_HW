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
    - Buffer: A chunk of memory that holds data while being read or written. Flush when done ( BufferedStream.flush ).
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
  - Anticipated exceptions are called Check Exceptions.
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