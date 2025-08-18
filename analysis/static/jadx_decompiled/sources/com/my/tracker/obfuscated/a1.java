package com.my.tracker.obfuscated;

import android.net.Uri;

/* loaded from: classes.dex */
public abstract class a1 {
    public static String a(String str, String str2, String str3) {
        return a(str + "." + str2, str3);
    }

    public static String a(String str, String str2) {
        Uri.Builder builderEncodedAuthority = new Uri.Builder().scheme("https").encodedAuthority(str);
        if (str2 != null) {
            builderEncodedAuthority.appendEncodedPath(str2);
        }
        return builderEncodedAuthority.toString();
    }
}
