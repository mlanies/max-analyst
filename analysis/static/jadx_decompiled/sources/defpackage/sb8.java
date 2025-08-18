package defpackage;

/* loaded from: classes.dex */
public interface sb8 extends ol7 {
    @Override // defpackage.ol7
    default boolean h(ol7 ol7Var) {
        if (!(ol7Var instanceof sb8)) {
            return false;
        }
        sb8 sb8Var = (sb8) ol7Var;
        return j() == sb8Var.j() && i() == sb8Var.i();
    }

    long i();

    long j();

    String x();
}
