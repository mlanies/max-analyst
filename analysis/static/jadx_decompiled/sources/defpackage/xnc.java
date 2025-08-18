package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class xnc {
    public final y9 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public xnc(y9 y9Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = y9Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xnc) {
            xnc xncVar = (xnc) obj;
            if (tpa.f(xncVar.a, this.a) && tpa.f(xncVar.b, this.b) && tpa.f(xncVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
