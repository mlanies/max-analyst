package defpackage;

/* loaded from: classes2.dex */
public final class ur7 extends gle {
    public fs8 c;

    public ur7(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("message")) {
            this.c = tpa.z(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{message=" + this.c + "}";
    }
}
