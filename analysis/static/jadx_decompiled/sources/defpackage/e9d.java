package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class e9d extends g9d {
    public final List A0;
    public List B0;
    public final boolean C0;
    public final String z0;

    public e9d(d9d d9dVar) {
        super(d9dVar);
        this.z0 = d9dVar.m;
        this.A0 = d9dVar.n;
        this.B0 = d9dVar.l;
        this.C0 = d9dVar.o;
    }

    @Override // defpackage.g9d
    public bu8 y() throws Throwable {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.B0.size());
        Iterator it = this.B0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o2 o2Var = (o2) it.next();
            if (o2Var instanceof k00) {
                arrayList2.add(o2Var);
                arrayList.add(((k00) o2Var).c);
            } else {
                e8d e8dVar = this.a;
                lpa lpaVarB = ((s9b) (e8dVar != null ? e8dVar : null).B.getValue()).b(o2Var, this.C0);
                if (lpaVarB != null) {
                    o2 o2Var2 = (o2) lpaVarB.a;
                    l20 l20Var = (l20) lpaVarB.b;
                    if (o2Var2 != null && l20Var != null) {
                        arrayList2.add(o2Var2);
                        arrayList.add(l20Var);
                    }
                }
            }
        }
        String str = this.z0;
        if ((str == null || str.length() == 0) && arrayList2.isEmpty()) {
            return null;
        }
        this.B0 = arrayList2;
        m20 m20Var = new m20();
        m20Var.a = arrayList;
        k8g k8gVarC = m20Var.c();
        bu8 bu8Var = new bu8();
        bu8Var.n = k8gVarC;
        if (!oag.t(str)) {
            bu8Var.g = str;
        }
        List list = this.A0;
        if (list != null && !list.isEmpty()) {
            bu8Var.F = list;
        }
        return bu8Var;
    }

    @Override // defpackage.g9d
    public long z(long j, e52 e52Var) {
        cu8 cu8Var;
        int i;
        int i2;
        long jZ = super.z(j, e52Var);
        cu8 cu8VarQ = o().q(j);
        if (cu8VarQ == null) {
            return 0L;
        }
        int size = this.B0.size();
        int i3 = 0;
        while (i3 < size) {
            o2 o2Var = (o2) this.B0.get(i3);
            String str = cu8VarQ.z0.h(i3).r;
            if (o2Var instanceof y95) {
                y95 y95Var = (y95) o2Var;
                cu8Var = cu8VarQ;
                i = i3;
                i2 = size;
                u().b(new aa5(((p7b) p()).a.o(), j, y95Var.b, e52Var.a, str, y95Var.Y));
            } else {
                cu8Var = cu8VarQ;
                i = i3;
                i2 = size;
                if (!(o2Var instanceof k00)) {
                    e8d e8dVar = this.a;
                    if (e8dVar == null) {
                        e8dVar = null;
                    }
                    ((dg5) e8dVar.b.getValue()).c(o2Var, j, e52Var.a, str);
                }
            }
            i3 = i + 1;
            cu8VarQ = cu8Var;
            size = i2;
        }
        return jZ;
    }
}
