package defpackage;

/* loaded from: classes2.dex */
public final class vr9 extends gle {
    public wm3 c;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        if (str.equals("contact")) {
            this.c = wm3.e(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{contact=" + this.c + "}";
    }
}
