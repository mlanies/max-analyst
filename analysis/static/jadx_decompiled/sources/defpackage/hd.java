package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class hd extends q2b {
    public static final boolean d = b46.p();
    public final ArrayList c;

    public hd() {
        ArrayList arrayListD0 = ys.d0(new oud[]{b46.p() ? new id() : null, new fg4(de.f), new fg4(fi3.a), new fg4(pr0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListD0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((oud) next).a()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.q2b
    public final a14 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        jd jdVar = x509TrustManagerExtensions != null ? new jd(x509TrustManager, x509TrustManagerExtensions) : null;
        return jdVar != null ? jdVar : super.b(x509TrustManager);
    }

    @Override // defpackage.q2b
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((oud) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        oud oudVar = (oud) next;
        if (oudVar != null) {
            oudVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.q2b
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((oud) next).b(sSLSocket)) {
                break;
            }
        }
        oud oudVar = (oud) next;
        if (oudVar != null) {
            return oudVar.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.q2b
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
