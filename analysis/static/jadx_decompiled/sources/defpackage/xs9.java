package defpackage;

/* loaded from: classes2.dex */
public final class xs9 extends gle {
    public long X;
    public long c;
    public s7b o;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "presence":
                this.o = s7b.a(gy8Var);
                break;
            case "userId":
                this.c = gy8Var.w0();
                break;
            case "time":
                this.X = gy8Var.w0();
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{userId=" + this.c + ", presence=" + this.o + ", time=" + this.X + "}";
    }
}
