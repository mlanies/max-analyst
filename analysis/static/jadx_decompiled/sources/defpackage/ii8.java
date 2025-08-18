package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public class ii8 {
    public final zw6 A;
    public final Bundle B;
    public final Object a = new Object();
    public final Uri b;
    public final fi8 c;
    public final m68 d;
    public final oz7 e;
    public final Context f;
    public final sj8 g;
    public final si8 h;
    public final String i;
    public final obd j;
    public final qh8 k;
    public final Handler l;
    public final ao0 m;
    public final ci8 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public m4b r;
    public x4b s;
    public final PendingIntent t;
    public gi8 u;
    public w4d v;
    public cj8 w;
    public boolean x;
    public final long y;
    public boolean z;

    static {
        new sad(1);
    }

    public ii8(qh8 qh8Var, Context context, u75 u75Var, ffc ffcVar, oz7 oz7Var, Bundle bundle, Bundle bundle2, imc imcVar) {
        z04.J("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "]");
        this.k = qh8Var;
        this.f = context;
        this.i = "";
        this.t = null;
        this.A = ffcVar;
        this.e = oz7Var;
        this.B = bundle2;
        this.m = imcVar;
        this.p = true;
        this.q = true;
        sj8 sj8Var = new sj8(this);
        this.g = sj8Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper looper = u75Var.E0;
        Handler handler = new Handler(looper);
        this.l = handler;
        this.r = m4b.F;
        this.c = new fi8(this, looper);
        this.d = new m68(this, looper);
        Uri uriBuild = new Uri.Builder().scheme(ii8.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = uriBuild;
        this.j = new obd(Process.myUid(), 1004001300, 4, context.getPackageName(), sj8Var, bundle);
        this.h = new si8(this, uriBuild, handler);
        x4b x4bVar = new x4b(u75Var, ffcVar, mh8.d, mh8.e, bundle2);
        this.s = x4bVar;
        oaf.W(handler, new vs5(this, 20, x4bVar));
        this.y = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.n = new ci8(this, 2);
        oaf.W(handler, new ci8(this, 3));
    }

    public static boolean j(oh8 oh8Var) {
        return oh8Var != null && oh8Var.b == 0 && Objects.equals(oh8Var.a.a.a, "com.android.systemui");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.KeyEvent r4, boolean r5) {
        /*
            r3 = this;
            qh8 r0 = r3.k
            ii8 r0 = r0.a
            oh8 r0 = r0.e()
            r0.getClass()
            int r4 = r4.getKeyCode()
            r1 = 85
            if (r4 == r1) goto L17
            r1 = 79
            if (r4 != r1) goto L1b
        L17:
            if (r5 == 0) goto L1b
            r4 = 87
        L1b:
            r5 = 126(0x7e, float:1.77E-43)
            if (r4 == r5) goto L72
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 == r5) goto L6b
            r5 = 272(0x110, float:3.81E-43)
            if (r4 == r5) goto L63
            r5 = 273(0x111, float:3.83E-43)
            if (r4 == r5) goto L5b
            switch(r4) {
                case 85: goto L45;
                case 86: goto L3e;
                case 87: goto L63;
                case 88: goto L5b;
                case 89: goto L37;
                case 90: goto L30;
                default: goto L2e;
            }
        L2e:
            r3 = 0
            return r3
        L30:
            wg3 r4 = new wg3
            r5 = 1
            r4.<init>(r3, r0, r5)
            goto L78
        L37:
            wg3 r4 = new wg3
            r5 = 2
            r4.<init>(r3, r0, r5)
            goto L78
        L3e:
            wg3 r4 = new wg3
            r5 = 3
            r4.<init>(r3, r0, r5)
            goto L78
        L45:
            x4b r4 = r3.s
            boolean r4 = r4.u()
            if (r4 == 0) goto L54
            wg3 r4 = new wg3
            r5 = 4
            r4.<init>(r3, r0, r5)
            goto L78
        L54:
            wg3 r4 = new wg3
            r5 = 5
            r4.<init>(r3, r0, r5)
            goto L78
        L5b:
            wg3 r4 = new wg3
            r5 = 9
            r4.<init>(r3, r0, r5)
            goto L78
        L63:
            wg3 r4 = new wg3
            r5 = 8
            r4.<init>(r3, r0, r5)
            goto L78
        L6b:
            wg3 r4 = new wg3
            r5 = 7
            r4.<init>(r3, r0, r5)
            goto L78
        L72:
            wg3 r4 = new wg3
            r5 = 6
            r4.<init>(r3, r0, r5)
        L78:
            android.os.Handler r5 = r3.l
            v05 r1 = new v05
            r2 = 13
            r1.<init>(r3, r4, r0, r2)
            defpackage.oaf.W(r5, r1)
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii8.a(android.view.KeyEvent, boolean):boolean");
    }

    public final void b(oh8 oh8Var, hi8 hi8Var) {
        int i;
        sj8 sj8Var = this.g;
        try {
            cd6 cd6VarB = sj8Var.e.B(oh8Var);
            if (cd6VarB != null) {
                i = cd6VarB.i();
            } else {
                if (!(sj8Var.e.E(oh8Var) || this.h.e.E(oh8Var))) {
                    return;
                } else {
                    i = 0;
                }
            }
            nh8 nh8Var = oh8Var.d;
            if (nh8Var != null) {
                hi8Var.a(nh8Var, i);
            }
        } catch (DeadObjectException unused) {
            sj8Var.e.L(oh8Var);
        } catch (RemoteException e) {
            z04.d0("Exception in " + oh8Var.toString(), e);
        }
    }

    public final void c(hi8 hi8Var) {
        zw6 zw6VarY = this.g.e.y();
        for (int i = 0; i < zw6VarY.size(); i++) {
            b((oh8) zw6VarY.get(i), hi8Var);
        }
        try {
            hi8Var.a(this.h.h, 0);
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    public final Handler d() {
        return this.l;
    }

    public final oh8 e() {
        zw6 zw6VarY = this.g.H0().y();
        for (int i = 0; i < zw6VarY.size(); i++) {
            oh8 oh8Var = (oh8) zw6VarY.get(i);
            if (h(oh8Var)) {
                return oh8Var;
            }
        }
        return null;
    }

    public final void f(k3b k3bVar) {
        this.c.a(false, false);
        c(new ea8(k3bVar));
        try {
            qi8 qi8Var = this.h.h;
            ui4 ui4Var = this.r.q;
            qi8Var.p();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    public final void g(oh8 oh8Var, boolean z) {
        if (o()) {
            boolean z2 = this.s.t1(16) && this.s.R0() != null;
            boolean z3 = this.s.t1(31) || this.s.t1(20);
            oh8 oh8VarS = s(oh8Var);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            fm9.k(!false);
            sparseBooleanArray.append(1, true);
            fm9.k(!false);
            k3b k3bVar = new k3b(new tm5(sparseBooleanArray));
            if (z2 || !z3) {
                if (!z2) {
                    z04.c0("Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                oaf.I(this.s);
                if (z) {
                    p(oh8VarS);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            bw6 bw6Var = new bw6();
            bw6Var.m(unsupportedOperationException);
            bw6Var.d(new h76(bw6Var, 0, new td(this, oh8VarS, z, k3bVar)), new xq1(2, this));
        }
    }

    public final boolean h(oh8 oh8Var) {
        return Objects.equals(oh8Var.a.a.a, this.f.getPackageName()) && oh8Var.b != 0 && new Bundle(oh8Var.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.x;
        }
        return z;
    }

    public final bm7 k(oh8 oh8Var, ffc ffcVar) {
        return this.e.h(this.k, s(oh8Var), ffcVar);
    }

    public final mh8 l(oh8 oh8Var) {
        int i = 0;
        if (this.z && j(oh8Var)) {
            z9d z9dVar = mh8.d;
            z9d z9dVar2 = this.s.o;
            z9dVar2.getClass();
            k3b k3bVar = this.s.X;
            k3bVar.getClass();
            zw6 zw6Var = this.s.c;
            return new mh8(z9dVar2, k3bVar, zw6Var != null ? zw6.j(zw6Var) : null);
        }
        this.e.getClass();
        k3b k3bVar2 = mh8.e;
        z9d z9dVar3 = mh8.d;
        mh8 mh8Var = new mh8(z9dVar3, k3bVar2, null);
        if (h(oh8Var)) {
            this.z = true;
            x4b x4bVar = this.s;
            x4bVar.c = this.k.a.A;
            boolean z = x4bVar.X.a(17) != k3bVar2.a(17);
            x4b x4bVar2 = this.s;
            x4bVar2.o = z9dVar3;
            x4bVar2.X = k3bVar2;
            si8 si8Var = this.h;
            if (z) {
                oaf.W(si8Var.f.l, new li8(si8Var, x4bVar2, i));
            } else {
                si8Var.S(x4bVar2);
            }
        }
        return mh8Var;
    }

    public final ew6 m(oh8 oh8Var) {
        s(oh8Var);
        this.e.getClass();
        return fm9.F(new sad(-6));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(defpackage.oh8 r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii8.n(oh8, android.content.Intent):boolean");
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ccd ccdVar = new ccd();
            this.o.post(new vs5(this, 18, ccdVar));
            try {
                return ((Boolean) ccdVar.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        w4d w4dVar = this.v;
        if (w4dVar == null) {
            return true;
        }
        w4dVar.getClass();
        int i = oaf.a;
        if (i < 31 || i >= 33) {
            return true;
        }
        bj8 bj8Var = (bj8) w4dVar.b;
        if (bj8Var.c().b) {
            return true;
        }
        return bj8Var.g(this.k, true);
    }

    public final void p(oh8 oh8Var) {
        s(oh8Var);
        this.e.getClass();
    }

    public final ccd q(oh8 oh8Var, ffc ffcVar, int i, long j) {
        return oaf.g0(this.e.h(this.k, s(oh8Var), ffcVar), new fc5(i, j));
    }

    public final void r() {
        z04.J("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "] [" + nc8.b() + "]");
        synchronized (this.a) {
            try {
                if (this.x) {
                    return;
                }
                this.x = true;
                m68 m68Var = this.d;
                v05 v05Var = (v05) m68Var.b;
                if (v05Var != null) {
                    m68Var.removeCallbacks(v05Var);
                    m68Var.b = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    oaf.W(this.l, new ci8(this, 0));
                } catch (Exception e) {
                    z04.d0("Exception thrown while closing", e);
                }
                si8 si8Var = this.h;
                si8Var.getClass();
                int i = oaf.a;
                ii8 ii8Var = si8Var.f;
                bi8 bi8Var = si8Var.j;
                if (i < 31) {
                    ComponentName componentName = si8Var.l;
                    if (componentName == null) {
                        bi8Var.a.a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", ii8Var.b);
                        intent.setComponent(componentName);
                        bi8Var.a.a.setMediaButtonReceiver(PendingIntent.getBroadcast(ii8Var.f, 0, intent, si8.q));
                    }
                }
                an anVar = si8Var.k;
                if (anVar != null) {
                    ii8Var.f.unregisterReceiver(anVar);
                }
                wh8 wh8Var = bi8Var.a;
                wh8Var.f.kill();
                MediaSession mediaSession = wh8Var.a;
                mediaSession.setCallback(null);
                wh8Var.b.c.set(null);
                mediaSession.release();
                sj8 sj8Var = this.g;
                Iterator it = sj8Var.e.y().iterator();
                while (it.hasNext()) {
                    nh8 nh8Var = ((oh8) it.next()).d;
                    if (nh8Var != null) {
                        try {
                            nh8Var.onDisconnected();
                        } catch (RemoteException unused) {
                        }
                    }
                }
                Iterator it2 = sj8Var.f.iterator();
                while (it2.hasNext()) {
                    nh8 nh8Var2 = ((oh8) it2.next()).d;
                    if (nh8Var2 != null) {
                        try {
                            nh8Var2.onDisconnected();
                        } catch (RemoteException unused2) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final oh8 s(oh8 oh8Var) {
        if (!this.z || !j(oh8Var)) {
            return oh8Var;
        }
        oh8 oh8VarE = e();
        oh8VarE.getClass();
        return oh8VarE;
    }

    public final void t() {
        Handler handler = this.l;
        ci8 ci8Var = this.n;
        handler.removeCallbacks(ci8Var);
        if (this.q) {
            long j = this.y;
            if (j > 0) {
                if (this.s.b() || this.s.a()) {
                    handler.postDelayed(ci8Var, j);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
