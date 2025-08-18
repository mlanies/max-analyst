package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class a9g {
    public static final a9g b;
    public bkg a;

    static {
        a9g a9gVar = new a9g();
        a9gVar.a = null;
        b = a9gVar;
    }

    public static bkg a(Context context) {
        bkg bkgVar;
        a9g a9gVar = b;
        synchronized (a9gVar) {
            try {
                if (a9gVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    a9gVar.a = new bkg(20, context);
                }
                bkgVar = a9gVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bkgVar;
    }
}
