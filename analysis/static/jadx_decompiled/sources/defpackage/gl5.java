package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class gl5 {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final gpb b;
    public final shc c = new shc();

    public gl5(Context context, gpb gpbVar) {
        this.a = context;
        this.b = gpbVar;
    }

    public static URL a(String str) throws FirebaseInstallationsException {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            return;
        }
        new StringBuilder(", ").append(str);
    }

    public static long d(String str) {
        fp3.g("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static ta0 e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        jn jnVarA = gc0.a();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        gc0 gc0Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals(ApiProtocol.KEY_TOKEN)) {
                        jnVarA.c = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        jnVarA.o = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                gc0 gc0VarI = jnVarA.i();
                jsonReader.endObject();
                gc0Var = gc0VarI;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new ta0(strNextString, strNextString2, strNextString3, gc0Var, 1);
    }

    public static gc0 f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        jn jnVarA = gc0.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(ApiProtocol.KEY_TOKEN)) {
                jnVarA.c = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                jnVarA.o = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        jnVarA.b = 1;
        return jnVarA.i();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[Catch: NameNotFoundException -> 0x00c8, TryCatch #0 {NameNotFoundException -> 0x00c8, blocks: (B:9:0x005b, B:11:0x0075, B:17:0x007f, B:23:0x008c, B:26:0x009c, B:27:0x00a0, B:29:0x00aa, B:30:0x00c3), top: B:39:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[Catch: NameNotFoundException -> 0x00c8, TryCatch #0 {NameNotFoundException -> 0x00c8, blocks: (B:9:0x005b, B:11:0x0075, B:17:0x007f, B:23:0x008c, B:26:0x009c, B:27:0x00a0, B:29:0x00aa, B:30:0x00c3), top: B:39:0x005b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection c(java.net.URL r8, java.lang.String r9) throws android.content.pm.PackageManager.NameNotFoundException, java.security.NoSuchAlgorithmException, com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r7 = this;
            java.net.URLConnection r8 = r8.openConnection()     // Catch: java.io.IOException -> Ld6
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: java.io.IOException -> Ld6
            r0 = 10000(0x2710, float:1.4013E-41)
            r8.setConnectTimeout(r0)
            r1 = 0
            r8.setUseCaches(r1)
            r8.setReadTimeout(r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/json"
            r8.addRequestProperty(r0, r2)
            java.lang.String r0 = "Accept"
            r8.addRequestProperty(r0, r2)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r8.addRequestProperty(r0, r2)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r8.addRequestProperty(r0, r2)
            android.content.Context r0 = r7.a
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r8.addRequestProperty(r3, r2)
            gpb r7 = r7.b
            java.lang.Object r7 = r7.get()
            lj6 r7 = (defpackage.lj6) r7
            if (r7 == 0) goto L5a
            java.lang.String r2 = "x-firebase-client"
            bb4 r7 = (defpackage.bb4) r7     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5a
            ukg r7 = r7.a()     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5a
            java.lang.Object r7 = defpackage.j1e.b(r7)     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5a
            r8.addRequestProperty(r2, r7)     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5a
            goto L5a
        L53:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        L5a:
            r7 = 0
            java.lang.String r2 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            bkg r3 = defpackage.a9g.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            java.lang.Object r3 = r3.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            android.content.Context r3 = (android.content.Context) r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r4 = 64
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            android.content.pm.Signature[] r3 = r2.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            if (r3 == 0) goto L99
            int r3 = r3.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r4 = 1
            if (r3 != r4) goto L99
            java.lang.String r3 = "SHA1"
            r4 = r1
        L7c:
            r5 = 2
            if (r4 >= r5) goto L88
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r3)     // Catch: java.security.NoSuchAlgorithmException -> L85 android.content.pm.PackageManager.NameNotFoundException -> Lc8
            if (r5 != 0) goto L89
        L85:
            int r4 = r4 + 1
            goto L7c
        L88:
            r5 = r7
        L89:
            if (r5 != 0) goto L8c
            goto L99
        L8c:
            android.content.pm.Signature[] r2 = r2.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r2 = r2[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            byte[] r2 = r2.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            byte[] r2 = r5.digest(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            goto L9a
        L99:
            r2 = r7
        L9a:
            if (r2 != 0) goto La0
            r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            goto Lcb
        La0:
            int r3 = r2.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            int r4 = r3 + r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r5.<init>(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
        La8:
            if (r1 >= r3) goto Lc3
            char[] r4 = defpackage.ju0.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r6 = r2[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >>> 4
            char r6 = r4[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r5.append(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r6 = r2[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r6 = r6 & 15
            char r4 = r4[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            r5.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            int r1 = r1 + 1
            goto La8
        Lc3:
            java.lang.String r7 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            goto Lcb
        Lc8:
            r0.getPackageName()
        Lcb:
            java.lang.String r0 = "X-Android-Cert"
            r8.addRequestProperty(r0, r7)
            java.lang.String r7 = "x-goog-api-key"
            r8.addRequestProperty(r7, r9)
            return r8
        Ld6:
            com.google.firebase.installations.FirebaseInstallationsException r7 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r8 = "Firebase Installations Service is unavailable. Please try again later."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl5.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
