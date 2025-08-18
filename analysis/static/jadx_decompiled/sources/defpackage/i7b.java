package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class i7b {
    public final SharedPreferences a;

    public i7b(Context context) {
        this.a = context.getSharedPreferences("webrtc-android-sdk-pref", 0);
    }
}
