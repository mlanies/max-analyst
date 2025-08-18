package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class lp6 implements u45 {
    public static final List Z = naf.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List s0 = naf.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final h8c X;
    public final kp6 Y;
    public volatile rp6 a;
    public final sob b;
    public volatile boolean c;
    public final f8c o;

    public lp6(u2a u2aVar, f8c f8cVar, h8c h8cVar, kp6 kp6Var) {
        this.o = f8cVar;
        this.X = h8cVar;
        this.Y = kp6Var;
        sob sobVar = sob.H2_PRIOR_KNOWLEDGE;
        this.b = u2aVar.D0.contains(sobVar) ? sobVar : sob.HTTP_2;
    }

    @Override // defpackage.u45
    public final yud a(yic yicVar) {
        return this.a.g;
    }

    @Override // defpackage.u45
    public final void b() {
        this.a.g().close();
    }

    @Override // defpackage.u45
    public final ksd c(mhc mhcVar, long j) {
        return this.a.g();
    }

    @Override // defpackage.u45
    public final void cancel() {
        this.c = true;
        rp6 rp6Var = this.a;
        if (rp6Var != null) {
            rp6Var.e(9);
        }
    }

    @Override // defpackage.u45
    public final long d(yic yicVar) {
        if (mq6.a(yicVar)) {
            return naf.j(yicVar);
        }
        return 0L;
    }

    @Override // defpackage.u45
    public final xic e(boolean z) throws NumberFormatException, IOException {
        cj6 cj6Var;
        rp6 rp6Var = this.a;
        synchronized (rp6Var) {
            rp6Var.i.i();
            while (rp6Var.e.isEmpty() && rp6Var.k == 0) {
                try {
                    rp6Var.k();
                } catch (Throwable th) {
                    rp6Var.i.m();
                    throw th;
                }
            }
            rp6Var.i.m();
            if (!(!rp6Var.e.isEmpty())) {
                IOException iOException = rp6Var.l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new StreamResetException(rp6Var.k);
            }
            cj6Var = (cj6) rp6Var.e.removeFirst();
        }
        sob sobVar = this.b;
        ArrayList arrayList = new ArrayList(20);
        int size = cj6Var.size();
        jn jnVarV = null;
        for (int i = 0; i < size; i++) {
            String strB = cj6Var.b(i);
            String strD = cj6Var.d(i);
            if (tpa.f(strB, ":status")) {
                jnVarV = xfg.v("HTTP/1.1 " + strD);
            } else if (!s0.contains(strB)) {
                arrayList.add(strB);
                arrayList.add(w9e.b1(strD).toString());
            }
        }
        if (jnVarV == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        xic xicVar = new xic();
        xicVar.b = sobVar;
        xicVar.c = jnVarV.b;
        xicVar.d = (String) jnVarV.o;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        bj6 bj6Var = new bj6();
        d63.X(bj6Var.a, (String[]) array);
        xicVar.f = bj6Var;
        if (z && xicVar.c == 100) {
            return null;
        }
        return xicVar;
    }

    @Override // defpackage.u45
    public final f8c f() {
        return this.o;
    }

    @Override // defpackage.u45
    public final void g(mhc mhcVar) throws IOException {
        int i;
        rp6 rp6Var;
        boolean z;
        if (this.a != null) {
            return;
        }
        boolean z2 = mhcVar.e != null;
        cj6 cj6Var = mhcVar.d;
        ArrayList arrayList = new ArrayList(cj6Var.size() + 4);
        arrayList.add(new vi6(vi6.f, mhcVar.c));
        aw0 aw0Var = vi6.g;
        vq6 vq6Var = mhcVar.b;
        String strB = vq6Var.b();
        String strD = vq6Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new vi6(aw0Var, strB));
        String strA = cj6Var.a(HTTP.TARGET_HOST);
        if (strA != null) {
            arrayList.add(new vi6(vi6.i, strA));
        }
        arrayList.add(new vi6(vi6.h, vq6Var.b));
        int size = cj6Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB2 = cj6Var.b(i2);
            Locale locale = Locale.US;
            if (strB2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strB2.toLowerCase(locale);
            if (!Z.contains(lowerCase) || (lowerCase.equals("te") && tpa.f(cj6Var.d(i2), "trailers"))) {
                arrayList.add(new vi6(lowerCase, cj6Var.d(i2)));
            }
        }
        kp6 kp6Var = this.Y;
        boolean z3 = !z2;
        synchronized (kp6Var.J0) {
            synchronized (kp6Var) {
                try {
                    if (kp6Var.Y > 1073741823) {
                        kp6Var.n(8);
                    }
                    if (kp6Var.Z) {
                        throw new ConnectionShutdownException();
                    }
                    i = kp6Var.Y;
                    kp6Var.Y = i + 2;
                    rp6Var = new rp6(i, kp6Var, z3, false, null);
                    z = !z2 || kp6Var.G0 >= kp6Var.H0 || rp6Var.c >= rp6Var.d;
                    if (rp6Var.i()) {
                        kp6Var.c.put(Integer.valueOf(i), rp6Var);
                    }
                } finally {
                }
            }
            sp6 sp6Var = kp6Var.J0;
            synchronized (sp6Var) {
                if (sp6Var.c) {
                    throw new IOException("closed");
                }
                sp6Var.o.d(arrayList);
                long j = sp6Var.a.b;
                long jMin = Math.min(sp6Var.b, j);
                int i3 = j == jMin ? 4 : 0;
                if (z3) {
                    i3 |= 1;
                }
                sp6Var.g(i, (int) jMin, 1, i3);
                sp6Var.X.N(sp6Var.a, jMin);
                if (j > jMin) {
                    sp6Var.U(i, j - jMin);
                }
            }
        }
        if (z) {
            kp6Var.J0.flush();
        }
        this.a = rp6Var;
        if (this.c) {
            this.a.e(9);
            throw new IOException("Canceled");
        }
        qp6 qp6Var = this.a.i;
        long j2 = this.X.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qp6Var.g(j2, timeUnit);
        this.a.j.g(this.X.e, timeUnit);
    }

    @Override // defpackage.u45
    public final void h() {
        this.Y.flush();
    }
}
