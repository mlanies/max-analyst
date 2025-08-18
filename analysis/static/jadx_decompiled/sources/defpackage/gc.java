package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gc implements dw4 {
    public static final byte[] w = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public String f;
    public yze g;
    public yze h;
    public boolean l;
    public boolean m;
    public int p;
    public boolean q;
    public int s;
    public yze u;
    public long v;
    public final s02 b = new s02(new byte[7], 7, 2, (byte) 0);
    public final wpa c = new wpa(Arrays.copyOf(w, 10));
    public int i = 0;
    public int j = 0;
    public int k = 256;
    public int n = -1;
    public int o = -1;
    public long r = -9223372036854775807L;
    public long t = -9223372036854775807L;

    public gc(boolean z, String str, int i) {
        this.a = z;
        this.d = str;
        this.e = i;
    }

    @Override // defpackage.dw4
    public final void a() {
        this.t = -9223372036854775807L;
        this.m = false;
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0304  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // defpackage.dw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.wpa r22) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc.d(wpa):void");
    }

    @Override // defpackage.dw4
    public final void e(boolean z) {
    }

    @Override // defpackage.dw4
    public final void g(int i, long j) {
        this.t = j;
    }

    @Override // defpackage.dw4
    public final void i(pa5 pa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.f = l3fVar.f;
        l3fVar.b();
        yze yzeVarMo6B = pa5Var.mo6B(l3fVar.e, 1);
        this.g = yzeVarMo6B;
        this.u = yzeVarMo6B;
        if (!this.a) {
            this.h = new sk4();
            return;
        }
        l3fVar.a();
        l3fVar.b();
        yze yzeVarMo6B2 = pa5Var.mo6B(l3fVar.e, 5);
        this.h = yzeVarMo6B2;
        ny5 ny5Var = new ny5();
        l3fVar.b();
        ny5Var.a = l3fVar.f;
        ny5Var.m = ia9.l("application/id3");
        yzeVarMo6B2.e(new qy5(ny5Var));
    }
}
