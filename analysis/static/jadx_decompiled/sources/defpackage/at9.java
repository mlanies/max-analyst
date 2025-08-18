package defpackage;

/* loaded from: classes2.dex */
public final class at9 extends gle {
    public b10 X;
    public long c;
    public long o;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "chatId":
                this.c = gy8Var.w0();
                break;
            case "userId":
                this.o = gy8Var.w0();
                break;
            case "type":
                String strP = lz7.P(gy8Var);
                if (strP != null) {
                    this.X = b10.a(strP);
                    break;
                }
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
        b10 b10Var = this.X;
        StringBuilder sbK = au1.k(j, "{chatId=", ", userId=");
        sbK.append(j2);
        sbK.append(", type=");
        sbK.append(b10Var);
        sbK.append("}");
        return sbK.toString();
    }
}
