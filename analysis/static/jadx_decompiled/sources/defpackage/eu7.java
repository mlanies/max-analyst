package defpackage;

/* loaded from: classes2.dex */
public final class eu7 {
    public static final kp7 g = new kp7(3);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResponse{uid='");
        sb.append(this.a);
        sb.append("', sessionKey='");
        sb.append(this.b);
        sb.append("', secretSessionKey='");
        sb.append(this.c);
        sb.append("', authenticationToken='");
        sb.append(this.d);
        sb.append("', apiServer='");
        sb.append(this.e);
        sb.append("', authenticationHash='");
        return zr6.l(sb, this.f, "'}");
    }
}
