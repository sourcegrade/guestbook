plugins {
    id("kotlin-js.base-conventions")
}

fun kotlinw(target: String): String =
    "org.jetbrains.kotlin-wrappers:kotlin-$target"

dependencies {
    commonMainImplementation(project(":guestbook-kotlin-app-web"))

    commonMainImplementation(libs.bundles.ktor.client)
    jsMainImplementation(enforcedPlatform(kotlinw("wrappers-bom:1.0.0-pre.605")))

    jsMainImplementation(kotlinw("react"))
    jsMainImplementation(kotlinw("react-dom"))
    jsMainImplementation(kotlinw("react-router-dom"))

    jsMainImplementation(kotlinw("emotion"))
    jsMainImplementation(kotlinw("mui"))
    jsMainImplementation(kotlinw("mui-icons"))

    jsMainImplementation(npm("date-fns", "2.29.3"))
    jsMainImplementation(npm("@date-io/date-fns", "2.16.0"))
    jsMainImplementation(npm("uuid", "9.0.0"))
    jsMainImplementation(npm("is-sorted", "1.0.5"))
}
