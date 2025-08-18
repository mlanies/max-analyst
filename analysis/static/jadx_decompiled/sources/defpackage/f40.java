package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.PowerManager;
import java.util.Set;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class f40 implements MediaRecorder.OnInfoListener, fh9 {
    public static final /* synthetic */ int x0 = 0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final Context a;
    public final av0 b;
    public final uh9 c;
    public final je7 o;
    public final khe s0;
    public final khe t0;
    public final khe u0;
    public volatile long v0 = -1;
    public volatile long w0 = -1;

    public f40(Context context, av0 av0Var, je7 je7Var, uh9 uh9Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = context;
        this.b = av0Var;
        this.c = uh9Var;
        this.o = je7Var;
        this.X = je7Var2;
        this.Y = je7Var3;
        this.Z = je7Var4;
        this.s0 = new khe(new z30(0, je7Var4));
        final int i = 0;
        this.t0 = new khe(new k56(this) { // from class: a40
            public final /* synthetic */ f40 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(32, "ru.ok.tamtam:tam-tam-prox");
                    default:
                        return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(536870918, "ru.ok.tamtam:tam-tam-screen-dim");
                }
            }
        });
        final int i2 = 1;
        this.u0 = new khe(new k56(this) { // from class: a40
            public final /* synthetic */ f40 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(32, "ru.ok.tamtam:tam-tam-prox");
                    default:
                        return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(536870918, "ru.ok.tamtam:tam-tam-screen-dim");
                }
            }
        });
        synchronized (uh9Var.o) {
            uh9Var.o.add(this);
        }
        av0Var.d(this);
    }

    public static void p(PowerManager.WakeLock wakeLock, int i) {
        if (wakeLock.isHeld()) {
            hm9.n("f40", "Releasing " + wakeLock);
            wakeLock.release(i);
        }
    }

    @Override // defpackage.fh9
    public final void a(long j, ub8 ub8Var) {
        r(j, ub8Var, false);
    }

    @Override // defpackage.fh9
    public final void b(long j, ub8 ub8Var) {
        hm9.p("f40", "onError " + j + " type " + ub8Var, null);
        t();
        r(j, ub8Var, false);
        o();
        if (ub8Var == ub8.c) {
            q(j, 0L);
        }
    }

    @Override // defpackage.fh9
    public final void c(long j, ub8 ub8Var, long j2, ub8 ub8Var2) {
        StringBuilder sb = new StringBuilder("onAudioChanged prev=");
        sb.append(j);
        sb.append(" prevType=");
        sb.append(ub8Var);
        au1.q(j2, ", curr=", " currType=", sb);
        sb.append(ub8Var2);
        hm9.n("f40", sb.toString());
        boolean z = this.c.A;
        if (j != -1 && ub8Var == ub8.c && !z) {
            q(j, 0L);
        }
        r(j, ub8Var, false);
    }

    @Override // defpackage.fh9
    public final void d(long j, ub8 ub8Var) {
        hm9.n("f40", "onBuffering " + j + " type " + ub8Var);
        kj6 kj6Var = ub8.a;
        t();
        ub8 ub8Var2 = ub8.c;
        khe kheVar = this.u0;
        if (ub8Var == ub8Var2) {
            if (!m()) {
                ((PowerManager.WakeLock) kheVar.getValue()).acquire();
            }
        } else if (m()) {
            p((PowerManager.WakeLock) kheVar.getValue(), 0);
        }
        r(j, ub8Var, false);
    }

    @Override // defpackage.fh9
    public final void e(long j, ub8 ub8Var, long j2) {
        hm9.n("f40", "onStop " + j + " type " + ub8Var);
        t();
        r(j, ub8Var, false);
        o();
        if (ub8Var == ub8.c) {
            q(j, j2);
        }
    }

    @Override // defpackage.fh9
    public final void f(long j, ub8 ub8Var) {
        hm9.n("f40", "onPause " + j + " type " + ub8Var);
        r(j, ub8Var, false);
    }

    @Override // defpackage.fh9
    public final void g(long j, ub8 ub8Var) {
        hm9.n("f40", "onSkipToPrevious " + j + " type " + ub8Var);
        r(j, ub8Var, false);
    }

    @Override // defpackage.fh9
    public final void h(long j, ub8 ub8Var) {
        hm9.n("f40", "onPlay " + j + " type " + ub8Var);
        kj6 kj6Var = ub8.a;
        t();
        ub8 ub8Var2 = ub8.c;
        khe kheVar = this.u0;
        if (ub8Var == ub8Var2) {
            if (!m()) {
                ((PowerManager.WakeLock) kheVar.getValue()).acquire();
            }
        } else if (m()) {
            p((PowerManager.WakeLock) kheVar.getValue(), 0);
        }
        r(j, ub8Var, true);
    }

    @Override // defpackage.fh9
    public final void i(long j, ub8 ub8Var) {
        hm9.n("f40", "onPause " + j + " type " + ub8Var);
        r(j, ub8Var, false);
        if (ub8Var == ub8.c) {
            if (m()) {
                p((PowerManager.WakeLock) this.u0.getValue(), 0);
            }
            q(j, this.c.o());
        }
    }

    @Override // defpackage.fh9
    public final void k(long j, ub8 ub8Var) {
        hm9.n("f40", "onSkipToNext " + j + " type " + ub8Var);
        r(j, ub8Var, false);
    }

    public final boolean l() {
        Object njcVar;
        khe kheVar = this.t0;
        if (!kheVar.a()) {
            return false;
        }
        try {
            njcVar = Boolean.valueOf(((PowerManager.WakeLock) kheVar.getValue()).isHeld());
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            ((cba) ((o45) this.X.getValue())).c(new HandledException(thA), true);
        }
        Boolean bool = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = bool;
        }
        return ((Boolean) njcVar).booleanValue();
    }

    public final boolean m() {
        Object njcVar;
        khe kheVar = this.u0;
        if (!kheVar.a()) {
            return false;
        }
        try {
            njcVar = Boolean.valueOf(((PowerManager.WakeLock) kheVar.getValue()).isHeld());
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            ((cba) ((o45) this.X.getValue())).c(new HandledException(thA), true);
        }
        Boolean bool = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = bool;
        }
        return ((Boolean) njcVar).booleanValue();
    }

    public final void n() {
        hm9.n("f40", "onDeviceAwayFromEar");
        if (l()) {
            khe kheVar = this.t0;
            if (kheVar.a()) {
                p((PowerManager.WakeLock) kheVar.getValue(), 0);
            }
            uh9 uh9Var = this.c;
            if (uh9Var.x) {
                if (uh9Var.m() == ub8.c) {
                    uh9Var.q();
                }
            }
        }
    }

    public final void o() {
        khe kheVar = this.u0;
        try {
            if (kheVar.a()) {
                p((PowerManager.WakeLock) kheVar.getValue(), 0);
            }
            khe kheVar2 = this.t0;
            if (kheVar2.a()) {
                p((PowerManager.WakeLock) kheVar2.getValue(), 1);
            }
        } catch (Throwable th) {
            ((cba) ((o45) this.X.getValue())).c(new HandledException(th), true);
        }
    }

    @uae
    public final void onEvent(re9 re9Var) {
        uh9 uh9Var = this.c;
        if (re9Var.X.contains(Long.valueOf(uh9Var.l())) && uh9Var.C == null) {
            hm9.n("f40", "stop");
            t();
            uh9Var.t();
            o();
        }
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801) {
            this.b.c(new su(1));
        }
    }

    public final void q(long j, long j2) {
        if (j == -1 || j2 < 0) {
            return;
        }
        j47.T((sx3) this.s0.getValue(), null, null, new c40(this, j2, j, null), 3);
    }

    public final void r(long j, ub8 ub8Var, boolean z) {
        hm9.n("f40", "sendEvent " + j + ", " + ub8Var + ", " + z);
        if (j == -1) {
            return;
        }
        if (j == this.v0 && this.w0 != -1) {
            s(j, ub8Var, this.w0);
            return;
        }
        hm9.n("f40", "track changed, should update chatId");
        if (j != this.v0 || this.w0 == -1) {
            j47.T((sx3) this.s0.getValue(), null, null, new e40(this, j, ub8Var, null), 3);
        } else {
            s(j, ub8Var, this.w0);
        }
    }

    public final void s(long j, ub8 ub8Var, long j2) {
        hm9.n("f40", "send event internal trackId=" + j + " trackType=" + ub8Var + " chatId=" + j2);
        this.b.c(new a60(ub8Var.ordinal(), j, j2));
    }

    public final void t() {
        hm9.n("f40", "unsubscribe sensors controller");
        b6d b6dVar = (b6d) this.o.getValue();
        Set set = b6dVar.c;
        if (set.remove(this) && set.size() == 0 && b6dVar.b != null) {
            b6dVar.a.unregisterListener(b6dVar);
        }
    }
}
