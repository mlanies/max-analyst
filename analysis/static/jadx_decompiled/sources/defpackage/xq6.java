package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class xq6 extends pj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xq6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pj0
    public final void a() {
        boolean zRemove;
        ArrayList arrayList;
        oj0 oj0Var;
        ArrayList arrayListL;
        ArrayList arrayListJ;
        g05 g05Var;
        switch (this.a) {
            case 0:
                if (((Future) this.b).cancel(false)) {
                    h7b h7bVar = (h7b) this.c;
                    ((un9) h7bVar.c).getClass();
                    hf5 hf5Var = (hf5) h7bVar.b;
                    hf5Var.a().k(hf5Var.b, "NetworkFetchProducer");
                    hf5Var.a.c();
                    return;
                }
                return;
            case 1:
                synchronized (((vg9) this.c)) {
                    try {
                        zRemove = ((vg9) this.c).b.remove((Pair) this.b);
                        arrayList = null;
                        if (!zRemove) {
                            oj0Var = null;
                            arrayListL = null;
                        } else if (((vg9) this.c).b.isEmpty()) {
                            oj0Var = ((vg9) this.c).f;
                            arrayListL = null;
                        } else {
                            ArrayList arrayListK = ((vg9) this.c).k();
                            arrayListL = ((vg9) this.c).l();
                            arrayListJ = ((vg9) this.c).j();
                            oj0Var = null;
                            arrayList = arrayListK;
                        }
                        arrayListJ = arrayListL;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oj0.c(arrayList);
                oj0.d(arrayListL);
                oj0.b(arrayListJ);
                if (oj0Var != null) {
                    if (!((vg9) this.c).h.c || oj0Var.g()) {
                        oj0Var.e();
                    } else {
                        oj0.d(oj0Var.i(a9b.a));
                    }
                }
                if (zRemove) {
                    ((fi0) ((Pair) this.b).first).c();
                    return;
                }
                return;
            case 2:
                hic hicVar = (hic) this.c;
                n87 n87Var = hicVar.g;
                synchronized (n87Var) {
                    g05Var = n87Var.e;
                    n87Var.e = null;
                    n87Var.f = 0;
                }
                g05.d(g05Var);
                hicVar.f = true;
                ((fi0) this.b).c();
                return;
            case 3:
                Looper looperMyLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                b8c b8cVar = (b8c) this.b;
                if (looperMyLooper != mainLooper) {
                    b8cVar.d();
                    return;
                }
                ExecutorService executorService = ((ble) this.c).p;
                Objects.requireNonNull(b8cVar);
                executorService.execute(new u3c(28, b8cVar));
                return;
            default:
                w0e w0eVar = (w0e) this.b;
                w0eVar.a();
                ((aab) ((sse) this.c).c).o((ip7) w0eVar);
                return;
        }
    }

    @Override // defpackage.pj0
    public void b() {
        switch (this.a) {
            case 1:
                oj0.b(((vg9) this.c).j());
                break;
            case 2:
                hic hicVar = (hic) this.c;
                if (((oj0) hicVar.e).f()) {
                    hicVar.g.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pj0
    public void c() {
        switch (this.a) {
            case 1:
                oj0.c(((vg9) this.c).k());
                break;
        }
    }

    @Override // defpackage.pj0
    public void d() {
        switch (this.a) {
            case 1:
                oj0.d(((vg9) this.c).l());
                break;
        }
    }

    public /* synthetic */ xq6(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
