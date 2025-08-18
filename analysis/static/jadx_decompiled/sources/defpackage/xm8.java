package defpackage;

/* loaded from: classes2.dex */
public abstract class xm8 implements ol7 {
    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        if (!(ol7Var instanceof xm8)) {
            return false;
        }
        xm8 xm8Var = (xm8) ol7Var;
        return j() == xm8Var.j() && i() == xm8Var.i();
    }

    public abstract long i();

    public abstract long j();
}
