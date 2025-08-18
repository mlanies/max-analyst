package defpackage;

/* loaded from: classes2.dex */
public final class s9 {
    public final nv4 a;

    public s9(nv4 nv4Var) {
        this.a = nv4Var;
    }

    public final void a(pv4 pv4Var) {
        uv4 uv4Var = (uv4) pv4Var;
        uv4Var.a.remove(this.a);
        uv4Var.invalidate();
    }
}
