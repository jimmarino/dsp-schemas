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
    testImplementation("com.apicatalog:titanium-json-ld:1.4.1")
    testImplementation("org.glassfish:jakarta.json:2.0.1")
    testImplementation("com.fasterxml.jackson.core:jackson-databind:2.18.0")
    testImplementation("com.fasterxml.jackson.datatype:jackson-datatype-jakarta-jsonp:2.18.0")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.8.1")
        }
    }
}
