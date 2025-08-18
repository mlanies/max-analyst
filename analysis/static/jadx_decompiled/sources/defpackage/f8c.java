package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.connection.RouteException;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class f8c extends cp6 {
    public Socket b;
    public Socket c;
    public fi6 d;
    public sob e;
    public kp6 f;
    public y7c g;
    public x7c h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n = 1;
    public final ArrayList o = new ArrayList();
    public long p = Long.MAX_VALUE;
    public final xnc q;

    public f8c(xnc xncVar) {
        this.q = xncVar;
    }

    public static void d(u2a u2aVar, xnc xncVar, IOException iOException) {
        if (xncVar.b.type() != Proxy.Type.DIRECT) {
            y9 y9Var = xncVar.a;
            y9Var.k.connectFailed(y9Var.a.h(), xncVar.b.address(), iOException);
        }
        wd6 wd6Var = u2aVar.N0;
        synchronized (wd6Var) {
            ((LinkedHashSet) wd6Var.b).add(xncVar);
        }
    }

    @Override // defpackage.cp6
    public final synchronized void a(ded dedVar) {
        this.n = (dedVar.a & 16) != 0 ? dedVar.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.cp6
    public final void b(rp6 rp6Var) {
        rp6Var.c(8, null);
    }

    public final void c(int i, int i2, int i3, int i4, boolean z, b8c b8cVar, dp3 dp3Var) throws Throwable {
        xnc xncVar;
        if (this.e != null) {
            throw new IllegalStateException("already connected".toString());
        }
        y9 y9Var = this.q.a;
        List list = y9Var.c;
        sh3 sh3Var = new sh3(list);
        if (y9Var.f == null) {
            if (!list.contains(rh3.f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.q.a.a.e;
            q2b q2bVar = q2b.a;
            if (!q2b.a.h(str)) {
                throw new RouteException(new UnknownServiceException(zr6.i("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (y9Var.b.contains(sob.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                xnc xncVar2 = this.q;
                if (xncVar2.a.f != null && xncVar2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, dp3Var);
                    if (this.b == null) {
                    }
                    xncVar = this.q;
                    if (xncVar.a.f == null && xncVar.b.type() == Proxy.Type.HTTP && this.b == null) {
                        throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.p = System.nanoTime();
                    return;
                }
                e(i, i2, dp3Var);
                g(sh3Var, i4, dp3Var);
                InetSocketAddress inetSocketAddress = this.q.c;
                xncVar = this.q;
                if (xncVar.a.f == null) {
                }
                this.p = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.c;
                if (socket != null) {
                    naf.d(socket);
                }
                Socket socket2 = this.b;
                if (socket2 != null) {
                    naf.d(socket2);
                }
                this.c = null;
                this.b = null;
                this.g = null;
                this.h = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.n = 1;
                InetSocketAddress inetSocketAddress2 = this.q.c;
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    j47.e(routeException.b, e);
                    routeException.a = e;
                }
                if (!z) {
                    throw routeException;
                }
                sh3Var.c = true;
                if (!sh3Var.b) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
            }
        } while (e instanceof SSLException);
        throw routeException;
    }

    public final void e(int i, int i2, dp3 dp3Var) throws IOException {
        int i3;
        int i4 = 0;
        int i5 = 2;
        int i6 = 1;
        xnc xncVar = this.q;
        Proxy proxy = xncVar.b;
        y9 y9Var = xncVar.a;
        Proxy.Type type = proxy.type();
        Socket socketCreateSocket = (type != null && ((i3 = c8c.$EnumSwitchMapping$0[type.ordinal()]) == 1 || i3 == 2)) ? y9Var.e.createSocket() : new Socket(proxy);
        this.b = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.q.c;
        dp3Var.getClass();
        socketCreateSocket.setSoTimeout(i2);
        try {
            q2b q2bVar = q2b.a;
            q2b.a.e(socketCreateSocket, this.q.c, i);
            try {
                Logger logger = x2a.a;
                qp6 qp6Var = new qp6(i5, socketCreateSocket);
                this.g = new y7c(new vx(qp6Var, i4, new vx(socketCreateSocket.getInputStream(), i6, qp6Var)));
                qp6 qp6Var2 = new qp6(i5, socketCreateSocket);
                this.h = new x7c(new ux(qp6Var2, i4, new ux(socketCreateSocket.getOutputStream(), i6, qp6Var2)));
            } catch (NullPointerException e) {
                if (tpa.f(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.q.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, dp3 dp3Var) throws IOException, NumberFormatException {
        l84 l84Var = new l84();
        xnc xncVar = this.q;
        l84Var.a = xncVar.a.a;
        l84Var.G("CONNECT", null);
        y9 y9Var = xncVar.a;
        ((bj6) l84Var.c).h(HTTP.TARGET_HOST, naf.v(y9Var.a, true));
        ((bj6) l84Var.c).h("Proxy-Connection", HTTP.CONN_KEEP_ALIVE);
        ((bj6) l84Var.c).h(HTTP.USER_AGENT, "okhttp/4.9.2");
        mhc mhcVarR = l84Var.r();
        xic xicVar = new xic();
        xicVar.a = mhcVarR;
        xicVar.b = sob.HTTP_1_1;
        xicVar.c = HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED;
        xicVar.d = "Preemptive Authenticate";
        xicVar.g = naf.c;
        xicVar.k = -1L;
        xicVar.l = -1L;
        xicVar.f.h(AUTH.PROXY_AUTH, "OkHttp-Preemptive");
        xicVar.a();
        y9Var.i.getClass();
        e(i, i2, dp3Var);
        String str = "CONNECT " + naf.v(mhcVarR.b, true) + " HTTP/1.1";
        y7c y7cVar = this.g;
        x7c x7cVar = this.h;
        x8 x8Var = new x8(null, this, y7cVar, x7cVar);
        oue oueVarP = y7cVar.c.p();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oueVarP.g(j, timeUnit);
        x7cVar.c.p().g(i3, timeUnit);
        x8Var.R(mhcVarR.d, str);
        x8Var.b();
        xic xicVarE = x8Var.e(false);
        xicVarE.a = mhcVarR;
        yic yicVarA = xicVarE.a();
        long j2 = naf.j(yicVarA);
        if (j2 != -1) {
            xo6 xo6VarF = x8Var.F(j2);
            naf.t(xo6VarF, Integer.MAX_VALUE, timeUnit);
            xo6VarF.close();
        }
        int i4 = yicVarA.o;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(zr6.h(i4, "Unexpected response code for CONNECT: "));
            }
            y9Var.i.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!y7cVar.a.B() || !x7cVar.a.B()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.sh3 r17, int r18, defpackage.dp3 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8c.g(sh3, int, dp3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        if (defpackage.s2a.c(r0, (java.security.cert.X509Certificate) r10) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.y9 r9, java.util.ArrayList r10) {
        /*
            r8 = this;
            byte[] r0 = defpackage.naf.a
            java.util.ArrayList r0 = r8.o
            int r0 = r0.size()
            int r1 = r8.n
            r2 = 0
            if (r0 >= r1) goto Ld2
            boolean r0 = r8.i
            if (r0 == 0) goto L13
            goto Ld2
        L13:
            xnc r0 = r8.q
            y9 r1 = r0.a
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            vq6 r1 = r9.a
            java.lang.String r3 = r1.e
            y9 r4 = r0.a
            vq6 r5 = r4.a
            java.lang.String r5 = r5.e
            boolean r3 = defpackage.tpa.f(r3, r5)
            r5 = 1
            if (r3 == 0) goto L30
            return r5
        L30:
            kp6 r3 = r8.f
            if (r3 != 0) goto L35
            return r2
        L35:
            if (r10 == 0) goto Ld2
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L3f
            goto Ld2
        L3f:
            java.util.Iterator r10 = r10.iterator()
        L43:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Ld2
            java.lang.Object r3 = r10.next()
            xnc r3 = (defpackage.xnc) r3
            java.net.Proxy r6 = r3.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L43
            java.net.Proxy r6 = r0.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L43
            java.net.InetSocketAddress r3 = r3.c
            java.net.InetSocketAddress r6 = r0.c
            boolean r3 = defpackage.tpa.f(r6, r3)
            if (r3 == 0) goto L43
            s2a r10 = defpackage.s2a.a
            javax.net.ssl.HostnameVerifier r0 = r9.g
            if (r0 == r10) goto L72
            return r2
        L72:
            byte[] r10 = defpackage.naf.a
            vq6 r10 = r4.a
            int r0 = r10.f
            int r3 = r1.f
            if (r3 == r0) goto L7d
            goto Ld2
        L7d:
            java.lang.String r0 = r1.e
            java.lang.String r10 = r10.e
            boolean r10 = defpackage.tpa.f(r0, r10)
            if (r10 == 0) goto L88
            goto La9
        L88:
            boolean r10 = r8.j
            if (r10 != 0) goto Ld2
            fi6 r10 = r8.d
            if (r10 == 0) goto Ld2
            java.util.List r10 = r10.a()
            boolean r1 = r10.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto Ld2
            java.lang.Object r10 = r10.get(r2)
            if (r10 == 0) goto Lca
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = defpackage.s2a.c(r0, r10)
            if (r10 == 0) goto Ld2
        La9:
            e12 r9 = r9.h     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            fi6 r8 = r8.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            r8.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            java.util.Set r8 = r9.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            if (r9 != 0) goto Lc0
            return r5
        Lc0:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            defpackage.au1.r(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc9
        Lc9:
            return r2
        Lca:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r8.<init>(r9)
            throw r8
        Ld2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8c.h(y9, java.util.ArrayList):boolean");
    }

    public final boolean i(boolean z) throws SocketException {
        long j;
        byte[] bArr = naf.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.b;
        Socket socket2 = this.c;
        y7c y7cVar = this.g;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        kp6 kp6Var = this.f;
        if (kp6Var != null) {
            synchronized (kp6Var) {
                if (kp6Var.Z) {
                    return false;
                }
                if (kp6Var.A0 < kp6Var.z0) {
                    if (jNanoTime >= kp6Var.B0) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.p;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z2 = !y7cVar.B();
                socket2.setSoTimeout(soTimeout);
                return z2;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final u45 j(u2a u2aVar, h8c h8cVar) throws SocketException {
        Socket socket = this.c;
        y7c y7cVar = this.g;
        x7c x7cVar = this.h;
        kp6 kp6Var = this.f;
        if (kp6Var != null) {
            return new lp6(u2aVar, this, h8cVar, kp6Var);
        }
        int i = h8cVar.d;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y7cVar.c.p().g(i, timeUnit);
        x7cVar.c.p().g(h8cVar.e, timeUnit);
        return new x8(u2aVar, this, y7cVar, x7cVar);
    }

    public final synchronized void k() {
        this.i = true;
    }

    public final void l(int i) throws SocketException {
        Socket socket = this.c;
        y7c y7cVar = this.g;
        x7c x7cVar = this.h;
        socket.setSoTimeout(0);
        foe foeVar = foe.h;
        gb0 gb0Var = new gb0();
        gb0Var.g = foeVar;
        gb0Var.f = cp6.a;
        String str = this.q.a.a.e;
        gb0Var.c = socket;
        gb0Var.a = naf.g + ' ' + str;
        gb0Var.d = y7cVar;
        gb0Var.e = x7cVar;
        gb0Var.f = this;
        gb0Var.b = i;
        kp6 kp6Var = new kp6(gb0Var);
        this.f = kp6Var;
        ded dedVar = kp6.M0;
        this.n = (dedVar.a & 16) != 0 ? dedVar.b[4] : Integer.MAX_VALUE;
        sp6 sp6Var = kp6Var.J0;
        synchronized (sp6Var) {
            try {
                if (sp6Var.c) {
                    throw new IOException("closed");
                }
                if (sp6Var.Y) {
                    Logger logger = sp6.Z;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(naf.h(">> CONNECTION " + zo6.a.d(), new Object[0]));
                    }
                    sp6Var.X.M(zo6.a);
                    sp6Var.X.flush();
                }
            } finally {
            }
        }
        sp6 sp6Var2 = kp6Var.J0;
        ded dedVar2 = kp6Var.C0;
        synchronized (sp6Var2) {
            try {
                if (sp6Var2.c) {
                    throw new IOException("closed");
                }
                sp6Var2.g(0, Integer.bitCount(dedVar2.a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z = true;
                    if (((1 << i2) & dedVar2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        sp6Var2.X.y(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                        sp6Var2.X.A(dedVar2.b[i2]);
                    }
                    i2++;
                }
                sp6Var2.X.flush();
            } finally {
            }
        }
        if (kp6Var.C0.a() != 65535) {
            kp6Var.J0.S(0, r8 - 65535);
        }
        foeVar.f().c(new ip6(kp6Var.K0, kp6Var.o, 2), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        xnc xncVar = this.q;
        sb.append(xncVar.a.a.e);
        sb.append(':');
        sb.append(xncVar.a.a.f);
        sb.append(", proxy=");
        sb.append(xncVar.b);
        sb.append(" hostAddress=");
        sb.append(xncVar.c);
        sb.append(" cipherSuite=");
        fi6 fi6Var = this.d;
        if (fi6Var == null || (obj = fi6Var.c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
