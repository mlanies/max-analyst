package defpackage;

import java.io.File;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ycf extends lz {
    public final pk c;
    public final q33 d;
    public final rf5 e;
    public final av0 f;
    public rx g;
    public long h;
    public long i;

    public ycf(l20 l20Var, pk pkVar, q33 q33Var, rf5 rf5Var, av0 av0Var) {
        super(l20Var);
        this.c = pkVar;
        this.d = q33Var;
        this.e = rf5Var;
        this.f = av0Var;
    }

    @Override // defpackage.lz
    public final void a() {
        this.h = 0L;
        this.i = 0L;
        b(this.g, new Throwable("cancelled"));
        e();
    }

    @Override // defpackage.lz
    public final void c(rx rxVar, File file) {
        super.c(rxVar, file);
        e();
    }

    @Override // defpackage.lz
    public final qy9 d() {
        qy9 qy9VarD = super.d();
        if (qy9VarD != null) {
            return qy9VarD;
        }
        rx rxVar = this.g;
        if (rxVar != null) {
            return rxVar;
        }
        this.g = new rx();
        this.f.d(this);
        l20 l20Var = this.a;
        k20 k20Var = l20Var.d;
        this.h = ((k4a) this.c).L(false, k20Var.a, 0L, 0L, 0L, l20Var.r, false, true, k20Var.m);
        return this.g;
    }

    public final void e() {
        try {
            this.f.f(this);
        } catch (Exception unused) {
        }
    }

    @uae
    public void onEvent(akf akfVar) {
        if (this.h == akfVar.a) {
            Map map = akfVar.b;
            if (map == null) {
                b(this.g, new Exception("uris empty"));
                e();
                return;
            }
            if (f46.H(map) == null) {
                b(this.g, new Exception("download url not found"));
                e();
                return;
            }
            String strH = f46.H(map);
            if (oag.t(strH)) {
                b(this.g, new Exception("download url not found"));
                e();
                return;
            }
            this.i = ((hyc) this.d).o();
            one oneVar = new one();
            oneVar.b = this.a.r;
            oneVar.c = akfVar.c;
            oneVar.g = strH;
            oneVar.h = true;
            oneVar.n = true;
            this.e.a(new pne(oneVar));
        }
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        if (this.h == oi0Var.a) {
            b(this.g, new Exception(oi0Var.b.b));
            e();
        }
    }

    @uae
    public void onEvent(hn4 hn4Var) {
        if (this.i == hn4Var.a) {
            b(this.g, new Exception("DownloadErrorEvent"));
            e();
        }
    }

    @uae
    public void onEvent(fn4 fn4Var) {
        if (this.i == fn4Var.a) {
            c(this.g, new File(fn4Var.c));
        }
    }
}
