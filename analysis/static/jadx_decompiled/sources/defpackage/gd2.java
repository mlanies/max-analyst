package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gd2 {
    public final e52 a;

    public gd2(e52 e52Var) {
        this.a = e52Var;
    }

    public final boolean equals(Object obj) {
        uj3 uj3Var;
        uj3 uj3Var2;
        uj3 uj3Var3;
        uj3 uj3Var4;
        cu8 cu8Var;
        cu8 cu8Var2;
        es8 es8Var;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd2)) {
            return false;
        }
        e52 e52Var = this.a;
        es8 es8Var2 = e52Var.c;
        boolean zH = (es8Var2 == null || (es8Var = ((gd2) obj).a.c) == null) ? true : s5c.h(es8Var2, es8Var);
        k92 k92Var = e52Var.b;
        long j = k92Var.l;
        gd2 gd2Var = (gd2) obj;
        k92 k92Var2 = gd2Var.a.b;
        if (j == k92Var2.l && k92Var.a == k92Var2.a && k92Var.k == k92Var2.k) {
            es8 es8Var3 = e52Var.c;
            String strP = null;
            Long lValueOf = (es8Var3 == null || (cu8Var2 = es8Var3.a) == null) ? null : Long.valueOf(cu8Var2.h());
            e52 e52Var2 = gd2Var.a;
            es8 es8Var4 = e52Var2.c;
            if (tpa.f(lValueOf, (es8Var4 == null || (cu8Var = es8Var4.a) == null) ? null : Long.valueOf(cu8Var.h())) && zH) {
                String strD = (es8Var3 == null || (uj3Var4 = es8Var3.b) == null) ? null : uj3Var4.d();
                es8 es8Var5 = e52Var2.c;
                if (tpa.f(strD, (es8Var5 == null || (uj3Var3 = es8Var5.b) == null) ? null : uj3Var3.d())) {
                    kk0 kk0Var = kk0.a;
                    String strP2 = (es8Var3 == null || (uj3Var2 = es8Var3.b) == null) ? null : uj3Var2.p(kk0Var);
                    es8 es8Var6 = e52Var2.c;
                    if (es8Var6 != null && (uj3Var = es8Var6.b) != null) {
                        strP = uj3Var.p(kk0Var);
                    }
                    if (tpa.f(strP2, strP)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        uj3 uj3Var;
        uj3 uj3Var2;
        cu8 cu8Var;
        cu8 cu8Var2;
        int iHashCode2 = gd2.class.hashCode();
        e52 e52Var = this.a;
        int iHashCode3 = (Long.hashCode(e52Var.b.k) * 31) + (Long.hashCode(e52Var.b.a) * 31) + (Long.hashCode(e52Var.b.l) * 31) + iHashCode2;
        es8 es8Var = e52Var.c;
        String strP = null;
        Long lValueOf = (es8Var == null || (cu8Var2 = es8Var.a) == null) ? null : Long.valueOf(cu8Var2.h());
        int iHashCode4 = ((lValueOf != null ? lValueOf.hashCode() : 0) * 31) + iHashCode3;
        es8 es8Var2 = e52Var.c;
        k8g k8gVar = (es8Var2 == null || (cu8Var = es8Var2.a) == null) ? null : cu8Var.z0;
        if (k8gVar == null || k8gVar.i() == 0) {
            iHashCode = 0;
        } else {
            iHashCode = 0;
            for (int i = 0; i < k8gVar.i(); i++) {
                l20 l20VarH = k8gVar.h(i);
                if (l20VarH != null) {
                    iHashCode = (iHashCode * 31) + Boolean.hashCode(l20VarH.z) + ms2.d((Objects.hashCode(l20VarH.x) + h4f.m(h4f.m(h4f.m(ms2.d((Objects.hashCode(l20VarH.s) + ((Objects.hashCode(l20VarH.r) + ms2.c(h4f.m((Objects.hashCode(l20VarH.o) + ((Objects.hashCode(l20VarH.m) + ((Objects.hashCode(l20VarH.l) + ((Objects.hashCode(l20VarH.k) + ((Objects.hashCode(l20VarH.j) + ((Objects.hashCode(l20VarH.i) + ((Objects.hashCode(l20VarH.h) + ((Objects.hashCode(l20VarH.g) + ((Objects.hashCode(l20VarH.f) + ((Objects.hashCode(l20VarH.e) + ((Objects.hashCode(l20VarH.d) + ((Objects.hashCode(l20VarH.c) + ((Objects.hashCode(l20VarH.b) + (Objects.hashCode(l20VarH.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, l20VarH.p), l20VarH.q, 31)) * 31)) * 31, 31, l20VarH.t), 31, l20VarH.u), 31, l20VarH.v), 31, l20VarH.w)) * 31, 31, l20VarH.y);
                }
            }
        }
        int i2 = (iHashCode * 31) + iHashCode4;
        es8 es8Var3 = e52Var.c;
        String strD = (es8Var3 == null || (uj3Var2 = es8Var3.b) == null) ? null : uj3Var2.d();
        int iHashCode5 = ((strD != null ? strD.hashCode() : 0) * 31) + i2;
        es8 es8Var4 = e52Var.c;
        if (es8Var4 != null && (uj3Var = es8Var4.b) != null) {
            strP = uj3Var.p(kk0.a);
        }
        return ((strP != null ? strP.hashCode() : 0) * 31) + iHashCode5;
    }

    public final String toString() {
        cu8 cu8Var;
        e52 e52Var = this.a;
        k92 k92Var = e52Var.b;
        long j = k92Var.l;
        long j2 = k92Var.a;
        long j3 = k92Var.k;
        es8 es8Var = e52Var.c;
        long jH = (es8Var == null || (cu8Var = es8Var.a) == null) ? 0L : cu8Var.h();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(":");
        sb.append(j2);
        au1.q(j3, ":", ":", sb);
        sb.append(jH);
        return sb.toString();
    }
}
