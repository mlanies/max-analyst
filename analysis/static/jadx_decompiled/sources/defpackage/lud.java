package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class lud extends mud {
    public static lud a(String str, Context context, nud[] nudVarArr) {
        StringBuilder sbM = au1.m("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < nudVarArr.length; i++) {
            sbM.append("\n\t\tSoSource ");
            sbM.append(i);
            sbM.append(": ");
            sbM.append(nudVarArr[i].toString());
        }
        if (context != null) {
            sbM.append("\n\tNative lib dir: ");
            sbM.append(context.getApplicationInfo().nativeLibraryDir);
            sbM.append("\n");
        }
        return new lud(str, sbM.toString());
    }
}
