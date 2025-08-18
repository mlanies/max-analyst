package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ns implements cc7 {
    public final cc7 a;
    public final ls b;

    public ns(cc7 cc7Var) {
        this.a = cc7Var;
        this.b = new ls(cc7Var.d());
    }

    @Override // defpackage.cc7
    public Object a(x8 x8Var) {
        return j(x8Var);
    }

    @Override // defpackage.cc7
    public void b(xu3 xu3Var, Object obj) {
        int iH = h(obj);
        xu3 xu3VarB = xu3Var.b(d());
        Iterator itG = g(obj);
        for (int i = 0; i < iH; i++) {
            xu3VarB.k(d(), i, this.a, itG.next());
        }
        xu3VarB.o();
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return this.b;
    }

    public final Object e() {
        return new ArrayList();
    }

    public final int f(Object obj) {
        return ((ArrayList) obj).size();
    }

    public final Iterator g(Object obj) {
        return ((Collection) obj).iterator();
    }

    public final int h(Object obj) {
        return ((Collection) obj).size();
    }

    public final void i(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }

    public final Object j(x8 x8Var) throws Throwable {
        Object objE = e();
        int iF = f(objE);
        x8 x8VarJ = x8Var.j(d());
        while (true) {
            int iP = x8VarJ.p(d());
            if (iP == -1) {
                x8VarJ.z(d());
                return l(objE);
            }
            k(x8VarJ, iP + iF, objE, true);
        }
    }

    public void k(x8 x8Var, int i, Object obj, boolean z) {
        i(obj, i, x8Var.t(d(), i, this.a, null));
    }

    public final Object l(Object obj) {
        return (ArrayList) obj;
    }
}
