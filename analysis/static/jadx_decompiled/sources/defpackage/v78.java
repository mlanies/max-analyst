package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class v78 extends g88 implements m78 {
    public final Context Q1;
    public final qz7 R1;
    public final b70 S1;
    public int T1;
    public boolean U1;
    public boolean V1;
    public qy5 W1;
    public qy5 X1;
    public long Y1;
    public boolean Z1;
    public boolean a2;
    public boolean b2;
    public int c2;

    public v78(Context context, q78 q78Var, Handler handler, o75 o75Var, e84 e84Var) {
        super(1, q78Var, 44100.0f);
        this.Q1 = context.getApplicationContext();
        this.S1 = e84Var;
        this.c2 = -1000;
        this.R1 = new qz7(handler, 5, o75Var);
        e84Var.s = new qqd(18, this);
    }

    public final int A0(y78 y78Var, qy5 qy5Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(y78Var.a) || (i = oaf.a) >= 24 || (i == 23 && oaf.P(this.Q1))) {
            return qy5Var.o;
        }
        return -1;
    }

    public final void B0() {
        long jMax;
        ArrayDeque arrayDeque;
        long jA;
        long jA0;
        boolean zM = m();
        e84 e84Var = (e84) this.S1;
        if (!e84Var.l() || e84Var.N) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(e84Var.i.a(zM), oaf.Y(e84Var.u.e, e84Var.h()));
            while (true) {
                arrayDeque = e84Var.j;
                if (arrayDeque.isEmpty() || jMin < ((w74) arrayDeque.getFirst()).c) {
                    break;
                } else {
                    e84Var.C = (w74) arrayDeque.remove();
                }
            }
            long j = jMin - e84Var.C.c;
            boolean zIsEmpty = arrayDeque.isEmpty();
            jo7 jo7Var = e84Var.b;
            if (zIsEmpty) {
                vud vudVar = (vud) jo7Var.c;
                if (vudVar.isActive()) {
                    if (vudVar.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                        long j2 = vudVar.n;
                        vudVar.j.getClass();
                        long j3 = j2 - ((r3.l * r3.c) * 2);
                        int i = vudVar.h.a;
                        int i2 = vudVar.g.a;
                        jA0 = i == i2 ? oaf.a0(j, j3, vudVar.o, RoundingMode.FLOOR) : oaf.a0(j, j3 * i, vudVar.o * i2, RoundingMode.FLOOR);
                    } else {
                        jA0 = (long) (vudVar.c * j);
                    }
                    j = jA0;
                }
                jA = e84Var.C.b + j;
            } else {
                w74 w74Var = (w74) arrayDeque.getFirst();
                jA = w74Var.b - oaf.A(e84Var.C.a.a, w74Var.c - jMin);
            }
            long j4 = ((lpd) jo7Var.b).q;
            jMax = oaf.Y(e84Var.u.e, j4) + jA;
            long j5 = e84Var.j0;
            if (j4 > j5) {
                long jY = oaf.Y(e84Var.u.e, j4 - j5);
                e84Var.j0 = j4;
                e84Var.k0 += jY;
                if (e84Var.l0 == null) {
                    e84Var.l0 = new Handler(Looper.myLooper());
                }
                e84Var.l0.removeCallbacksAndMessages(null);
                e84Var.l0.postDelayed(new cu1(25, e84Var), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.Z1) {
                jMax = Math.max(this.Y1, jMax);
            }
            this.Y1 = jMax;
            this.Z1 = false;
        }
    }

    @Override // defpackage.g88
    public final s54 G(y78 y78Var, qy5 qy5Var, qy5 qy5Var2) {
        s54 s54VarB = y78Var.b(qy5Var, qy5Var2);
        boolean z = this.Q0 == null && u0(qy5Var2);
        int i = s54VarB.e;
        if (z) {
            i |= 32768;
        }
        if (A0(y78Var, qy5Var2) > this.T1) {
            i |= 64;
        }
        int i2 = i;
        return new s54(y78Var.a, qy5Var, qy5Var2, i2 == 0 ? s54VarB.d : 0, i2);
    }

    @Override // defpackage.m78
    public final boolean I() {
        boolean z = this.b2;
        this.b2 = false;
        return z;
    }

    @Override // defpackage.g88
    public final float S(float f, qy5[] qy5VarArr) {
        int iMax = -1;
        for (qy5 qy5Var : qy5VarArr) {
            int i = qy5Var.C;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.g88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList T(defpackage.xw0 r3, defpackage.qy5 r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = r4.n
            if (r0 != 0) goto L7
            ffc r2 = defpackage.ffc.X
            goto L31
        L7:
            b70 r2 = r2.S1
            e84 r2 = (defpackage.e84) r2
            int r2 = r2.f(r4)
            r0 = 0
            if (r2 == 0) goto L2d
            java.lang.String r2 = "audio/raw"
            java.util.List r2 = defpackage.p88.e(r2, r0, r0)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L20
            r2 = 0
            goto L26
        L20:
            java.lang.Object r2 = r2.get(r0)
            y78 r2 = (defpackage.y78) r2
        L26:
            if (r2 == 0) goto L2d
            ffc r2 = defpackage.zw6.n(r2)
            goto L31
        L2d:
            ffc r2 = defpackage.p88.g(r3, r4, r5, r0)
        L31:
            java.util.ArrayList r2 = defpackage.p88.h(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v78.T(xw0, qy5, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    @Override // defpackage.g88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.o78 U(defpackage.y78 r12, defpackage.qy5 r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v78.U(y78, qy5, android.media.MediaCrypto, float):o78");
    }

    @Override // defpackage.g88
    public final void V(p54 p54Var) {
        qy5 qy5Var;
        u74 u74Var;
        if (oaf.a < 29 || (qy5Var = p54Var.c) == null || !Objects.equals(qy5Var.n, "audio/opus") || !this.u1) {
            return;
        }
        ByteBuffer byteBuffer = p54Var.s0;
        byteBuffer.getClass();
        qy5 qy5Var2 = p54Var.c;
        qy5Var2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            e84 e84Var = (e84) this.S1;
            AudioTrack audioTrack = e84Var.w;
            if (audioTrack == null || !e84.m(audioTrack) || (u74Var = e84Var.u) == null || !u74Var.k) {
                return;
            }
            e84Var.w.setOffloadDelayPadding(qy5Var2.E, i);
        }
    }

    @Override // defpackage.vj0, defpackage.q4b
    public final void a(int i, Object obj) throws IllegalStateException {
        b70 b70Var = this.S1;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            e84 e84Var = (e84) b70Var;
            if (e84Var.P != fFloatValue) {
                e84Var.P = fFloatValue;
                if (e84Var.l()) {
                    if (oaf.a >= 21) {
                        e84Var.w.setVolume(e84Var.P);
                        return;
                    }
                    AudioTrack audioTrack = e84Var.w;
                    float f = e84Var.P;
                    audioTrack.setStereoVolume(f, f);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            h30 h30Var = (h30) obj;
            h30Var.getClass();
            e84 e84Var2 = (e84) b70Var;
            if (e84Var2.A.equals(h30Var)) {
                return;
            }
            e84Var2.A = h30Var;
            if (e84Var2.d0) {
                return;
            }
            x30 x30Var = e84Var2.y;
            if (x30Var != null) {
                x30Var.u0 = h30Var;
                x30Var.d(t30.b((Context) x30Var.b, h30Var, (g40) x30Var.t0));
            }
            e84Var2.d();
            return;
        }
        if (i == 6) {
            qc0 qc0Var = (qc0) obj;
            qc0Var.getClass();
            e84 e84Var3 = (e84) b70Var;
            if (e84Var3.b0.equals(qc0Var)) {
                return;
            }
            if (e84Var3.w != null) {
                e84Var3.b0.getClass();
            }
            e84Var3.b0 = qc0Var;
            return;
        }
        if (i == 12) {
            if (oaf.a >= 23) {
                t78.a(b70Var, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.c2 = ((Integer) obj).intValue();
            s78 s78Var = this.W0;
            if (s78Var != null && oaf.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.c2));
                s78Var.setParameters(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            e84 e84Var4 = (e84) b70Var;
            e84Var4.E = ((Boolean) obj).booleanValue();
            w74 w74Var = new w74(e84Var4.t() ? c3b.d : e84Var4.D, -9223372036854775807L, -9223372036854775807L);
            if (e84Var4.l()) {
                e84Var4.B = w74Var;
                return;
            } else {
                e84Var4.C = w74Var;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                this.R0 = (w75) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        e84 e84Var5 = (e84) b70Var;
        if (e84Var5.a0 != iIntValue) {
            e84Var5.a0 = iIntValue;
            e84Var5.Z = iIntValue != 0;
            e84Var5.d();
        }
    }

    @Override // defpackage.g88
    public final void a0(Exception exc) {
        z04.v("Audio codec error", exc);
        qz7 qz7Var = this.R1;
        Handler handler = (Handler) qz7Var.b;
        if (handler != null) {
            handler.post(new w60(qz7Var, exc, 0));
        }
    }

    @Override // defpackage.g88
    public final void b0(long j, String str, long j2) {
        qz7 qz7Var = this.R1;
        Handler handler = (Handler) qz7Var.b;
        if (handler != null) {
            handler.post(new v60(qz7Var, str, j, j2, 1));
        }
    }

    @Override // defpackage.g88
    public final void c0(String str) {
        qz7 qz7Var = this.R1;
        Handler handler = (Handler) qz7Var.b;
        if (handler != null) {
            handler.post(new c(qz7Var, 7, str));
        }
    }

    @Override // defpackage.m78
    /* renamed from: d */
    public final c3b mo1d() {
        return ((e84) this.S1).D;
    }

    @Override // defpackage.g88
    public final s54 d0(y7g y7gVar) throws ExoPlaybackException {
        qy5 qy5Var = (qy5) y7gVar.c;
        qy5Var.getClass();
        this.W1 = qy5Var;
        s54 s54VarD0 = super.d0(y7gVar);
        qz7 qz7Var = this.R1;
        Handler handler = (Handler) qz7Var.b;
        if (handler != null) {
            handler.post(new f5(qz7Var, qy5Var, s54VarD0, 1));
        }
        return s54VarD0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010b A[Catch: AudioSink$ConfigurationException -> 0x0109, TryCatch #0 {AudioSink$ConfigurationException -> 0x0109, blocks: (B:42:0x00dd, B:45:0x00e5, B:47:0x00e9, B:49:0x00f2, B:53:0x0103, B:56:0x010b, B:60:0x0115, B:61:0x011a), top: B:65:0x00dd }] */
    @Override // defpackage.g88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(defpackage.qy5 r14, android.media.MediaFormat r15) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v78.e0(qy5, android.media.MediaFormat):void");
    }

    @Override // defpackage.m78
    public final void f(c3b c3bVar) {
        e84 e84Var = (e84) this.S1;
        e84Var.getClass();
        e84Var.D = new c3b(oaf.i(c3bVar.a, 0.1f, 8.0f), oaf.i(c3bVar.b, 0.1f, 8.0f));
        if (e84Var.t()) {
            e84Var.s();
            return;
        }
        w74 w74Var = new w74(c3bVar, -9223372036854775807L, -9223372036854775807L);
        if (e84Var.l()) {
            e84Var.B = w74Var;
        } else {
            e84Var.C = w74Var;
        }
    }

    @Override // defpackage.g88
    public final void f0() {
        this.S1.getClass();
    }

    @Override // defpackage.g88
    public final void h0() {
        ((e84) this.S1).M = true;
    }

    @Override // defpackage.vj0
    public final m78 j() {
        return this;
    }

    @Override // defpackage.vj0
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    @Override // defpackage.g88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(long r1, long r3, defpackage.s78 r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, defpackage.qy5 r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r0 = this;
            r6.getClass()
            qy5 r1 = r0.X1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r8 & 2
            if (r1 == 0) goto L14
            r5.getClass()
            r5.releaseOutputBuffer(r7, r3)
            return r2
        L14:
            b70 r1 = r0.S1
            if (r12 == 0) goto L29
            if (r5 == 0) goto L1d
            r5.releaseOutputBuffer(r7, r3)
        L1d:
            n54 r0 = r0.L1
            int r3 = r0.g
            int r3 = r3 + r9
            r0.g = r3
            e84 r1 = (defpackage.e84) r1
            r1.M = r2
            return r2
        L29:
            e84 r1 = (defpackage.e84) r1     // Catch: androidx.media3.exoplayer.audio.AudioSink$WriteException -> L3f androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L41
            boolean r1 = r1.i(r6, r10, r9)     // Catch: androidx.media3.exoplayer.audio.AudioSink$WriteException -> L3f androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L41
            if (r1 == 0) goto L3e
            if (r5 == 0) goto L36
            r5.releaseOutputBuffer(r7, r3)
        L36:
            n54 r0 = r0.L1
            int r1 = r0.f
            int r1 = r1 + r9
            r0.f = r1
            return r2
        L3e:
            return r3
        L3f:
            r1 = move-exception
            goto L43
        L41:
            r1 = move-exception
            goto L5c
        L43:
            boolean r2 = r0.u1
            if (r2 == 0) goto L53
            lgc r2 = r0.o
            r2.getClass()
            int r2 = r2.a
            if (r2 == 0) goto L53
            r2 = 5003(0x138b, float:7.01E-42)
            goto L55
        L53:
            r2 = 5002(0x138a, float:7.009E-42)
        L55:
            boolean r3 = r1.b
            androidx.media3.exoplayer.ExoPlaybackException r0 = r0.e(r1, r14, r3, r2)
            throw r0
        L5c:
            qy5 r2 = r0.W1
            boolean r3 = r0.u1
            if (r3 == 0) goto L6e
            lgc r3 = r0.o
            r3.getClass()
            int r3 = r3.a
            if (r3 == 0) goto L6e
            r3 = 5004(0x138c, float:7.012E-42)
            goto L70
        L6e:
            r3 = 5001(0x1389, float:7.008E-42)
        L70:
            boolean r4 = r1.b
            androidx.media3.exoplayer.ExoPlaybackException r0 = r0.e(r1, r2, r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v78.l0(long, long, s78, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, qy5):boolean");
    }

    @Override // defpackage.vj0
    public final boolean m() {
        if (this.H1) {
            e84 e84Var = (e84) this.S1;
            if (!e84Var.l() || (e84Var.V && !e84Var.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g88, defpackage.vj0
    public final boolean o() {
        return ((e84) this.S1).j() || super.o();
    }

    @Override // defpackage.g88
    public final void o0() throws IllegalStateException, ExoPlaybackException {
        try {
            e84 e84Var = (e84) this.S1;
            if (!e84Var.V && e84Var.l() && e84Var.c()) {
                e84Var.p();
                e84Var.V = true;
            }
        } catch (AudioSink$WriteException e) {
            throw e(e, e.c, e.b, this.u1 ? 5003 : 5002);
        }
    }

    @Override // defpackage.g88, defpackage.vj0
    public final void p() {
        qz7 qz7Var = this.R1;
        this.a2 = true;
        this.W1 = null;
        try {
            ((e84) this.S1).d();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.vj0
    public final void q(boolean z, boolean z2) throws IllegalStateException {
        n54 n54Var = new n54(1);
        this.L1 = n54Var;
        qz7 qz7Var = this.R1;
        Handler handler = (Handler) qz7Var.b;
        if (handler != null) {
            handler.post(new q60(qz7Var, n54Var, 0));
        }
        lgc lgcVar = this.o;
        lgcVar.getClass();
        boolean z3 = lgcVar.b;
        b70 b70Var = this.S1;
        if (z3) {
            e84 e84Var = (e84) b70Var;
            e84Var.getClass();
            fm9.k(oaf.a >= 21);
            fm9.k(e84Var.Z);
            if (!e84Var.d0) {
                e84Var.d0 = true;
                e84Var.d();
            }
        } else {
            e84 e84Var2 = (e84) b70Var;
            if (e84Var2.d0) {
                e84Var2.d0 = false;
                e84Var2.d();
            }
        }
        j4b j4bVar = this.Y;
        j4bVar.getClass();
        e84 e84Var3 = (e84) b70Var;
        e84Var3.r = j4bVar;
        she sheVar = this.Z;
        sheVar.getClass();
        e84Var3.i.J = sheVar;
    }

    @Override // defpackage.g88, defpackage.vj0
    public final void r(long j, boolean z) throws IllegalStateException, ExoPlaybackException {
        super.r(j, z);
        ((e84) this.S1).d();
        this.Y1 = j;
        this.b2 = false;
        this.Z1 = true;
    }

    @Override // defpackage.vj0
    public final void s() {
        v30 v30Var;
        x30 x30Var = ((e84) this.S1).y;
        if (x30Var == null || !x30Var.a) {
            return;
        }
        x30Var.s0 = null;
        int i = oaf.a;
        Context context = (Context) x30Var.b;
        if (i >= 23 && (v30Var = (v30) x30Var.X) != null) {
            u30.b(context, v30Var);
        }
        an anVar = (an) x30Var.Y;
        if (anVar != null) {
            context.unregisterReceiver(anVar);
        }
        w30 w30Var = (w30) x30Var.Z;
        if (w30Var != null) {
            w30Var.a.unregisterContentObserver(w30Var);
        }
        x30Var.a = false;
    }

    @Override // defpackage.m78
    public final long t() {
        if (this.s0 == 2) {
            B0();
        }
        return this.Y1;
    }

    @Override // defpackage.vj0
    public final void u() throws IllegalStateException {
        b70 b70Var = this.S1;
        this.b2 = false;
        try {
            try {
                J();
                n0();
                fr4 fr4Var = this.Q0;
                if (fr4Var != null) {
                    fr4Var.f(null);
                }
                this.Q0 = null;
            } catch (Throwable th) {
                fr4 fr4Var2 = this.Q0;
                if (fr4Var2 != null) {
                    fr4Var2.f(null);
                }
                this.Q0 = null;
                throw th;
            }
        } finally {
            if (this.a2) {
                this.a2 = false;
                ((e84) b70Var).r();
            }
        }
    }

    @Override // defpackage.g88
    public final boolean u0(qy5 qy5Var) {
        lgc lgcVar = this.o;
        lgcVar.getClass();
        if (lgcVar.a != 0) {
            int iZ0 = z0(qy5Var);
            if ((iZ0 & 512) != 0) {
                lgc lgcVar2 = this.o;
                lgcVar2.getClass();
                if (lgcVar2.a == 2 || (iZ0 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 || (qy5Var.E == 0 && qy5Var.F == 0)) {
                    return true;
                }
            }
        }
        return ((e84) this.S1).f(qy5Var) != 0;
    }

    @Override // defpackage.vj0
    public final void v() throws IllegalStateException {
        ((e84) this.S1).o();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    @Override // defpackage.g88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v0(defpackage.xw0 r14, defpackage.qy5 r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v78.v0(xw0, qy5):int");
    }

    @Override // defpackage.vj0
    public final void w() throws IllegalStateException {
        B0();
        e84 e84Var = (e84) this.S1;
        e84Var.Y = false;
        if (e84Var.l()) {
            o70 o70Var = e84Var.i;
            o70Var.d();
            if (o70Var.y == -9223372036854775807L) {
                m70 m70Var = o70Var.f;
                m70Var.getClass();
                m70Var.a();
            } else {
                o70Var.A = o70Var.b();
                if (!e84.m(e84Var.w)) {
                    return;
                }
            }
            e84Var.w.pause();
        }
    }

    public final int z0(qy5 qy5Var) {
        y50 y50VarE = ((e84) this.S1).e(qy5Var);
        if (!y50VarE.a) {
            return 0;
        }
        int i = y50VarE.b ? 1536 : 512;
        return y50VarE.c ? i | 2048 : i;
    }
}
