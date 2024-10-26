@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.konan.properties.Properties
// use an integer for version numbers
version = 1

android {
    defaultConfig {
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())
        buildConfigField("String", "iptv_org", "\"${properties.getProperty("IPTV_ORG")}\"")
        buildConfigField("String", "public_japan_iptv_1", "\"${properties.getProperty("PUBLIC_JAPAN_IPTV_1")}\"")
        buildConfigField("String", "public_asian_iptv_1", "\"${properties.getProperty("PUBLIC_ASIAN_IPTV_1")}\"")
        buildConfigField("String", "public_asian_iptv_2", "\"${properties.getProperty("PUBLIC_ASIAN_IPTV_2")}\"")
        buildConfigField("String", "public_sports_iptv_1", "\"${properties.getProperty("PUBLIC_SPORTS_IPTV_1")}\"")
    }
}

cloudstream {
    // All of these properties are optional, you can safely remove them
    language = "universal"
    description = "Public IPTV Playlist aggregator"
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
