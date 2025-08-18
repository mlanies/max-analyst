package defpackage;

/* loaded from: classes2.dex */
public final class t82 {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public t82(s82 s82Var) {
        this.a = s82Var.b;
        this.b = s82Var.a;
        this.c = s82Var.c;
        this.d = (String) s82Var.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant{id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias='");
        return zr6.l(sb, this.d, "'}");
    }
}
