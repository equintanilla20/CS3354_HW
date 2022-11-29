=============================\
**FIRST SECTION OF COURSE**
=============================\

=============================\
### **Method Naming Convention (09/12/2022)**
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
### **Java I/O (09/19/2022)**
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
### **Inheritance (09/26/2022)**
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
### **Interfaces (10/3/2022)**
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
    - Hashtable
    - Priority Queue
    - Vector
    - ArrayList
    - Bulk Operations
    - Interface Array Operations

=============================\
### **Java Collections Framework (10/10/2022)**
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
### **Logging / EXAM ON 10/24/2022**
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

=============================\
**SECOND SECTION OF COURSE**
=============================\

=============================\
### **Unified Modeling Language (10/31/2022)**
- UML Diagram illustrates the structure of a program in detail
  - Multiple layers from system-wide down to individual components
  - Product Managers manage relationship between the client and functional components of project.
    - Client -> Product Manager -> Functional Components -> Architecture -> Teams -> Development -> Deployment
      - Outbound <-> Inbound -> Functional Components
  - Rational Software Corporation (1994): Grady Booch, James Rumbaugh, and Ivar Jacobsen
  - Static View also called Class View.
    - Characterizes things in a system and their static relationships to each other.
    - Shows the static structure of a system, the kinds of things that exist, internal structure, and relationships.
    - Top level constituents of a static view:
      - Classifiers (class, interface, data type)
      - relationships (association, generalization, dependency, realization)
      - Constraints
      - comments
    - Relationships:
      - Bidirectional association between class A <-> B
      - Dependency: C - - -> D (Dotted line representing "C depends on D")
  - Two types of UML Diagrams:
    - Structural Diagrams
      - Profile Diagram
      - Class diagram (static view)
        - A set of classes (multiple classes) and their relationship with each other
        - Represented by three boxes (Always underline anything static): Name, Attributes, Operations (signature of methods)
        - Solid arrow with empty triangle head is a generalization: Child Class -I> Parent Class (Inheritance)
        - Dashed line with arrow shows a class implements an interface: Subclass - - - > Interface (Dependency)
        - Dotted line is for comments
        - Solid double arrow or just solid line indicates association: Parent <-> Child (Parent references Child within and vice versa)
        - Numbers (or \* for infinite) near object over line indicates how many objects may be expected.
        - Association Class: dotted line between two classes that are themselves associated with solid line. Acts like a buffer.
        - Implementor Class: dotted line with arrow of empty triangle 
        - Example 1 from slides:
          - Button, EditBox, and Panel inherit from Component.
          - One panel can have many Component children. Panel is a container for other panels and components.
          - Component implements (dependency) DrawingContext
        - Example 2 from slides:
          - Invoice has many LineItems.
          - Each LineItem has one Product.
          - TV and Radio are types of Products. (Inheritance)
        - Example 3 from slides:
          - Membership is an association class that associates Library with Member.
        - Example 4 from slides:
          - XOR between SubscriptionSeries and IndividualReservation. 
          - Show (Cats on Broadway) can have multiple Performances. Ticket can have one performance.
      - UML.org, OMG.org
      - Association:
        - Empty Diamond: Aggregation (Destroying Whole does not destroy Part)
        - Filled in Diamond: Composition (Destroying Whole destroys Part)
      - Constraints:
        - Note / Comment can constrain logic.
      - "We don't want to get into Internal Structures"
      - State Machine
    - "Activity Diagram is like flow chart"
    - Sequence Diagram
      - In some sense, a graphical representation of functional behavior
    - Deployment Diagram
    - Behavioral Diagrams

=============================\
### **Concurrency (11/07/2022)**
- Analogy:
  - Opening laptop and reading email while also listening to music
    - Our attention is actually only paid to one task at a time
  - 4 way stop: Handles cars in a FCFS manner, appears to be running all four directions concurrently
- User -> Linux (VM) -> Windows > Hardware
- JVM (Emulates OS) -> Windows
  - JVM is light. Much lighter than Linux.
  - JVM runs on one process.
- Types of Processing
  - Multiprogramming
    - Multi processes on single processor
  - Multiprocessing
    - Multi processes on multi processors
  - Distributed processing
    - multi processes on multi systems
  - Three C's
    - Cooperation
    - Competition
    - Communication
- Processes & Threads
  - In an OS:
    - User Space: Shell, Application layers, file system, and processes management
    - Kernel Space: Kernal (Untouchable by the user)
    - Hardware under kernel and user space.
  - JVM is a process in the process manager
  - A thread emulates a process in the context of one java process
    - A lightweight process in the JVM
    - Round robin scheduling
  - Process context:
    - PID, state (running, sleeping, waiting, etc)
    - Memory Space
    - Procedure call stack
    - Open files, ports, connections through the kernel
    - Registers and counters:
      - Program counter, stack pointer
      - General purpose registers
  - Process is a complex data structure
  - Making an OS is not easy
