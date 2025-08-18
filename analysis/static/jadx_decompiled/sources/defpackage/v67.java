package defpackage;

import java.net.InetAddress;

/* loaded from: classes2.dex */
public final class v67 {
    public final InetAddress a;
    public volatile int b;
    public volatile int c;
    public volatile int d;
    public volatile float e = 1.0f;

    public v67(InetAddress inetAddress) {
        this.a = inetAddress;
    }

    public final String toString() {
        InetAddress inetAddress = this.a;
        int i = this.b;
        int i2 = this.d;
        int i3 = this.c;
        float f = this.c != 0 ? this.d / this.c : 0.0f;
        float f2 = this.e;
        StringBuilder sb = new StringBuilder("Ip(");
        sb.append(inetAddress);
        sb.append("|uc=");
        sb.append(i);
        sb.append("|sc=");
        ms2.k(sb, i2, "|tc=", i3, "|sr=");
        sb.append(f);
        sb.append("|w=");
        sb.append(f2);
        sb.append(")");
        return sb.toString();
    }
}
