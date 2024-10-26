plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.networknt:json-schema-validator:1.5.2")  {
        exclude("com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml")
    }

    testImplementation("org.assertj:assertj-core:3.26.3")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.8.1")
        }
    }
}
