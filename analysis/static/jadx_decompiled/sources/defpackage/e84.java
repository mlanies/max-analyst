package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class e84 implements b70 {
    public static final Object m0 = new Object();
    public static ExecutorService n0;
    public static int o0;
    public h30 A;
    public w74 B;
    public w74 C;
    public c3b D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public byte[] T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public int a0;
    public final jo7 b;
    public qc0 b0;
    public final boolean c;
    public g40 c0;
    public final d42 d;
    public boolean d0;
    public final z2f e;
    public long e0;
    public final ffc f;
    public long f0;
    public final ffc g;
    public boolean g0;
    public final ae3 h;
    public boolean h0;
    public final o70 i;
    public Looper i0;
    public final ArrayDeque j;
    public long j0;
    public final boolean k;
    public long k0;
    public int l;
    public Handler l0;
    public c84 m;
    public final z74 n;
    public final z74 o;
    public final yb9 p;
    public final ph4 q;
    public j4b r;
    public qqd s;
    public u74 t;
    public u74 u;
    public h60 v;
    public AudioTrack w;
    public t30 x;
    public x30 y;
    public y74 z;

    public e84(s74 s74Var) {
        t30 t30VarB;
        Context context = (Context) s74Var.d;
        this.a = context;
        h30 h30Var = h30.g;
        this.A = h30Var;
        if (context != null) {
            t30 t30Var = t30.c;
            int i = oaf.a;
            t30VarB = t30.b(context, h30Var, null);
        } else {
            t30VarB = (t30) s74Var.e;
        }
        this.x = t30VarB;
        this.b = (jo7) s74Var.f;
        int i2 = oaf.a;
        this.c = i2 >= 21 && s74Var.a;
        this.k = i2 >= 23 && s74Var.b;
        this.l = 0;
        this.p = (yb9) s74Var.g;
        ph4 ph4Var = (ph4) s74Var.h;
        ph4Var.getClass();
        this.q = ph4Var;
        ae3 ae3Var = new ae3(false, 1);
        this.h = ae3Var;
        ae3Var.g();
        this.i = new o70(new bkg(11, this));
        d42 d42Var = new d42();
        this.d = d42Var;
        z2f z2fVar = new z2f();
        z2fVar.m = oaf.f;
        this.e = z2fVar;
        cwe cweVar = new cwe();
        ls5 ls5Var = zw6.b;
        Object[] objArr = {cweVar, d42Var, z2fVar};
        c54.n(3, objArr);
        this.f = zw6.h(3, objArr);
        this.g = zw6.n(new bwe());
        this.P = 1.0f;
        this.a0 = 0;
        this.b0 = new qc0();
        c3b c3bVar = c3b.d;
        this.C = new w74(c3bVar, 0L, 0L);
        this.D = c3bVar;
        this.E = false;
        this.j = new ArrayDeque();
        this.n = new z74(1);
        this.o = new z74(1);
    }

    public static boolean m(AudioTrack audioTrack) {
        return oaf.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            boolean r2 = r16.t()
            r3 = 4
            r4 = 1610612736(0x60000000, float:3.689349E19)
            r5 = 22
            r6 = 1342177280(0x50000000, float:8.589935E9)
            r7 = 21
            boolean r8 = r0.c
            jo7 r9 = r0.b
            if (r2 != 0) goto L5b
            boolean r2 = r0.d0
            if (r2 != 0) goto L55
            u74 r2 = r0.u
            int r10 = r2.c
            if (r10 != 0) goto L55
            qy5 r2 = r2.a
            int r2 = r2.D
            if (r8 == 0) goto L33
            int r10 = defpackage.oaf.a
            if (r2 == r7) goto L55
            if (r2 == r6) goto L55
            if (r2 == r5) goto L55
            if (r2 == r4) goto L55
            if (r2 != r3) goto L33
            goto L55
        L33:
            c3b r2 = r0.D
            r9.getClass()
            float r10 = r2.a
            java.lang.Object r11 = r9.c
            vud r11 = (defpackage.vud) r11
            float r12 = r11.c
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L48
            r11.c = r10
            r11.i = r1
        L48:
            float r10 = r11.d
            float r12 = r2.b
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L57
            r11.d = r12
            r11.i = r1
            goto L57
        L55:
            c3b r2 = defpackage.c3b.d
        L57:
            r0.D = r2
        L59:
            r11 = r2
            goto L5e
        L5b:
            c3b r2 = defpackage.c3b.d
            goto L59
        L5e:
            boolean r2 = r0.d0
            if (r2 != 0) goto L84
            u74 r2 = r0.u
            int r10 = r2.c
            if (r10 != 0) goto L84
            qy5 r2 = r2.a
            int r2 = r2.D
            if (r8 == 0) goto L7b
            int r8 = defpackage.oaf.a
            if (r2 == r7) goto L84
            if (r2 == r6) goto L84
            if (r2 == r5) goto L84
            if (r2 == r4) goto L84
            if (r2 != r3) goto L7b
            goto L84
        L7b:
            boolean r2 = r0.E
            java.lang.Object r3 = r9.b
            lpd r3 = (defpackage.lpd) r3
            r3.o = r2
            goto L85
        L84:
            r2 = 0
        L85:
            r0.E = r2
            java.util.ArrayDeque r2 = r0.j
            w74 r3 = new w74
            r4 = 0
            r6 = r17
            long r12 = java.lang.Math.max(r4, r6)
            u74 r4 = r0.u
            long r5 = r16.h()
            int r4 = r4.e
            long r14 = defpackage.oaf.Y(r4, r5)
            r10 = r3
            r10.<init>(r11, r12, r14)
            r2.add(r3)
            u74 r2 = r0.u
            h60 r2 = r2.i
            r0.v = r2
            r2.b()
            qqd r2 = r0.s
            if (r2 == 0) goto Lc9
            boolean r0 = r0.E
            java.lang.Object r2 = r2.b
            v78 r2 = (defpackage.v78) r2
            qz7 r2 = r2.R1
            java.lang.Object r3 = r2.b
            android.os.Handler r3 = (android.os.Handler) r3
            if (r3 == 0) goto Lc9
            u60 r4 = new u60
            r4.<init>(r2, r0, r1)
            r3.post(r4)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e84.a(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.qy5 r28, int[] r29) throws androidx.media3.exoplayer.audio.AudioSink$ConfigurationException {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e84.b(qy5, int[]):void");
    }

    public final boolean c() throws Exception {
        if (!this.v.f()) {
            ByteBuffer byteBuffer = this.S;
            if (byteBuffer == null) {
                return true;
            }
            u(Long.MIN_VALUE, byteBuffer);
            return this.S == null;
        }
        this.v.h();
        q(Long.MIN_VALUE);
        if (!this.v.e()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.S;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final void d() throws IllegalStateException {
        y74 y74Var;
        if (l()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.h0 = false;
            this.L = 0;
            this.C = new w74(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.j.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.W = false;
            this.V = false;
            this.X = false;
            this.F = null;
            this.G = 0;
            this.e.o = 0L;
            h60 h60Var = this.u.i;
            this.v = h60Var;
            h60Var.b();
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (m(this.w)) {
                c84 c84Var = this.m;
                c84Var.getClass();
                c84Var.b(this.w);
            }
            int i = oaf.a;
            if (i < 21 && !this.Z) {
                this.a0 = 0;
            }
            u74 u74Var = this.u;
            a70 a70Var = new a70(u74Var.g, u74Var.e, u74Var.f, u74Var.h, u74Var.l, u74Var.c == 1);
            u74 u74Var2 = this.t;
            if (u74Var2 != null) {
                this.u = u74Var2;
                this.t = null;
            }
            o70 o70Var = this.i;
            o70Var.d();
            o70Var.c = null;
            o70Var.f = null;
            if (i >= 24 && (y74Var = this.z) != null) {
                y74Var.c();
                this.z = null;
            }
            AudioTrack audioTrack2 = this.w;
            ae3 ae3Var = this.h;
            qqd qqdVar = this.s;
            ae3Var.c();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (m0) {
                try {
                    if (n0 == null) {
                        n0 = Executors.newSingleThreadExecutor(new pd3(2, "ExoPlayer:AudioTrackReleaseThread"));
                    }
                    o0++;
                    n0.execute(new vq1(audioTrack2, qqdVar, handler, a70Var, ae3Var, 3));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w = null;
        }
        this.o.b = null;
        this.n.b = null;
        this.j0 = 0L;
        this.k0 = 0L;
        Handler handler2 = this.l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final y50 e(qy5 qy5Var) {
        int i;
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.g0) {
            return y50.d;
        }
        h30 h30Var = this.A;
        ph4 ph4Var = this.q;
        ph4Var.getClass();
        qy5Var.getClass();
        h30Var.getClass();
        int i2 = oaf.a;
        if (i2 < 29 || (i = qy5Var.C) == -1) {
            return y50.d;
        }
        Boolean bool = (Boolean) ph4Var.b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = (Context) ph4Var.a;
            if (context == null || (audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
                ph4Var.b = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                ph4Var.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) ph4Var.b).booleanValue();
        }
        String str = qy5Var.n;
        str.getClass();
        int iB = ia9.b(str, qy5Var.j);
        if (iB == 0 || i2 < oaf.r(iB)) {
            return y50.d;
        }
        int iT = oaf.t(qy5Var.B);
        if (iT == 0) {
            return y50.d;
        }
        try {
            AudioFormat audioFormatS = oaf.s(i, iT, iB);
            return i2 >= 31 ? m74.a(audioFormatS, (AudioAttributes) h30Var.b().a, zBooleanValue) : l74.a(audioFormatS, (AudioAttributes) h30Var.b().a, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return y50.d;
        }
    }

    public final int f(qy5 qy5Var) {
        n();
        if (!"audio/raw".equals(qy5Var.n)) {
            return this.x.d(this.A, qy5Var) != null ? 2 : 0;
        }
        int i = qy5Var.D;
        if (oaf.L(i)) {
            return (i == 2 || (this.c && i == 4)) ? 2 : 1;
        }
        ey8.k(i, "Invalid PCM encoding: ");
        return 0;
    }

    public final long g() {
        return this.u.c == 0 ? this.H / r0.b : this.I;
    }

    public final long h() {
        u74 u74Var = this.u;
        if (u74Var.c != 0) {
            return this.K;
        }
        long j = this.J;
        long j2 = u74Var.d;
        int i = oaf.a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0106, code lost:
    
        if (r9.b() == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.nio.ByteBuffer r25, long r26, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e84.i(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean j() {
        return l() && !(oaf.a >= 29 && this.w.isOffloadedPlayback() && this.X) && this.i.c(h());
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() throws androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e84.k():boolean");
    }

    public final boolean l() {
        return this.w != null;
    }

    public final void n() {
        Context context;
        t30 t30VarC;
        v30 v30Var;
        if (this.y != null || (context = this.a) == null) {
            return;
        }
        this.i0 = Looper.myLooper();
        x30 x30Var = new x30(context, new q64(2, this), this.A, this.c0);
        this.y = x30Var;
        if (x30Var.a) {
            t30VarC = (t30) x30Var.s0;
            t30VarC.getClass();
        } else {
            x30Var.a = true;
            w30 w30Var = (w30) x30Var.Z;
            if (w30Var != null) {
                w30Var.a.registerContentObserver(w30Var.b, false, w30Var);
            }
            int i = oaf.a;
            Handler handler = (Handler) x30Var.o;
            Context context2 = (Context) x30Var.b;
            if (i >= 23 && (v30Var = (v30) x30Var.X) != null) {
                u30.a(context2, v30Var, handler);
            }
            an anVar = (an) x30Var.Y;
            t30VarC = t30.c(context2, anVar != null ? context2.registerReceiver(anVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, (h30) x30Var.u0, (g40) x30Var.t0);
            x30Var.s0 = t30VarC;
        }
        this.x = t30VarC;
    }

    public final void o() throws IllegalStateException {
        this.Y = true;
        if (l()) {
            o70 o70Var = this.i;
            if (o70Var.y != -9223372036854775807L) {
                o70Var.J.getClass();
                o70Var.y = oaf.S(SystemClock.elapsedRealtime());
            }
            m70 m70Var = o70Var.f;
            m70Var.getClass();
            m70Var.a();
            this.w.play();
        }
    }

    public final void p() throws IllegalStateException {
        if (this.W) {
            return;
        }
        this.W = true;
        long jH = h();
        o70 o70Var = this.i;
        o70Var.A = o70Var.b();
        o70Var.J.getClass();
        o70Var.y = oaf.S(SystemClock.elapsedRealtime());
        o70Var.B = jH;
        if (m(this.w)) {
            this.X = false;
        }
        this.w.stop();
        this.G = 0;
    }

    public final void q(long j) throws Exception {
        ByteBuffer byteBufferD;
        if (!this.v.f()) {
            ByteBuffer byteBuffer = this.Q;
            if (byteBuffer == null) {
                byteBuffer = m60.a;
            }
            u(j, byteBuffer);
            return;
        }
        while (!this.v.e()) {
            do {
                byteBufferD = this.v.d();
                if (byteBufferD.hasRemaining()) {
                    u(j, byteBufferD);
                } else {
                    ByteBuffer byteBuffer2 = this.Q;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.v.i(this.Q);
                    }
                }
            } while (!byteBufferD.hasRemaining());
            return;
        }
    }

    public final void r() throws IllegalStateException {
        d();
        ls5 ls5VarListIterator = this.f.listIterator(0);
        while (ls5VarListIterator.hasNext()) {
            ((m60) ls5VarListIterator.next()).reset();
        }
        ls5 ls5VarListIterator2 = this.g.listIterator(0);
        while (ls5VarListIterator2.hasNext()) {
            ((m60) ls5VarListIterator2.next()).reset();
        }
        h60 h60Var = this.v;
        if (h60Var != null) {
            h60Var.j();
        }
        this.Y = false;
        this.g0 = false;
    }

    public final void s() {
        if (l()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                z04.d0("Failed to set playback params", e);
            }
            c3b c3bVar = new c3b(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = c3bVar;
            float f = c3bVar.a;
            o70 o70Var = this.i;
            o70Var.j = f;
            m70 m70Var = o70Var.f;
            if (m70Var != null) {
                m70Var.a();
            }
            o70Var.d();
        }
    }

    public final boolean t() {
        u74 u74Var = this.u;
        return u74Var != null && u74Var.j && oaf.a >= 23;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(long r13, java.nio.ByteBuffer r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e84.u(long, java.nio.ByteBuffer):void");
    }
}
