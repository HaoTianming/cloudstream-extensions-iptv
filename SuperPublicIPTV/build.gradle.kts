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
        buildConfigField("String", "public_asian_iptv_3", "\"${properties.getProperty("PUBLIC_ASIAN_IPTV_3")}\"")
        buildConfigField("String", "public_asian_iptv_4", "\"${properties.getProperty("PUBLIC_ASIAN_IPTV_4")}\"")
        buildConfigField("String", "public_asian_iptv_5", "\"${properties.getProperty("PUBLIC_ASIAN_IPTV_5")}\"")
        buildConfigField("String", "public_asian_iptv_6", "\"${properties.getProperty("PUBLIC_ASIAN_IPTV_6")}\"")
        buildConfigField("String", "public_asian_iptv_7", "\"${properties.getProperty("PUBLIC_ASIAN_IPTV_7")}\"")
        buildConfigField("String", "public_americas_iptv_1", "\"${properties.getProperty("PUBLIC_AMERICAS_IPTV_1")}\"")
        buildConfigField("String", "public_bangladesh_iptv_1", "\"${properties.getProperty("PUBLIC_BANGLADESH_IPTV_1")}\"")
        buildConfigField("String", "public_brazil_iptv_1", "\"${properties.getProperty("PUBLIC_BRAZIL_IPTV_1")}\"")
        buildConfigField("String", "public_brazil_iptv_2", "\"${properties.getProperty("PUBLIC_BRAZIL_IPTV_2")}\"")
        buildConfigField("String", "public_brazil_iptv_2", "\"${properties.getProperty("PUBLIC_BRAZIL_IPTV_3")}\"")
        buildConfigField("String", "public_conflict_zone_iptv_1", "\"${properties.getProperty("PUBLIC_CONFLICT_ZONE_IPTV_1")}\"")
        buildConfigField("String", "public_france_iptv_1", "\"${properties.getProperty("PUBLIC_FRANCE_IPTV_1")}\"")
        buildConfigField("String", "public_greece_iptv_1", "\"${properties.getProperty("PUBLIC_GREECE_IPTV_1")}\"")
        buildConfigField("String", "public_hungary_iptv_1", "\"${properties.getProperty("PUBLIC_HUNGARY_IPTV_1")}\"")
        buildConfigField("String", "public_india_iptv_1", "\"${properties.getProperty("PUBLIC_INDIA_IPTV_1")}\"")
        buildConfigField("String", "public_international_iptv_1", "\"${properties.getProperty("PUBLIC_INTERNATIONAL_IPTV_1")}\"")
        buildConfigField("String", "public_international_iptv_2", "\"${properties.getProperty("PUBLIC_INTERNATIONAL_IPTV_2")}\"")
        buildConfigField("String", "public_international_iptv_3", "\"${properties.getProperty("PUBLIC_INTERNATIONAL_IPTV_3")}\"")
        buildConfigField("String", "public_international_iptv_4", "\"${properties.getProperty("PUBLIC_INTERNATIONAL_IPTV_4")}\"")
        buildConfigField("String", "public_malaysia_iptv_1", "\"${properties.getProperty("PUBLIC_MALAYSIA_IPTV_1")}\"")
        buildConfigField("String", "public_russia_iptv_1", "\"${properties.getProperty("PUBLIC_RUSSIA_IPTV_1")}\"")
        buildConfigField("String", "public_south_america_iptv_1", "\"${properties.getProperty("PUBLIC_SOUTH_AMERICA_IPTV_1")}\"")
        buildConfigField("String", "public_sports_iptv_1", "\"${properties.getProperty("PUBLIC_SPORTS_IPTV_1")}\"")
        buildConfigField("String", "public_sports_iptv_2", "\"${properties.getProperty("PUBLIC_SPORTS_IPTV_2")}\"")
        buildConfigField("String", "public_sports_iptv_3", "\"${properties.getProperty("PUBLIC_SPORTS_IPTV_3")}\"")
        buildConfigField("String", "public_sports_iptv_4", "\"${properties.getProperty("PUBLIC_SPORTS_IPTV_4")}\"")
        buildConfigField("String", "public_sports_iptv_5", "\"${properties.getProperty("PUBLIC_SPORTS_IPTV_5")}\"")
        buildConfigField("String", "public_tv_and_sports_events_iptv_1", "\"${properties.getProperty("PUBLIC_TV_AND_SPORTS_EVENTS_IPTV_1")}\"")
        buildConfigField("String", "public_tamil_iptv_1", "\"${properties.getProperty("PUBLIC_TAMIL_IPTV_1")}\"")
        buildConfigField("String", "public_thai_iptv_1", "\"${properties.getProperty("PUBLIC_THAI_IPTV_1")}\"")
        buildConfigField("String", "public_thai_iptv_2", "\"${properties.getProperty("PUBLIC_THAI_IPTV_2")}\"")
        buildConfigField("String", "public_turkiye_iptv_1", "\"${properties.getProperty("PUBLIC_TURKIYE_IPTV_1")}\"")
        buildConfigField("String", "public_us_iptv_1", "\"${properties.getProperty("PUBLIC_US_IPTV_1")}\"")
        buildConfigField("String", "public_us_iptv_2", "\"${properties.getProperty("PUBLIC_US_IPTV_2")}\"")
        buildConfigField("String", "public_us_iptv_3", "\"${properties.getProperty("PUBLIC_US_IPTV_3")}\"")
        buildConfigField("String", "public_us_iptv_4", "\"${properties.getProperty("PUBLIC_US_IPTV_4")}\"")
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
