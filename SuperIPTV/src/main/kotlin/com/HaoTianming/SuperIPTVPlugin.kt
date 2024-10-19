package com.HaoTianming
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class QuickIPTVPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(PublicIPTV())
        registerMainAPI(PublicIPTVJapan1())
        registerMainAPI(PublicBangladeshIPTV1())
        registerMainAPI(())
    }
}
