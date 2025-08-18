package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class u0b {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public volatile zl4 f;

    public u0b(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, khe kheVar) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = kheVar;
    }

    public final void a() {
        zl4 zl4Var;
        hm9.n("u0b", "schedulePing");
        zl4 zl4Var2 = this.f;
        if (zl4Var2 != null && !zl4Var2.h() && (zl4Var = this.f) != null) {
            zl4Var.g();
        }
        this.f = ((ztc) this.e.getValue()).a().c(new nn6(26, this), 29000L, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        hm9.n("u0b", "startInteractivePings");
        if (((f5a) this.c.getValue()).d()) {
            ((k4a) ((pk) this.a.getValue())).G(true);
        }
        a();
    }
}
