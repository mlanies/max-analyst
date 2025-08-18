package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class xp implements up {
    public final fig b;

    public xp(Context context) {
        hgf hgfVar;
        synchronized (tfg.class) {
            try {
                if (tfg.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    tfg.a = new hgf(new y7f(4, applicationContext != null ? applicationContext : context));
                }
                hgfVar = tfg.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = (fig) ((ifg) hgfVar.a).r();
    }
}
