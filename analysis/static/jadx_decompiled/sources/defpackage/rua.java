package defpackage;

/* loaded from: classes2.dex */
public final class rua extends gle {
    public Long X;
    public int Y;
    public String c;
    public wm3 o;

    public rua(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "profile":
                this.o = wm3.e(gy8Var);
                break;
            case "phone":
                this.X = Long.valueOf(lz7.M(gy8Var, 0L));
                break;
            case "token":
                this.c = lz7.P(gy8Var);
                break;
            case "tokenType":
                this.Y = ey8.u(lz7.P(gy8Var));
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{token='" + this.c + "', profile=" + this.o + ", phone=" + this.X + ", tokenType=" + ey8.p(this.Y) + "}";
    }
}
