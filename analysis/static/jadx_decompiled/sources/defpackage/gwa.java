package defpackage;

/* loaded from: classes2.dex */
public final class gwa extends gle {
    public String c;

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
