package com.my.tracker.obfuscated;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes.dex */
public final class z {
    private y a;
    protected boolean b = false;

    private static y b(Context context) {
        y0.a("GoogleAdInfoDataProvider: get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            y0.a("GoogleAdInfoDataProvider: AId: " + id);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            y0.a("GoogleAdInfoDataProvider: AId ad tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new y(id, zIsLimitAdTrackingEnabled);
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                y0.a("GoogleAdInfoDataProvider: google AId is not found");
                return null;
            }
            y0.a("GoogleAdInfoDataProvider: failed to get google AId", th);
            return null;
        }
    }

    public y a(Context context) {
        if (!this.b) {
            this.a = b(context);
            this.b = true;
        }
        return this.a;
    }
}
