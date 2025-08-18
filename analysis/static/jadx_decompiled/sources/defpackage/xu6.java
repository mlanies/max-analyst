package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class xu6 extends li0 {
    public final /* synthetic */ zu6 a;
    public final /* synthetic */ wv6 b;
    public final /* synthetic */ av6 c;

    public xu6(av6 av6Var, zu6 zu6Var, wv6 wv6Var) {
        this.c = av6Var;
        this.a = zu6Var;
        this.b = wv6Var;
    }

    @Override // defpackage.li0
    public final void e(g0 g0Var) {
        this.c.b(this.a);
    }

    @Override // defpackage.li0
    public final void f(g0 g0Var) {
        if (g0Var.h()) {
            o43 o43Var = (o43) g0Var.e();
            zu6 zu6Var = this.a;
            av6 av6Var = this.c;
            if (o43Var == null) {
                av6Var.b(zu6Var);
                return;
            }
            q5b q5bVar = new q5b((qq8) o43Var.e0());
            try {
                try {
                    je7 je7Var = pu6.d;
                    String str = i24.o(q5bVar).b;
                    if ("webp".equalsIgnoreCase(str)) {
                        zi5 zi5Var = (zi5) av6Var.a.getValue();
                        s36.o().a(this.b, null).m(new yu6(av6Var, zu6Var, zi5Var), qq1.a);
                    } else {
                        File fileA = ((zi5) av6Var.a.getValue()).a(str);
                        s5c.I(q5bVar, fileA);
                        String absolutePath = fileA.getAbsolutePath();
                        if (zu6Var != null) {
                            av6Var.c(new vs5(zu6Var, 6, absolutePath));
                        }
                    }
                } catch (Exception e) {
                    hm9.p("av6", "onNewResultImpl: failed to save image", e);
                    av6Var.b(zu6Var);
                }
                q43.b(q5bVar);
                o43.S(o43Var);
            } catch (Throwable th) {
                q43.b(q5bVar);
                o43.S(o43Var);
                throw th;
            }
        }
    }
}
