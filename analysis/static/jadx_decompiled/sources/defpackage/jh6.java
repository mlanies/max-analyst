package defpackage;

/* loaded from: classes.dex */
public final class jh6 implements cw4 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public xze b;
    public final djb c;
    public final yaf d;
    public final vl9 e;
    public final boolean[] f = new boolean[4];
    public final ih6 g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public jh6(djb djbVar) {
        this.c = djbVar;
        ih6 ih6Var = new ih6(0);
        ih6Var.e = new byte[128];
        this.g = ih6Var;
        if (djbVar != null) {
            this.e = new vl9(178, 0);
            this.d = new yaf(3, false);
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.cw4
    public final void a() {
        np8.i(this.f);
        ih6 ih6Var = this.g;
        ih6Var.b = false;
        ih6Var.c = 0;
        ih6Var.d = 0;
        vl9 vl9Var = this.e;
        if (vl9Var != null) {
            vl9Var.c();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    @Override // defpackage.cw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.yaf r27) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh6.f(yaf):void");
    }

    @Override // defpackage.cw4
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.cw4
    public final void h() {
    }

    @Override // defpackage.cw4
    public final void j(oa5 oa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.a = l3fVar.f;
        l3fVar.b();
        this.b = oa5Var.B(l3fVar.e, 2);
        djb djbVar = this.c;
        if (djbVar != null) {
            djbVar.f(oa5Var, l3fVar);
        }
    }
}
