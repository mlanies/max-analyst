package defpackage;

/* loaded from: classes2.dex */
public final class pm1 extends gle {
    public go9 X;
    public String Y;
    public String c;
    public long o;

    public pm1(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "conversationId":
                this.c = lz7.P(gy8Var);
                break;
            case "joinLink":
                this.Y = lz7.P(gy8Var);
                break;
            case "peerId":
                this.o = lz7.M(gy8Var, 0L);
                break;
            case "turnServer":
                this.X = go9.h(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{conversationId='" + this.c + "', peerId=" + this.o + ", turnServer=" + this.X + ", joinLink=" + this.Y + "}";
    }
}
