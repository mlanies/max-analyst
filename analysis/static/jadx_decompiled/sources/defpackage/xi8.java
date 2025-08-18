package defpackage;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public final class xi8 {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile xi8 d;
    public ui8 a;

    public static xi8 a(Context context) {
        xi8 xi8Var;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    xi8 xi8Var2 = new xi8();
                    ui8 ui8Var = new ui8(applicationContext);
                    xi8Var2.a = ui8Var;
                    d = xi8Var2;
                }
                xi8Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xi8Var;
    }

    public final boolean b(vi8 vi8Var) {
        if (vi8Var != null) {
            return this.a.b(vi8Var.a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
