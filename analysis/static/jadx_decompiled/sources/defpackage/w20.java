package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class w20 extends lz {
    public final rf5 c;
    public final av0 d;
    public rx e;
    public volatile long f;

    public w20(l20 l20Var, rf5 rf5Var, av0 av0Var) {
        super(l20Var);
        this.c = rf5Var;
        this.d = av0Var;
    }

    @Override // defpackage.lz
    public final void a() {
        this.f = 0L;
        b(this.e, new Exception("cancelled"));
        try {
            this.d.f(this);
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.lz
    public final qy9 d() {
        qy9 qy9VarD = super.d();
        if (qy9VarD != null) {
            return qy9VarD;
        }
        rx rxVar = this.e;
        if (rxVar != null) {
            return rxVar;
        }
        this.e = new rx();
        this.d.d(this);
        one oneVar = new one();
        l20 l20Var = this.a;
        oneVar.b = l20Var.r;
        i10 i10Var = l20Var.e;
        oneVar.d = i10Var.a;
        oneVar.g = i10Var.b;
        oneVar.h = true;
        pne pneVar = new pne(oneVar);
        this.f = pneVar.o;
        this.c.a(pneVar);
        return this.e;
    }

    @uae
    public void onEvent(hn4 hn4Var) {
        if (this.f == hn4Var.a) {
            b(this.e, new Exception("DownloadErrorEvent"));
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @uae
    public void onEvent(fn4 fn4Var) {
        if (this.f == fn4Var.a) {
            this.e.e(new File(fn4Var.c));
            this.e.b();
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }
}
