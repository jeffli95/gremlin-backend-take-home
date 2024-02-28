This project makes use of two external libraries, junit-jupiter and jackson-databind, and maven to handle dependency management.

In order to run this program, execute these commands in your cmd

```
mvn clean compile assembly:single
java -jar target/gremlin-backend-take-home-1.0-SNAPSHOT-jar-with-dependencies.jar {arguements}
```

My primary goal was to showcase OOP principles.
I have also used jackson library many times over the years and I really like it for its ability to convert JSON into POJO and vice versa.

There are also a few JUnit tests under the Test package which I used during my development.
