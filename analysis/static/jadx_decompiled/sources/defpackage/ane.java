package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class ane implements X509TrustManager {
    public final String a;
    public final String b;
    public final X509TrustManager c;
    public final X509TrustManagerExtensions d;

    public ane(String str) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = str;
        String name = ane.class.getName();
        this.b = name;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "init, useX509Extension=true", null);
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        X509TrustManager x509TrustManager = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        this.c = x509TrustManager;
        this.d = new X509TrustManagerExtensions(x509TrustManager);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        String str2 = this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str2, wg0.i("checkClientTrusted, authType=", str), null);
        }
        this.c.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        String str2 = this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str2, wg0.i("checkServerTrusted, authType=", str), null);
        }
        try {
            if (this.d == null) {
                this.c.checkServerTrusted(x509CertificateArr, str);
                return;
            }
            String str3 = this.b;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, str3, "checkServerTrusted, use X509 extension, host=" + this.a, null);
            }
            this.d.checkServerTrusted(x509CertificateArr, str, this.a);
        } catch (CertificateException e) {
            hm9.p(this.b, "server certificate chain not trusted", e);
            if (x509CertificateArr != null) {
                String str4 = this.b;
                ir6 ir6Var3 = hm9.m;
                if (ir6Var3 != null && ir6Var3.c()) {
                    us7 us7Var = us7.X;
                    StringBuilder sb = new StringBuilder("\n");
                    int length = x509CertificateArr.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(i);
                        sb.append('.');
                        sb.append(' ');
                        tpa.c(sb, x509CertificateArr[i]);
                    }
                    ir6Var3.d(us7Var, str4, "server certificate chain: " + ((Object) sb), null);
                }
            }
            try {
                Locale locale = Locale.getDefault();
                StringBuilder sb2 = new StringBuilder();
                X509Certificate[] acceptedIssuers = this.c.getAcceptedIssuers();
                int i2 = 0;
                while (i2 < acceptedIssuers.length) {
                    int i3 = i2 + 1;
                    try {
                        X509Certificate x509Certificate = acceptedIssuers[i2];
                        Principal issuerDN = x509Certificate.getIssuerDN();
                        String name = issuerDN != null ? issuerDN.getName() : null;
                        Principal subjectDN = x509Certificate.getSubjectDN();
                        String name2 = subjectDN != null ? subjectDN.getName() : null;
                        if ((name != null && w9e.p0(name.toLowerCase(locale), "comodo", false)) || (name2 != null && w9e.p0(name2.toLowerCase(locale), "comodo", false))) {
                            tpa.c(sb2, x509Certificate);
                        }
                        i2 = i3;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw new NoSuchElementException(e2.getMessage());
                    }
                }
                String str5 = this.b;
                ir6 ir6Var4 = hm9.m;
                if (ir6Var4 != null && ir6Var4.c()) {
                    ir6Var4.d(us7.X, str5, "trusted store certificates: " + ((Object) sb2), null);
                }
            } catch (GeneralSecurityException e3) {
                hm9.p(this.b, "failed to log trusted store certificates", e3);
            }
            throw e;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.c.getAcceptedIssuers();
    }
}
