# Pull base image.
FROM gradle

LABEL maintainer="duclm22@viettel.com.vn"

COPY . /home/gradle

RUN gradle build --refresh-dependencies

# Define default command.
RUN ls -l build/libs

CMD ["java", "-jar", "./build/libs/gradle.jar"]


