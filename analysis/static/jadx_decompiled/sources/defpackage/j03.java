package defpackage;

/* loaded from: classes2.dex */
public final class j03 {
    public final znc a;

    public j03(znc zncVar) {
        this.a = zncVar;
    }

    public final void a() {
        this.a.P(nz4.a, null);
    }

    public final uu3 b() {
        coc cocVar = (coc) x53.i0(this.a.e());
        if (cocVar != null) {
            return cocVar.a;
        }
        return null;
    }

    public final String c() {
        coc cocVar = (coc) x53.i0(this.a.e());
        if (cocVar != null) {
            return cocVar.b;
        }
        return null;
    }

    public final void d(String str, k56 k56Var) {
        if (tpa.f(c(), str)) {
            return;
        }
        coc cocVar = new coc((uu3) k56Var.invoke(), null, null, null, false, -1);
        cocVar.d(str);
        this.a.R(cocVar);
    }
}
