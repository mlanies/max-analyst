package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class a98 implements q3b {
    public final Handler X;
    public final long Y;
    public boolean Z;
    public final kue a;
    public boolean b;
    public final z88 c;
    public final y88 o;
    public final x88 s0;

    public a98(Context context, obd obdVar, Bundle bundle, y88 y88Var, Looper looper, i98 i98Var, imc imcVar) {
        z88 w98Var;
        fm9.i(context, "context must not be null");
        fm9.i(obdVar, "token must not be null");
        z04.J("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "]");
        this.a = new kue();
        this.Y = -9223372036854775807L;
        this.o = y88Var;
        this.X = new Handler(looper);
        this.s0 = i98Var;
        if (obdVar.a.e()) {
            imcVar.getClass();
            w98Var = new da8(context, this, obdVar, looper, imcVar);
        } else {
            w98Var = new w98(context, this, obdVar, bundle, looper);
        }
        this.c = w98Var;
        w98Var.connect();
    }

    @Override // defpackage.q3b
    public final long A() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.A();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.q3b
    public final void A0(int i, tb8 tb8Var) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.A0(i, tb8Var);
        } else {
            z04.c0("The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // defpackage.q3b
    public final int B() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.B();
        }
        return -1;
    }

    @Override // defpackage.q3b
    public final jlf C() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() ? z88Var.C() : jlf.e;
    }

    @Override // defpackage.q3b
    public final void C0(tb8 tb8Var) {
        K();
        fm9.i(tb8Var, "mediaItems must not be null");
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.C0(tb8Var);
        } else {
            z04.c0("The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final void D() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.D();
        } else {
            z04.c0("The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // defpackage.q3b
    public final void D0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.D0();
        } else {
            z04.c0("The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.q3b
    public final void E() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.E();
        } else {
            z04.c0("The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.q3b
    public final boolean E0() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() && z88Var.E0();
    }

    @Override // defpackage.q3b
    public final h30 F() {
        K();
        z88 z88Var = this.c;
        return !z88Var.isConnected() ? h30.g : z88Var.F();
    }

    @Override // defpackage.q3b
    public final j0f F0() {
        K();
        z88 z88Var = this.c;
        return !z88Var.isConnected() ? j0f.C : z88Var.F0();
    }

    public final void G(Runnable runnable) {
        oaf.W(this.X, runnable);
    }

    @Override // defpackage.q3b
    public final long G0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.G0();
        }
        return 0L;
    }

    @Override // defpackage.q3b
    public final void H(int i, boolean z) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.H(i, z);
        } else {
            z04.c0("The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.q3b
    public final void H0(int i, long j, List list) {
        K();
        fm9.i(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            fm9.e("items must not contain null, index=" + i2, list.get(i2) != null);
        }
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.H0(i, j, list);
        } else {
            z04.c0("The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final ui4 I() {
        K();
        z88 z88Var = this.c;
        return !z88Var.isConnected() ? ui4.e : z88Var.I();
    }

    @Override // defpackage.q3b
    public final void I0(int i) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.I0(i);
        } else {
            z04.c0("The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.q3b
    public final void J() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.J();
        } else {
            z04.c0("The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.q3b
    public final void J0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.J0();
        } else {
            z04.c0("The controller is not connected. Ignoring seekToNext().");
        }
    }

    public final void K() {
        fm9.j("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.X.getLooper());
    }

    @Override // defpackage.q3b
    public final void K0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.K0();
        } else {
            z04.c0("The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // defpackage.q3b
    public final boolean K1() {
        K();
        mue mueVarX0 = x0();
        return !mueVarX0.q() && mueVarX0.n(p0(), this.a, 0L).a();
    }

    @Override // defpackage.q3b
    public final void L(int i, int i2) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.L(i, i2);
        } else {
            z04.c0("The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.q3b
    public final void L0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.L0();
        } else {
            z04.c0("The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // defpackage.q3b
    public final boolean M() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() && z88Var.M();
    }

    @Override // defpackage.q3b
    public final void N(int i) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.N(i);
        } else {
            z04.c0("The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.q3b
    public final gd8 N0() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() ? z88Var.N0() : gd8.J;
    }

    @Override // defpackage.q3b
    public final int O() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.O();
        }
        return -1;
    }

    @Override // defpackage.q3b
    public final void O0(List list) {
        K();
        fm9.i(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            fm9.e("items must not contain null, index=" + i, list.get(i) != null);
        }
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.O0(list);
        } else {
            z04.c0("The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final long P0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.P0();
        }
        return 0L;
    }

    @Override // defpackage.q3b
    public final void Q(j0f j0fVar) {
        K();
        z88 z88Var = this.c;
        if (!z88Var.isConnected()) {
            z04.c0("The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        z88Var.Q(j0fVar);
    }

    @Override // defpackage.q3b
    public final tb8 R0() {
        mue mueVarX0 = x0();
        if (mueVarX0.q()) {
            return null;
        }
        return mueVarX0.n(p0(), this.a, 0L).c;
    }

    @Override // defpackage.q3b
    public final void S(int i) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.S(i);
        } else {
            z04.c0("The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // defpackage.q3b
    public final void U(int i, int i2) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.U(i, i2);
        } else {
            z04.c0("The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final void V() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.V();
        } else {
            z04.c0("The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // defpackage.q3b
    public final PlaybackException X() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.X();
        }
        return null;
    }

    @Override // defpackage.q3b
    public final void Y(boolean z) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.Y(z);
        }
    }

    @Override // defpackage.q3b
    public final void Z(int i) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.Z(i);
        } else {
            z04.c0("The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.q3b
    public final boolean a() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() && z88Var.a();
    }

    @Override // defpackage.q3b
    public final long a0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.a0();
        }
        return 0L;
    }

    @Override // defpackage.q3b
    public final boolean b() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() && z88Var.b();
    }

    @Override // defpackage.q3b
    public final long b0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.b0();
        }
        return 0L;
    }

    @Override // defpackage.q3b
    public final long c() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.c();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.q3b
    public final c3b d() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() ? z88Var.d() : c3b.d;
    }

    @Override // defpackage.q3b
    public final void d0(int i, List list) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.d0(i, list);
        } else {
            z04.c0("The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final float e() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.e();
        }
        return 1.0f;
    }

    @Override // defpackage.q3b
    public final long e0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.e0();
        }
        return 0L;
    }

    @Override // defpackage.q3b
    public final void f(c3b c3bVar) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.f(c3bVar);
        } else {
            z04.c0("The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // defpackage.q3b
    public final void f0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.f0();
        } else {
            z04.c0("The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // defpackage.q3b
    public final void g(float f) {
        K();
        fm9.e("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.g(f);
        } else {
            z04.c0("The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // defpackage.q3b
    public final void g0(int i) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.g0(i);
        } else {
            z04.c0("The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.q3b
    public final int getPlaybackState() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.getPlaybackState();
        }
        return 1;
    }

    @Override // defpackage.q3b
    public final int getRepeatMode() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.getRepeatMode();
        }
        return 0;
    }

    public final int h() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.T0();
        }
        return -1;
    }

    @Override // defpackage.q3b
    public final p0f h0() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() ? z88Var.h0() : p0f.b;
    }

    public final int i() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.R0();
        }
        return -1;
    }

    public final void j() {
        fm9.k(Looper.myLooper() == this.X.getLooper());
        fm9.k(!this.Z);
        this.Z = true;
        i98 i98Var = (i98) this.s0;
        i98Var.u0 = true;
        a98 a98Var = i98Var.t0;
        if (a98Var != null) {
            i98Var.l(a98Var);
        }
    }

    @Override // defpackage.q3b
    public final boolean j0() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() && z88Var.j0();
    }

    @Override // defpackage.q3b
    public final long k() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.k();
        }
        return 0L;
    }

    @Override // defpackage.q3b
    public final gd8 k0() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() ? z88Var.k0() : gd8.J;
    }

    @Override // defpackage.q3b
    public final int l() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.l();
        }
        return 0;
    }

    @Override // defpackage.q3b
    public final zz3 l0() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() ? z88Var.l0() : zz3.c;
    }

    @Override // defpackage.q3b
    public final void m(Surface surface) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.m(surface);
        } else {
            z04.c0("The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override // defpackage.q3b
    public final void m0(h30 h30Var, boolean z) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.m0(h30Var, z);
        } else {
            z04.c0("The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // defpackage.q3b
    public final boolean n() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() && z88Var.n();
    }

    @Override // defpackage.q3b
    public final void n0(gd8 gd8Var) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.n0(gd8Var);
        } else {
            z04.c0("The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // defpackage.q3b
    public final boolean n1() {
        K();
        mue mueVarX0 = x0();
        return !mueVarX0.q() && mueVarX0.n(p0(), this.a, 0L).h;
    }

    public final void o(pj3 pj3Var) {
        fm9.k(Looper.myLooper() == this.X.getLooper());
        pj3Var.accept(this.o);
    }

    @Override // defpackage.q3b
    public final int o0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.o0();
        }
        return -1;
    }

    @Override // defpackage.q3b
    public final long p() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.p();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.q3b
    public final int p0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.p0();
        }
        return -1;
    }

    @Override // defpackage.q3b
    public final void pause() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.pause();
        } else {
            z04.c0("The controller is not connected. Ignoring pause().");
        }
    }

    @Override // defpackage.q3b
    public final void play() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.play();
        } else {
            z04.c0("The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.q3b
    public final void prepare() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.prepare();
        } else {
            z04.c0("The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // defpackage.q3b
    public final long q() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.q();
        }
        return 0L;
    }

    @Override // defpackage.q3b
    public final void q0(boolean z) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.q0(z);
        } else {
            z04.c0("The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.q3b
    public final void r(int i, long j) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.r(i, j);
        } else {
            z04.c0("The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.q3b
    public final void r0(n3b n3bVar) {
        K();
        fm9.i(n3bVar, "listener must not be null");
        this.c.r0(n3bVar);
    }

    @Override // defpackage.q3b
    public final void release() {
        K();
        if (this.b) {
            return;
        }
        z04.J("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "] [" + nc8.b() + "]");
        this.b = true;
        Handler handler = this.X;
        handler.removeCallbacksAndMessages(null);
        try {
            this.c.release();
        } catch (Exception e) {
            z04.s(e, "Exception while releasing impl");
        }
        if (this.Z) {
            fm9.k(Looper.myLooper() == handler.getLooper());
            this.o.onDisconnected();
        } else {
            this.Z = true;
            i98 i98Var = (i98) this.s0;
            i98Var.getClass();
            i98Var.m(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // defpackage.q3b
    public final k3b s() {
        K();
        z88 z88Var = this.c;
        return !z88Var.isConnected() ? k3b.b : z88Var.s();
    }

    @Override // defpackage.q3b
    public final void s0(List list, int i, int i2) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.s0(list, i, i2);
        } else {
            z04.c0("The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final void seekTo(long j) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.seekTo(j);
        } else {
            z04.c0("The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.q3b
    public final void setPlaybackSpeed(float f) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.setPlaybackSpeed(f);
        } else {
            z04.c0("The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // defpackage.q3b
    public final void setRepeatMode(int i) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.setRepeatMode(i);
        } else {
            z04.c0("The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // defpackage.q3b
    public final void stop() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.stop();
        } else {
            z04.c0("The controller is not connected. Ignoring stop().");
        }
    }

    @Override // defpackage.q3b
    public final void t(tb8 tb8Var, long j) {
        K();
        fm9.i(tb8Var, "mediaItems must not be null");
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.t(tb8Var, j);
        } else {
            z04.c0("The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.q3b
    public final void t0(int i, int i2) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.t0(i, i2);
        } else {
            z04.c0("The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override // defpackage.q3b
    public final boolean t1(int i) {
        return s().a(i);
    }

    @Override // defpackage.q3b
    public final boolean u() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() && z88Var.u();
    }

    @Override // defpackage.q3b
    public final void u0(int i, int i2, int i3) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.u0(i, i2, i3);
        } else {
            z04.c0("The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final void v() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.v();
        } else {
            z04.c0("The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final int v0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.v0();
        }
        return 0;
    }

    @Override // defpackage.q3b
    public final void w(boolean z) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.w(z);
        } else {
            z04.c0("The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // defpackage.q3b
    public final void w0(List list) {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            z88Var.w0(list);
        } else {
            z04.c0("The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.q3b
    public final int x() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.x();
        }
        return 0;
    }

    @Override // defpackage.q3b
    public final mue x0() {
        K();
        z88 z88Var = this.c;
        return z88Var.isConnected() ? z88Var.x0() : mue.a;
    }

    @Override // defpackage.q3b
    public final long y() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.y();
        }
        return 0L;
    }

    @Override // defpackage.q3b
    public final boolean y1() {
        K();
        mue mueVarX0 = x0();
        return !mueVarX0.q() && mueVarX0.n(p0(), this.a, 0L).i;
    }

    @Override // defpackage.q3b
    public final void z(n3b n3bVar) {
        this.c.z(n3bVar);
    }

    @Override // defpackage.q3b
    public final boolean z0() {
        K();
        z88 z88Var = this.c;
        if (z88Var.isConnected()) {
            return z88Var.z0();
        }
        return false;
    }

    @Override // defpackage.q3b
    public final Looper z1() {
        return this.X.getLooper();
    }
}
