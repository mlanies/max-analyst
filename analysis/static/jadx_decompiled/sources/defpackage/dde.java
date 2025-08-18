package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class dde implements qj3, bce {
    public final /* synthetic */ ede a;

    public /* synthetic */ dde(ede edeVar) {
        this.a = edeVar;
    }

    @Override // defpackage.bce
    public List a() {
        ede edeVar = this.a;
        ArrayList arrayListJ = edeVar.n.j();
        ((oq3) edeVar.m.getValue()).b(arrayListJ);
        return arrayListJ;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        h62 h62Var = (h62) obj;
        ede edeVar = this.a;
        edeVar.getClass();
        eq0 eq0Var = new eq0(h62Var.c, h62Var.o);
        long j = edeVar.n.a;
        dq0 dq0Var = edeVar.d;
        dq0Var.getClass();
        cqc.a(new t5(dq0Var, j, eq0Var), (ztc) cqc.a.b, null, new un0(2), null);
        List list = h62Var.c;
        HashMap map = h62Var.o;
        y8 y8Var = edeVar.f;
        y8Var.getClass();
        List listEmptyList = list == null ? Collections.emptyList() : nd7.F(list, new f9(y8Var, 3, map));
        synchronized (edeVar) {
            edeVar.p.clear();
            edeVar.p.addAll(listEmptyList);
        }
    }
}
