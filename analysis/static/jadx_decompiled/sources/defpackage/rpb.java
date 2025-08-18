package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class rpb implements ka5 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public jm5 i;
    public oa5 j;
    public boolean k;
    public final sue a = new sue(0);
    public final yaf c = new yaf(4096);
    public final SparseArray b = new SparseArray();
    public final opb d = new opb(0);

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        long j3;
        sue sueVar = this.a;
        synchronized (sueVar) {
            j3 = sueVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jC = sueVar.c();
            z = (jC == -9223372036854775807L || jC == 0 || jC == j2) ? false : true;
        }
        if (z) {
            sueVar.d(j2);
        }
        jm5 jm5Var = this.i;
        if (jm5Var != null) {
            jm5Var.e(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ppb ppbVar = (ppb) sparseArray.valueAt(i);
            ppbVar.f = false;
            ppbVar.a.a();
            i++;
        }
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.j = oa5Var;
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        byte[] bArr = new byte[14];
        ra4 ra4Var = (ra4) ma5Var;
        ra4Var.q(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ra4Var.b(bArr[13] & 7, false);
        ra4Var.q(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r29, defpackage.lh4 r30) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpb.i(ma5, lh4):int");
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
