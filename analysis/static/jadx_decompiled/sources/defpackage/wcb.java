package defpackage;

/* loaded from: classes2.dex */
public final class wcb extends gle {
    public nab c;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        if (str.equals("profile")) {
            this.c = nd7.C(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{profile=" + this.c + "}";
    }
}
