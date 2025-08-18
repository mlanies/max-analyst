package defpackage;

/* loaded from: classes.dex */
public final class je9 implements dw4 {
    public String e;
    public yze f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final wpa a = new wpa(2, new byte[15]);
    public final s02 b = new s02(2);
    public final wpa c = new wpa();
    public final ke9 p = new ke9();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override // defpackage.dw4
    public final void a() {
        this.d = 0;
        this.l = 0;
        this.a.D(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0404  */
    @Override // defpackage.dw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.wpa r23) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je9.d(wpa):void");
    }

    @Override // defpackage.dw4
    public final void e(boolean z) {
    }

    @Override // defpackage.dw4
    public final void g(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
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
