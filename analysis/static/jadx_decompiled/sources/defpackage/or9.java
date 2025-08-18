package defpackage;

/* loaded from: classes2.dex */
public final class or9 extends gle {
    public long X;
    public long Y;
    public go9 Z;
    public String c;
    public String o;
    public String s0;
    public int t0;

    public or9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        int i;
        i = 3;
        str.getClass();
        switch (str) {
            case "conversationId":
                this.c = lz7.P(gy8Var);
                break;
            case "chatId":
                this.Y = lz7.M(gy8Var, 0L);
                break;
            case "callerId":
                this.X = lz7.M(gy8Var, 0L);
                break;
            case "vcp":
                this.o = lz7.P(gy8Var);
                break;
            case "type":
                String strP = lz7.P(gy8Var);
                strP.getClass();
                if (strP.equals("AUDIO")) {
                    i = 2;
                } else if (!strP.equals("VIDEO")) {
                    i = 1;
                }
                this.t0 = i;
                break;
            case "turnServer":
                this.Z = go9.h(gy8Var);
                break;
            case "sdpOffer":
                this.s0 = lz7.P(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        String str = this.c;
        String str2 = this.o;
        long j = this.X;
        long j2 = this.Y;
        go9 go9Var = this.Z;
        String str3 = this.s0;
        int i = this.t0;
        StringBuilder sbK = k7d.k("{conversationId='", str, "'convParams='", str2, "', callerId=");
        sbK.append(j);
        au1.q(j2, ", chatId=", ", turnServer=", sbK);
        sbK.append(go9Var);
        sbK.append(", sdpOffer='");
        sbK.append(str3);
        sbK.append("', callType=");
        sbK.append(wg0.q(i));
        sbK.append("}");
        return sbK.toString();
    }
}
