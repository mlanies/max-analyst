package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class nb4 extends ki0 {
    public boolean A0;
    public int B0;
    public long C0;
    public long D0;
    public final boolean X;
    public final boolean Y;
    public final int Z;
    public final int s0;
    public final String t0;
    public final imc u0;
    public final imc v0;
    public final a7b w0;
    public final boolean x0;
    public HttpURLConnection y0;
    public InputStream z0;

    public nb4(String str, int i, int i2, boolean z, imc imcVar) {
        super(true);
        this.t0 = str;
        this.Z = i;
        this.s0 = i2;
        this.X = z;
        this.Y = false;
        this.u0 = imcVar;
        this.w0 = null;
        this.v0 = new imc(21);
        this.x0 = false;
    }

    public static void m(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (httpURLConnection == null || oaf.a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    @Override // defpackage.t24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long G(defpackage.a34 r23) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb4.G(a34):long");
    }

    @Override // defpackage.t24
    public final Map a() {
        HttpURLConnection httpURLConnection = this.y0;
        if (httpURLConnection == null) {
            return kfc.s0;
        }
        return new lb4(1, httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.t24
    public final void close() {
        try {
            InputStream inputStream = this.z0;
            if (inputStream != null) {
                long j = this.C0;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.D0;
                }
                m(this.y0, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = oaf.a;
                    throw new HttpDataSource$HttpDataSourceException(2000, 3, e);
                }
            }
        } finally {
            this.z0 = null;
            g();
            if (this.A0) {
                this.A0 = false;
                c();
            }
        }
    }

    public final void g() {
        HttpURLConnection httpURLConnection = this.y0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                z04.v("Unexpected error while disconnecting", e);
            }
            this.y0 = null;
        }
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.y0;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final URL i(URL url, String str) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException(wg0.i("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.X || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.Y) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e) {
                    throw new HttpDataSource$HttpDataSourceException(2001, 1, e);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e2) {
            throw new HttpDataSource$HttpDataSourceException(2001, 1, e2);
        }
    }

    public final HttpURLConnection j(a34 a34Var) throws IOException {
        HttpURLConnection httpURLConnectionK;
        a34 a34Var2 = a34Var;
        URL url = new URL(a34Var2.a.toString());
        int i = 0;
        boolean z = (a34Var2.i & 1) == 1;
        boolean z2 = this.X;
        boolean z3 = this.x0;
        int i2 = a34Var2.c;
        byte[] bArr = a34Var2.d;
        long j = a34Var2.f;
        long j2 = a34Var2.g;
        if (!z2 && !this.Y && !z3) {
            return k(url, i2, bArr, j, j2, z, true, a34Var2.e);
        }
        URL urlI = url;
        byte[] bArr2 = bArr;
        int i3 = i2;
        while (true) {
            int i4 = i + 1;
            if (i > 20) {
                throw new HttpDataSource$HttpDataSourceException(2001, 1, new NoRouteToHostException(zr6.h(i4, "Too many redirects: ")));
            }
            Map map = a34Var2.e;
            int i5 = i3;
            long j3 = j2;
            URL url2 = urlI;
            long j4 = j;
            httpURLConnectionK = k(urlI, i3, bArr2, j, j2, z, false, map);
            int responseCode = httpURLConnectionK.getResponseCode();
            String headerField = httpURLConnectionK.getHeaderField("Location");
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionK.disconnect();
                urlI = i(url2, headerField);
                i3 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionK.disconnect();
                if (z3 && responseCode == 302) {
                    i3 = i5;
                } else {
                    bArr2 = null;
                    i3 = 1;
                }
                urlI = i(url2, headerField);
            }
            a34Var2 = a34Var;
            i = i4;
            j2 = j3;
            j = j4;
        }
        return httpURLConnectionK;
    }

    public final HttpURLConnection k(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.Z);
        httpURLConnection.setReadTimeout(this.s0);
        HashMap map2 = new HashMap();
        imc imcVar = this.u0;
        if (imcVar != null) {
            map2.putAll(imcVar.S());
        }
        map2.putAll(this.v0.S());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = br6.a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbK = au1.k(j, "bytes=", "-");
            if (j2 != -1) {
                sbK.append((j + j2) - 1);
            }
            string = sbK.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.t0;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = a34.k;
        if (i == 1) {
            str = HttpGet.METHOD_NAME;
        } else if (i == 2) {
            str = HttpPost.METHOD_NAME;
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = HttpHead.METHOD_NAME;
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void n(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.z0;
            int i = oaf.a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(2000, 1, new InterruptedIOException());
            }
            if (i2 == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j -= i2;
            b(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x0034, TRY_LEAVE, TryCatch #0 {IOException -> 0x0034, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:19:0x0004 }] */
    @Override // defpackage.m24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r6 = 0
            goto L33
        L4:
            long r0 = r6.C0     // Catch: java.io.IOException -> L34
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.D0     // Catch: java.io.IOException -> L34
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L18
        L16:
            r6 = r3
            goto L33
        L18:
            long r4 = (long) r9     // Catch: java.io.IOException -> L34
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L34
            int r9 = (int) r0     // Catch: java.io.IOException -> L34
        L1e:
            java.io.InputStream r0 = r6.z0     // Catch: java.io.IOException -> L34
            int r1 = defpackage.oaf.a     // Catch: java.io.IOException -> L34
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L34
            if (r7 != r3) goto L29
            goto L16
        L29:
            long r8 = r6.D0     // Catch: java.io.IOException -> L34
            long r0 = (long) r7     // Catch: java.io.IOException -> L34
            long r8 = r8 + r0
            r6.D0 = r8     // Catch: java.io.IOException -> L34
            r6.b(r7)     // Catch: java.io.IOException -> L34
            r6 = r7
        L33:
            return r6
        L34:
            r6 = move-exception
            int r7 = defpackage.oaf.a
            r7 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r6 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.b(r7, r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb4.read(byte[], int, int):int");
    }
}
