package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class z05 implements k05, ry9 {
    public final LinkedHashMap a = new LinkedHashMap();
    public lt0 b = lt0.b;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ d15 o;

    public z05(d15 d15Var) {
        this.o = d15Var;
    }

    public final void a(boolean z) {
        lt0 lt0Var = lt0.b;
        lt0 lt0Var2 = z ? lt0.a : lt0Var;
        if (this.b == lt0Var2) {
            return;
        }
        this.b = lt0Var2;
        if (lt0Var2 == lt0Var) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bm7) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new kl4(entry, 10, lt0Var2));
            } catch (RejectedExecutionException unused) {
                String str = this.o.a;
            }
        }
    }

    @Override // defpackage.ry9
    public final void f(Executor executor, py9 py9Var) {
        this.o.h.execute(new v05(this, py9Var, executor, 0));
    }

    @Override // defpackage.ry9
    public final bm7 j() {
        return f8.g(new w05(this, 0));
    }

    @Override // defpackage.ry9
    public final void l(py9 py9Var) {
        this.o.h.execute(new kl4(this, 12, py9Var));
    }
}
