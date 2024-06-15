# Beans

Project to practice the core concept of Spring Beans, exploring the @Bean and @Component annotations.

## Bean Creation: 
The IoC container is responsible for creating instances of beans. Beans are Java objects that are instantiated, assembled, and managed by the Spring IoC container.

## IoC Container
The IoC (Inversion of Control) container is a generic term that refers to the framework's capability to manage the creation, configuration, and lifecycle of objects (beans) and their dependencies. In the context of Spring, the IoC container is responsible for:

Creating Beans: Instantiating beans as defined in the configuration.
Dependency Injection: Injecting dependencies into beans.
Managing Bean Lifecycle: Managing the initialization and destruction of beans.
Configuring Beans: Applying configuration metadata to beans.

## IoC Container vs Application Context
IoC Container: A generic concept referring to the framework's capability to manage objects and their dependencies.\
Spring Context: A specific implementation of the IoC container in Spring, represented by the ApplicationContext interface, which provides additional features and functionality.

## @Bean
- By default, creates a singleton Spring Bean managed by the IoC container
- Defined at the method level
- The class that contains methods with @Bean requires a @Configuration annotation
- Usually used when you are using a third-party library for data source or need custom initialization logic.

## @Component
- By default, creates a singleton Spring Bean managed by the IoC container
- Defined at the class level