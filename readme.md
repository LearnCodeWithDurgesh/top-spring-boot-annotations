### Spring Boot Important Annotations

- @SpringBootApplication

  This annotation combines @Configuration, @EnableAutoConfiguration, and @ComponentScan to enable the Spring Boot application.

```java
   @SpringBootApplication
   public class MySpringBootApplication
   {
       public static void main(String[] args) {
           SpringApplication.run(MySpringBootApplication.class, args);
       }
   }
```

- @Configuration

  This annotation is used to define a configuration class, and **@Bean** is used to declare a bean within that class.

  ```java
  @Configuration
  public class MyConfiguration {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
  }
  ```

- @ComponentScan

  This annotation is used to enable component scanning. In this example, it scans the package "com.example" and its sub-packages for components.

  ```java
  @SpringBootApplication
  @ComponentScan(basePackages = "com.example")
  public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
  }

  ```

- @Bean
  This annotation is used to declare a bean. In this example, a method named myBean is annotated with @Bean to declare a bean.

  ```java
  @Configuration
  public class MyConfiguration {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
  }


  ```

- @Component

  This annotation use to define any class as spring component

  ```java
  @Component
  class ProductService{

  }
  ```

- @Autowired

  This annotation is used to automatically inject dependencies. In this example, MyRepository is automatically injected into MyService.

  ```java

      @Service

  public class MyService {
  private final MyRepository myRepository;

      @Autowired
      public MyService(MyRepository myRepository) {
          this.myRepository = myRepository;
      }

  }

  ```

- @Qualifier

  This annotation is used to disambiguate when there are multiple beans of the same type. In this example, the bean with the qualifier "myRepositoryImpl" is injected.

  ```java
  @Controller
  public class MyController {
      @RequestMapping("/hello")
      public String hello() {
          return "Hello, World!";
      }
  }

  ```

- @Controller

  This annotation marks a class as a controller. In this example, the method hello handles requests to the "/hello" URL.

  ```java
  @Controller
  public class MyController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }
  }


  ```

- @ResponseBody

      This annotation indicates that the return value of the method should be directly serialized to the HTTP response body.

  ````java

    @Controller

  public class MyController
  {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
    return "Hello, World!";
    }
  }

    ```
  ````

- @RestController

  This annotation is a combination of @Controller and @ResponseBody. In this example, it simplifies the creation of a RESTful web service.

  ```java
  @RestController
  public class MyRestController {
  @RequestMapping("/hello")
  public String hello() {
      return "Hello, World!";
  }
  ```

}

    ```

10. @RequestMapping

    This annotation is used to map a URL pattern to a method. In this example, the hello method responds to requests at the "/hello" URL.

    ```java
        @Controller
        public class MyController {
        @RequestMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }

        }


    ```

---

- @GetMapping
- @PostMapping
- @PutMapping
- @RequestBody
- @Services
- @Repository
- @EnableAutoConfigurations
- @EnableWebMvc
- @PropertySource
- @Value
- @ConfigureProperties

---

- @ConditionalOnProperty
- @Bean and @Scope
- @Entity
- @Table
- @Id
- @GeneratedValue
- @Column
- @Transient
- @EntityListeners
- @PrePersist 
- @PostPersist 
- @PreUpdate 
- @PostUpdate 
- @PreRemove 
- @PostRemove


---
- @OneToOne
- @OneToMany
- @ManyToMany
- @Query
- @Param
- @Transactional
