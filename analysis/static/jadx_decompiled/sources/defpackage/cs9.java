package defpackage;

/* loaded from: classes2.dex */
public final class cs9 extends gle {
    public fr7 X;
    public long c;
    public String o;

    public cs9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "userId":
                this.c = lz7.M(gy8Var, 0L);
                break;
            case "deviceId":
                this.o = lz7.P(gy8Var);
                break;
            case "location":
                this.X = fr7.a(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        long j = this.c;
        String str = this.o;
        fr7 fr7Var = this.X;
        StringBuilder sbJ = z7b.j("Response{userId=", j, ", deviceId='", str);
        sbJ.append("', location=");
        sbJ.append(fr7Var);
        sbJ.append("}");
        return sbJ.toString();
    }
}
