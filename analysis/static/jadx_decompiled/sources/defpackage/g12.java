package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g12 extends r5g {
    public final ArrayList k;
    public int l;

    public g12(hj3 hj3Var, int i) {
        hj3 hj3Var2;
        super(hj3Var);
        this.k = new ArrayList();
        this.f = i;
        hj3 hj3Var3 = this.b;
        hj3 hj3VarM = hj3Var3.m(i);
        while (true) {
            hj3 hj3Var4 = hj3VarM;
            hj3Var2 = hj3Var3;
            hj3Var3 = hj3Var4;
            if (hj3Var3 == null) {
                break;
            } else {
                hj3VarM = hj3Var3.m(this.f);
            }
        }
        this.b = hj3Var2;
        int i2 = this.f;
        r5g r5gVar = i2 == 0 ? hj3Var2.d : i2 == 1 ? hj3Var2.e : null;
        ArrayList arrayList = this.k;
        arrayList.add(r5gVar);
        hj3 hj3VarL = hj3Var2.l(this.f);
        while (hj3VarL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? hj3VarL.d : i3 == 1 ? hj3VarL.e : null);
            hj3VarL = hj3VarL.l(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r5g r5gVar2 = (r5g) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                r5gVar2.b.b = this;
            } else if (i4 == 1) {
                r5gVar2.b.c = this;
            }
        }
        if (this.f == 0 && ((ij3) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((r5g) wg0.f(arrayList, 1)).b;
        }
        this.l = this.f == 0 ? this.b.i0 : this.b.j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0153  */
    @Override // defpackage.oh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.oh4 r27) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.a(oh4):void");
    }

    @Override // defpackage.r5g
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r5g) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        hj3 hj3Var = ((r5g) arrayList.get(0)).b;
        hj3 hj3Var2 = ((r5g) arrayList.get(size - 1)).b;
        int i = this.f;
        sh4 sh4Var = this.i;
        sh4 sh4Var2 = this.h;
        if (i == 0) {
            oi3 oi3Var = hj3Var.I;
            oi3 oi3Var2 = hj3Var2.K;
            sh4 sh4VarI = r5g.i(oi3Var, 0);
            int iE = oi3Var.e();
            hj3 hj3VarM = m();
            if (hj3VarM != null) {
                iE = hj3VarM.I.e();
            }
            if (sh4VarI != null) {
                r5g.b(sh4Var2, sh4VarI, iE);
            }
            sh4 sh4VarI2 = r5g.i(oi3Var2, 0);
            int iE2 = oi3Var2.e();
            hj3 hj3VarN = n();
            if (hj3VarN != null) {
                iE2 = hj3VarN.K.e();
            }
            if (sh4VarI2 != null) {
                r5g.b(sh4Var, sh4VarI2, -iE2);
            }
        } else {
            oi3 oi3Var3 = hj3Var.J;
            oi3 oi3Var4 = hj3Var2.L;
            sh4 sh4VarI3 = r5g.i(oi3Var3, 1);
            int iE3 = oi3Var3.e();
            hj3 hj3VarM2 = m();
            if (hj3VarM2 != null) {
                iE3 = hj3VarM2.J.e();
            }
            if (sh4VarI3 != null) {
                r5g.b(sh4Var2, sh4VarI3, iE3);
            }
            sh4 sh4VarI4 = r5g.i(oi3Var4, 1);
            int iE4 = oi3Var4.e();
            hj3 hj3VarN2 = n();
            if (hj3VarN2 != null) {
                iE4 = hj3VarN2.L.e();
            }
            if (sh4VarI4 != null) {
                r5g.b(sh4Var, sh4VarI4, -iE4);
            }
        }
        sh4Var2.a = this;
        sh4Var.a = this;
    }

    @Override // defpackage.r5g
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((r5g) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.r5g
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((r5g) it.next()).f();
        }
    }

    @Override // defpackage.r5g
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((r5g) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.r5g
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((r5g) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final hj3 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            hj3 hj3Var = ((r5g) arrayList.get(i)).b;
            if (hj3Var.g0 != 8) {
                return hj3Var;
            }
            i++;
        }
    }

    public final hj3 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hj3 hj3Var = ((r5g) arrayList.get(size)).b;
            if (hj3Var.g0 != 8) {
                return hj3Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            r5g r5gVar = (r5g) it.next();
            sb.append("<");
            sb.append(r5gVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
