package defpackage;

/* loaded from: classes2.dex */
public final class ss9 extends gle {
    public long X;
    public f52 c;
    public long o;

    public ss9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "startTime":
                this.o = lz7.M(gy8Var, 0L);
                break;
            case "endTime":
                this.X = lz7.M(gy8Var, 0L);
                break;
            case "chat":
                this.c = f52.a(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        long j = this.o;
        long j2 = this.X;
        f52 f52Var = this.c;
        StringBuilder sbK = au1.k(j, "{startTime=", ", endTime=");
        sbK.append(j2);
        sbK.append(", chat=");
        sbK.append(f52Var);
        sbK.append("}");
        return sbK.toString();
    }
}
