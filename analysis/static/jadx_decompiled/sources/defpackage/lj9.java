package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class lj9 extends u2 implements ol9, jk9, slf, ve8, ue8 {
    public k20 A0;
    public g8c B0;
    public iq1 C0;
    public sd7 D0;
    public sd7 E0;
    public sd7 F0;
    public long G0;
    public long H0;
    public boolean I0;
    public final hle X;
    public final ef7 Y;
    public final o20 Z;
    public final we8 c;
    public final dlf o;
    public final au8 s0;
    public final m7b t0;
    public final kj9 u0;
    public final o45 v0;
    public final ti4 w0;
    public cu8 x0;
    public l20 y0;
    public hkf z0;

    /* JADX WARN: Multi-variable type inference failed */
    public lj9(pl9 pl9Var, we8 we8Var, dlf dlfVar, hle hleVar, ef7 ef7Var, o20 o20Var, au8 au8Var, m7b m7bVar, kj9 kj9Var, o45 o45Var, ti4 ti4Var, boolean z, boolean z2) {
        super(0, pl9Var);
        this.c = we8Var;
        this.o = dlfVar;
        this.X = hleVar;
        this.Y = ef7Var;
        this.Z = o20Var;
        this.s0 = au8Var;
        this.t0 = m7bVar;
        this.u0 = kj9Var;
        this.v0 = o45Var;
        this.w0 = ti4Var;
        hkf hkfVar = new hkf();
        bq7 bq7Var = (bq7) we8Var;
        hkfVar.e = bq7Var.l();
        hkfVar.a = z;
        hkfVar.d = z2;
        this.z0 = new hkf(hkfVar);
        ((v2) pl9Var).r(this);
        bq7Var.e = this;
    }

    @Override // defpackage.jk9
    public final boolean B0(int i, KeyEvent keyEvent) {
        boolean zC2 = c2();
        we8 we8Var = this.c;
        if (zC2 || !((bq7) we8Var).l()) {
            bq7 bq7Var = (bq7) we8Var;
            if (bq7Var.c()) {
                if (i != 24 && i != 25) {
                    return false;
                }
                ef7 ef7Var = this.Y;
                if (ef7Var.get() != null) {
                    ((ad) ef7Var.get()).f("ENABLE_VIDEO_AUTO_PLAY_SOUND_BY_VOLUME_BUTTON");
                }
                bq7Var.t(1.0f);
                hkf hkfVarA = this.z0.a();
                hkfVarA.e = true;
                hkf hkfVar = new hkf(hkfVarA);
                this.z0 = hkfVar;
                ((pl9) ((kk9) this.b)).d(hkfVar);
                g8c g8cVar = this.B0;
                if (g8cVar != null) {
                    ef7 ef7Var2 = (ef7) g8cVar.e;
                    if (ef7Var2.get() != null) {
                        ((ad) ef7Var2.get()).d(1, "SWITCH_AUDIO_MODE");
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ve8
    public final void D1(Throwable th) {
        hm9.k("lj9", "onPlaybackError");
        g8c g8cVar = this.B0;
        if (g8cVar != null) {
            g8cVar.d(th);
        }
        hkf hkfVarA = this.z0.a();
        hkfVarA.b = false;
        hkfVarA.c = false;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        kj9 kj9Var = this.u0;
        if (kj9Var == null) {
            return;
        }
        k20 k20Var = this.A0;
        if (k20Var != null) {
            String str = k20Var.h;
            if (!oag.t(str)) {
                kj9Var.k(str);
                return;
            }
        }
        kj9Var.Y(th);
    }

    @Override // defpackage.jk9
    public final void F1() {
        g8c g8cVar = this.B0;
        if (g8cVar == null) {
            return;
        }
        String str = g8cVar.b == 2 ? "message" : "viewer";
        ef7 ef7Var = (ef7) g8cVar.e;
        if (ef7Var.get() != null) {
            ((ad) ef7Var.get()).g("ACTION_PIP_OPEN", str);
        }
        e2();
    }

    @Override // defpackage.slf
    public final void G(Surface surface) {
        ((bq7) this.c).r(surface);
    }

    @Override // defpackage.ol9
    public final void H1() {
        hm9.n("lj9", "onPauseClick");
        pause();
        kj9 kj9Var = this.u0;
        if (kj9Var != null) {
            kj9Var.r(true);
        }
        f2(true);
    }

    @Override // defpackage.ol9
    public final void I1() {
        hm9.n("lj9", "onPipClick");
        kj9 kj9Var = this.u0;
        if (kj9Var != null) {
            kj9Var.n();
        }
        f2(true);
    }

    @Override // defpackage.ol9
    public final void J1() {
        hm9.n("lj9", "onFullScreenClick");
        kj9 kj9Var = this.u0;
        if (kj9Var != null) {
            kj9Var.s();
        }
        f2(false);
    }

    @Override // defpackage.ve8
    public final void K() {
        hm9.n("lj9", "onTrackChanged");
        n2();
        hkf hkfVarA = this.z0.a();
        hkfVarA.r = c2();
        hkfVarA.j = ((bq7) this.c).g();
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        kj9 kj9Var = this.u0;
        if (kj9Var != null) {
            kj9Var.K();
        }
    }

    @Override // defpackage.slf
    public final int M0() {
        if (b2()) {
            return ((bq7) this.c).h();
        }
        return 0;
    }

    @Override // defpackage.ve8
    public final void P(int i, int i2, int i3) {
        ((pl9) ((kk9) this.b)).a(i, i2);
        kj9 kj9Var = this.u0;
        if (kj9Var != null) {
            kj9Var.P(i, i2, i3);
        }
    }

    @Override // defpackage.slf
    public final int R() {
        if (b2()) {
            return ((bq7) this.c).j();
        }
        return 0;
    }

    @Override // defpackage.ol9
    public final void S0() {
        hm9.n("lj9", "onPlayClick");
        g8c g8cVar = this.B0;
        if (g8cVar != null) {
            hm9.n("g8c", "sendVideoPlayToggleStat");
            g8cVar.e(null, "play_toggle");
        }
        we8 we8Var = this.c;
        ((bq7) we8Var).o();
        we8Var.getClass();
        kj9 kj9Var = this.u0;
        if (kj9Var != null) {
            kj9Var.r(true);
        }
        f2(false);
    }

    @Override // defpackage.ol9
    public final void T() {
        hm9.k("lj9", "onVideoViewClick");
        kj9 kj9Var = this.u0;
        if (kj9Var == null) {
            return;
        }
        kj9Var.T();
    }

    @Override // defpackage.ol9
    public final void V0() {
        hm9.n("lj9", "onCloseClick");
        kj9 kj9Var = this.u0;
        if (kj9Var == null) {
            return;
        }
        kj9Var.G();
    }

    @Override // defpackage.ol9
    public final void W() {
        hm9.k("lj9", "onVideoViewLongClick");
        kj9 kj9Var = this.u0;
        if (kj9Var == null) {
            return;
        }
        kj9Var.W();
    }

    @Override // defpackage.ve8
    public final void W0() {
        hm9.n("lj9", "onMediaPlayerControllerDetach");
        e2();
    }

    @Override // defpackage.jk9
    public final void X0() {
        if (this.B0 == null) {
            return;
        }
        bq7 bq7Var = (bq7) this.c;
        bq7Var.n();
        g8c g8cVar = this.B0;
        String str = g8cVar.b == 2 ? "message" : "pip";
        ef7 ef7Var = (ef7) g8cVar.e;
        if (ef7Var.get() != null) {
            ((ad) ef7Var.get()).g("ACTION_FULLSCREEN_OPEN", str);
        }
        e2();
        if (b2()) {
            bq7Var.r(null);
        }
    }

    @Override // defpackage.ol9
    public final void Y0(long j) {
        we8 we8Var = this.c;
        ((bq7) we8Var).q(j);
        hkf hkfVarA = this.z0.a();
        bq7 bq7Var = (bq7) we8Var;
        hkfVarA.k = bq7Var.f();
        hkfVarA.l = bq7Var.d();
        hkfVarA.q = null;
        hkfVarA.p = null;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
    }

    @Override // defpackage.ol9
    public final void Z0() {
        this.I0 = true;
        m2();
        l2();
    }

    public final void Z1(l20 l20Var, long j, cu8 cu8Var, int i, boolean z) {
        we8 we8Var = this.c;
        ((bq7) we8Var).j = z;
        hm9.m("lj9", "Bind attach %s", l20Var.r);
        this.I0 = false;
        this.H0 = System.currentTimeMillis();
        cqc.b(this.C0);
        m2();
        l2();
        cqc.b(this.F0);
        this.y0 = l20Var;
        this.G0 = j;
        k20 k20Var = s5c.P(l20Var) ? l20Var.j.d.d : l20Var.d;
        this.A0 = k20Var;
        this.x0 = cu8Var;
        kk9 kk9Var = (kk9) this.b;
        if (k20Var == null) {
            d2(new FetcherException(11, "Video is null"));
            hkf hkfVarA = this.z0.a();
            hkfVarA.b = false;
            hkfVarA.c = false;
            hkfVarA.h = false;
            hkf hkfVar = new hkf(hkfVarA);
            this.z0 = hkfVar;
            ((pl9) kk9Var).d(hkfVar);
            return;
        }
        m7b m7bVar = this.t0;
        boolean zQ = s5c.Q(m7bVar, k20Var);
        if (zQ) {
            cqc.b(this.F0);
            r0a r0aVarN = qy9.l(1L, TimeUnit.SECONDS).n(ce.a());
            sd7 sd7Var = new sd7(new ij9(this, 3), new hj8(29), ft.d);
            r0aVarN.a(sd7Var);
            this.F0 = sd7Var;
        }
        Uri uriA = this.Z.a(l20Var);
        hkf hkfVarA2 = this.z0.a();
        hkfVarA2.e = ((bq7) we8Var).l();
        hkfVarA2.f = false;
        k20 k20Var2 = this.A0;
        hkfVarA2.g = k20Var2.g;
        hkfVarA2.h = s5c.a0(m7bVar, k20Var2);
        hkfVarA2.i = zQ;
        k20 k20Var3 = this.A0;
        hkfVarA2.j = k20Var3.c;
        hkfVarA2.k = k20Var3.k;
        hkfVarA2.n = null;
        hkfVarA2.o = k20Var3;
        hkfVarA2.p = null;
        hkfVarA2.q = uriA;
        c2();
        hkfVarA2.s = true;
        hkfVarA2.t = false;
        hkfVarA2.r = true;
        hkf hkfVar2 = new hkf(hkfVarA2);
        this.z0 = hkfVar2;
        ((pl9) kk9Var).d(hkfVar2);
        hkf hkfVarA3 = this.z0.a();
        hkfVarA3.p = null;
        hkfVarA3.q = null;
        hkf hkfVar3 = new hkf(hkfVarA3);
        this.z0 = hkfVar3;
        ((pl9) kk9Var).d(hkfVar3);
        we8Var.getClass();
        k20 k20Var4 = this.A0;
        this.B0 = new g8c(k20Var4.a, i, k20Var4.i, this.Y);
        if (zQ) {
            return;
        }
        i2();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a2() {
        /*
            r8 = this;
            we8 r8 = r8.c
            bq7 r8 = (defpackage.bq7) r8
            fef r0 = r8.f
            if (r0 != 0) goto Le
            java.util.List r8 = java.util.Collections.emptyList()
            goto L78
        Le:
            u65 r8 = r8.b
            kad r8 = r8.b
            java.lang.Object r0 = r8.b
            zpd r0 = (defpackage.zpd) r0
            r0.Z1()
            t75 r0 = r0.c
            r0.s2()
            z2b r0 = r0.k1
            l0f r0 = r0.i
            java.lang.Object r0 = r0.X
            m85[] r0 = (defpackage.m85[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r2
        L2a:
            if (r3 >= r1) goto L4b
            if (r3 < r1) goto L30
        L2e:
            r5 = r2
            goto L3b
        L30:
            r5 = r0[r3]
            boolean r6 = r5 instanceof defpackage.m85
            if (r6 != 0) goto L37
            goto L2e
        L37:
            oy5 r5 = r5.j()
        L3b:
            if (r5 != 0) goto L3e
            goto L48
        L3e:
            java.lang.String r6 = r5.w0
            int r6 = defpackage.ha9.g(r6)
            r7 = 2
            if (r6 != r7) goto L48
            r4 = r5
        L48:
            int r3 = r3 + 1
            goto L2a
        L4b:
            if (r4 != 0) goto L52
            java.util.List r8 = java.util.Collections.emptyList()
            goto L78
        L52:
            java.lang.Object r8 = r8.o
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L5a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r8.next()
            mze r0 = (defpackage.mze) r0
            lze r1 = r0.a
            boolean r1 = defpackage.kad.a(r1, r4)
            if (r1 == 0) goto L5a
            r2 = r0
        L6f:
            if (r2 != 0) goto L76
            java.util.List r8 = java.util.Collections.emptyList()
            goto L78
        L76:
            java.util.List r8 = r2.b
        L78:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj9.a2():java.util.List");
    }

    @Override // defpackage.u2, defpackage.q3b
    public final boolean b() {
        if (b2()) {
            return ((bq7) this.c).k();
        }
        return false;
    }

    public final boolean b2() {
        return ((bq7) this.c).g == this;
    }

    @Override // defpackage.q3b
    public final long c() {
        if (b2()) {
            return ((bq7) this.c).g();
        }
        return 0L;
    }

    @Override // defpackage.jk9
    public final boolean c0() {
        if (!b2()) {
            return false;
        }
        bq7 bq7Var = (bq7) this.c;
        if (bq7Var.f == null) {
            return false;
        }
        u65 u65Var = bq7Var.b;
        zpd zpdVar = u65Var.a;
        lue lueVarO1 = zpdVar.O1();
        return (!lueVarO1.q() && lueVarO1.n(zpdVar.p0(), (jue) zpdVar.b, 0L).t0) || u65Var.v() == -9223372036854775807L;
    }

    @Override // defpackage.ue8
    public final void c1() {
        hm9.n("lj9", "onMediaPlayerControllerOwnerChanged");
        if (this.y0 == null) {
            return;
        }
        g2();
        this.c.getClass();
        h2();
        o();
    }

    public final boolean c2() {
        j20 j20Var;
        k20 k20Var = this.A0;
        return !(k20Var == null || (j20Var = k20Var.l) == null || !j20Var.d) || ((bq7) this.c).e() == lze.u0;
    }

    @Override // defpackage.ve8
    public final void d1() {
        hm9.k("lj9", "onVolumeChange");
        hkf hkfVarA = this.z0.a();
        hkfVarA.e = ((bq7) this.c).l();
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
    }

    public final void d2(Throwable th) {
        k20 k20Var;
        g8c g8cVar = this.B0;
        if (g8cVar != null) {
            g8cVar.d(th);
        }
        hkf hkfVarA = this.z0.a();
        hkfVarA.b = false;
        hkfVarA.c = false;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        kj9 kj9Var = this.u0;
        if (kj9Var == null || (k20Var = this.A0) == null) {
            return;
        }
        String str = k20Var.h;
        if (this.o.a(th) || this.A0 == null || oag.t(str)) {
            kj9Var.Y(th);
        } else {
            kj9Var.k(str);
        }
    }

    @Override // defpackage.ol9
    public final void e1() {
        hm9.k("lj9", "onSettingsClick");
        kj9 kj9Var = this.u0;
        if (kj9Var == null) {
            return;
        }
        kj9Var.L();
    }

    public final void e2() {
        if (b2()) {
            this.c.getClass();
            h2();
            g2();
        }
    }

    @Override // defpackage.slf
    public final void f1() {
        if (b2()) {
            we8 we8Var = this.c;
            if (((bq7) we8Var).k()) {
                we8Var.getClass();
                h2();
            }
        }
    }

    public final void f2(boolean z) {
        cu8 cu8Var;
        l20 l20Var;
        if (!((bq7) this.c).c.q() || (cu8Var = this.x0) == null || (l20Var = this.y0) == null) {
            return;
        }
        au8 au8Var = this.s0;
        au8Var.getClass();
        au8Var.t(cu8Var, l20Var.r, new l01(z, 11));
    }

    @Override // defpackage.ol9
    public final void g1() {
        hm9.n("lj9", "onSoundClick");
        if (c2()) {
            ((cba) this.v0).c(new HandledException(new IllegalStateException("Receive onSoundClick but video is muted")), true);
            return;
        }
        bq7 bq7Var = (bq7) this.c;
        if (bq7Var.l()) {
            bq7Var.t(0.0f);
        } else {
            bq7Var.t(1.0f);
        }
        boolean zL = bq7Var.l();
        ef7 ef7Var = this.Y;
        if (ef7Var.get() != null) {
            ((ad) ef7Var.get()).d(zL ? 1 : 0, "VIDEO_AUTO_PLAY_SOUND_CLICK");
        }
    }

    public final void g2() {
        l20 l20Var;
        cu8 cu8Var;
        hm9.n("lj9", "saveVideoPosition");
        if (c0()) {
            return;
        }
        long jK = k();
        long jC = c();
        if ((jK <= 0 && jC <= 0) || (l20Var = this.y0) == null || (cu8Var = this.x0) == null) {
            return;
        }
        boolean zC0 = c0();
        au8 au8Var = this.s0;
        au8Var.getClass();
        au8Var.t(cu8Var, l20Var.r, new zt8(jK, jC, zC0));
    }

    @Override // defpackage.ve8
    public final void h() {
        hm9.n("lj9", "onVideoPaused");
        m2();
        l2();
        cqc.b(this.F0);
        hkf hkfVarA = this.z0.a();
        hkfVarA.b = false;
        hkfVarA.c = false;
        hkfVarA.a = true;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        kj9 kj9Var = this.u0;
        if (kj9Var != null) {
            kj9Var.h();
            kj9Var.r(true);
        }
    }

    public final void h2() {
        pl9 pl9Var;
        BitmapDrawable bitmapDrawableE;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        hm9.n("lj9", "saveVideoScreenShot");
        if (this.y0 == null || c0()) {
            return;
        }
        long jK = k();
        long jC = c();
        if (jK > 0 || jC > 0) {
            l20 l20Var = this.y0;
            o20 o20Var = this.Z;
            HashMap map = o20Var.d;
            String str = l20Var.r;
            if (map.containsKey(str) && Math.abs(((Number) map.get(str)).longValue() - jK) <= 50) {
                return;
            }
            vi4 vi4VarB = this.w0.b();
            vi4VarB.getClass();
            if (vi4VarB == vi4.c || (bitmapDrawableE = (pl9Var = (pl9) ((kk9) this.b)).e()) == null) {
                return;
            }
            l20 l20Var2 = this.y0;
            Bitmap bitmap = bitmapDrawableE.getBitmap();
            o20Var.d.put(l20Var2.r, Long.valueOf(jK));
            y00 y00Var = o20Var.b;
            y00Var.getClass();
            rqd rqdVar = new rqd(new rqd(new q1a(1, new u00(y00Var, l20Var2, bitmap, i3)).h(new xw0(23)).m(y00Var.e).i(((jle) y00Var.a).b()), new w00(y00Var, l20Var2, i3), i), new x00(y00Var), i2);
            hc3 hc3Var = y00Var.f;
            Objects.requireNonNull(hc3Var);
            ync yncVar = new ync(5, hc3Var);
            iq1 iq1Var = new iq1(new y7g(o20Var, 3, l20Var2), 2, ft.f);
            Objects.requireNonNull(iq1Var, "observer is null");
            try {
                rqdVar.k(new td(iq1Var, 15, yncVar));
                o20Var.h.a(iq1Var);
                hkf hkfVarA = this.z0.a();
                hkfVarA.p = bitmapDrawableE;
                hkf hkfVar = new hkf(hkfVarA);
                this.z0 = hkfVar;
                pl9Var.d(hkfVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                c37.B(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    @Override // defpackage.ve8
    public final void i() {
        hm9.n("lj9", "onVideoPlay");
        we8 we8Var = this.c;
        boolean zK = ((bq7) we8Var).k();
        hkf hkfVarA = this.z0.a();
        hkfVarA.b = zK;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        if (zK) {
            k2();
            we8Var.getClass();
            j2();
        }
        kj9 kj9Var = this.u0;
        if (kj9Var == null) {
            return;
        }
        kj9Var.i();
    }

    @Override // defpackage.ve8
    public final void i0() {
        hm9.k("lj9", "onRenderedFirstFrame");
        g8c g8cVar = this.B0;
        if (g8cVar != null) {
            long j = this.H0;
            g8cVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            g8cVar.e(Long.valueOf(jCurrentTimeMillis), "first_frame");
            hm9.m("g8c", "sendVideoFirstFrameStat: %d", Long.valueOf(jCurrentTimeMillis));
            g8cVar.e(null, "play");
        }
        j1();
    }

    @Override // defpackage.slf
    public final int i1() {
        if (b2()) {
            return ((bq7) this.c).i();
        }
        return 0;
    }

    public final void i2() {
        cqc.b(this.C0);
        if (this.y0 == null || this.x0 == null) {
            return;
        }
        hkf hkfVarA = this.z0.a();
        hkfVarA.c = true;
        hkfVarA.b = ((bq7) this.c).j;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        uqd uqdVarC = this.o.c(this.y0, this.G0, this.x0.c);
        jle jleVar = (jle) this.X;
        drd drdVarI = uqdVarC.m(jleVar.a()).i(jleVar.b());
        iq1 iq1Var = new iq1(new ij9(this, 1), 2, new ij9(this, 2));
        drdVarI.k(iq1Var);
        this.C0 = iq1Var;
    }

    @Override // defpackage.slf
    public final int j() {
        fef fefVar;
        if (b2() && (fefVar = ((bq7) this.c).f) != null) {
            return fefVar.j();
        }
        return 0;
    }

    @Override // defpackage.ve8
    public final void j1() {
        hm9.k("lj9", "onPlaybackPrepared");
        we8 we8Var = this.c;
        boolean zK = ((bq7) we8Var).k();
        hkf hkfVarA = this.z0.a();
        hkfVarA.b = zK;
        hkfVarA.t = true;
        hkfVarA.c = false;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        if (zK) {
            k2();
            we8Var.getClass();
            j2();
        }
    }

    public final void j2() {
        l2();
        if (this.z0.a) {
            r0a r0aVarN = qy9.l(2L, TimeUnit.SECONDS).n(ce.a());
            sd7 sd7Var = new sd7(new ij9(this, 0), new hj8(28), ft.d);
            r0aVarN.a(sd7Var);
            this.E0 = sd7Var;
        }
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long k() {
        if (b2()) {
            return ((bq7) this.c).f();
        }
        return 0L;
    }

    @Override // defpackage.jk9
    public final void k1(boolean z) {
        hkf hkfVar = this.z0;
        if (z != hkfVar.a) {
            hkf hkfVarA = hkfVar.a();
            hkfVarA.a = z;
            hkf hkfVar2 = new hkf(hkfVarA);
            this.z0 = hkfVar2;
            ((pl9) ((kk9) this.b)).d(hkfVar2);
            kj9 kj9Var = this.u0;
            if (kj9Var != null) {
                kj9Var.r(z);
            }
        }
        if (!z) {
            l2();
        } else if (this.z0.b) {
            this.c.getClass();
            j2();
        }
    }

    public final void k2() {
        m2();
        if (this.I0) {
            return;
        }
        r0a r0aVarN = qy9.l(100L, TimeUnit.MILLISECONDS).n(ce.a());
        sd7 sd7Var = new sd7(new ij9(this, 4), new jj9(0), ft.d);
        r0aVarN.a(sd7Var);
        this.D0 = sd7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jk9
    public final void l1(boolean z) {
        hm9.n("lj9", "Release");
        g8c g8cVar = this.B0;
        if (g8cVar != null) {
            hm9.m("g8c", "sendVideoStopStat userAction: %s", Boolean.valueOf(z));
            g8cVar.e(z ? "user" : "scroll", "stop");
        }
        cqc.b(this.C0);
        m2();
        l2();
        cqc.b(this.F0);
        e2();
        this.y0 = null;
        this.x0 = null;
        this.B0 = null;
        this.G0 = 0L;
        this.I0 = false;
        if (b2()) {
            we8 we8Var = this.c;
            we8Var.getClass();
            bq7 bq7Var = (bq7) we8Var;
            bq7Var.u();
            bq7Var.e = null;
            bq7Var.r(null);
            bq7Var.g = null;
        }
        pl9 pl9Var = (pl9) ((kk9) this.b);
        ((Set) ((v2) pl9Var).a).remove(this);
        pl9Var.release();
    }

    public final void l2() {
        cqc.b(this.E0);
    }

    @Override // defpackage.ol9
    public final void m1(int i) {
        this.I0 = false;
        long j = i;
        we8 we8Var = this.c;
        bq7 bq7Var = (bq7) we8Var;
        bq7Var.q(j);
        hkf hkfVarA = this.z0.a();
        bq7 bq7Var2 = (bq7) we8Var;
        hkfVarA.k = bq7Var2.f();
        hkfVarA.l = bq7Var2.d();
        hkfVarA.q = null;
        hkfVarA.p = null;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        if (bq7Var.k()) {
            k2();
            we8Var.getClass();
            j2();
        }
    }

    public final void m2() {
        cqc.b(this.D0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n2() {
        /*
            r3 = this;
            we8 r0 = r3.c
            r1 = r0
            bq7 r1 = (defpackage.bq7) r1
            fef r2 = r1.f
            if (r2 != 0) goto Le
            java.util.List r1 = java.util.Collections.emptyList()
            goto L16
        Le:
            u65 r1 = r1.b
            kad r1 = r1.b
            java.lang.Object r1 = r1.o
            java.util.List r1 = (java.util.List) r1
        L16:
            int r1 = r1.size()
            r2 = 1
            if (r1 <= r2) goto L40
            r0.getClass()
            bq7 r0 = (defpackage.bq7) r0
            fef r1 = r0.f
            if (r1 != 0) goto L29
            mze r0 = defpackage.mze.c
            goto L31
        L29:
            u65 r0 = r0.b
            kad r0 = r0.b
            mze r0 = r0.b()
        L31:
            mze r1 = defpackage.mze.c
            if (r0 == r1) goto L40
            lze r0 = r0.a
            int r1 = r0.o
            int r0 = r0.X
            mqb r0 = defpackage.j1e.H(r1, r0)
            goto L41
        L40:
            r0 = 0
        L41:
            hkf r1 = r3.z0
            hkf r1 = r1.a()
            r2 = 0
            r1.f = r2
            r1.m = r0
            hkf r0 = new hkf
            r0.<init>(r1)
            r3.z0 = r0
            java.lang.Object r3 = r3.b
            kk9 r3 = (defpackage.kk9) r3
            pl9 r3 = (defpackage.pl9) r3
            r3.d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj9.n2():void");
    }

    @Override // defpackage.ve8
    public final void o() {
        hm9.k("lj9", "onPlaybackEnded");
        m2();
        l2();
        hkf hkfVarA = this.z0.a();
        hkfVarA.b = false;
        hkfVarA.c = false;
        hkfVarA.a = true;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        kj9 kj9Var = this.u0;
        if (kj9Var == null) {
            return;
        }
        kj9Var.X();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final void pause() {
        hm9.k("lj9", "Pause");
        if (b2()) {
            g8c g8cVar = this.B0;
            we8 we8Var = this.c;
            if (g8cVar != null) {
                long jF = ((bq7) we8Var).f();
                g8cVar.getClass();
                long j = jF > 0 ? jF / 1000 : 0L;
                hm9.m("g8c", "sendVideoPauseStat: %d", Long.valueOf(j));
                g8cVar.e(Long.valueOf(j), "pause");
            }
            ((bq7) we8Var).n();
            we8Var.getClass();
        }
    }

    @Override // defpackage.jk9
    public final View u1() {
        View view = (View) ((v2) ((pl9) ((kk9) this.b))).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }

    @Override // defpackage.ve8
    public final void y0() {
        hm9.k("lj9", "onPlaybackBuffering");
        hkf hkfVarA = this.z0.a();
        hkfVarA.c = true;
        hkf hkfVar = new hkf(hkfVarA);
        this.z0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
    }
}
