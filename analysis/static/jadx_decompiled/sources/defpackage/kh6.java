package defpackage;

/* loaded from: classes.dex */
public final class kh6 implements dw4 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public yze b;
    public final b9b c;
    public final wpa d;
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

    public kh6(b9b b9bVar) {
        this.c = b9bVar;
        ih6 ih6Var = new ih6(1);
        ih6Var.e = new byte[128];
        this.g = ih6Var;
        if (b9bVar != null) {
            this.e = new vl9(178, 1);
            this.d = new wpa();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.dw4
    public final void a() {
        fm9.n(this.f);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    @Override // defpackage.dw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.wpa r27) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh6.d(wpa):void");
    }

    @Override // defpackage.dw4
    public final void e(boolean z) {
        fm9.l(this.b);
        if (z) {
            boolean z2 = this.o;
            this.b.a(this.n, z2 ? 1 : 0, (int) (this.h - this.m), 0, null);
        }
    }

    @Override // defpackage.dw4
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.dw4
    public final void i(pa5 pa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.a = l3fVar.f;
        l3fVar.b();
        this.b = pa5Var.mo6B(l3fVar.e, 2);
        b9b b9bVar = this.c;
        if (b9bVar != null) {
            b9bVar.h(pa5Var, l3fVar);
        }
    }
}
