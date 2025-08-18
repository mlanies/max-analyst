package defpackage;

/* loaded from: classes2.dex */
public final class i4e extends gle {
    public String c;

    public i4e(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        if (str.equals("url")) {
            this.c = gy8Var.z0();
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return zr6.i("{url='", this.c, "'}");
    }
}
