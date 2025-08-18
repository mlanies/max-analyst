package defpackage;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class bj8 extends Service {
    public ue X;
    public jc4 Y;
    public sh0 Z;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final us c = new us(0);
    public aj8 o;

    public final void a(qh8 qh8Var) {
        qh8 qh8Var2;
        boolean z = true;
        fm9.e("session is already released", !qh8Var.a.i());
        synchronized (this.a) {
            qh8Var2 = (qh8) this.c.get(qh8Var.a.i);
            if (qh8Var2 != null && qh8Var2 != qh8Var) {
                z = false;
            }
            fm9.e("Session ID should be unique", z);
            this.c.put(qh8Var.a.i, qh8Var);
        }
        if (qh8Var2 == null) {
            oaf.W(this.b, new v05(this, c(), qh8Var, 15));
        }
    }

    public final sh0 b() {
        sh0 sh0Var;
        synchronized (this.a) {
            try {
                if (this.Z == null) {
                    this.Z = new sh0(5, this);
                }
                sh0Var = this.Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sh0Var;
    }

    public final ue c() {
        ue ueVar;
        synchronized (this.a) {
            try {
                if (this.X == null) {
                    if (this.Y == null) {
                        er0 er0Var = new er0(getApplicationContext());
                        fm9.k(!er0Var.c);
                        jc4 jc4Var = new jc4(er0Var);
                        er0Var.c = true;
                        this.Y = jc4Var;
                    }
                    this.X = new ue(this, this.Y, b());
                }
                ueVar = this.X;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ueVar;
    }

    public final boolean d(qh8 qh8Var) {
        boolean zContainsKey;
        synchronized (this.a) {
            zContainsKey = this.c.containsKey(qh8Var.a.i);
        }
        return zContainsKey;
    }

    public abstract qh8 e(oh8 oh8Var);

    public final void f(qh8 qh8Var, boolean z) {
        a98 a98VarB;
        a98 a98Var;
        zw6 zw6VarV0;
        ue ueVarC = c();
        if (!((bj8) ueVarC.c).d(qh8Var) || (a98VarB = ueVarC.b(qh8Var)) == null || a98VarB.x0().q() || a98VarB.getPlaybackState() == 1) {
            ueVarC.d(true);
            return;
        }
        int i = ueVarC.a + 1;
        ueVarC.a = i;
        bm7 bm7Var = (bm7) ((HashMap) ueVarC.i).get(qh8Var);
        if (bm7Var == null || !bm7Var.isDone()) {
            a98Var = null;
        } else {
            try {
                a98Var = (a98) fm9.C(bm7Var);
            } catch (ExecutionException unused) {
            }
        }
        if (a98Var != null) {
            a98Var.K();
            z88 z88Var = a98Var.c;
            if (z88Var.isConnected()) {
                zw6VarV0 = z88Var.V0();
            } else {
                ls5 ls5Var = zw6.b;
                zw6VarV0 = ffc.X;
            }
        } else {
            ls5 ls5Var2 = zw6.b;
            zw6VarV0 = ffc.X;
        }
        oaf.W(new Handler(qh8Var.c().z1()), new nd8(0, ueVarC, qh8Var, zw6VarV0, new ui0(ueVarC, i, qh8Var, 9), z));
    }

    public final boolean g(qh8 qh8Var, boolean z) {
        try {
            f(qh8Var, c().i(qh8Var, z));
            return true;
        } catch (IllegalStateException e) {
            if (oaf.a < 31 || !zi8.a(e)) {
                throw e;
            }
            z04.v("Failed to start foreground", e);
            this.b.post(new nn6(14, this));
            return false;
        }
    }

    public final void h(qh8 qh8Var) {
        synchronized (this.a) {
            fm9.e("session not found", this.c.containsKey(qh8Var.a.i));
            this.c.remove(qh8Var.a.i);
        }
        oaf.W(this.b, new vs5(c(), 23, qh8Var));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        aj8 aj8Var;
        qh8 qh8VarE;
        cj8 cj8Var;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            synchronized (this.a) {
                aj8Var = this.o;
                fm9.l(aj8Var);
            }
            return aj8Var;
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (qh8VarE = e(new oh8(new vi8("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY))) == null) {
            return null;
        }
        a(qh8VarE);
        ii8 ii8Var = qh8VarE.a;
        synchronized (ii8Var.a) {
            try {
                if (ii8Var.w == null) {
                    ai8 ai8Var = ii8Var.k.a.h.j.a.c;
                    cj8 cj8Var2 = new cj8(ii8Var);
                    cj8Var2.a(ai8Var);
                    ii8Var.w = cj8Var2;
                }
                cj8Var = ii8Var.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cj8Var.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        synchronized (this.a) {
            this.o = new aj8(this);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        synchronized (this.a) {
            try {
                aj8 aj8Var = this.o;
                if (aj8Var != null) {
                    aj8Var.c.clear();
                    aj8Var.d.removeCallbacksAndMessages(null);
                    Iterator it = aj8Var.f.iterator();
                    while (it.hasNext()) {
                        try {
                            ((kr6) it.next()).c(0);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        qh8 qh8VarE;
        qh8 qh8Var;
        if (intent == null) {
            return 1;
        }
        sh0 sh0VarB = b();
        Uri data = intent.getData();
        if (data != null) {
            synchronized (qh8.b) {
                try {
                    Iterator it = qh8.c.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            qh8Var = null;
                            break;
                        }
                        qh8Var = (qh8) it.next();
                        if (oaf.a(qh8Var.a.b, data)) {
                        }
                    }
                } finally {
                }
            }
            qh8VarE = qh8Var;
        } else {
            qh8VarE = null;
        }
        sh0VarB.getClass();
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            if (qh8VarE == null) {
                qh8VarE = e(new oh8(new vi8("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
                if (qh8VarE == null) {
                    return 1;
                }
                a(qh8VarE);
            }
            ii8 ii8Var = qh8VarE.a;
            ii8Var.l.post(new vs5(ii8Var, 22, intent));
        } else if (qh8VarE != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return 1;
            }
            Bundle extras2 = intent.getExtras();
            Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
            Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
            ue ueVarC = c();
            a98 a98VarB = ueVarC.b(qh8VarE);
            if (a98VarB != null) {
                oaf.W(new Handler(qh8VarE.c().z1()), new md8(ueVarC, qh8VarE, str, bundle, a98VarB));
            }
        }
        return 1;
    }
}
