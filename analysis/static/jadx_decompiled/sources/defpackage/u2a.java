package defpackage;

import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class u2a implements Cloneable, ny0 {
    public static final List O0 = naf.k(sob.HTTP_2, sob.HTTP_1_1);
    public static final List P0 = naf.k(rh3.e, rh3.f);
    public final SSLSocketFactory A0;
    public final X509TrustManager B0;
    public final List C0;
    public final List D0;
    public final HostnameVerifier E0;
    public final e12 F0;
    public final a14 G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final long M0;
    public final wd6 N0;
    public final qqd X;
    public final boolean Y;
    public final ob6 Z;
    public final a8g a;
    public final bkg b;
    public final List c;
    public final List o;
    public final boolean s0;
    public final boolean t0;
    public final kj6 u0;
    public final qq9 v0;
    public final Proxy w0;
    public final ProxySelector x0;
    public final ob6 y0;
    public final SocketFactory z0;

    public u2a(t2a t2aVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.a = t2aVar.a;
        this.b = t2aVar.b;
        this.c = naf.w(t2aVar.c);
        this.o = naf.w(t2aVar.d);
        this.X = t2aVar.e;
        this.Y = t2aVar.f;
        this.Z = t2aVar.g;
        this.s0 = t2aVar.h;
        this.t0 = t2aVar.i;
        this.u0 = t2aVar.j;
        this.v0 = t2aVar.k;
        Proxy proxy = t2aVar.l;
        this.w0 = proxy;
        if (proxy != null) {
            proxySelector = zx9.a;
        } else {
            proxySelector = t2aVar.m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = zx9.a;
            }
        }
        this.x0 = proxySelector;
        this.y0 = t2aVar.n;
        this.z0 = t2aVar.o;
        List list = t2aVar.r;
        this.C0 = list;
        this.D0 = t2aVar.s;
        this.E0 = t2aVar.t;
        this.H0 = t2aVar.w;
        this.I0 = t2aVar.x;
        this.J0 = t2aVar.y;
        this.K0 = t2aVar.z;
        this.L0 = t2aVar.A;
        this.M0 = t2aVar.B;
        wd6 wd6Var = t2aVar.C;
        this.N0 = wd6Var == null ? new wd6(25) : wd6Var;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.A0 = null;
            this.G0 = null;
            this.B0 = null;
            this.F0 = e12.c;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((rh3) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = t2aVar.p;
                    if (sSLSocketFactory != null) {
                        this.A0 = sSLSocketFactory;
                        a14 a14Var = t2aVar.v;
                        this.G0 = a14Var;
                        this.B0 = t2aVar.q;
                        e12 e12Var = t2aVar.u;
                        this.F0 = tpa.f(e12Var.b, a14Var) ? e12Var : new e12(e12Var.a, a14Var);
                    } else {
                        q2b q2bVar = q2b.a;
                        X509TrustManager x509TrustManagerM = q2b.a.m();
                        this.B0 = x509TrustManagerM;
                        this.A0 = q2b.a.l(x509TrustManagerM);
                        a14 a14VarB = q2b.a.b(x509TrustManagerM);
                        this.G0 = a14VarB;
                        e12 e12Var2 = t2aVar.u;
                        this.F0 = tpa.f(e12Var2.b, a14VarB) ? e12Var2 : new e12(e12Var2.a, a14VarB);
                    }
                }
            }
            this.A0 = null;
            this.G0 = null;
            this.B0 = null;
            this.F0 = e12.c;
        }
        List list2 = this.c;
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List list3 = this.o;
        if (list3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list4 = this.C0;
        boolean z = list4 instanceof Collection;
        X509TrustManager x509TrustManager = this.B0;
        a14 a14Var2 = this.G0;
        SSLSocketFactory sSLSocketFactory2 = this.A0;
        if (!z || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((rh3) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (a14Var2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (!(sSLSocketFactory2 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (a14Var2 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!tpa.f(this.F0, e12.c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final t2a a() {
        t2a t2aVar = new t2a();
        t2aVar.a = this.a;
        t2aVar.b = this.b;
        d63.V(this.c, t2aVar.c);
        d63.V(this.o, t2aVar.d);
        t2aVar.e = this.X;
        t2aVar.f = this.Y;
        t2aVar.g = this.Z;
        t2aVar.h = this.s0;
        t2aVar.i = this.t0;
        t2aVar.j = this.u0;
        t2aVar.k = this.v0;
        t2aVar.l = this.w0;
        t2aVar.m = this.x0;
        t2aVar.n = this.y0;
        t2aVar.o = this.z0;
        t2aVar.p = this.A0;
        t2aVar.q = this.B0;
        t2aVar.r = this.C0;
        t2aVar.s = this.D0;
        t2aVar.t = this.E0;
        t2aVar.u = this.F0;
        t2aVar.v = this.G0;
        t2aVar.w = this.H0;
        t2aVar.x = this.I0;
        t2aVar.y = this.J0;
        t2aVar.z = this.K0;
        t2aVar.A = this.L0;
        t2aVar.B = this.M0;
        t2aVar.C = this.N0;
        return t2aVar;
    }

    public final b8c b(mhc mhcVar) {
        return new b8c(this, mhcVar, false);
    }

    public final m8c c(mhc mhcVar, frf frfVar) {
        m8c m8cVar = new m8c(foe.h, mhcVar, frfVar, new Random(), this.L0, this.M0);
        if (mhcVar.d.a("Sec-WebSocket-Extensions") != null) {
            m8cVar.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"));
        } else {
            t2a t2aVarA = a();
            byte[] bArr = naf.a;
            t2aVarA.e = new qqd(29, (byte) 0);
            ArrayList arrayList = new ArrayList(m8c.x);
            sob sobVar = sob.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(sobVar) && !arrayList.contains(sob.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
            }
            if (arrayList.contains(sobVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
            }
            if (!(!arrayList.contains(sob.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
            }
            if (!(!arrayList.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            arrayList.remove(sob.SPDY_3);
            if (!arrayList.equals(t2aVarA.s)) {
                t2aVarA.C = null;
            }
            t2aVarA.s = Collections.unmodifiableList(arrayList);
            u2a u2aVar = new u2a(t2aVarA);
            l84 l84VarA = mhcVar.a();
            ((bj6) l84VarA.c).h("Upgrade", "websocket");
            ((bj6) l84VarA.c).h(HTTP.CONN_DIRECTIVE, "Upgrade");
            ((bj6) l84VarA.c).h("Sec-WebSocket-Key", m8cVar.a);
            ((bj6) l84VarA.c).h("Sec-WebSocket-Version", "13");
            ((bj6) l84VarA.c).h("Sec-WebSocket-Extensions", "permessage-deflate");
            mhc mhcVarR = l84VarA.r();
            b8c b8cVar = new b8c(u2aVar, mhcVarR, true);
            m8cVar.b = b8cVar;
            b8cVar.e(new wva(m8cVar, 3, mhcVarR));
        }
        return m8cVar;
    }

    public final Object clone() {
        return super.clone();
    }

    public u2a() {
        this(new t2a());
    }
}