- Main states of a processes:
  - Create:
    - Moves to Ready state 
  - Ready
  - Running
  - Waiting
  - Terminate
- Check out 8_Sched.pptx from CS3360
- Interprocess Communication (Using pipes and sockets).
  - Shared Memory:
    - Two processes sharing messages by writing and reading from a common memory location
    - Shared memory is in the heap. Stack belongs to processes, heap is unbounded by the processes.
  - Direct Communication (Message Queue Technique):
    - Two processes send and receive messages directly.
    - Kernel has message queue space
- Threads
  - Very similar to a process.
  - Exist in different states emulating processes
  - Threads share process's resources , including memory and open files
  - There is always one default thread as part of the process
  - In Java:
    - Object class has the following concurrency related methods:
      - `wait()`
      - `notify()`
      - `notifyAll()`
    - Thread inherits from object
    - Some class `Mars` inheriting from object receives the concurrency methods
      - Can communicate with `Jupiter` using those methods
    - Start a thread by using an object called `Thread`
    - Extend a class `A` from `Thread`, it is a thread.
      - `A` now has `start()` and `run()`
  - `Start()` calls / allows `run()` method to run for a thread.
  - `Runnable` is an interface
  - Professor prefers `implements Runnable` 
  - `start()` will spawn a thread. If a `for()` loop runs 10 times and creates threads each iteration.
  - JVM size increases, borrowing from the heap as we add threads

=============================\
### **Concurrency Pt 2 (11/14/2022)**
- Estimate run time for threads by statement lines executed.
  - "Thread was alive for one single print statement"
  - "The other threads run 6-7 statements + 5 seconds of `sleep()` time"
- Initial thread creation is ordered, but threads sit in the Main States Of A Process diagram and can be dispatched/scheduled differently
- Illegal Thread State Exception
  - Using `thread1.start()` twice throws an error
  - Race conditions
  - `Thread th1 = new Thread();`
  - `sleep()` is very useful in threads.
    - Can sleep an infinite time.
  - Always run `Thread.sleep()` in try and catch block
    - Thread can be interrupted.
    - May not always sleep x amount of seconds
    - As soon as interrupt comes in, it generates an InterruptedException and continues processing statements
    - Can be used to simulate some process execution time (like real time event simulator)
- Thread Interrupts
  - Stop, wake up, etc.
  - Can send interrupts to threads with `Thread.interrupt()`
  - Flags in the global scope: Interrupt flag initially false, is set to true when a thread is interrupted
    - Java is polling the interrupt flag for the thread "are you false?" "are you false?" "are you false?"
  - JVM and only the JVM has the authority to stop a thread.
  - `Thread.interrupted` checks the value of the interrupted flag and *resets the value to false*.
- Thread Join
  - Causes a thread to halt execution, enter a sleep state, and wait for another thread's completion.
  - Potentially more graceful than interrupting a sleeping thread.
  - Effectively use in distributed processing.
- Ending a thread
  - Do it gracefully, never use `stop()`
  - UsingInterruptToShutdownThread
  - Thread.interrupt() and Thread.interrupted() both reset the interrupt flag because they "peek" at its value.
