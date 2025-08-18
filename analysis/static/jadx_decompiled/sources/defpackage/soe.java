package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class soe extends v2 {
    public sg9 X;
    public t26 Y;
    public final va8 Z;
    public l0f o;

    public soe(va8 va8Var, nx0 nx0Var) {
        super(nx0Var);
        this.Z = va8Var;
    }

    @Override // defpackage.ed6
    public final void h() {
        this.o.getClass();
        l0f l0fVar = this.o;
        Objects.requireNonNull(l0fVar);
        ((nx0) this.a).v(new nf4(4, l0fVar));
    }

    @Override // defpackage.v2
    public final synchronized void i() {
        l0f l0fVar = this.o;
        l0fVar.getClass();
        l0fVar.v();
        super.i();
    }

    @Override // defpackage.v2
    public final int k() {
        int size;
        l0f l0fVar = this.o;
        l0fVar.getClass();
        synchronized (l0fVar) {
            size = ((ArrayDeque) l0fVar.c).size();
        }
        return size;
    }

    @Override // defpackage.v2
    public final void p(final int i, final long j) {
        final t26 t26Var = this.Y;
        t26Var.getClass();
        this.X.getClass();
        ((nx0) this.a).v(new xff() { // from class: roe
            @Override // defpackage.xff
            public final void run() {
                soe soeVar = this.a;
                int i2 = i;
                t26 t26Var2 = t26Var;
                long j2 = j;
                soeVar.getClass();
                hd6 hd6Var = new hd6(i2, -1, t26Var2.b, t26Var2.c);
                l0f l0fVar = soeVar.o;
                l0fVar.getClass();
                l0fVar.Q(hd6Var, j2);
                LinkedHashMap linkedHashMap = d54.a;
                synchronized (d54.class) {
                }
            }
        });
    }

    @Override // defpackage.v2
    public final void release() {
    }

    @Override // defpackage.ed6
    public final void s(hd6 hd6Var) {
        ((nx0) this.a).v(new i12(this, 4, hd6Var));
    }

    @Override // defpackage.v2
    public final void w(t26 t26Var) {
        this.Y = t26Var;
    }

    @Override // defpackage.v2
    public final void x(sg9 sg9Var) {
        this.X = sg9Var;
    }

    @Override // defpackage.v2
    public final void y(od4 od4Var) {
        this.o = new l0f(this.Z, od4Var, (nx0) this.a);
    }

    @Override // defpackage.v2
    public final void z() {
        ((nx0) this.a).v(new nf4(3, this));
    }
}
