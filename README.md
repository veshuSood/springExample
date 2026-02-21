📘 Spring Core Examples (XML + Annotations)

This project is a collection of small Spring Core examples created for revision and interview preparation.

It focuses on:

Inversion of Control (IoC)

Dependency Injection (DI)

Bean configuration using XML and Annotations

Different autowiring modes

Understanding loose vs tight coupling

All examples use simple Java classes to clearly demonstrate Spring Core concepts without Spring Boot.

🛠 Tech Stack

Java 21 (configured via Maven Compiler Plugin)

Maven build tool

Spring Core & Spring Context (7.0.4)

Pure Spring Core (❌ No Spring Boot)

📦 Maven Configuration (pom.xml)

groupId: org.example
artifactId: untitled

Dependencies:
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>7.0.4</version>
    </dependency>

    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>7.0.4</version>
    </dependency>
</dependencies>
📁 Project Structure Overview
src/
 └── main/
     ├── java/
     │   ├── Coupling/
     │   ├── car/example/
     │   ├── com/
     │   └── org/example/
     └── resources/
         ├── applicationIoCLooseCouplingExample.xml
         ├── applicationConstructorInjection.xml
         ├── applicationSetterInjection.xml
         ├── autowireByName.xml
         ├── autowireByType.xml
         ├── autowireByConstructor.xml
         └── ComponentScanDemo.xml
📂 Java Packages
🔹 Coupling

Demonstrates tight coupling vs loose coupling without Spring.

Shows why IoC and Dependency Injection are needed.

🔹 car.example

Contains simple domain classes (e.g., Car, Engine) used for DI demonstrations.

🔹 com

Used for annotation-based configuration.

Classes annotated with @Component, @Autowired.

🔹 org.example

Contains main classes that:

Load ApplicationContext

Run different Spring Core demos

⚙ XML Configuration Files
File Name	Purpose
applicationIoCLooseCouplingExample.xml	IoC and loose coupling demo
applicationConstructorInjection.xml	Constructor-based dependency injection
applicationSetterInjection.xml	Setter-based dependency injection
autowireByName.xml	Autowiring by name
autowireByType.xml	Autowiring by type
autowireByConstructor.xml	Autowiring using constructor
ComponentScanDemo.xml	Enables component scanning for annotations
🧠 Core Concepts Covered
✅ Inversion of Control (IoC) & Loose Coupling

Objects are created and wired by Spring container.

No manual new keyword.

Demonstrated using:

Coupling package

applicationIoCLooseCouplingExample.xml

✅ Constructor Injection

Dependencies passed via constructor.

Configuration file:

applicationConstructorInjection.xml

✅ Setter Injection

Dependencies injected using setter methods.

Configuration file:

applicationSetterInjection.xml

✅ Autowiring
Mode	Description	Config File
byName	Matches property name with bean id	autowireByName.xml
byType	Matches property type with bean type	autowireByType.xml
constructor	Uses constructor parameters	autowireByConstructor.xml
✅ Annotation-based Configuration

Uses:

@Component

@Autowired

Enabled using:

ComponentScanDemo.xml

▶ How to Run

Clone the repository:

git clone https://github.com/veshuSood/springExample.git

Open in IDE (IntelliJ / Eclipse)

Run main classes from org.example package.

Change XML config files to test different injection methods.
