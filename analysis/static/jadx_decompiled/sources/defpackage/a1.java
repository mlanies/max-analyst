package defpackage;

/* loaded from: classes.dex */
public final class a1 implements Runnable {
    public final l1 a;
    public final bm7 b;

    public a1(l1 l1Var, bm7 bm7Var) {
        this.a = l1Var;
        this.b = bm7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (l1.Y.d(this.a, this, l1.f(this.b))) {
            l1.b(this.a);
        }
    }
}
