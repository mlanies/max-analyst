package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class ur0 implements p37 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ur0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static int d(yic yicVar, int i) {
        String strA = yic.a(yicVar, "Retry-After");
        if (strA == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strA).matches()) {
            return Integer.valueOf(strA).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x023f  */
    @Override // defpackage.p37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yic a(defpackage.h8c r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur0.a(h8c):yic");
    }

    public mhc b(yic yicVar, od odVar) throws ProtocolException {
        od3 od3Var;
        f8c f8cVar;
        xnc xncVar = (odVar == null || (f8cVar = (f8c) odVar.b) == null) ? null : f8cVar.q;
        int i = yicVar.o;
        String str = yicVar.a.c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((u2a) this.b).Z.getClass();
                return null;
            }
            if (i == 421) {
                if (odVar == null || !(!tpa.f(((v45) odVar.X).h.a.e, ((f8c) odVar.b).q.a.a.e))) {
                    return null;
                }
                f8c f8cVar2 = (f8c) odVar.b;
                synchronized (f8cVar2) {
                    f8cVar2.j = true;
                }
                return yicVar.a;
            }
            if (i == 503) {
                yic yicVar2 = yicVar.u0;
                if ((yicVar2 == null || yicVar2.o != 503) && d(yicVar, Integer.MAX_VALUE) == 0) {
                    return yicVar.a;
                }
                return null;
            }
            if (i == 407) {
                if (xncVar.b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((u2a) this.b).y0.getClass();
                return null;
            }
            if (i == 408) {
                if (!((u2a) this.b).Y) {
                    return null;
                }
                yic yicVar3 = yicVar.u0;
                if ((yicVar3 == null || yicVar3.o != 408) && d(yicVar, 0) <= 0) {
                    return yicVar.a;
                }
                return null;
            }
            switch (i) {
                case HttpStatus.SC_MULTIPLE_CHOICES /* 300 */:
                case HttpStatus.SC_MOVED_PERMANENTLY /* 301 */:
                case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                case HttpStatus.SC_SEE_OTHER /* 303 */:
                    break;
                default:
                    return null;
            }
        }
        u2a u2aVar = (u2a) this.b;
        if (!u2aVar.s0) {
            return null;
        }
        String strA = yicVar.Y.a("Location");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return null;
        }
        mhc mhcVar = yicVar.a;
        vq6 vq6Var = mhcVar.b;
        vq6Var.getClass();
        try {
            od3Var = new od3();
            od3Var.j(vq6Var, strA);
        } catch (IllegalArgumentException unused) {
            od3Var = null;
        }
        vq6 vq6VarB = od3Var != null ? od3Var.b() : null;
        if (vq6VarB == null) {
            return null;
        }
        if (!tpa.f(vq6VarB.b, mhcVar.b.b) && !u2aVar.t0) {
            return null;
        }
        l84 l84VarA = mhcVar.a();
        if (tu0.z(str)) {
            boolean zEquals = str.equals("PROPFIND");
            int i2 = yicVar.o;
            boolean z = zEquals || i2 == 308 || i2 == 307;
            if (!(!str.equals("PROPFIND")) || i2 == 308 || i2 == 307) {
                l84VarA.G(str, z ? mhcVar.e : null);
            } else {
                l84VarA.G(HttpGet.METHOD_NAME, null);
            }
            if (!z) {
                l84VarA.J(HTTP.TRANSFER_ENCODING);
                l84VarA.J(HTTP.CONTENT_LEN);
                l84VarA.J(HTTP.CONTENT_TYPE);
            }
        }
        if (!naf.a(mhcVar.b, vq6VarB)) {
            l84VarA.J(AUTH.WWW_AUTH_RESP);
        }
        l84VarA.a = vq6VarB;
        return l84VarA.r();
    }

    public boolean c(IOException iOException, b8c b8cVar, mhc mhcVar, boolean z) {
        gb0 gb0Var;
        boolean zC;
        f8c f8cVar;
        if (!((u2a) this.b).Y) {
            return false;
        }
        if ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        v45 v45Var = b8cVar.Y;
        int i = v45Var.c;
        if (i == 0 && v45Var.d == 0 && v45Var.e == 0) {
            zC = false;
        } else if (v45Var.f != null) {
            zC = true;
        } else {
            xnc xncVar = null;
            if (i <= 1 && v45Var.d <= 1 && v45Var.e <= 0 && (f8cVar = v45Var.i.Z) != null) {
                synchronized (f8cVar) {
                    if (f8cVar.k == 0 && naf.a(f8cVar.q.a.a, v45Var.h.a)) {
                        xncVar = f8cVar.q;
                    }
                }
            }
            if (xncVar != null) {
                v45Var.f = xncVar;
            } else {
                df4 df4Var = v45Var.a;
                if ((df4Var == null || !df4Var.e()) && (gb0Var = v45Var.b) != null) {
                    zC = gb0Var.c();
                }
            }
            zC = true;
        }
        return zC;
    }
}
