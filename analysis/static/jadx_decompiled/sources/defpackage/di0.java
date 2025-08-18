package defpackage;

import android.net.TrafficStats;
import android.os.SystemClock;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import one.me.net.client.impl.internal.SocketFactoryCreateException;
import one.me.net.ssl.api.InvalidSslSessionException;

/* loaded from: classes2.dex */
public abstract class di0 implements k33 {
    public static final Pattern i = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    public final cjg a;
    public final ai3 b;
    public final zwd c;
    public Socket d;
    public sqd e;
    public final eh3 f;
    public tg3 g = new tg3(false);
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public di0(cjg cjgVar, eh3 eh3Var, zwd zwdVar, ai3 ai3Var) {
        this.a = cjgVar;
        this.b = ai3Var;
        this.c = zwdVar;
        this.f = eh3Var;
    }

    public static Socket n(SocketFactory socketFactory) throws IOException {
        hm9.n("di0", "createSocket");
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = socketFactory.createSocket();
            if (socketCreateSocket != null) {
                TrafficStats.tagSocket(socketCreateSocket);
            }
            socketCreateSocket.setKeepAlive(false);
            socketCreateSocket.setTcpNoDelay(true);
            return socketCreateSocket;
        } catch (IOException e) {
            p(socketCreateSocket);
            throw e;
        } catch (Throwable th) {
            p(socketCreateSocket);
            throw new IOException("Failed to create socket", th);
        }
    }

    public static long o(int i2, boolean z) {
        if (i2 > 6) {
            i2 = 6;
        }
        double dPow = (long) (Math.pow(2.0d, i2) * 1000.0d);
        long jRandom = (long) (((dPow / 2.0d) * Math.random()) + dPow);
        if (z && jRandom > 15000) {
            jRandom = 15000;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "di0", "getConnectionTimeout: errorsCount: " + i2 + " timeout: " + jRandom, null);
        }
        return jRandom;
    }

    public static void p(Socket socket) {
        if (socket != null) {
            hm9.n("di0", "releaseSocketSafely");
            try {
                socket.close();
            } catch (Throwable th) {
                hm9.l0("di0", "failed to close socket", th);
            }
        }
    }

    @Override // defpackage.k33
    public final ai3 a() {
        return this.b;
    }

    @Override // defpackage.k33
    public final void b() {
        this.h.clear();
    }

    @Override // defpackage.k33
    public final void c(Socket socket) throws SocketException {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    @Override // defpackage.k33
    public Socket connect() {
        String str;
        int i2;
        long j;
        hm9.n("di0", "connect ->");
        this.g = new tg3(true);
        TrafficStats.setThreadStatsTag((i() + d()).hashCode());
        String strI = i();
        int iD = d();
        try {
            SocketFactory socketFactory = (SocketFactory) this.h.computeIfAbsent(strI, new di(21, this));
            tg3 tg3Var = this.g;
            tg3Var.g = strI;
            tg3Var.h = iD;
            Socket socketM = m(socketFactory, strI, iD);
            this.d = socketM;
            if (!(socketM instanceof SSLSocket)) {
                tg3 tg3Var2 = this.g;
                tg3Var2.getClass();
                tg3Var2.b = System.currentTimeMillis();
                return this.d;
            }
            zwd zwdVar = this.c;
            SSLSocket sSLSocket = (SSLSocket) socketM;
            String str2 = i.matcher(strI).matches() ? this.f.a : strI;
            axd axdVar = (axd) zwdVar;
            String str3 = axdVar.a;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str3, zr6.i("verifySocket, host=", str2, " ->"), null);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            bxd bxdVar = (bxd) axdVar.d.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                try {
                    try {
                        SSLSession session = sSLSocket.getSession();
                        if (!session.isValid()) {
                            throw new InvalidSslSessionException("session is not valid " + session, 2);
                        }
                        if ("SSL_NULL_WITH_NULL_NULL".equalsIgnoreCase(session.getCipherSuite())) {
                            throw new InvalidSslSessionException("Illegal session cipher suite", 2);
                        }
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (jElapsedRealtime2 >= 0) {
                            bxdVar.g = jElapsedRealtime2;
                            bxdVar.h += jElapsedRealtime2;
                            bxdVar.i++;
                        } else {
                            bxdVar.getClass();
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        bxd bxdVar2 = (bxd) axdVar.d.b;
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        try {
                            if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSocket.getSession())) {
                                throw new SSLPeerUnverifiedException("Failed to verify host=".concat(str2));
                            }
                            bxdVar2.a(SystemClock.elapsedRealtime() - jElapsedRealtime3);
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                            String str4 = axdVar.a;
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, str4, ey8.i(jCurrentTimeMillis2 + jCurrentTimeMillis4, "<- verifySocket, took=", "ms"), null);
                            }
                            tg3 tg3Var3 = this.g;
                            tg3Var3.getClass();
                            tg3Var3.b = System.currentTimeMillis();
                            hm9.n("di0", "ssl session is ok");
                            sqd sqdVar = this.e;
                            if (sqdVar != null && ((nqd) sqdVar).h()) {
                                String str5 = "emitter was disposed " + strI + ":" + iD;
                                hm9.n("di0", str5);
                                throw new IOException(str5);
                            }
                            bxd bxdVar3 = ((axd) this.c).c;
                            long j2 = bxdVar3.a;
                            int i3 = bxdVar3.c;
                            long j3 = bxdVar3.b;
                            if (i3 > 1) {
                                j3 /= bxdVar3.c;
                            }
                            long j4 = j3;
                            int i4 = bxdVar3.c;
                            long j5 = bxdVar3.d;
                            long j6 = bxdVar3.f > 1 ? bxdVar3.e / bxdVar3.f : bxdVar3.e;
                            int i5 = bxdVar3.f;
                            long j7 = bxdVar3.g;
                            if (bxdVar3.i > 1) {
                                str = strI;
                                i2 = iD;
                                j = bxdVar3.h / bxdVar3.i;
                            } else {
                                str = strI;
                                i2 = iD;
                                j = bxdVar3.h;
                            }
                            cxd cxdVar = new cxd(j2, j4, i4, j5, j6, i5, j7, j, bxdVar3.i);
                            tg3 tg3Var4 = this.g;
                            long j8 = cxdVar.l;
                            tg3Var4.getClass();
                            tg3Var4.f = Math.max(j8, 0L);
                            hm9.m("di0", "<- connect, socket connected to %s:%d, ssl_metrics=%s", str, Integer.valueOf(i2), cxdVar.toString());
                            return this.d;
                        } catch (SSLPeerUnverifiedException e) {
                            bxdVar2.a(SystemClock.elapsedRealtime() - jElapsedRealtime3);
                            hm9.p(axdVar.a, mqd.i(sSLSocket, str2), null);
                            throw e;
                        } catch (Throwable th) {
                            bxdVar2.a(SystemClock.elapsedRealtime() - jElapsedRealtime3);
                            hm9.p(axdVar.a, mqd.i(sSLSocket, str2), null);
                            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException("Failed to verify host=".concat(str2));
                            sSLPeerUnverifiedException.initCause(th);
                            throw sSLPeerUnverifiedException;
                        }
                    } catch (InvalidSslSessionException e2) {
                        throw e2;
                    }
                } catch (Throwable th2) {
                    throw new InvalidSslSessionException("Failed to check session", th2);
                }
            } catch (Throwable th3) {
                long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime4 >= 0) {
                    bxdVar.g = jElapsedRealtime4;
                    bxdVar.h += jElapsedRealtime4;
                    bxdVar.i++;
                } else {
                    bxdVar.getClass();
                }
                throw th3;
            }
        } catch (SocketFactoryCreateException e3) {
            throw e3.a;
        }
    }

    @Override // defpackage.k33
    public final boolean e() {
        return true;
    }

    @Override // defpackage.k33
    public final void f() {
        ai3 ai3Var = this.b;
        ((AtomicInteger) ai3Var.c).incrementAndGet();
        String name = ai3.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, zr6.h(((AtomicInteger) ai3Var.c).get(), "tryNextRequestTimeout "), null);
        }
    }

    @Override // defpackage.k33
    public final long h(int i2) {
        return o(i2, ((ri4) this.a.a).d());
    }

    @Override // defpackage.k33
    public final tg3 k() {
        return this.g;
    }

    public void l(Socket socket, String str, int i2, int i3) throws IOException {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "di0", String.format(Locale.ROOT, "connectSocket, socket=%s, host=%s:%d, timeout=%dms", socket, str, Integer.valueOf(i2), Integer.valueOf(i3)), null);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i2);
        if (inetSocketAddress.getAddress() != null) {
            tg3 tg3Var = this.g;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            tg3Var.getClass();
            tg3Var.d = Math.max(jElapsedRealtime2, 0L);
        }
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        hm9.n("Socket", "socket connect");
        socket.connect(inetSocketAddress, i3);
        hm9.n("Socket", "socket connected");
        tg3 tg3Var2 = this.g;
        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
        tg3Var2.getClass();
        tg3Var2.e = Math.max(jElapsedRealtime4, 0L);
    }

    public Socket m(SocketFactory socketFactory, String str, int i2) throws IOException {
        hm9.n("di0", "createConnection");
        Socket socketN = n(socketFactory);
        try {
            l(socketN, str, i2, j());
            return socketN;
        } catch (IOException e) {
            p(socketN);
            throw e;
        } catch (Throwable th) {
            p(socketN);
            throw new IOException("Failed to create connection", th);
        }
    }
}
