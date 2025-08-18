package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class asb implements l66 {
    public static wrb a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrB = b(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] strArrB2 = b(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        Arrays.toString(strArrB);
        Arrays.toString(strArrB2);
        return new wrb(z, new HashSet(c(strArrB)), new HashSet(c(strArrB2)));
    }

    public static String[] b(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            return new String[0];
        }
    }

    public static HashSet c(String[] strArr) throws ClassNotFoundException {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException unused) {
            }
            if (!vrb.class.isAssignableFrom(cls)) {
                cls = null;
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }
}
