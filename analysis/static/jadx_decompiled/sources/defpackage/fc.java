package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fc implements cw4 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public xze f;
    public xze g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public xze t;
    public long u;
    public final s02 b = new s02(new byte[7], 7, 1, (byte) 0);
    public final yaf c = new yaf(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public fc(String str, boolean z) {
        this.a = z;
        this.d = str;
    }

    @Override // defpackage.cw4
    public final void a() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02dd  */
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
    @Override // defpackage.cw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.yaf r23) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc.f(yaf):void");
    }

    @Override // defpackage.cw4
    public final void g(int i, long j) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // defpackage.cw4
    public final void h() {
    }

    @Override // defpackage.cw4
    public final void j(oa5 oa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.e = l3fVar.f;
        l3fVar.b();
        xze xzeVarB = oa5Var.B(l3fVar.e, 1);
        this.f = xzeVarB;
        this.t = xzeVarB;
        if (!this.a) {
            this.g = new dt4();
            return;
        }
        l3fVar.a();
        l3fVar.b();
        xze xzeVarB2 = oa5Var.B(l3fVar.e, 5);
        this.g = xzeVarB2;
        my5 my5Var = new my5();
        l3fVar.b();
        my5Var.a = l3fVar.f;
        my5Var.k = "application/id3";
        xzeVarB2.d(new oy5(my5Var));
    }
}
