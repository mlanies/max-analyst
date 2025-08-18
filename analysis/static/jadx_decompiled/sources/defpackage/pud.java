package defpackage;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class pud extends SSLSocketFactory {
    public final String a;
    public final SSLCertificateSocketFactory b;

    public pud(Context context, String str) {
        SSLSessionCache sSLSessionCache;
        String name = pud.class.getName();
        this.a = name;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "init, useX509Extension=true", null);
        }
        try {
            sSLSessionCache = new SSLSessionCache(context.getDir("tamtam_sslcache", 0));
        } catch (IOException e) {
            hm9.p(this.a, "failed to create ssl cache with specified dir", e);
            sSLSessionCache = new SSLSessionCache(context);
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(5000, sSLSessionCache);
        this.b = sSLCertificateSocketFactory;
        try {
            sSLCertificateSocketFactory.setTrustManagers(new ane[]{new ane(str)});
        } catch (Throwable th) {
            hm9.p(this.a, "failed set tam trust manager to default ssl socket factory", th);
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket();
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.b.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.b.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(socket, str, i, z);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(str, i);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(str, i, inetAddress, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.b;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }
}
