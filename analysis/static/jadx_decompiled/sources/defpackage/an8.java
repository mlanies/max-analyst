package defpackage;

/* loaded from: classes.dex */
public final class an8 implements g2a {
    public final xm7 a;
    public final g2a b;
    public int c = -1;

    public an8(xm7 xm7Var, g2a g2aVar) {
        this.a = xm7Var;
        this.b = g2aVar;
    }

    @Override // defpackage.g2a
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    public final void b() {
        this.a.f(this);
    }
}
