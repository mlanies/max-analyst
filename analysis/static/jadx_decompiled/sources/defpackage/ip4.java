package defpackage;

/* loaded from: classes2.dex */
public final class ip4 extends gle {
    public long c;

    public ip4(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        if (str.equals("time")) {
            this.c = lz7.M(gy8Var, 0L);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return ey8.i(this.c, "Response{time=", "}");
    }
}
