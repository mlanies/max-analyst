package defpackage;

/* loaded from: classes2.dex */
public final class r82 extends gle {
    public f52 c;

    public r82(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        if (str.equals("chat")) {
            this.c = f52.a(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{chat=" + this.c + "}";
    }
}
