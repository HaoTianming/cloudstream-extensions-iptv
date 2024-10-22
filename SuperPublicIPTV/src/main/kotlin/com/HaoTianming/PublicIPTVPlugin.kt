package com.HaoTianming
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class PublicIPTVPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(iptv_org())
        registerMainAPI(public_japan_iptv_1())
        registerMainAPI(public_asian_iptv_1())
        registerMainAPI(public_asian_iptv_2())
        registerMainAPI(public_sports_iptv_1())
    }
}
