package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class mx0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public b94 e;

    public mx0(int i, String str, b94 b94Var) {
        this.a = i;
        this.b = str;
        this.e = b94Var;
    }

    public final long a(long j, long j2) {
        fm9.f(j >= 0);
        fm9.f(j2 >= 0);
        vpd vpdVarB = b(j, j2);
        boolean z = true ^ vpdVarB.o;
        long j3 = vpdVarB.c;
        if (z) {
            return -Math.min(j3 != -1 ? j3 : Long.MAX_VALUE, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = vpdVarB.b + j3;
        if (jMax < j5) {
            for (vpd vpdVar : this.c.tailSet(vpdVarB, false)) {
                long j6 = vpdVar.b;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + vpdVar.c);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final vpd b(long j, long j2) {
        vpd vpdVar = new vpd(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        vpd vpdVar2 = (vpd) treeSet.floor(vpdVar);
        if (vpdVar2 != null && vpdVar2.b + vpdVar2.c > j) {
            return vpdVar2;
        }
        vpd vpdVar3 = (vpd) treeSet.ceiling(vpdVar);
        if (vpdVar3 != null) {
            long j3 = vpdVar3.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return new vpd(this.b, j, j2, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            kx0 kx0Var = (kx0) arrayList.get(i);
            long j3 = kx0Var.b;
            long j4 = kx0Var.a;
            if (j3 == -1) {
                if (j >= j4) {
                    return true;
                }
            } else if (j2 != -1 && j4 <= j && j + j2 <= j4 + j3) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mx0.class != obj.getClass()) {
            return false;
        }
        mx0 mx0Var = (mx0) obj;
        return this.a == mx0Var.a && this.b.equals(mx0Var.b) && this.c.equals(mx0Var.c) && this.e.equals(mx0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rh4.d(this.a * 31, 31, this.b);
    }
}
