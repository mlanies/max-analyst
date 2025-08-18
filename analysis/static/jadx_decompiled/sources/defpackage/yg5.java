package defpackage;

/* loaded from: classes2.dex */
public final class yg5 extends gle {
    public String c;
    public Boolean o;

    public yg5(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("unsafe")) {
            this.o = Boolean.valueOf(lz7.H(gy8Var));
        } else if (str.equals("url")) {
            this.c = lz7.P(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{url='" + this.c + "'unsafe='" + this.o + "'}";
    }
}
