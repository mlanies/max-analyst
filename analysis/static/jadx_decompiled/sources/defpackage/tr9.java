package defpackage;

/* loaded from: classes2.dex */
public final class tr9 extends gle {
    public le3 c;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("config")) {
            this.c = nu0.C(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{config=" + this.c + "}";
    }
}
