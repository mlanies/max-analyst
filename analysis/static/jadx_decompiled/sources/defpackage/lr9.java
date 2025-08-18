package defpackage;

/* loaded from: classes2.dex */
public final class lr9 {
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;

    public lr9(rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5) {
        this.a = rm4Var;
        this.b = rm4Var2;
        this.c = rm4Var3;
        this.d = rm4Var4;
        this.e = rm4Var5;
    }

    public final void a(mr9 mr9Var) {
        long j = mr9Var.s0;
        if (j != 0) {
            hm9.m("lr9", "setFavoritesSync: %d", Long.valueOf(j));
            ((hyc) ((q33) this.c.get())).l("user.favoritesLastSync", Long.valueOf(mr9Var.s0));
        }
    }
}
