package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class qi0 implements gd6 {
    public final er0 a;
    public ed6 b = new dp3();
    public fd6 c = new sp3();
    public dd6 d = new xw0(24);
    public Executor e = nk4.a;
    public int f = -1;
    public int g = -1;

    public qi0(boolean z) {
        this.a = new er0(z, 1);
    }

    @Override // defpackage.gd6
    public final void a(hd6 hd6Var) {
        er0 er0Var = this.a;
        if (((ArrayDeque) er0Var.e).contains(hd6Var)) {
            ArrayDeque arrayDeque = (ArrayDeque) er0Var.e;
            fm9.k(arrayDeque.contains(hd6Var));
            arrayDeque.remove(hd6Var);
            ((ArrayDeque) er0Var.d).add(hd6Var);
            this.b.h();
        }
    }

    @Override // defpackage.gd6
    public final void b() {
        this.c.q();
    }

    public abstract void c(int i, long j);

    @Override // defpackage.gd6
    public final void d(Executor executor, lf4 lf4Var) {
        this.e = executor;
        this.d = lf4Var;
    }

    @Override // defpackage.gd6
    public final void e(va8 va8Var, hd6 hd6Var, long j) {
        try {
            int i = this.f;
            int i2 = hd6Var.c;
            er0 er0Var = this.a;
            int i3 = hd6Var.d;
            if (i != i2 || this.g != i3 || !((n77) er0Var.g()).hasNext()) {
                int i4 = hd6Var.c;
                this.f = i4;
                this.g = i3;
                lsd lsdVarG = c37.g(((od4) this).i, i4, i3);
                er0Var.e(va8Var, lsdVarG.a, lsdVarG.b);
            }
            hd6 hd6VarH = er0Var.h();
            mr0.u(hd6VarH.b, hd6VarH.c, hd6VarH.d);
            od4 od4Var = (od4) this;
            if (!od4Var.u || !od4Var.t) {
                mr0.h();
            }
            c(hd6Var.a, j);
            this.b.s(hd6Var);
            this.c.B(hd6VarH, j);
        } catch (VideoFrameProcessingException | GlUtil$GlException e) {
            this.e.execute(new c(this, 12, e));
        }
    }

    @Override // defpackage.gd6
    public final void f(jo7 jo7Var) {
        this.c = jo7Var;
    }

    @Override // defpackage.gd6
    public final void flush() {
        er0 er0Var = this.a;
        ArrayDeque arrayDeque = (ArrayDeque) er0Var.d;
        ArrayDeque arrayDeque2 = (ArrayDeque) er0Var.e;
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        this.b.v();
        for (int i = 0; i < er0Var.b; i++) {
            this.b.h();
        }
    }

    @Override // defpackage.gd6
    public final void g(ed6 ed6Var) {
        this.b = ed6Var;
        for (int i = 0; i < this.a.f(); i++) {
            ed6Var.h();
        }
    }
}
