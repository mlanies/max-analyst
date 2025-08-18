package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.TrafficStats;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class wq6 {
    public final Context a;
    public final String b;
    public final int c;
    public final int d = 0;
    public final int e = 0;

    public wq6(int i, Context context, String str) {
        this.a = context;
        this.b = str;
        this.c = i;
    }

    public static void a(HttpURLConnection httpURLConnection, int i, int i2, int i3) {
        int threadStatsTag;
        if (i != -1) {
            threadStatsTag = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(i);
        } else {
            threadStatsTag = -1;
        }
        try {
            if (i2 > 0) {
                try {
                    try {
                        try {
                            httpURLConnection.setConnectTimeout(i2);
                        } catch (SecurityException e) {
                            Throwable cause = e.getCause();
                            if (cause == null) {
                                throw e;
                            }
                            String name = cause.getClass().getName();
                            if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                                throw e;
                            }
                            throw new UnknownHostException();
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e3) {
                    throw e3;
                }
            }
            if (i3 > 0) {
                httpURLConnection.setReadTimeout(i3);
            }
            httpURLConnection.connect();
            if (threadStatsTag != -1) {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
        } catch (Throwable th) {
            if (threadStatsTag != -1) {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
            throw th;
        }
    }

    public final rq6 b(bkb bkbVar) {
        String str;
        BufferedInputStream bufferedInputStream;
        byte[] byteArray;
        String str2 = (String) bkbVar.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) bkbVar.b).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
            int i = uzb.rootca_ssl_rsa2022;
            Resources resources = this.a.getApplicationContext().getResources();
            InputStream inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X509").generateCertificate(inputStreamOpenRawResource);
                v3c.i(inputStreamOpenRawResource, null);
                String resourceEntryName = resources.getResourceEntryName(i);
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setCertificateEntry(resourceEntryName, (X509Certificate) certificateGenerateCertificate);
                TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                trustManagerFactory2.init(keyStore);
                TrustManager[] trustManagers2 = trustManagerFactory2.getTrustManagers();
                if (trustManagers2.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                vc3 vc3Var = new vc3(new X509TrustManager[]{x509TrustManager, (X509TrustManager) trustManagers2[0]});
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, new TrustManager[]{vc3Var}, null);
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } finally {
            }
        }
        try {
            httpURLConnection.setRequestMethod(str2);
            String str3 = this.b;
            if (str3 != null) {
                httpURLConnection.setRequestProperty(HTTP.USER_AGENT, str3);
            }
            qq6 qq6Var = (qq6) bkbVar.c;
            if (qq6Var != null) {
                httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, qq6Var.getContentType());
                httpURLConnection.setDoOutput(true);
                if (qq6Var.getContentLength() >= 0) {
                    httpURLConnection.setFixedLengthStreamingMode(qq6Var.getContentLength());
                } else {
                    httpURLConnection.setChunkedStreamingMode(4096);
                }
            }
            a(httpURLConnection, this.c, this.d, this.e);
            if (qq6Var != null) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    qq6Var.writeTo(outputStream);
                    v3c.i(outputStream, null);
                } finally {
                }
            }
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                List<String> list = httpURLConnection.getHeaderFields().get(HTTP.CONTENT_TYPE);
                if (list == null || (str = (String) x53.i0(list)) == null) {
                    str = "application/octet-stream";
                }
                if (responseCode < 400) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, bufferedInputStream.available()));
                        ema.l(bufferedInputStream, byteArrayOutputStream, 8192);
                        byteArray = byteArrayOutputStream.toByteArray();
                        v3c.i(bufferedInputStream, null);
                    } finally {
                    }
                } else {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(Math.max(8192, bufferedInputStream.available()));
                        ema.l(bufferedInputStream, byteArrayOutputStream2, 8192);
                        byteArray = byteArrayOutputStream2.toByteArray();
                        v3c.i(bufferedInputStream, null);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return new rq6(responseCode, responseMessage, new rh5(str, 1, byteArray), 0);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException(e);
            } catch (NullPointerException e2) {
                String message = e2.getMessage();
                if (message == null || !eae.o0(message, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false)) {
                    throw e2;
                }
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            httpURLConnection.disconnect();
            throw e3;
        }
    }
}
