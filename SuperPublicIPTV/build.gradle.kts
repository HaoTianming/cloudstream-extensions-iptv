@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.konan.properties.Properties
// use an integer for version numbers
version = 1

android {
    defaultConfig {
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())
        buildConfigField("String", "iptv_org", "\"${properties.getProperty("iptv_org")}\"")
        buildConfigField("String", "public_japan_iptv_1", "\"${properties.getProperty("public_japan_iptv_1")}\"")
        buildConfigField("String", "public_asian_iptv_1", "\"${properties.getProperty("public_asian_iptv_1")}\"")
        buildConfigField("String", "public_asian_iptv_2", "\"${properties.getProperty("public_asian_iptv_2")}\"")
        buildConfigField("String", "public_sports_iptv_1", "\"${properties.getProperty("public_sports_iptv_1")}\"")
    }
}

cloudstream {
    // All of these properties are optional, you can safely remove them
    language = "international"
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
