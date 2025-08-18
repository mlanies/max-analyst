package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class x4b implements q3b {
    public k3b X;
    public final q3b a;
    public final Bundle b;
    public zw6 c;
    public z9d o;

    public x4b(u75 u75Var, ffc ffcVar, z9d z9dVar, k3b k3bVar, Bundle bundle) {
        this.a = u75Var;
        this.c = ffcVar;
        this.o = z9dVar;
        this.X = k3bVar;
        this.b = bundle;
    }

    @Override // defpackage.q3b
    public final long A() {
        A1();
        return this.a.A();
    }

    @Override // defpackage.q3b
    public final void A0(int i, tb8 tb8Var) {
        A1();
        a1(i, tb8Var);
    }

    public final void A1() {
        fm9.k(Looper.myLooper() == this.a.z1());
    }

    @Override // defpackage.q3b
    public final int B() {
        A1();
        return this.a.B();
    }

    public final jlf B0() {
        return this.a.C();
    }

    @Override // defpackage.q3b
    public final jlf C() {
        A1();
        return B0();
    }

    @Override // defpackage.q3b
    public final void C0(tb8 tb8Var) {
        A1();
        p1(tb8Var);
    }

    @Override // defpackage.q3b
    public final void D() {
        A1();
        j1();
    }

    @Override // defpackage.q3b
    public final void D0() {
        A1();
        M0();
    }

    @Override // defpackage.q3b
    public final void E() {
        A1();
        e1();
    }

    @Override // defpackage.q3b
    public final boolean E0() {
        A1();
        return this.a.E0();
    }

    @Override // defpackage.q3b
    public final h30 F() {
        A1();
        return this.a.F();
    }

    @Override // defpackage.q3b
    public final j0f F0() {
        A1();
        return y0();
    }

    public final p3b G() {
        boolean zT1 = t1(16);
        boolean zT12 = t1(17);
        return new p3b(null, zT12 ? p0() : 0, zT1 ? R0() : null, null, zT12 ? B() : 0, zT1 ? k() : 0L, zT1 ? b0() : 0L, zT1 ? o0() : -1, zT1 ? O() : -1);
    }

    @Override // defpackage.q3b
    public final long G0() {
        A1();
        return this.a.G0();
    }

    @Override // defpackage.q3b
    public final void H(int i, boolean z) {
        A1();
        k1(i, z);
    }

    @Override // defpackage.q3b
    public final void H0(int i, long j, List list) {
        A1();
        this.a.H0(i, j, list);
    }

    @Override // defpackage.q3b
    public final ui4 I() {
        A1();
        return this.a.I();
    }

    @Override // defpackage.q3b
    public final void I0(int i) {
        A1();
        m1(i);
    }

    @Override // defpackage.q3b
    public final void J() {
        A1();
        P();
    }

    @Override // defpackage.q3b
    public final void J0() {
        A1();
        g1();
    }

    public final qad K() {
        boolean zT1 = t1(16);
        return new qad(G(), zT1 && n(), SystemClock.elapsedRealtime(), zT1 ? c() : -9223372036854775807L, zT1 ? e0() : 0L, zT1 ? x() : 0, zT1 ? q() : 0L, zT1 ? p() : -9223372036854775807L, zT1 ? A() : -9223372036854775807L, zT1 ? G0() : 0L);
    }

    @Override // defpackage.q3b
    public final void K0() {
        A1();
        c1();
    }

    @Override // defpackage.q3b
    public final boolean K1() {
        A1();
        return this.a.K1();
    }

    @Override // defpackage.q3b
    public final void L(int i, int i2) {
        A1();
        o1(i, i2);
    }

    @Override // defpackage.q3b
    public final void L0() {
        A1();
        b1();
    }

    @Override // defpackage.q3b
    public final boolean M() {
        A1();
        return this.a.M();
    }

    public final void M0() {
        this.a.D0();
    }

    @Override // defpackage.q3b
    public final void N(int i) {
        A1();
        Q0(i);
    }

    @Override // defpackage.q3b
    public final gd8 N0() {
        A1();
        return this.a.N0();
    }

    @Override // defpackage.q3b
    public final int O() {
        A1();
        return this.a.O();
    }

    @Override // defpackage.q3b
    public final void O0(List list) {
        A1();
        this.a.O0(list);
    }

    public final void P() {
        this.a.J();
    }

    @Override // defpackage.q3b
    public final long P0() {
        A1();
        return this.a.P0();
    }

    @Override // defpackage.q3b
    public final void Q(j0f j0fVar) {
        A1();
        w1(j0fVar);
    }

    public final void Q0(int i) {
        this.a.N(i);
    }

    public final void R(int i) {
        this.a.g0(i);
    }

    @Override // defpackage.q3b
    public final tb8 R0() {
        A1();
        return this.a.R0();
    }

    @Override // defpackage.q3b
    public final void S(int i) {
        A1();
        Z0(i);
    }

    public final boolean S0() {
        return this.a.z0();
    }

    public final zz3 T() {
        return this.a.l0();
    }

    public final boolean T0() {
        return t1(23) && z0();
    }

    @Override // defpackage.q3b
    public final void U(int i, int i2) {
        A1();
        this.a.U(i, i2);
    }

    public final void U0(int i, int i2) {
        this.a.t0(i, i2);
    }

    @Override // defpackage.q3b
    public final void V() {
        A1();
        i1();
    }

    public final void V0() {
        this.a.pause();
    }

    public final tb8 W() {
        if (t1(16)) {
            return R0();
        }
        return null;
    }

    public final void W0() {
        this.a.prepare();
    }

    @Override // defpackage.q3b
    public final PlaybackException X() {
        A1();
        return this.a.X();
    }

    public final void X0() {
        this.a.release();
    }

    @Override // defpackage.q3b
    public final void Y(boolean z) {
        A1();
        this.a.Y(z);
    }

    public final void Y0(n3b n3bVar) {
        this.a.r0(new n06(this, n3bVar));
    }

    @Override // defpackage.q3b
    public final void Z(int i) {
        A1();
        f1(i);
    }

    public final void Z0(int i) {
        this.a.S(i);
    }

    @Override // defpackage.q3b
    public final boolean a() {
        A1();
        return this.a.a();
    }

    @Override // defpackage.q3b
    public final long a0() {
        A1();
        return this.a.a0();
    }

    public final void a1(int i, tb8 tb8Var) {
        this.a.A0(i, tb8Var);
    }

    @Override // defpackage.q3b
    public final boolean b() {
        A1();
        return this.a.b();
    }

    @Override // defpackage.q3b
    public final long b0() {
        A1();
        return this.a.b0();
    }

    public final void b1() {
        this.a.L0();
    }

    @Override // defpackage.q3b
    public final long c() {
        A1();
        return this.a.c();
    }

    public final mue c0() {
        return t1(17) ? x0() : t1(16) ? new w4b(this) : mue.a;
    }

    public final void c1() {
        this.a.K0();
    }

    @Override // defpackage.q3b
    public final c3b d() {
        A1();
        return this.a.d();
    }

    @Override // defpackage.q3b
    public final void d0(int i, List list) {
        A1();
        this.a.d0(i, list);
    }

    public final void d1(int i, long j) {
        this.a.r(i, j);
    }

    @Override // defpackage.q3b
    public final float e() {
        A1();
        return this.a.e();
    }

    @Override // defpackage.q3b
    public final long e0() {
        A1();
        return this.a.e0();
    }

    public final void e1() {
        this.a.E();
    }

    @Override // defpackage.q3b
    public final void f(c3b c3bVar) {
        A1();
        this.a.f(c3bVar);
    }

    @Override // defpackage.q3b
    public final void f0() {
        A1();
        h1();
    }

    public final void f1(int i) {
        this.a.Z(i);
    }

    @Override // defpackage.q3b
    public final void g(float f) {
        A1();
        this.a.g(f);
    }

    @Override // defpackage.q3b
    public final void g0(int i) {
        A1();
        R(i);
    }

    public final void g1() {
        this.a.J0();
    }

    @Override // defpackage.q3b
    public final int getPlaybackState() {
        A1();
        return this.a.getPlaybackState();
    }

    @Override // defpackage.q3b
    public final int getRepeatMode() {
        A1();
        return this.a.getRepeatMode();
    }

    public final void h(List list) {
        this.a.w0(list);
    }

    @Override // defpackage.q3b
    public final p0f h0() {
        A1();
        return this.a.h0();
    }

    public final void h1() {
        this.a.f0();
    }

    public final void i() {
        this.a.v();
    }

    public final gd8 i0() {
        return t1(18) ? N0() : gd8.J;
    }

    public final void i1() {
        this.a.V();
    }

    public final i3b j() {
        int i;
        PlaybackException playbackExceptionX = X();
        int iO = gf7.o(this);
        k3b k3bVarR = j47.R(this.X, s());
        long j = 128;
        int i2 = 0;
        while (true) {
            if (i2 >= k3bVarR.e()) {
                long jP = t1(17) ? gf7.p(p0()) : -1L;
                float f = d().a;
                float f2 = b() ? f : 0.0f;
                Bundle bundle = new Bundle();
                Bundle bundle2 = this.b;
                if (bundle2 != null && !bundle2.isEmpty()) {
                    bundle.putAll(bundle2);
                }
                bundle.putFloat("EXO_SPEED", f);
                tb8 tb8VarW = W();
                if (tb8VarW != null) {
                    String str = tb8VarW.a;
                    if (!"".equals(str)) {
                        bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str);
                    }
                }
                boolean zT1 = t1(16);
                long jK = zT1 ? k() : -1L;
                jE0 = zT1 ? e0() : 0L;
                g3b g3bVar = new g3b();
                g3bVar.h(iO, jK, f2, SystemClock.elapsedRealtime());
                g3bVar.c(j);
                g3bVar.d(jP);
                g3bVar.e(jE0);
                g3bVar.g(bundle);
                for (int i3 = 0; i3 < this.c.size(); i3++) {
                    c73 c73Var = (c73) this.c.get(i3);
                    y9d y9dVar = c73Var.a;
                    if (y9dVar != null && c73Var.h && y9dVar.a == 0 && c73.c(c73Var, this.o, this.X)) {
                        int i4 = c73Var.c;
                        Bundle bundle3 = y9dVar.c;
                        if (i4 != 0) {
                            Bundle bundle4 = new Bundle(bundle3);
                            bundle4.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", i4);
                            bundle3 = bundle4;
                        }
                        go9 go9Var = new go9(y9dVar.b, c73Var.f, c73Var.d);
                        go9Var.i(bundle3);
                        g3bVar.a(go9Var.c());
                    }
                }
                if (playbackExceptionX != null) {
                    int i5 = playbackExceptionX.a;
                    if (i5 == -110) {
                        i = 8;
                    } else if (i5 == -109) {
                        i = 11;
                    } else if (i5 != -6) {
                        i = 1;
                        if (i5 != -2) {
                            if (i5 != 1) {
                                switch (i5) {
                                    case -107:
                                        i = 9;
                                        break;
                                    case -106:
                                        i = 7;
                                        break;
                                    case -105:
                                        i = 6;
                                        break;
                                    case -104:
                                        i = 5;
                                        break;
                                    case -103:
                                        i = 4;
                                        break;
                                    case -102:
                                        i = 3;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                            } else {
                                i = 10;
                            }
                        }
                    } else {
                        i = 2;
                    }
                    g3bVar.f(i, playbackExceptionX.getMessage());
                }
                return g3bVar.b();
            }
            int iD = k3bVarR.d(i2);
            if (iD == 1) {
                jE0 = 518;
            } else if (iD == 2) {
                jE0 = PlaybackStateCompat.ACTION_PREPARE;
            } else if (iD == 3) {
                jE0 = 1;
            } else if (iD != 31) {
                switch (iD) {
                    case 5:
                        jE0 = 256;
                        break;
                    case 6:
                    case 7:
                        jE0 = 16;
                        break;
                    case 8:
                    case 9:
                        jE0 = 32;
                        break;
                    case 10:
                        jE0 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                        break;
                    case 11:
                        jE0 = 8;
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        jE0 = 64;
                        break;
                    case 13:
                        jE0 = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                        break;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        jE0 = 2621440;
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        jE0 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        break;
                }
            } else {
                jE0 = 240640;
            }
            j |= jE0;
            i2++;
        }
    }

    @Override // defpackage.q3b
    public final boolean j0() {
        A1();
        return this.a.j0();
    }

    public final void j1() {
        this.a.D();
    }

    @Override // defpackage.q3b
    public final long k() {
        A1();
        return this.a.k();
    }

    @Override // defpackage.q3b
    public final gd8 k0() {
        A1();
        return this.a.k0();
    }

    public final void k1(int i, boolean z) {
        this.a.H(i, z);
    }

    @Override // defpackage.q3b
    public final int l() {
        A1();
        return this.a.l();
    }

    @Override // defpackage.q3b
    public final zz3 l0() {
        A1();
        return T();
    }

    public final void l1(boolean z) {
        this.a.q0(z);
    }

    @Override // defpackage.q3b
    public final void m(Surface surface) {
        A1();
        this.a.m(surface);
    }

    @Override // defpackage.q3b
    public final void m0(h30 h30Var, boolean z) {
        this.a.m0(h30Var, z);
    }

    public final void m1(int i) {
        this.a.I0(i);
    }

    @Override // defpackage.q3b
    public final boolean n() {
        A1();
        return this.a.n();
    }

    @Override // defpackage.q3b
    public final void n0(gd8 gd8Var) {
        A1();
        s1(gd8Var);
    }

    @Override // defpackage.q3b
    public final boolean n1() {
        A1();
        return this.a.n1();
    }

    public final m4b o() {
        return new m4b(X(), 0, K(), G(), G(), 0, d(), getRepeatMode(), E0(), C(), c0(), 0, t1(18) ? k0() : gd8.J, t1(22) ? e() : 0.0f, t1(21) ? F() : h30.g, t1(28) ? l0() : zz3.c, I(), t1(23) ? l() : 0, T0(), u(), 1, v0(), getPlaybackState(), b(), a(), i0(), P0(), a0(), y(), t1(30) ? h0() : p0f.b, F0());
    }

    @Override // defpackage.q3b
    public final int o0() {
        A1();
        return this.a.o0();
    }

    public final void o1(int i, int i2) {
        this.a.L(i, i2);
    }

    @Override // defpackage.q3b
    public final long p() {
        A1();
        return this.a.p();
    }

    @Override // defpackage.q3b
    public final int p0() {
        A1();
        return this.a.p0();
    }

    public final void p1(tb8 tb8Var) {
        this.a.C0(tb8Var);
    }

    @Override // defpackage.q3b
    public final void pause() {
        A1();
        V0();
    }

    @Override // defpackage.q3b
    public final void play() {
        A1();
        this.a.play();
    }

    @Override // defpackage.q3b
    public final void prepare() {
        A1();
        W0();
    }

    @Override // defpackage.q3b
    public final long q() {
        A1();
        return this.a.q();
    }

    @Override // defpackage.q3b
    public final void q0(boolean z) {
        A1();
        l1(z);
    }

    public final void q1(tb8 tb8Var, long j) {
        this.a.t(tb8Var, j);
    }

    @Override // defpackage.q3b
    public final void r(int i, long j) {
        A1();
        d1(i, j);
    }

    @Override // defpackage.q3b
    public final void r0(n3b n3bVar) {
        A1();
        Y0(n3bVar);
    }

    public final void r1(float f) {
        this.a.setPlaybackSpeed(f);
    }

    @Override // defpackage.q3b
    public final void release() {
        A1();
        X0();
    }

    @Override // defpackage.q3b
    public final k3b s() {
        A1();
        return this.a.s();
    }

    @Override // defpackage.q3b
    public final void s0(List list, int i, int i2) {
        A1();
        this.a.s0(list, i, i2);
    }

    public final void s1(gd8 gd8Var) {
        this.a.n0(gd8Var);
    }

    @Override // defpackage.q3b
    public final void seekTo(long j) {
        A1();
        this.a.seekTo(j);
    }

    @Override // defpackage.q3b
    public final void setPlaybackSpeed(float f) {
        A1();
        r1(f);
    }

    @Override // defpackage.q3b
    public final void setRepeatMode(int i) {
        A1();
        u1(i);
    }

    @Override // defpackage.q3b
    public final void stop() {
        A1();
        x1();
    }

    @Override // defpackage.q3b
    public final void t(tb8 tb8Var, long j) {
        A1();
        q1(tb8Var, j);
    }

    @Override // defpackage.q3b
    public final void t0(int i, int i2) {
        A1();
        U0(i, i2);
    }

    @Override // defpackage.q3b
    public final boolean t1(int i) {
        A1();
        return this.a.t1(i);
    }

    @Override // defpackage.q3b
    public final boolean u() {
        A1();
        return this.a.u();
    }

    @Override // defpackage.q3b
    public final void u0(int i, int i2, int i3) {
        A1();
        this.a.u0(i, i2, i3);
    }

    public final void u1(int i) {
        this.a.setRepeatMode(i);
    }

    @Override // defpackage.q3b
    public final void v() {
        A1();
        i();
    }

    @Override // defpackage.q3b
    public final int v0() {
        A1();
        return this.a.v0();
    }

    public final void v1(boolean z) {
        this.a.w(z);
    }

    @Override // defpackage.q3b
    public final void w(boolean z) {
        A1();
        v1(z);
    }

    @Override // defpackage.q3b
    public final void w0(List list) {
        A1();
        h(list);
    }

    public final void w1(j0f j0fVar) {
        this.a.Q(j0fVar);
    }

    @Override // defpackage.q3b
    public final int x() {
        A1();
        return this.a.x();
    }

    @Override // defpackage.q3b
    public final mue x0() {
        A1();
        return this.a.x0();
    }

    public final void x1() {
        this.a.stop();
    }

    @Override // defpackage.q3b
    public final long y() {
        A1();
        return this.a.y();
    }

    public final j0f y0() {
        return this.a.F0();
    }

    @Override // defpackage.q3b
    public final boolean y1() {
        A1();
        return this.a.y1();
    }

    @Override // defpackage.q3b
    public final void z(n3b n3bVar) {
        A1();
        this.a.z(new n06(this, n3bVar));
    }

    @Override // defpackage.q3b
    public final boolean z0() {
        A1();
        return S0();
    }

    @Override // defpackage.q3b
    public final Looper z1() {
        return this.a.z1();
    }
}
