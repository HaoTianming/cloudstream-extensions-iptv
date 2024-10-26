package com.HaoTianming
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class PublicIPTVPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(PublicSportsIPTV4())
        registerMainAPI(PublicInternationalIPTV2())
        registerMainAPI(PublicSportsIPTV1())
        registerMainAPI(PublicInternationalIPTV1())
        registerMainAPI(PublicTamilIPTV1())
        registerMainAPI(PublicSportsIPTV5())
        registerMainAPI(PublicInternationalIPTV3())
        registerMainAPI(PublicJapanIPTV1())
        registerMainAPI(PublicUSIPTV2())
        registerMainAPI(PublicUSIPTV1())
        registerMainAPI(PublicIPTV())
        registerMainAPI(PublicSportsIPTV2())
        registerMainAPI(PublicMalaysiaIPTV1())
        registerMainAPI(PublicUSIPTV3())
        registerMainAPI(PublicUSIPTV4())
        registerMainAPI(PublicBrazilIPTV1())
        registerMainAPI(PublicBrazilIPTV2())
        registerMainAPI(PublicSouthAmericaIPTV())
        registerMainAPI(PublicTVAndSportsEventsIPTV1())
        registerMainAPI(PublicThaiIPTV1())
        registerMainAPI(PublicThaiIPTV2())
        registerMainAPI(PublicRussiaIPTV1())
        registerMainAPI(PublicGreeceIPTV1())
        registerMainAPI(PublicHungaryIPTV1())
        registerMainAPI(PublicFranceIPTV1())
        registerMainAPI(PublicConflictZoneIPTV1())
        registerMainAPI(PublicInternationalIPTV4())
        registerMainAPI(PublicAmericasIPTV1())
        registerMainAPI(PublicAsianIPTV1())
        registerMainAPI(PublicAsianIPTV2())
        registerMainAPI(PublicAsianIPTV3())
        registerMainAPI(PublicAsianIPTV4())
        registerMainAPI(PublicAsianIPTV5())
        registerMainAPI(PublicAsianIPTV6())
        registerMainAPI(PublicAsianIPTV7())
        registerMainAPI(PublicBangladeshIPTV1())
        registerMainAPI(PublicIndiaIPTV1())
        registerMainAPI(PublicTurkiyeIPTV1())
        registerMainAPI(PublicSportsIPTV3())
    }
}
