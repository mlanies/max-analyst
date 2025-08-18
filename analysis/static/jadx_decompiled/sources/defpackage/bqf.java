package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class bqf extends e06 {
    public final String b;
    public int c;

    public bqf(yw1 yw1Var) {
        super(yw1Var);
        this.b = "virtual-" + yw1Var.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.e06, defpackage.yw1
    public final int b() {
        return l(0);
    }

    @Override // defpackage.e06, defpackage.yw1
    public final String d() {
        return this.b;
    }

    @Override // defpackage.e06, defpackage.yw1
    public final int l(int i) {
        return e1f.i(this.a.l(i) - this.c);
    }
}
