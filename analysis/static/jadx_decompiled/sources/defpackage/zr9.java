package defpackage;

/* loaded from: classes2.dex */
public final class zr9 extends gle {
    public long X;
    public long c;
    public long o;

    public zr9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "chatId":
                this.c = lz7.M(gy8Var, 0L);
                break;
            case "userId":
                this.o = lz7.M(gy8Var, 0L);
                break;
            case "time":
                this.X = lz7.M(gy8Var, 0L);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        long j3 = this.X;
        StringBuilder sbK = au1.k(j, "Response{chatId=", ", userId=");
        sbK.append(j2);
        sbK.append(", time=");
        sbK.append(j3);
        sbK.append("}");
        return sbK.toString();
    }
}
