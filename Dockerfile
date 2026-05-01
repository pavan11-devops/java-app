FROM eclipse-temurin:17-jdk

COPY target/movie-ticket-booking.jar .

ENTRYPOINT ["java", "-jar", "movie-ticket-booking.jar"]
