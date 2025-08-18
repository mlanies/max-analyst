package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ur8 implements a04 {
    public static final hd3 b;
    public final ArrayList a = new ArrayList();

    static {
        sm9 sm9Var = sm9.a;
        hj8 hj8Var = new hj8(6);
        sm9Var.getClass();
        rv0 rv0Var = new rv0(hj8Var, sm9Var);
        dkc dkcVar = dkc.a;
        hj8 hj8Var2 = new hj8(7);
        dkcVar.getClass();
        b = new hd3(rv0Var, new rv0(hj8Var2, dkcVar));
    }

    @Override // defpackage.a04
    public final long c(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((b04) arrayList.get(i)).b;
            long j3 = ((b04) arrayList.get(i)).d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.a04
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.a04
    public final boolean d(b04 b04Var, long j) {
        long j2 = b04Var.b;
        fm9.f(j2 != -9223372036854775807L);
        fm9.f(b04Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < b04Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((b04) arrayList.get(size)).b) {
                arrayList.add(size + 1, b04Var);
                return z;
            }
        }
        arrayList.add(0, b04Var);
        return z;
    }

    @Override // defpackage.a04
    public final zw6 i(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((b04) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    b04 b04Var = (b04) arrayList.get(i);
                    if (j >= b04Var.b && j < b04Var.d) {
                        arrayList2.add(b04Var);
                    }
                    if (j < b04Var.b) {
                        break;
                    }
                }
                ffc ffcVarR = zw6.r(b, arrayList2);
                ww6 ww6VarI = zw6.i();
                for (int i2 = 0; i2 < ffcVarR.size(); i2++) {
                    ww6VarI.f(((b04) ffcVarR.get(i2)).a);
                }
                return ww6VarI.j();
            }
        }
        return zw6.m();
    }

    @Override // defpackage.a04
    public final long n(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((b04) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((b04) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((b04) arrayList.get(i)).b;
            long j3 = ((b04) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.a04
    public final void u(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((b04) arrayList.get(i)).b;
            if (j > j2 && j > ((b04) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
