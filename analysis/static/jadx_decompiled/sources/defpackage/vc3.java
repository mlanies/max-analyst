package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class vc3 implements X509TrustManager {
    public final X509TrustManager[] a;
    public final ArrayList b;

    public vc3(X509TrustManager[] x509TrustManagerArr) {
        this.a = x509TrustManagerArr;
        ArrayList arrayList = new ArrayList(x509TrustManagerArr.length);
        for (X509TrustManager x509TrustManager : x509TrustManagerArr) {
            arrayList.add(new X509TrustManagerExtensions(x509TrustManager));
        }
        this.b = arrayList;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (X509TrustManager x509TrustManager : this.a) {
            try {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (X509TrustManager x509TrustManager : this.a) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = new ArrayList();
        for (X509TrustManager x509TrustManager : this.a) {
            d63.V(ys.m0(x509TrustManager.getAcceptedIssuers()), arrayList);
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                return ((X509TrustManagerExtensions) it.next()).checkServerTrusted(x509CertificateArr, str, str2);
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
