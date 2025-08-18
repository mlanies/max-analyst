package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class ei8 {
    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }
}
