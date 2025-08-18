package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Looper;
import com.google.android.exoplayer2.PlaybackException;
import java.util.MissingResourceException;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class u65 implements m3b, AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int y0 = 0;
    public final qz7 X;
    public bq7 Y;
    public fef Z;
    public final zpd a;
    public final kad b;
    public final o45 c;
    public final m65 o;
    public float s0 = 0.0f;
    public dj0 t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;

    public u65(Context context, o45 o45Var, m65 m65Var, ef7 ef7Var, t33 t33Var) throws MissingResourceException {
        this.c = o45Var;
        this.o = m65Var;
        ec4.a("bufferForPlaybackMs", 500, 0, "0");
        ec4.a("bufferForPlaybackAfterRebufferMs", 3000, 0, "0");
        ec4.a("minBufferMs", 7000, 500, "bufferForPlaybackMs");
        ec4.a("minBufferMs", 7000, 3000, "bufferForPlaybackAfterRebufferMs");
        ec4.a("maxBufferMs", 15000, 7000, "minBufferMs");
        ec4 ec4Var = new ec4(new n64(0), 7000, 15000, 500, 3000);
        bf4 bf4Var = new bf4(context, new ob6());
        pe4 pe4VarB = bf4Var.b();
        String iSO3Language = t33Var.v().getISO3Language();
        if (iSO3Language == null) {
            pe4VarB.c(new String[0]);
        } else {
            pe4VarB.c(new String[]{iSO3Language});
        }
        cle cleVar = new cle(context);
        w65 w65Var = new w65(context, cleVar);
        np8.f(!w65Var.p);
        w65Var.e = new lc4(4, bf4Var);
        np8.f(!w65Var.p);
        w65Var.f = new lc4(1, ec4Var);
        np8.f(!w65Var.p);
        w65Var.p = true;
        zpd zpdVar = new zpd(w65Var);
        this.a = zpdVar;
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        t75Var.getClass();
        z23 z23Var = t75Var.x0;
        z23Var.getClass();
        ((CopyOnWriteArraySet) z23Var.d).add(new nm7(this));
        zpdVar.Z1();
        h74 h74Var = t75Var.C0;
        h74Var.getClass();
        z23 z23Var2 = h74Var.Y;
        z23Var2.getClass();
        ((CopyOnWriteArraySet) z23Var2.d).add(new nm7(this));
        this.b = new kad(zpdVar, bf4Var, t33Var, ef7Var, cleVar);
        this.X = new qz7(23, new dp(context));
        context.registerReceiver(new an(6, this), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    public static void u() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is NOT main!");
        }
    }

    public final void B() {
        u();
        fef fefVar = this.Z;
        zpd zpdVar = this.a;
        if (fefVar != null && fefVar.m() > 0) {
            fef fefVar2 = this.Z;
            if (!((ok0) fefVar2).c) {
                hm9.m("u65", "seekToStart seekTo: %d", Long.valueOf(fefVar2.m()));
                zpdVar.r(zpdVar.p0(), this.Z.m());
                return;
            }
        }
        hm9.n("u65", "seekToStart seekTo: 0");
        zpdVar.r(zpdVar.p0(), 0L);
    }

    public final void E() {
        hm9.n("u65", "Stop");
        u();
        zpd zpdVar = this.a;
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        t75Var.s2();
        t75Var.s2();
        t75Var.I0.d(1, t75Var.u());
        t75Var.n2(null);
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        bq7 bq7Var = this.Y;
        if (bq7Var != null) {
            bq7Var.p();
        }
    }

    @Override // defpackage.m3b
    public final void G(sze szeVar, b0f b0fVar) {
        ve8 ve8Var;
        u();
        if (!this.x0) {
            this.x0 = this.b.e();
        }
        bq7 bq7Var = this.Y;
        if (bq7Var == null || (ve8Var = bq7Var.e) == null) {
            return;
        }
        ve8Var.K();
    }

    public final boolean b() {
        zpd zpdVar = this.a;
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        t75Var.s2();
        int i = t75Var.k1.e;
        if (i != 2 && i != 3) {
            return false;
        }
        zpdVar.Z1();
        if (!t75Var.u()) {
            return false;
        }
        zpdVar.Z1();
        t75Var.s2();
        return t75Var.k1.m == 0;
    }

    public final void g(float f) {
        u();
        zpd zpdVar = this.a;
        float fE = zpdVar.e();
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        t75Var.s2();
        float fI = maf.i(f, 0.0f, 1.0f);
        if (t75Var.e1 != fI) {
            t75Var.e1 = fI;
            t75Var.k2(1, 2, Float.valueOf(t75Var.I0.e * fI));
            t75Var.x0.i(22, new b75(0, fI));
        }
        bq7 bq7Var = this.Y;
        if (bq7Var != null) {
            ve8 ve8Var = bq7Var.e;
            if (ve8Var != null) {
                ve8Var.d1();
            }
            if (bq7Var.b.b()) {
                if (bq7Var.l()) {
                    bq7Var.a();
                } else {
                    bq7Var.p();
                }
            }
        }
        if (fE > 0.0f || f <= 0.0f) {
            return;
        }
        y();
    }

    @Override // defpackage.m3b
    public final void h(int i) {
        ve8 ve8Var;
        ve8 ve8Var2;
        u();
        if (i == 1) {
            hm9.n("u65", "onPlayerStateChanged ExoPlayer.STATE_IDLE");
            return;
        }
        if (i == 2) {
            hm9.n("u65", "onPlayerStateChanged ExoPlayer.STATE_BUFFERING");
            bq7 bq7Var = this.Y;
            if (bq7Var == null || (ve8Var = bq7Var.e) == null) {
                return;
            }
            ve8Var.y0();
            return;
        }
        if (i == 3) {
            hm9.n("u65", "onPlayerStateChanged ExoPlayer.STATE_READY");
            bq7 bq7Var2 = this.Y;
            if (bq7Var2 == null || (ve8Var2 = bq7Var2.e) == null) {
                return;
            }
            ve8Var2.j1();
            return;
        }
        if (i != 4) {
            return;
        }
        hm9.n("u65", "onPlayerStateChanged ExoPlayer.STATE_ENDED");
        if (this.a.getRepeatMode() == 1) {
            hm9.n("u65", "State ended, but video is looping. Restart");
            play();
            return;
        }
        bq7 bq7Var3 = this.Y;
        if (bq7Var3 != null) {
            ve8 ve8Var3 = bq7Var3.e;
            if (ve8Var3 != null) {
                ve8Var3.o();
            }
            bq7Var3.p();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        hm9.m("u65", "On audio focus change, %d", Integer.valueOf(i));
        zpd zpdVar = this.a;
        if (i == -3) {
            if (!b() || zpdVar.e() <= 0.0f) {
                return;
            }
            hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2");
            g(0.2f);
            return;
        }
        if (i == -2) {
            if (!b() || zpdVar.e() <= 0.0f) {
                return;
            }
            hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player");
            pause();
            return;
        }
        if (i == -1) {
            hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_LOSS");
            if (!b() || zpdVar.e() <= 0.0f) {
                return;
            }
            hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_LOSS. Stop");
            pause();
            return;
        }
        if (i != 1) {
            return;
        }
        if (!b()) {
            hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_GAIN. Resuming player");
            play();
        }
        float fE = zpdVar.e();
        if (fE <= 0.0f || fE >= 1.0d) {
            return;
        }
        hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_GAIN. Volume up");
        g(1.0f);
    }

    public final void pause() {
        hm9.n("u65", "Pause");
        u();
        this.a.Y(false);
        bq7 bq7Var = this.Y;
        if (bq7Var != null) {
            ve8 ve8Var = bq7Var.e;
            if (ve8Var != null) {
                ve8Var.h();
            }
            bq7Var.p();
        }
    }

    public final void play() {
        hm9.n("u65", "Play");
        u();
        zpd zpdVar = this.a;
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        t75Var.s2();
        if (t75Var.k1.e == 4) {
            B();
        }
        zpdVar.Y(true);
        bq7 bq7Var = this.Y;
        if (bq7Var != null) {
            bq7Var.m();
        }
        y();
    }

    @Override // defpackage.m3b
    public final void r(PlaybackException playbackException) {
        u();
        hm9.p("u65", "onPlayerError", playbackException);
        if (playbackException != null) {
            ((cba) this.c).c(new HandledException(playbackException), false);
        }
        bq7 bq7Var = this.Y;
        if (bq7Var != null) {
            ve8 ve8Var = bq7Var.e;
            if (ve8Var != null) {
                ve8Var.D1(playbackException);
            }
            bq7Var.p();
        }
    }

    public final long v() {
        fef fefVar = this.Z;
        if (fefVar == null) {
            return 0L;
        }
        long jK = fefVar.k();
        zpd zpdVar = this.a;
        if (jK > 0) {
            zpdVar.Z1();
            return Math.min(zpdVar.c.c(), this.Z.k() - this.Z.m());
        }
        zpdVar.Z1();
        return zpdVar.c.c();
    }

    @Override // defpackage.m3b
    public final void x(int i) {
        hm9.m("u65", "onTimelineChanged %d", Integer.valueOf(i));
    }

    public final void y() {
        if (this.a.e() <= 0.0f || !b()) {
            return;
        }
        ((AudioManager) this.X.get()).requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).build());
    }
}