- Advanced Topics
  - Thread executors, process control concepts, Synchronization and locking, thread groups
  - Problem (Producer & Consumer)
    - `Synchronized(this) { //code };`
    - Producer thread writes to shared memory, consumer reads from that memory
    - Producer runs infinite loop adding values to a linked list IF the list isn't full. If it is full, it uses `wait()`. If not, it adds value and uses `notify()` to tell the consumer it has added a value then sleeps.
    - Consumer runs infinite loop consumes a value removing it from the linked list then notifies the producer.
    - IMPORTANT, study this and how threads communicate thanks to Java.
  - Critical Section Problem (See other class's slides)
    - Critical Section is a part of the code where a processes are using a shared resource (shared memory, table, file, etc)
    - Mutual Exclusion, Progress, Bounded Waiting
    - Mutex
    - Deadlocks
    - Lock: Every object has a `lock` flag. Tool for controlling shared resources.
    - Synchronization: Essential for locking, communication between threads
      - Method level synchronization (Entire method or block of code)
      - Statement level synchronization
      - Can synchronize entire blocks of code
      - Replaces mutex/semaphore/critical section stuff. Java handles it.
      - Locks and unlocks the `lock` flag of an object.

=============================\
### **Concurrency Pt 3 (11/21/2022)**
- Lock
  - Use `Synchronized(this) {}` to handle locks inherent in every object when dealing with multiple threads sharing a resource
- Re-entrant Synchronization (Don't worry about this)
  - Thread cannot acquire a lock owned by another thread
  - A thread can reacquire the same lock that it already owns.
- Atomic Access
  - An atomic action is one that effectively happens all at once.
    - Acquiring a lock and incrementing is atomic
- Liveness, three problems of concurrency
  - Deadlock: two or more threads blocked forever, waiting for each other.
    - Dining Philosopher problem
  - Starvation: Holding onto resource for so long that other threads are waiting and waiting
  - Livelock: Other variation of deadlock
- Executors
  - Thread Pools
    - Consider using Java 18 Fork/Join/Thread Pool functionality
- Callable
  - Similar to Runnable but returns a value and can throw exceptions

### **DESIGN PATTERNS**
- Developed by Beck and Cunningham back in 1987
- Gamma, Erich; Helm, Richard; Johnson, Ralph; Vlissides, John;
  - "Design Patterns: Elements of Reusable Object-Oriented Software"
- Types of Patterns
  - Two main patterns: Inheritance and Composite (see below). The two pillars of object-oriented design.
  I. Creational Design Pattern
    - Ensure you are creating an object in the best possible way with checks and balances before reaching the `new` keyword.
    - Dependency Injection?
    A. [Singleton](https://www.geeksforgeeks.org/singleton-design-pattern/)* - Single instance of a class allowed. Example: Logger.
    B. [Factory](https://www.geeksforgeeks.org/factory-design-pattern/)* - Builds objects without specifying everything necessary
    C. [Builder](https://www.geeksforgeeks.org/builder-pattern-in-java/)* - Builds objects incrementally
      - Controls how many parameters we want to set
      - Some attributes are needed for building, some are optional. Builders allow us to choose.
    D. [Prototype](https://www.geeksforgeeks.org/prototype-design-pattern/)* - Used in cloning for new objects
      - Shallow vs Deep Copying
    E. [Abstract Factory](https://www.geeksforgeeks.org/abstract-factory-pattern/) - A factory that builds factories
  II. Structural Design Pattern
    A. [Adapter](https://www.geeksforgeeks.org/adapter-pattern/) - Connects unrelated interfaces
    B. [Composite](https://www.geeksforgeeks.org/composite-design-pattern/)* - Tree hierarchy of objects that hold other objects
    C. [Facade](https://www.geeksforgeeks.org/facade-design-pattern-introduction/) - "Mask to hide the details"
      - Keep complications hidden 
    D. [Bridge](https://www.geeksforgeeks.org/bridge-design-pattern/) - Prefers Composition to inheritance
    E. [Proxy](https://www.geeksforgeeks.org/proxy-design-pattern/) - Security
  III. Behavioral Design Pattern

=============================\
### **Structural Design Patterns (11/21/2022)**
- Composite is a base pattern
- [Bridge Design Pattern](https://www.geeksforgeeks.org/bridge-design-pattern/) - Prefers Composition to inheritance
  - "Bridge" in PP Slide: `Shape` could be an abstract class. `Shape` class depends on `Color` interface (Solid line with arrow)
  - Rather than having "color" be an attribute in `Shape`, separate this out into its own class (or in this case, interface).
  - "Bridging two concepts"
  - Bridge is a special case of a composition
  - From a data center point of view: Network <-> VMs <-> storage <-> etc
- Proxy
  - Think of it as a cache.
  - Java RMI - uses proxy pattern
  - Load balancer
  - Client Object -> Proxy Object -> Real Object
    - Important for security
- UML Aside:
  - Know how to implement a UML diagram into code
  - Association A <- - - -> B (dependency both ways of A and B)
- Composition 90% and Inheritance 10%

### **Behavioral Design Patterns**
  A. [Decorator](https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/) - A pattern that takes a bare object and embellishes it
    - Works during runtime unlike prototype which is static
    - Car Example
      - Car is a concept, implements an interface.
      - CarDecorator
      - ConceptCar - Concrete version of a decorator
      - Addresses both composition and inheritance
  B. [Mediator](https://www.geeksforgeeks.org/mediator-design-pattern/)
    - Similar to bridge / proxy
    - Chat example:
      - User (possible abstract class) DEPENDS ON ChatMediator interface (0..1 ChatMediators)
      - UserImpl inherits User
      - ChatMediatorImpl implements ChatMediator
      - ChatMediatorImpl DEPENDS ON User (0..\* users)
  C. Strategy - [1](https://www.geeksforgeeks.org/strategy-pattern-set-1/) and [2](https://www.geeksforgeeks.org/strategy-pattern-set-2/)
  D. Observer-Observable - [1](https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/) and [2](https://www.geeksforgeeks.org/observer-pattern-set-2-implementation/?ref=rp)
    - When Observable object changes state, notify all dependent Observer objects
    - Implemented in many frameworks and most, if not all, GUIs.
  E. [Visitor](https://www.geeksforgeeks.org/visitor-design-pattern/)
    - Used when working on individual elements of a collection, and we want to change functionality without changing classes.
    - `Visitor` class can `visit()` objects who themselves have `accept()` methods to accept a visitor.
  
**FINAL EXAM**
- Read up on JUNIT: Including JUNIT Website
- Abstract Classes
- Style of exam is similar to first exam
- Slide deck
- 20 Questions of multiple choice?
- 4 Short answers. Write as much as possible that's relevant. "What is inheritance"
- 3 coding questions