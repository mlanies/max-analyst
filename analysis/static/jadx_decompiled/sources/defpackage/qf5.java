package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class qf5 extends lz {
    public final pk c;
    public final rf5 d;
    public final av0 e;
    public rx f;
    public long g;
    public long h;

    public qf5(l20 l20Var, pk pkVar, rf5 rf5Var, av0 av0Var) {
        super(l20Var);
        this.c = pkVar;
        this.d = rf5Var;
        this.e = av0Var;
    }

    @Override // defpackage.lz
    public final void a() {
        this.g = 0L;
        this.h = 0L;
        b(this.f, new Exception("cancelled"));
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.lz
    public final void c(rx rxVar, File file) {
        super.c(rxVar, file);
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.lz
    public final qy9 d() {
        qy9 qy9VarD = super.d();
        if (qy9VarD != null) {
            return qy9VarD;
        }
        rx rxVar = this.f;
        if (rxVar != null) {
            return rxVar;
        }
        this.f = new rx();
        this.e.d(this);
        l20 l20Var = this.a;
        s10 s10Var = l20Var.j;
        long j = s10Var.a;
        k4a k4aVar = (k4a) this.c;
        this.g = ome.d(k4aVar.z(), new wg5(s10Var.c, l20Var.r, ((p7b) k4aVar.y()).a.o(), j, 0L), false, 0, 12);
        return this.f;
    }

    @uae
    public void onEvent(ah5 ah5Var) {
        if (this.g == ah5Var.a) {
            one oneVar = new one();
            l20 l20Var = this.a;
            oneVar.b = l20Var.r;
            s10 s10Var = l20Var.j;
            oneVar.j = s10Var.a;
            oneVar.k = s10Var.c;
            oneVar.g = ah5Var.b;
            oneVar.h = true;
            pne pneVar = new pne(oneVar);
            this.h = pneVar.o;
            this.d.a(pneVar);
        }
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        if (this.g == oi0Var.a) {
            b(this.f, new Exception(oi0Var.b.b));
            try {
                this.e.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @uae
    public void onEvent(hn4 hn4Var) {
        if (this.h == hn4Var.a) {
            b(this.f, new Exception("DownloadErrorEvent"));
            try {
                this.e.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @uae
    public void onEvent(fn4 fn4Var) {
        if (this.h == fn4Var.a) {
            c(this.f, new File(fn4Var.c));
        }
    }
}
