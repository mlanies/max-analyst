package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import defpackage.fre;
import defpackage.rag;

/* loaded from: classes.dex */
public final class a0 {
    static int f = 3;
    static volatile a0 g;
    final t a;
    final i b;
    final Context c;
    InstallReferrerClient d;
    int e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            y0.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + a0.this.e);
            a0.this.a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            y0.a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                a0.this.a(this);
            } else {
                a0.this.a(i);
            }
        }
    }

    public a0(t tVar, i iVar, Context context) {
        this.a = tVar;
        this.b = iVar;
        this.c = context.getApplicationContext();
    }

    public static void a(t tVar, i iVar, Context context) {
        if (g != null) {
            return;
        }
        synchronized (a0.class) {
            try {
                if (g != null) {
                    return;
                }
                a0 a0Var = new a0(tVar, iVar, context);
                h.a(new rag(a0Var, 1));
                g = a0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        try {
            y0.a("ReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a(new a());
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                y0.a("ReferrerHandler: InstallReferrerClient not found");
            } else {
                y0.a("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
            }
        }
    }

    public void b() {
        p0 p0VarA = p0.a(this.c);
        if (p0VarA.q()) {
            return;
        }
        String strL = p0VarA.l();
        if (TextUtils.isEmpty(strL)) {
            return;
        }
        a(strL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a0 a0Var) {
        a0Var.b();
        a0Var.a();
    }

    public static void a(String str, Context context, Runnable runnable) {
        a0 a0Var = g;
        if (a0Var == null) {
            p0 p0VarA = p0.a(context);
            if (!p0VarA.q()) {
                p0VarA.l(str);
            }
            runnable.run();
            return;
        }
        a0Var.a(str, runnable);
    }

    public void a() {
        if (p0.a(this.c).n()) {
            return;
        }
        h.b(new rag(this, 0));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:17:0x003b). Please report as a decompilation issue!!! */
    public void a(int i) {
        if (this.d == null) {
            y0.b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                y0.a("ReferrerHandler: retrieving install referrer");
                h.a(new fre(this, 29, this.d.getInstallReferrer()));
            } else {
                y0.a("ReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            y0.b("ReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.d;
        if (installReferrerClient == null) {
            y0.a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            y0.a("ReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            y0.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }

    public void a(String str, Runnable runnable) {
        p0 p0VarA = p0.a(this.c);
        if (p0VarA.q()) {
            y0.a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.a.a(str, o.b(this.c), runnable);
        this.b.a(str);
        p0VarA.u();
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(ReferrerDetails referrerDetails) {
        p0 p0VarA = p0.a(this.c);
        if (p0VarA.n()) {
            y0.a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        y0.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.a.a(installReferrer, o.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        p0VarA.r();
    }
}
