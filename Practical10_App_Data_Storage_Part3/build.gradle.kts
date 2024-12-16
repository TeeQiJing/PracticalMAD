// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
}

ext {
    // Declaring versions for dependencies
    extra["appCompatVersion"] = "1.5.1"
    extra["constraintLayoutVersion"] = "2.1.4"
    extra["coreTestingVersion"] = "2.1.0"
    extra["lifecycleVersion"] = "2.3.1"
    extra["materialVersion"] = "1.7.0"
    extra["roomVersion"] = "2.4.3"
    // Testing versions
    extra["junitVersion"] = "4.13.2"
    extra["espressoVersion"] = "3.5.0"
    extra["androidxJunitVersion"] = "1.1.2"
}
