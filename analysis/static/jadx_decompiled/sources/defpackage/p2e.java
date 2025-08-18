package defpackage;

/* loaded from: classes2.dex */
public final class p2e extends gle {
    public e2e c;

    public p2e(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        if (str.equals("sticker")) {
            this.c = e2e.a(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return zr6.i("{sticker = ", this.c.toString(), "}");
    }
}
