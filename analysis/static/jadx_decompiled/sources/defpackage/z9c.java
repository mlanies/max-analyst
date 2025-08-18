package defpackage;

/* loaded from: classes2.dex */
public final class z9c extends gle {
    public String c;
    public boolean o;

    public z9c(gy8 gy8Var) {
        super(gy8Var);
        this.o = true;
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("tls")) {
            this.o = gy8Var.u0();
        } else if (str.equals("redirectHost")) {
            this.c = lz7.P(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    public final String c() {
        int iIndexOf;
        if (oag.t(this.c) || (iIndexOf = this.c.indexOf(":")) <= 0) {
            return null;
        }
        String str = this.c;
        return str.substring(iIndexOf + 1, str.length());
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{redirectHost='" + this.c + "', tls=" + this.o + "}";
    }
}
