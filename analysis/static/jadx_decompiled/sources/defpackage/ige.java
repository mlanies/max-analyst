package defpackage;

/* loaded from: classes2.dex */
public final class ige {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public ige(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var4;
        this.c = je7Var2;
        this.d = je7Var3;
    }

    public static final d7f a(ige igeVar, iy8 iy8Var) {
        igeVar.getClass();
        gk8 gk8Var = new gk8();
        String str = iy8Var.f;
        if (str.length() == 0) {
            str = iy8Var.a.c;
        }
        gk8Var.d = str;
        gk8Var.c = iy8Var.b;
        gk8Var.b = iy8Var.d;
        gk8Var.a = iy8Var.c;
        return new d7f(gk8Var);
    }
}
