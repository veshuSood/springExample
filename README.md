Spring Core Examples (XML + Annotations)
This project is a collection of small Spring Core examples meant for revision and interview preparation.

It focuses on IoC, dependency injection, bean configuration via XML and annotations, and different autowiring modes using simple Java classes.

Tech Stack
Java 21 (configured via Maven compiler plugin)

Maven build tool with spring-core and spring-context dependencies (version 7.0.4)

Pure Spring Core (no Spring Boot)

pom.xml (key points):

groupId: org.example

artifactId: untitled

Dependencies:

org.springframework:spring-core:7.0.4

org.springframework:spring-context:7.0.4

Project Structure Overview
Source root: src/main/java
Configurations: src/main/resources

Main Java packages:

Coupling

Contains loose and tight coupling examples without Spring, to show why IoC is useful.

car.example

Likely simple domain classes (e.g., Car, Engine) used for DI examples.

com

Annotation-based component examples (used with ComponentScanDemo.xml).

org.example

Probably contains the main methods that bootstrap the ApplicationContext and run demos.

Main XML configuration files under src/main/resources:

applicationIoCLooseCouplingExample.xml – IoC and loose coupling example configuration.

applicationConstructorInjection.xml – Constructor-based dependency injection configuration.

applicationSetterInjection.xml – Setter-based dependency injection configuration.

autowireByName.xml – Autowiring beans by name.

autowireByType.xml – Autowiring beans by type.

autowireByConstructor.xml – Autowiring beans via constructor.

ComponentScanDemo.xml – Enables component scanning for annotation-based configuration.

Core Concepts Covered
Inversion of Control (IoC) and Loose Coupling

Demonstrates how Spring’s container creates and wires objects instead of manual new calls.

Coupling package + applicationIoCLooseCouplingExample.xml.

Constructor Injection

Dependencies passed through constructors.

Configuration: applicationConstructorInjection.xml.

Setter Injection

Dependencies injected via setter methods.

Configuration: applicationSetterInjection.xml.

Autowiring

autowire="byName" – Matches property name with bean id (autowireByName.xml).

autowire="byType" – Matches property type with bean type (autowireByType.xml).

autowire="constructor" – Uses constructor parameters (autowireByConstructor.xml).

Annotation-based Configuration

Uses @Component, @Autowired, and component scanning.

Enabled through ComponentScanDemo.xml.
