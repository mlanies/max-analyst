package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final /* synthetic */ class jg4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg4 b;

    public /* synthetic */ jg4(kg4 kg4Var, int i) {
        this.a = i;
        this.b = kg4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        kg4 kg4Var = this.b;
        switch (i) {
            case 0:
                kg4.b(kg4Var);
                return;
            default:
                if (kg4Var.Z != 0) {
                    a14.u().n(kg4.x0, "Already started work for " + kg4Var.c);
                    return;
                }
                kg4Var.Z = 1;
                a14.u().n(kg4.x0, "onAllConstraintsMet for " + kg4Var.c);
                if (!kg4Var.o.o.h(kg4Var.w0, null)) {
                    kg4Var.c();
                    return;
                }
                n8g n8gVar = kg4Var.o.c;
                l7g l7gVar = kg4Var.c;
                synchronized (n8gVar.d) {
                    a14.u().n(n8g.e, "Starting timer for " + l7gVar);
                    n8gVar.a(l7gVar);
                    m8g m8gVar = new m8g(n8gVar, l7gVar);
                    n8gVar.b.put(l7gVar, m8gVar);
                    n8gVar.c.put(l7gVar, kg4Var);
                    ((Handler) n8gVar.a.a).postDelayed(m8gVar, 600000L);
                }
                return;
        }
    }
}
