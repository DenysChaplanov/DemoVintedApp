//configuration for uploading images
package com.vinted.demovinted.data.helpers

import android.content.Context
import android.graphics.Bitmap
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions

@GlideModule
class GlideModule : AppGlideModule() {

    override fun applyOptions(context: Context, builder: GlideBuilder) {
        builder.setDefaultRequestOptions(
            RequestOptions()
                .format(DecodeFormat.PREFER_ARGB_8888)
                .encodeFormat(Bitmap.CompressFormat.WEBP)
                .skipMemoryCache(false)
                .apply(RequestOptions.centerInsideTransform())
                .disallowHardwareConfig()
        )
    }
}