## Spring Cloud Skeleton

This is a demo app for microservice architecture using Spring Cloud. The list of technologies used in the app:

*   Spring Cloud Netflix
*   Spring Boot
*   Gradle

### Modules.

*   discovery. It allows services to find and communicate with each other.
*   gateway. Provides server-side load balancing.
*   common. A library that contains classes shared among modules.
*   admin. A web application, used for managing and monitoring Spring Boot applications, using Spring Boot Actuator endpoints.
*   zoo. A web application providing some business logic.

### Building and running.

In the root folder execute:

```plaintext
./gradlew build
```

After finishing, all jar files will be in a bin folder.

To run the services, use this command:

```plaintext
java -jar ./bin/service.jar
```

All services depend on discovery service, so discovery service should be started before any others.

### Usage.

Using a REST client, you can send a request to the zoo service:

URL: http://localhost:8080/api/v1/zoo/tickets/buy POST

Headers: Content-Type application/json

Body:

```plaintext
{
 "firstName": "foo",
 "lastName": "bar" 
}
```

### License.

[The MIT License (MIT)](LICENSE)
