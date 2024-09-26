## Basic Commands

### Building the Application

To build the application, run the following command:
```
./gradlew bootJar
```

To run your application without docker:
```
./gradlew bootRun
```

### Creating a New Image

To create a new image, run the following command:
```
docker build -t spring:0.0.1 .
```
> Note: Set the version as you want.

### Running a Container

To run a container, use the following command:
```
docker run -p 8080:8080 spring:0.0.1
```