package defpackage;

/* loaded from: classes2.dex */
public final class cgc extends gle {
    public nab c;

    public cgc(gy8 gy8Var) {
        super(gy8Var);
    }

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
