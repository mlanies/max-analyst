package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;

/* loaded from: classes.dex */
public final class y9 {
    public final vq6 a;
    public final List b;
    public final List c;
    public final qq9 d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final e12 h;
    public final ob6 i;
    public final Proxy j;
    public final ProxySelector k;

    public y9(String str, int i, qq9 qq9Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e12 e12Var, ob6 ob6Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        this.d = qq9Var;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = e12Var;
        this.i = ob6Var;
        this.j = proxy;
        this.k = proxySelector;
        od3 od3Var = new od3();
        od3Var.m(sSLSocketFactory != null ? "https" : HttpHost.DEFAULT_SCHEME_NAME);
        od3Var.h(str);
        od3Var.k(i);
        this.a = od3Var.b();
        this.b = naf.w(list);
        this.c = naf.w(list2);
    }

    public final boolean a(y9 y9Var) {
        return tpa.f(this.d, y9Var.d) && tpa.f(this.i, y9Var.i) && tpa.f(this.b, y9Var.b) && tpa.f(this.c, y9Var.c) && tpa.f(this.k, y9Var.k) && tpa.f(this.j, y9Var.j) && tpa.f(this.f, y9Var.f) && tpa.f(this.g, y9Var.g) && tpa.f(this.h, y9Var.h) && this.a.f == y9Var.a.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y9) {
            y9 y9Var = (y9) obj;
            if (tpa.f(this.a, y9Var.a) && a(y9Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.h) + ((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + ((Objects.hashCode(this.j) + ((this.k.hashCode() + k7d.g(this.c, k7d.g(this.b, (this.i.hashCode() + ((this.d.hashCode() + rh4.d(527, 31, this.a.i)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        vq6 vq6Var = this.a;
        sb.append(vq6Var.e);
        sb.append(':');
        sb.append(vq6Var.f);
        sb.append(", ");
        Proxy proxy = this.j;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.k;
        }
        return zr6.l(sb, str, "}");
    }
}
