package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class cu0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ cu0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws InterruptedException {
        qq8 qq8VarE;
        switch (this.a) {
            case 0:
                if (((AtomicBoolean) this.b).get()) {
                    throw new CancellationException();
                }
                du0 du0Var = (du0) this.c;
                rxd rxdVar = du0Var.g;
                ww0 ww0Var = (ww0) this.o;
                g05 g05VarW = rxdVar.W((tpd) ww0Var);
                pq9 pq9Var = du0Var.f;
                if (g05VarW != null) {
                    ta5.d(du0.class, ww0Var.c(), "Found image for %s in staging area");
                    pq9Var.getClass();
                } else {
                    ta5.d(du0.class, ww0Var.c(), "Did not find image for %s in staging area");
                    pq9Var.getClass();
                    g05VarW = null;
                    try {
                        qq8VarE = du0Var.e((tpd) ww0Var);
                    } catch (Exception unused) {
                    }
                    if (qq8VarE == null) {
                        return g05VarW;
                    }
                    v84 v84VarO0 = o43.o0(qq8VarE);
                    try {
                        g05VarW = new g05(v84VarO0);
                    } finally {
                        o43.S(v84VarO0);
                    }
                }
                if (Thread.interrupted()) {
                    if (ta5.a.i(2)) {
                        ta5.a.b(du0.class.getSimpleName());
                    }
                    g05VarW.close();
                    throw new InterruptedException();
                }
                return g05VarW;
            case 1:
                ah4 ah4Var = (ah4) this.b;
                ah4Var.getClass();
                return ah4Var.a.submit(new wt1((Callable) this.c, 28, (bkg) this.o));
            default:
                WorkDatabase workDatabase = ((y9b) this.b).X;
                k8g k8gVarZ = workDatabase.z();
                String str = (String) this.o;
                ((ArrayList) this.c).addAll(k8gVarZ.r(str));
                return workDatabase.y().l(str);
        }
    }
}
