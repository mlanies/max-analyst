package defpackage;

/* loaded from: classes2.dex */
public final class s10 {
    public static final s10 f = new r10().a();
    public final long a;
    public final long b;
    public final String c;
    public final l20 d;
    public final String e;

    public s10(r10 r10Var) {
        this.a = r10Var.a;
        this.b = r10Var.b;
        this.c = (String) r10Var.c;
        this.d = (l20) r10Var.e;
        this.e = (String) r10Var.d;
    }

    public final r10 a() {
        r10 r10Var = new r10();
        r10Var.a = this.a;
        r10Var.b = this.b;
        r10Var.c = this.c;
        r10Var.e = this.d;
        r10Var.d = this.e;
        return r10Var;
    }
}
