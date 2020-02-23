# Pull base image.
FROM gradle

LABEL maintainer="duclm22@viettel.com.vn"


# Define commonly used JAVA_HOME variable
# ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
# WORKDIR /home/gradle

COPY . /home/gradle

RUN pwd
RUN ls -l

RUN gradle build --refresh-dependencies

RUN ls -l build/libs

EXPOSE 6789

CMD ["java", "-jar", "./build/libs/gradle.jar"]

