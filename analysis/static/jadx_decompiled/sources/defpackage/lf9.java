package defpackage;

/* loaded from: classes2.dex */
public final class lf9 extends gle {
    public String X;
    public fs8 c;
    public f52 o;

    public lf9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "chatAccessToken":
                this.X = lz7.P(gy8Var);
                break;
            case "chat":
                this.o = f52.a(gy8Var);
                break;
            case "message":
                this.c = tpa.z(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response{, message=" + this.c + ", chat=" + this.o + "}";
    }
}
