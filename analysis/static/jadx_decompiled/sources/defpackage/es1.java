package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class es1 {
    public final e52 a;
    public final uj3 b;
    public final es8 c;
    public final dc1 d;
    public List e;

    public es1(es8 es8Var, uj3 uj3Var) {
        this.b = uj3Var;
        this.c = es8Var;
        this.a = null;
        this.d = null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(this.c.a.b));
        List list = this.e;
        if ((list == null ? 0 : list.size()) > 0) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((es1) it.next()).c.a.b));
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || es1.class != obj.getClass()) {
            return false;
        }
        es1 es1Var = (es1) obj;
        e52 e52Var = es1Var.a;
        e52 e52Var2 = this.a;
        if (e52Var2 == null ? e52Var != null : !e52Var2.equals(e52Var)) {
            return false;
        }
        uj3 uj3Var = es1Var.b;
        uj3 uj3Var2 = this.b;
        if (uj3Var2 == null ? uj3Var != null : !uj3Var2.equals(uj3Var)) {
            return false;
        }
        es8 es8Var = es1Var.c;
        es8 es8Var2 = this.c;
        if (es8Var2 == null ? es8Var != null : !es8Var2.equals(es8Var)) {
            return false;
        }
        dc1 dc1Var = es1Var.d;
        dc1 dc1Var2 = this.d;
        if (dc1Var2 == null ? dc1Var != null : !dc1Var2.equals(dc1Var)) {
            return false;
        }
        List list = this.e;
        return list != null ? list.equals(es1Var.e) : es1Var.e == null;
    }

    public final int hashCode() {
        e52 e52Var = this.a;
        int iHashCode = (e52Var != null ? e52Var.hashCode() : 0) * 31;
        uj3 uj3Var = this.b;
        int iHashCode2 = (iHashCode + (uj3Var != null ? uj3Var.hashCode() : 0)) * 31;
        es8 es8Var = this.c;
        int iHashCode3 = (iHashCode2 + (es8Var != null ? es8Var.hashCode() : 0)) * 31;
        dc1 dc1Var = this.d;
        int iHashCode4 = (iHashCode3 + (dc1Var != null ? dc1Var.hashCode() : 0)) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public es1(e52 e52Var, es8 es8Var) {
        this.a = e52Var;
        this.c = es8Var;
        this.b = null;
        this.d = null;
    }

    public es1(dc1 dc1Var) {
        this.d = dc1Var;
        this.a = null;
        this.c = null;
        this.b = null;
    }
}
