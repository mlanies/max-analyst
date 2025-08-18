package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;
import defpackage.ule;

/* loaded from: classes.dex */
public final class f0 {
    static int f = 3;
    static volatile f0 g;
    final t a;
    final i b;
    final Context c;
    InstallReferrerClient d;
    int e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            y0.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + f0.this.e);
            f0.this.a(this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                f0.this.a(this);
            } else {
                y0.a("HuaweiReferrerHandler: install referrer setup is finished");
                f0.this.a(i);
            }
        }
    }

    public f0(t tVar, i iVar, Context context) {
        this.a = tVar;
        this.b = iVar;
        this.c = context.getApplicationContext();
    }

    public static void a(t tVar, i iVar, Context context) {
        if (g != null) {
            return;
        }
        synchronized (f0.class) {
            try {
                if (g != null) {
                    return;
                }
                f0 f0Var = new f0(tVar, iVar, context);
                h.a(new ule(22, f0Var));
                g = f0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:17:0x0034). Please report as a decompilation issue!!! */
    public void a(int i) {
        if (this.d == null) {
            y0.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                y0.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.d.getInstallReferrer());
            } else {
                y0.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            y0.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    public void a() {
        if (p0.a(this.c).o()) {
            return;
        }
        try {
            y0.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a(new a());
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                y0.a("HuaweiReferrerHandler: InstallReferrerClient is not found");
            } else {
                y0.a("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
            }
        }
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.d == null) {
            y0.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            y0.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.d.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            y0.a("HuaweiReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            y0.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }

    public void a(ReferrerDetails referrerDetails) {
        p0 p0VarA = p0.a(this.c);
        if (p0VarA.o()) {
            y0.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        y0.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.a.b(installReferrer, o.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        p0VarA.s();
    }
}
