package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class nrd implements grc {
    public int a;
    public boolean b;
    public final /* synthetic */ prd c;

    public nrd(prd prdVar) {
        this.c = prdVar;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        prd prdVar = this.c;
        prdVar.X.m(ia9.g(prdVar.u0.n), prdVar.u0, 0, null, 0L);
        this.b = true;
    }

    @Override // defpackage.grc
    public final void c() throws IOException {
        prd prdVar = this.c;
        if (prdVar.v0) {
            return;
        }
        prdVar.t0.c();
    }

    @Override // defpackage.grc
    public final boolean d() {
        return this.c.w0;
    }

    @Override // defpackage.grc
    public final int e(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // defpackage.grc
    public final int j(y7g y7gVar, p54 p54Var, int i) {
        a();
        prd prdVar = this.c;
        boolean z = prdVar.w0;
        if (z && prdVar.x0 == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            p54Var.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            y7gVar.c = prdVar.u0;
            this.a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        prdVar.x0.getClass();
        p54Var.a(1);
        p54Var.Z = 0L;
        if ((i & 4) == 0) {
            p54Var.x(prdVar.y0);
            p54Var.X.put(prdVar.x0, 0, prdVar.y0);
        }
        if ((i & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }
}
