package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class lx0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public a94 e;

    public lx0(int i, String str, a94 a94Var) {
        this.a = i;
        this.b = str;
        this.e = a94Var;
    }

    public final upd a(long j, long j2) {
        upd updVar = new upd(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        upd updVar2 = (upd) treeSet.floor(updVar);
        if (updVar2 != null && updVar2.b + updVar2.c > j) {
            return updVar2;
        }
        upd updVar3 = (upd) treeSet.ceiling(updVar);
        if (updVar3 != null) {
            long j3 = updVar3.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return new upd(this.b, j, j2, -9223372036854775807L, null);
    }

    public final boolean b(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            jx0 jx0Var = (jx0) arrayList.get(i);
            long j3 = jx0Var.b;
            long j4 = jx0Var.a;
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
        if (obj == null || lx0.class != obj.getClass()) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        return this.a == lx0Var.a && this.b.equals(lx0Var.b) && this.c.equals(lx0Var.c) && this.e.equals(lx0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rh4.d(this.a * 31, 31, this.b);
    }
}
