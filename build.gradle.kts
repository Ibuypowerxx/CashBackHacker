plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.testng:testng:7.1.0")
<<<<<<< HEAD

=======
    testImplementation("junit:junit:4.13")
>>>>>>> 3d087d37abfbe674538e2459b1f819572ddd81fd

}

tasks.test {
    useJUnitPlatform()
    useTestNG()
<<<<<<< HEAD

=======
    useJUnit()
>>>>>>> 3d087d37abfbe674538e2459b1f819572ddd81fd


}