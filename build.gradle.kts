plugins {
    // Aplica o plugin de Kotlin apenas onde necessário, sem forçar em todos os submódulos
    kotlin("jvm") version "1.9.22" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}