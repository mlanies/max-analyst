package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class v0f implements jx3 {
    public static final sp3 c = new sp3();
    public final iu3 a;
    public final AtomicInteger b = new AtomicInteger(0);

    public v0f(iu3 iu3Var) {
        this.a = iu3Var;
    }

    @Override // defpackage.lx3
    public final Object fold(Object obj, a66 a66Var) {
        return a66Var.invoke(obj, this);
    }

    @Override // defpackage.lx3
    public final jx3 get(kx3 kx3Var) {
        return tpa.r(this, kx3Var);
    }

    @Override // defpackage.jx3
    public final kx3 getKey() {
        return c;
    }

    @Override // defpackage.lx3
    public final lx3 minusKey(kx3 kx3Var) {
        return tpa.y(this, kx3Var);
    }

    @Override // defpackage.lx3
    public final lx3 plus(lx3 lx3Var) {
        return ema.z(this, lx3Var);
    }
}
