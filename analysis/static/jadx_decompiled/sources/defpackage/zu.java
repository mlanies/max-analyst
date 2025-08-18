package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class zu implements bb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ zu(tf2 tf2Var, long j, int i) {
        this.a = i;
        this.b = tf2Var;
        this.c = j;
    }

    @Override // defpackage.bb3
    public final void b(ra3 ra3Var) {
        switch (this.a) {
            case 0:
                nl6 nl6Var = this.b.b;
                yx4 yx4Var = nl6Var.e;
                long c = this.c;
                if (yx4Var != null) {
                    yx4Var.b("loadPrev: " + yx4.a(c));
                }
                nl6Var.q();
                if (!nl6Var.d().i().isEmpty()) {
                    vk6 vk6VarH = ft.h(nl6Var.f(c));
                    if (vk6VarH != null) {
                        c = vk6VarH.getC();
                    }
                    long j = c;
                    nl6Var.j(nl6Var.b, j, true, false, false);
                    nl6Var.k(nl6Var.c, j, true, false);
                } else {
                    nl6Var.l(c);
                }
                if (yx4Var != null) {
                    kq0.u(yx4Var, nl6Var.e());
                }
                if (!ra3Var.h()) {
                    ra3Var.b();
                    break;
                }
                break;
            default:
                nl6 nl6Var2 = this.b.b;
                yx4 yx4Var2 = nl6Var2.e;
                long j2 = this.c;
                if (yx4Var2 != null) {
                    yx4Var2.b("load: " + yx4.a(j2));
                }
                nl6Var2.q();
                if (!nl6Var2.d().i().isEmpty()) {
                    nl6Var2.j(nl6Var2.b, j2, true, true, false);
                    nl6Var2.k(nl6Var2.c, j2, true, true);
                } else {
                    nl6Var2.l(j2);
                }
                if (yx4Var2 != null) {
                    kq0.u(yx4Var2, nl6Var2.e());
                }
                if (!ra3Var.h()) {
                    ra3Var.b();
                    break;
                }
                break;
        }
    }
}
