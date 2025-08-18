package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class opc {
    public r5g a;
    public ArrayList b;

    public static long a(sh4 sh4Var, long j) {
        r5g r5gVar = sh4Var.d;
        if (r5gVar instanceof tj6) {
            return j;
        }
        ArrayList arrayList = sh4Var.k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            oh4 oh4Var = (oh4) arrayList.get(i);
            if (oh4Var instanceof sh4) {
                sh4 sh4Var2 = (sh4) oh4Var;
                if (sh4Var2.d != r5gVar) {
                    jMin = Math.min(jMin, a(sh4Var2, sh4Var2.f + j));
                }
            }
        }
        if (sh4Var != r5gVar.i) {
            return jMin;
        }
        long j2 = r5gVar.j();
        long j3 = j - j2;
        return Math.min(Math.min(jMin, a(r5gVar.h, j3)), j3 - r9.f);
    }

    public static long b(sh4 sh4Var, long j) {
        r5g r5gVar = sh4Var.d;
        if (r5gVar instanceof tj6) {
            return j;
        }
        ArrayList arrayList = sh4Var.k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            oh4 oh4Var = (oh4) arrayList.get(i);
            if (oh4Var instanceof sh4) {
                sh4 sh4Var2 = (sh4) oh4Var;
                if (sh4Var2.d != r5gVar) {
                    jMax = Math.max(jMax, b(sh4Var2, sh4Var2.f + j));
                }
            }
        }
        if (sh4Var != r5gVar.h) {
            return jMax;
        }
        long j2 = r5gVar.j();
        long j3 = j + j2;
        return Math.max(Math.max(jMax, b(r5gVar.i, j3)), j3 - r9.f);
    }
}
