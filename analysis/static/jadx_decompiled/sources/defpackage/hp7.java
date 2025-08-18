package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class hp7 implements pi4 {
    public final jqe a;
    public final k56 b;
    public final m56 c;
    public final int d;
    public final m56 e;
    public final long f;
    public final q0e g;
    public final w7c h;

    public hp7(jqe jqeVar, k56 k56Var, m56 m56Var, int i, int i2) {
        i = (i2 & 8) != 0 ? 0 : i;
        this.a = jqeVar;
        this.b = k56Var;
        this.c = m56Var;
        this.d = i;
        this.e = null;
        this.f = ei4.b.incrementAndGet();
        q0e q0eVarA = r0e.a(e());
        this.g = q0eVarA;
        this.h = new w7c(q0eVarA);
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.h;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        if (ei4.a(b54Var.a, this.f)) {
            k56 k56Var = this.b;
            this.c.invoke(Boolean.valueOf(!((Boolean) k56Var.invoke()).booleanValue()));
            this.g.m(null, e());
            m56 m56Var = this.e;
            if (m56Var != null) {
                m56Var.invoke(k56Var.invoke());
            }
        }
    }

    public final List e() {
        a54 a54Var = new a54(((Boolean) this.b.invoke()).booleanValue());
        return Collections.singletonList(new b54(this.f, this.a, this.d, null, a54Var, 8));
    }
}
