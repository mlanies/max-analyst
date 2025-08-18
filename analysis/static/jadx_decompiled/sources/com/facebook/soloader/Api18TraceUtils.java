package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import defpackage.au1;
import defpackage.om4;
import defpackage.rh4;

@om4
@TargetApi(18)
/* loaded from: classes.dex */
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String strJ = rh4.j(str, str2, str3);
        if (strJ.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbL = au1.l(str);
            sbL.append(str2.substring(0, length));
            sbL.append(str3);
            strJ = sbL.toString();
        }
        Trace.beginSection(strJ);
    }
}
