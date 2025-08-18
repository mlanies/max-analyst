package defpackage;

/* loaded from: classes.dex */
public final class c0a extends pa3 implements x66 {
    public final r1a a;
    public final b66 b;
    public final boolean c = false;

    public c0a(r1a r1aVar, b66 b66Var) {
        this.a = r1aVar;
        this.b = b66Var;
    }

    @Override // defpackage.x66
    public final qy9 d() {
        return new a0a(this.a, this.b, this.c);
    }

    @Override // defpackage.pa3
    public final void j(ab3 ab3Var) {
        this.a.a(new b0a(ab3Var, this.b, this.c));
    }
}
