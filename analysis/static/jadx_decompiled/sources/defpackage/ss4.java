package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ss4 implements dw4 {
    public final wpa a;
    public final String c;
    public final int d;
    public String e;
    public yze f;
    public int h;
    public int i;
    public long j;
    public qy5 k;
    public int l;
    public int m;
    public int g = 0;
    public long p = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int n = -1;
    public int o = -1;

    public ss4(String str, int i, int i2) {
        this.a = new wpa(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.dw4
    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }

    public final boolean b(wpa wpaVar, byte[] bArr, int i) {
        int iMin = Math.min(wpaVar.a(), i - this.h);
        wpaVar.e(this.h, bArr, iMin);
        int i2 = this.h + iMin;
        this.h = i2;
        return i2 == i;
    }

    public final void c(e eVar) {
        int i;
        int i2 = eVar.a;
        if (i2 == -2147483647 || (i = eVar.b) == -1) {
            return;
        }
        qy5 qy5Var = this.k;
        String str = eVar.c;
        if (qy5Var != null && i == qy5Var.B && i2 == qy5Var.C && oaf.a(str, qy5Var.n)) {
            return;
        }
        qy5 qy5Var2 = this.k;
        ny5 ny5Var = qy5Var2 == null ? new ny5() : qy5Var2.a();
        ny5Var.a = this.e;
        ny5Var.m = ia9.l(str);
        ny5Var.A = i;
        ny5Var.B = i2;
        ny5Var.d = this.c;
        ny5Var.f = this.d;
        qy5 qy5Var3 = new qy5(ny5Var);
        this.k = qy5Var3;
        this.f.e(qy5Var3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a6  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [yze] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // defpackage.dw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.wpa r37) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss4.d(wpa):void");
    }

    @Override // defpackage.dw4
    public final void e(boolean z) {
    }

    @Override // defpackage.dw4
    public final void g(int i, long j) {
        this.p = j;
    }

    @Override // defpackage.dw4
    public final void i(pa5 pa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.e = l3fVar.f;
        l3fVar.b();
        this.f = pa5Var.mo6B(l3fVar.e, 1);
    }
}
