package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class t36 implements b37 {
    public final /* synthetic */ AtomicBoolean a;

    public t36(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // defpackage.b37
    public final Object a(v4 v4Var) {
        khe kheVarD = v4Var.d(m7b.class);
        AtomicBoolean atomicBoolean = this.a;
        return new hp7(new iqe("Fresco Debug"), new e11(0, atomicBoolean, AtomicBoolean.class, "get", "get()Z", 0, 24), new zp1(atomicBoolean, 4, kheVarD), gpc.U, 16);
    }
}
