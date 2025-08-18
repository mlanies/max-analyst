package defpackage;

/* loaded from: classes2.dex */
public final class fe3 extends gle {
    public String c;
    public gaf o;

    public fe3(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("hash")) {
            this.c = gy8Var.z0();
        } else if (str.equals("user")) {
            this.o = tu0.E(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{hash='" + this.c + "', userSettings=" + this.o + "}";
    }
}
