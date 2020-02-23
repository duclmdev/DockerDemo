repositories {
    mavenCentral()
}

plugins { java }

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    val lombokV = "1.18.10"
    // implementation(fileTree("/libs"))

    implementation("org.slf4j:slf4j-api:1.7.26")
    implementation("ch.qos.logback:logback-core:1.2.3")
    implementation("ch.qos.logback:logback-classic:1.2.3")

    compileOnly("org.projectlombok:lombok:$lombokV")
    annotationProcessor("org.projectlombok:lombok:$lombokV")

    testImplementation("junit:junit:4.12")
    testAnnotationProcessor("org.projectlombok:lombok:$lombokV")
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "com.viettel.demo.TCPClient"
    }
}
