package defpackage;

/* loaded from: classes2.dex */
public final class idf {
    public final /* synthetic */ int a = 0;
    public String b;
    public long c;
    public long d;
    public go9 e;
    public String f;
    public int g;

    public /* synthetic */ idf() {
    }

    public static idf a(gy8 gy8Var) {
        int iN = lz7.N(gy8Var);
        if (iN == 0) {
            return null;
        }
        idf idfVar = new idf();
        for (int i = 0; i < iN; i++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            switch (strZ0) {
                case "conversationId":
                    idfVar.b = gy8Var.z0();
                    break;
                case "chatId":
                    idfVar.d = gy8Var.w0();
                    break;
                case "callerId":
                    idfVar.c = gy8Var.w0();
                    break;
                case "type":
                    String strZ02 = gy8Var.z0();
                    strZ02.getClass();
                    idfVar.g = !strZ02.equals("AUDIO") ? !strZ02.equals("VIDEO") ? 1 : 3 : 2;
                    break;
                case "turnServer":
                    idfVar.e = go9.h(gy8Var);
                    break;
                case "sdpOffer":
                    idfVar.f = lz7.P(gy8Var);
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        return new idf(idfVar);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "{conversationId='" + this.b + "', callerId=" + this.c + ", chatId=" + this.d + ", turnServer=" + this.e + ", sdpOffer='" + this.f + "', type=" + wg0.q(this.g) + "}";
            default:
                return super.toString();
        }
    }

    public idf(idf idfVar) {
        this.b = idfVar.b;
        this.c = idfVar.c;
        this.d = idfVar.d;
        this.e = idfVar.e;
        this.f = idfVar.f;
        this.g = idfVar.g;
    }
}
