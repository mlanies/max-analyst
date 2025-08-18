package defpackage;

/* loaded from: classes.dex */
public final class mw0 implements q24 {
    public gw0 a;
    public final tg5 b = new tg5();
    public boolean c;
    public q24 d;
    public int e;

    @Override // defpackage.q24
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ow0 a() {
        q24 q24Var = this.d;
        return d(q24Var != null ? q24Var.a() : null, this.e, 0);
    }

    public final ow0 c() {
        q24 q24Var = this.d;
        return d(q24Var != null ? q24Var.a() : null, this.e | 1, -4000);
    }

    public final ow0 d(t24 t24Var, int i, int i2) {
        gw0 gw0Var = this.a;
        gw0Var.getClass();
        return new ow0(gw0Var, t24Var, this.b.a(), (this.c || t24Var == null) ? null : new kw0(gw0Var), i);
    }
}
