import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("io.qameta.allure") version "2.11.2"
    kotlin("jvm") version "1.8.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation ("org.seleniumhq.selenium:selenium-java:4.10.0")
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.10.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}
allure{
    report {
        version.set("2.19.0")
        adapter {
            frameworks {
                junit5 {
                    adapterVersion.set("2.19.0")

                }
            }
        }
    }
}