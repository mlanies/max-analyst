package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class k8e implements Runnable {
    public static final String o = a14.O("StopWorkRunnable");
    public final s7g a;
    public final yzd b;
    public final boolean c;

    public k8e(s7g s7gVar, yzd yzdVar, boolean z) {
        this.a = s7gVar;
        this.b = yzdVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        v8g v8gVar;
        if (this.c) {
            y9b y9bVar = this.a.f;
            yzd yzdVar = this.b;
            y9bVar.getClass();
            String str = yzdVar.a.a;
            synchronized (y9bVar.w0) {
                try {
                    a14.u().n(y9b.x0, "Processor stopping foreground work " + str);
                    v8gVar = (v8g) y9bVar.Y.remove(str);
                    if (v8gVar != null) {
                        y9bVar.s0.remove(str);
                    }
                } finally {
                }
            }
            zC = y9b.c(str, v8gVar);
        } else {
            y9b y9bVar2 = this.a.f;
            yzd yzdVar2 = this.b;
            y9bVar2.getClass();
            String str2 = yzdVar2.a.a;
            synchronized (y9bVar2.w0) {
                try {
                    v8g v8gVar2 = (v8g) y9bVar2.Z.remove(str2);
                    if (v8gVar2 == null) {
                        a14.u().n(y9b.x0, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) y9bVar2.s0.get(str2);
                        if (set != null && set.contains(yzdVar2)) {
                            a14.u().n(y9b.x0, "Processor stopping background work " + str2);
                            y9bVar2.s0.remove(str2);
                            zC = y9b.c(str2, v8gVar2);
                        }
                    }
                    zC = false;
                } finally {
                }
            }
        }
        a14.u().n(o, "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + zC);
    }
}
