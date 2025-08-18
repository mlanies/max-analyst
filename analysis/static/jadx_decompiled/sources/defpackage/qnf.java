package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class qnf {
    public final mu3 a = new mu3();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        mu3 mu3Var = this.a;
        if (mu3Var != null) {
            if (mu3Var.a) {
                mu3.b(autoCloseable);
                return;
            }
            synchronized (((qx7) mu3Var.b)) {
                autoCloseable2 = (AutoCloseable) ((LinkedHashMap) mu3Var.c).put(str, autoCloseable);
            }
            mu3.b(autoCloseable2);
        }
    }

    public final void b() {
        mu3 mu3Var = this.a;
        if (mu3Var != null && !mu3Var.a) {
            mu3Var.a = true;
            synchronized (((qx7) mu3Var.b)) {
                try {
                    Iterator it = ((LinkedHashMap) mu3Var.c).values().iterator();
                    while (it.hasNext()) {
                        mu3.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = ((LinkedHashSet) mu3Var.d).iterator();
                    while (it2.hasNext()) {
                        mu3.b((AutoCloseable) it2.next());
                    }
                    ((LinkedHashSet) mu3Var.d).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        mu3 mu3Var = this.a;
        if (mu3Var == null) {
            return null;
        }
        synchronized (((qx7) mu3Var.b)) {
            autoCloseable = (AutoCloseable) ((LinkedHashMap) mu3Var.c).get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
