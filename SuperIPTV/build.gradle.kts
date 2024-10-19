@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.konan.properties.Properties
// use an integer for version numbers
version = 1

android {
    defaultConfig {
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())
        buildConfigField("String", "PublicIPTV", "\"${properties.getProperty("PublicIPTV")}\"")
        buildConfigField("String", "PublicJapanIPTV1", "\"${properties.getProperty("PublicJapanIPTV1")}\"")
        buildConfigField("String", "PublicAsianIPTV1", "\"${properties.getProperty("PublicAsianIPTV1")}\"")
        buildConfigField("String", "PublicAsianIPTV2", "\"${properties.getProperty("PublicAsianIPTV2")}\"")
        buildConfigField("String", "PublicSportsIPTV1", "\"${properties.getProperty("PublicSportsIPTV1")}\"")
    }
}

cloudstream {
    // All of these properties are optional, you can safely remove them
    language = "en"
    description = "IPTV Playlist aggregator"
    authors = listOf("HaoTianming")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "Live",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=github.com&sz=%size%"
}
