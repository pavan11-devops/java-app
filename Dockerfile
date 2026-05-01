FROM openjdk:17

COPY target/movie-ticket-booking.jar .

ENTRYPOINT ["java", "-jar", "movie-ticket-booking.jar"]
