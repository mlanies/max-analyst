package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class zza extends Thread {
    final /* synthetic */ Map zza;

    public zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.zza = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Map map = this.zza;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zze.zza(builderBuildUpon.build().toString());
    }
}
