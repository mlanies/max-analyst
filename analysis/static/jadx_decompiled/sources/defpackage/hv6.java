package defpackage;

/* loaded from: classes.dex */
public final class hv6 implements ide {
    public final /* synthetic */ iv6 a;
    public final /* synthetic */ wv6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ vv6 d;

    public hv6(iv6 iv6Var, wv6 wv6Var, Object obj) {
        vv6 vv6Var = vv6.FULL_FETCH;
        this.a = iv6Var;
        this.b = wv6Var;
        this.c = obj;
        this.d = vv6Var;
    }

    @Override // defpackage.ide
    public final Object get() {
        return this.a.b(this.b, this.c, this.d, null, null);
    }

    public final String toString() {
        nw4 nw4VarR0 = j47.r0(this);
        nw4VarR0.e(this.b.b, "uri");
        return nw4VarR0.toString();
    }
}
