package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class n8g {
    public static final String e = a14.O("WorkTimer");
    public final y8 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public n8g(y8 y8Var) {
        this.a = y8Var;
    }

    public final void a(l7g l7gVar) {
        synchronized (this.d) {
            try {
                if (((m8g) this.b.remove(l7gVar)) != null) {
                    a14.u().n(e, "Stopping timer for " + l7gVar);
                    this.c.remove(l7gVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
