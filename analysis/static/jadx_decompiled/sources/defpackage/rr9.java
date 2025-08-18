package defpackage;

/* loaded from: classes2.dex */
public final class rr9 extends gle {
    public f52 c;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
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
