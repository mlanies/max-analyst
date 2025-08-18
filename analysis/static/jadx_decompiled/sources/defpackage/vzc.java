package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class vzc implements xzc {
    public final p82 a;
    public final el3 b;
    public final oq3 c;
    public final b0d d;
    public final boolean e;

    public vzc(p82 p82Var, el3 el3Var, oq3 oq3Var, b0d b0dVar, boolean z) {
        this.a = p82Var;
        this.b = el3Var;
        this.c = oq3Var;
        this.d = b0dVar;
        this.e = z;
    }

    @Override // defpackage.xzc
    public final List a(String str) {
        List listE;
        b0d b0dVar;
        gi9 gi9Var = new gi9((Object) null);
        boolean z = this.e;
        p82 p82Var = this.a;
        if (z) {
            v00 v00Var = p82.I;
            ArrayList arrayListD = p82Var.D(p82.M, true, null);
            Collections.sort(arrayListD, v00Var);
            listE = Collections.unmodifiableList(arrayListD);
        } else {
            listE = p82Var.E(p82.I);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            b0dVar = this.d;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (b0dVar.f((e52) next, str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            c63.U(arrayList, new ky6(12));
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e52 e52Var = (e52) it2.next();
            uj3 uj3VarL = e52Var.l();
            if (uj3VarL != null) {
                gi9Var.a(uj3VarL.n());
            }
            arrayList2.add(b0dVar.a(e52Var, str));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        List listK = this.b.k();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : listK) {
            uj3 uj3Var = (uj3) obj;
            if (!gi9Var.d(uj3Var.n()) && b0dVar.g(uj3Var, str)) {
                arrayList4.add(obj);
            }
        }
        oq3 oq3Var = this.c;
        oq3Var.getClass();
        c63.U(arrayList4, new ca3(2, oq3Var));
        ArrayList arrayList5 = new ArrayList(z53.S(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(b0dVar.b((uj3) it3.next(), str));
        }
        arrayList3.addAll(arrayList5);
        return arrayList3;
    }
}
