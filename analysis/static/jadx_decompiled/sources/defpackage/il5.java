package defpackage;

import android.net.TrafficStats;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class il5 implements jl5 {
    public static final Object m = new Object();
    public final fl5 a;
    public final gl5 b;
    public final ph4 c;
    public final qaf d;
    public final le7 e;
    public final o4c f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public il5(fl5 fl5Var, gpb gpbVar, ExecutorService executorService, p6d p6dVar) {
        fl5Var.a();
        gl5 gl5Var = new gl5(fl5Var.a, gpbVar);
        ph4 ph4Var = new ph4();
        ph4Var.b = fl5Var;
        if (mq9.Z == null) {
            mq9.Z = new mq9(17);
        }
        mq9 mq9Var = mq9.Z;
        if (qaf.d == null) {
            qaf.d = new qaf(mq9Var);
        }
        qaf qafVar = qaf.d;
        le7 le7Var = new le7(new bc3(2, fl5Var));
        o4c o4cVar = new o4c();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = fl5Var;
        this.b = gl5Var;
        this.c = ph4Var;
        this.d = qafVar;
        this.e = le7Var;
        this.f = o4cVar;
        this.h = executorService;
        this.i = p6dVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        hb0 hb0VarT;
        synchronized (m) {
            try {
                fl5 fl5Var = this.a;
                fl5Var.a();
                qz7 qz7VarG = qz7.g(fl5Var.a);
                try {
                    hb0VarT = this.c.t();
                    int i = hb0VarT.b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strF = f(hb0VarT);
                        ph4 ph4Var = this.c;
                        gb0 gb0VarA = hb0VarT.a();
                        gb0VarA.a = strF;
                        gb0VarA.b = 3;
                        hb0VarT = gb0VarA.a();
                        ph4Var.r(hb0VarT);
                    }
                    if (qz7VarG != null) {
                        qz7VarG.V();
                    }
                } catch (Throwable th) {
                    if (qz7VarG != null) {
                        qz7VarG.V();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(hb0VarT);
        this.i.execute(new u60(9, this));
    }

    public final hb0 b(hb0 hb0Var) {
        int responseCode;
        gc0 gc0VarF;
        fl5 fl5Var = this.a;
        fl5Var.a();
        String str = fl5Var.c.a;
        String str2 = hb0Var.a;
        fl5 fl5Var2 = this.a;
        fl5Var2.a();
        String str3 = fl5Var2.c.g;
        String str4 = hb0Var.d;
        gl5 gl5Var = this.b;
        shc shcVar = gl5Var.c;
        if (!shcVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = gl5.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = gl5Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnectionC.addRequestProperty(AUTH.WWW_AUTH_RESP, "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    gl5.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    shcVar.b(responseCode);
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                gc0VarF = gl5.f(httpURLConnectionC);
            } else {
                gl5.b(httpURLConnectionC, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    jn jnVarA = gc0.a();
                    jnVarA.b = 3;
                    gc0VarF = jnVarA.i();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        jn jnVarA2 = gc0.a();
                        jnVarA2.b = 2;
                        gc0VarF = jnVarA2.i();
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            httpURLConnectionC.disconnect();
            TrafficStats.clearThreadStatsTag();
            int iS = au1.s(gc0VarF.c);
            if (iS == 0) {
                qaf qafVar = this.d;
                qafVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                qafVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                gb0 gb0VarA = hb0Var.a();
                gb0VarA.c = gc0VarF.a;
                gb0VarA.f = Long.valueOf(gc0VarF.b);
                gb0VarA.g = Long.valueOf(seconds);
                return gb0VarA.a();
            }
            if (iS == 1) {
                gb0 gb0VarA2 = hb0Var.a();
                gb0VarA2.e = "BAD CONFIG";
                gb0VarA2.b = 5;
                return gb0VarA2.a();
            }
            if (iS != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            gb0 gb0VarA3 = hb0Var.a();
            gb0VarA3.b = 2;
            return gb0VarA3.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final ukg c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return j1e.r(str);
        }
        qne qneVar = new qne();
        yb6 yb6Var = new yb6(qneVar);
        synchronized (this.g) {
            this.l.add(yb6Var);
        }
        ukg ukgVar = qneVar.a;
        this.h.execute(new hl5(this, 0));
        return ukgVar;
    }

    public final ukg d() {
        e();
        qne qneVar = new qne();
        bb6 bb6Var = new bb6(this.d, qneVar);
        synchronized (this.g) {
            this.l.add(bb6Var);
        }
        this.h.execute(new hl5(this, 1));
        return qneVar.a;
    }

    public final void e() {
        fl5 fl5Var = this.a;
        fl5Var.a();
        fp3.k(fl5Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fl5Var.a();
        fp3.k(fl5Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fl5Var.a();
        fp3.k(fl5Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fl5Var.a();
        String str = fl5Var.c.b;
        Pattern pattern = qaf.c;
        fp3.g("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        fl5Var.a();
        fp3.g("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", qaf.c.matcher(fl5Var.c.a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(defpackage.hb0 r6) {
        /*
            r5 = this;
            fl5 r0 = r5.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            fl5 r0 = r5.a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5b
        L1e:
            r0 = 1
            int r6 = r6.b
            if (r6 != r0) goto L5b
            le7 r6 = r5.e
            java.lang.Object r6 = r6.get()
            jt6 r6 = (defpackage.jt6) r6
            android.content.SharedPreferences r0 = r6.a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.a     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r5 = move-exception
            goto L59
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L55
            o4c r5 = r5.f
            r5.getClass()
            java.lang.String r2 = defpackage.o4c.a()
        L55:
            return r2
        L56:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r5     // Catch: java.lang.Throwable -> L3f
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L5b:
            o4c r5 = r5.f
            r5.getClass()
            java.lang.String r5 = defpackage.o4c.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il5.f(hb0):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [gl5] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ta0] */
    public final hb0 g(hb0 hb0Var) {
        int responseCode;
        String str = hb0Var.a;
        String string = null;
        if (str != null && str.length() == 11) {
            jt6 jt6Var = (jt6) this.e.get();
            synchronized (jt6Var.a) {
                try {
                    String[] strArr = jt6.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = jt6Var.a.getString("|T|" + jt6Var.b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString(ApiProtocol.KEY_TOKEN);
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        gl5 gl5Var = this.b;
        fl5 fl5Var = this.a;
        fl5Var.a();
        String str3 = fl5Var.c.a;
        String str4 = hb0Var.a;
        fl5 fl5Var2 = this.a;
        fl5Var2.a();
        String str5 = fl5Var2.c.g;
        fl5 fl5Var3 = this.a;
        fl5Var3.a();
        String str6 = fl5Var3.c.b;
        shc shcVar = gl5Var.c;
        if (!shcVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = gl5.a("projects/" + str5 + "/installations");
        int i2 = 0;
        ta0 ta0Var = gl5Var;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = ta0Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    gl5.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    shcVar.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                ta0 ta0VarE = gl5.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                ta0Var = ta0VarE;
            } else {
                try {
                    gl5.b(httpURLConnectionC, str6, str3, str5);
                } catch (IOException | AssertionError unused3) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    ta0Var = ta0Var;
                }
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    ta0 ta0Var2 = new ta0(null, null, null, null, 2);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    ta0Var = ta0Var2;
                } else {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    ta0Var = ta0Var;
                }
            }
            int iS = au1.s(ta0Var.e);
            if (iS != 0) {
                if (iS != 1) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                gb0 gb0VarA = hb0Var.a();
                gb0VarA.e = "BAD CONFIG";
                gb0VarA.b = 5;
                return gb0VarA.a();
            }
            String str7 = ta0Var.b;
            String str8 = ta0Var.c;
            qaf qafVar = this.d;
            qafVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qafVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            gc0 gc0Var = ta0Var.d;
            String str9 = gc0Var.a;
            long j = gc0Var.b;
            gb0 gb0VarA2 = hb0Var.a();
            gb0VarA2.a = str7;
            gb0VarA2.b = 4;
            gb0VarA2.c = str9;
            gb0VarA2.d = str8;
            gb0VarA2.f = Long.valueOf(j);
            gb0VarA2.g = Long.valueOf(seconds);
            return gb0VarA2.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((t0e) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(hb0 hb0Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((t0e) it.next()).b(hb0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
