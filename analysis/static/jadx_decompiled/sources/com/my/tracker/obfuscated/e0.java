package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes.dex */
public final class e0 {
    private d0 a = null;
    protected boolean b = false;

    private static d0 b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            y0.a("HuaweiAdInfoDataProvider: oaid: " + id);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            y0.a("HuaweiAdInfoDataProvider: oaid tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new d0(id, zIsLimitAdTrackingEnabled);
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                y0.a("HuaweiAdInfoDataProvider: huawei AId is not found");
                return null;
            }
            y0.a("HuaweiAdInfoDataProvider: failed to get huawei AId", th);
            return null;
        }
    }

    public d0 a(Context context) {
        if (!this.b) {
            this.a = b(context);
            this.b = true;
        }
        return this.a;
    }
}
