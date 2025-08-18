package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dl5 implements re0 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.re0
    public final void a(boolean z) {
        synchronized (fl5.j) {
            try {
                Iterator it = new ArrayList(fl5.k.values()).iterator();
                while (it.hasNext()) {
                    fl5 fl5Var = (fl5) it.next();
                    if (fl5Var.e.get()) {
                        Iterator it2 = fl5Var.i.iterator();
                        while (it2.hasNext()) {
                            fl5 fl5Var2 = ((cl5) it2.next()).a;
                            if (z) {
                                fl5Var2.getClass();
                            } else {
                                ((bb4) fl5Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
