package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class i74 implements n3b, ik8, nr4 {
    public final SparseArray X;
    public pm7 Y;
    public q3b Z;
    public final she a;
    public final hue b;
    public final kue c;
    public final ai3 o;
    public bie s0;
    public boolean t0;

    public i74(she sheVar) {
        sheVar.getClass();
        this.a = sheVar;
        this.Y = new pm7(oaf.w(), sheVar, new v64(2));
        hue hueVar = new hue();
        this.b = hueVar;
        this.c = new kue();
        ai3 ai3Var = new ai3();
        ai3Var.a = hueVar;
        ls5 ls5Var = zw6.b;
        ai3Var.b = ffc.X;
        ai3Var.c = kfc.s0;
        this.o = ai3Var;
        this.X = new SparseArray();
    }

    @Override // defpackage.ik8
    public final void A(int i, yj8 yj8Var, pc8 pc8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1005, new g74(fdVarE, pc8Var, 0));
    }

    public final fd B(mue mueVar, int i, yj8 yj8Var) {
        long jB0;
        yj8 yj8Var2 = mueVar.q() ? null : yj8Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = mueVar.equals(this.Z.x0()) && i == this.Z.p0();
        long jH0 = 0;
        if (yj8Var2 == null || !yj8Var2.b()) {
            if (z) {
                jB0 = this.Z.b0();
                return new fd(jElapsedRealtime, mueVar, i, yj8Var2, jB0, this.Z.x0(), this.Z.p0(), (yj8) this.o.o, this.Z.k(), this.Z.q());
            }
            if (!mueVar.q()) {
                jH0 = oaf.h0(mueVar.n(i, this.c, 0L).l);
            }
        } else if (z && this.Z.o0() == yj8Var2.b && this.Z.O() == yj8Var2.c) {
            jH0 = this.Z.k();
        }
        jB0 = jH0;
        return new fd(jElapsedRealtime, mueVar, i, yj8Var2, jB0, this.Z.x0(), this.Z.p0(), (yj8) this.o.o, this.Z.k(), this.Z.q());
    }

    @Override // defpackage.nr4
    public final void C(int i, yj8 yj8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1026, new w64(fdVarE, 4));
    }

    @Override // defpackage.nr4
    public final void D(int i, yj8 yj8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1023, new w64(fdVarE, 6));
    }

    public final fd E(int i, yj8 yj8Var) {
        this.Z.getClass();
        if (yj8Var != null) {
            return ((mue) ((cx6) this.o.c).get(yj8Var)) != null ? g(yj8Var) : B(mue.a, i, yj8Var);
        }
        mue mueVarX0 = this.Z.x0();
        if (i >= mueVarX0.p()) {
            mueVarX0 = mue.a;
        }
        return B(mueVarX0, i, null);
    }

    public final fd F() {
        return g((yj8) this.o.Y);
    }

    @Override // defpackage.n3b
    public final void G(int i, tb8 tb8Var) {
        fd fdVarB = b();
        I(fdVarB, 1, new s64(fdVarB, tb8Var, i));
    }

    @Override // defpackage.nr4
    public final void H(int i, yj8 yj8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1027, new w64(fdVarE, 3));
    }

    public final void I(fd fdVar, int i, km7 km7Var) {
        this.X.put(i, fdVar);
        this.Y.f(i, km7Var);
    }

    public final void J(q3b q3bVar, Looper looper) {
        fm9.k(this.Z == null || ((zw6) this.o.b).isEmpty());
        this.Z = q3bVar;
        this.s0 = this.a.a(looper, null);
        pm7 pm7Var = this.Y;
        this.Y = new pm7(pm7Var.d, looper, pm7Var.a, new f9(this, 25, q3bVar), pm7Var.i);
    }

    @Override // defpackage.ik8
    public final void L(int i, yj8 yj8Var, pc8 pc8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1004, new g74(fdVarE, pc8Var, 1));
    }

    @Override // defpackage.n3b
    public final void O(boolean z) {
        fd fdVarB = b();
        I(fdVarB, 9, new p64(fdVarB, z, 2));
    }

    @Override // defpackage.n3b
    public final void S(zz3 zz3Var) {
        I(b(), 27, new v64(20));
    }

    @Override // defpackage.n3b
    public final void X(p0f p0fVar) {
        fd fdVarB = b();
        I(fdVarB, 2, new f9(fdVarB, 27, p0fVar));
    }

    @Override // defpackage.n3b
    public final void Y(q3b q3bVar, l3b l3bVar) {
    }

    @Override // defpackage.n3b
    public final void a(int i) {
        fd fdVarB = b();
        I(fdVarB, 6, new s64(fdVarB, i, 0));
    }

    @Override // defpackage.n3b
    public final void a0(long j) {
        I(b(), 16, new b74(14));
    }

    public final fd b() {
        return g((yj8) this.o.o);
    }

    @Override // defpackage.n3b
    public final void b0(gd8 gd8Var) {
        I(b(), 14, new b74(7));
    }

    @Override // defpackage.n3b
    public final void c(boolean z) {
        fd fdVarB = b();
        I(fdVarB, 3, new p64(fdVarB, z, 3));
    }

    @Override // defpackage.n3b
    public final void c0(gd8 gd8Var) {
        I(b(), 15, new b74(5));
    }

    @Override // defpackage.n3b
    public final void d(int i, boolean z) {
        fd fdVarB = b();
        I(fdVarB, 5, new u64(fdVarB, z, i));
    }

    @Override // defpackage.n3b
    public final void d0(long j) {
        I(b(), 17, new b74(17));
    }

    @Override // defpackage.ik8
    public final void e(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1003, new t64(fdVarE, yn7Var, pc8Var, iOException, z));
    }

    @Override // defpackage.n3b
    public final void f(float f) {
        fd fdVarF = F();
        I(fdVarF, 22, new c74(fdVarF, f));
    }

    @Override // defpackage.n3b
    public final void f0(mue mueVar, int i) {
        q3b q3bVar = this.Z;
        q3bVar.getClass();
        ai3 ai3Var = this.o;
        ai3Var.o = ai3.d(q3bVar, (zw6) ai3Var.b, (yj8) ai3Var.X, (hue) ai3Var.a);
        ai3Var.i(q3bVar.x0());
        fd fdVarB = b();
        I(fdVarB, 0, new s64(fdVarB, i, 5));
    }

    public final fd g(yj8 yj8Var) {
        this.Z.getClass();
        mue mueVar = yj8Var == null ? null : (mue) ((cx6) this.o.c).get(yj8Var);
        if (yj8Var != null && mueVar != null) {
            return B(mueVar, mueVar.h(yj8Var.a, this.b).c, yj8Var);
        }
        int iP0 = this.Z.p0();
        mue mueVarX0 = this.Z.x0();
        if (iP0 >= mueVarX0.p()) {
            mueVarX0 = mue.a;
        }
        return B(mueVarX0, iP0, null);
    }

    @Override // defpackage.n3b
    public final void h(int i) {
        fd fdVarB = b();
        I(fdVarB, 4, new s64(fdVarB, i, 2));
    }

    @Override // defpackage.n3b
    public final void i(int i, boolean z) {
        I(b(), 30, new yv3(28));
    }

    @Override // defpackage.n3b
    public final void i0() {
    }

    @Override // defpackage.n3b
    public final void j(boolean z) {
        fd fdVarF = F();
        I(fdVarF, 23, new p64(fdVarF, z, 1));
    }

    @Override // defpackage.n3b
    public final void k(List list) {
        I(b(), 27, new v64(0));
    }

    @Override // defpackage.n3b
    public final void l(int i, boolean z) {
        I(b(), -1, new yv3(17));
    }

    @Override // defpackage.n3b
    public final void m(int i, int i2) {
        fd fdVarF = F();
        I(fdVarF, 24, new a74(i, i2, fdVarF));
    }

    @Override // defpackage.n3b
    public final void n(boolean z) {
        fd fdVarB = b();
        I(fdVarB, 7, new p64(fdVarB, z, 0));
    }

    @Override // defpackage.n3b
    public final void o(boolean z) {
    }

    @Override // defpackage.n3b
    public final void onRepeatModeChanged(int i) {
        fd fdVarB = b();
        I(fdVarB, 8, new s64(fdVarB, i, 3));
    }

    @Override // defpackage.n3b
    public final void p(int i) {
    }

    @Override // defpackage.n3b
    public final void p0(c3b c3bVar) {
        fd fdVarB = b();
        I(fdVarB, 12, new f9(fdVarB, 24, c3bVar));
    }

    @Override // defpackage.n3b
    public final void q(p3b p3bVar, p3b p3bVar2, int i) {
        if (i == 1) {
            this.t0 = false;
        }
        q3b q3bVar = this.Z;
        q3bVar.getClass();
        ai3 ai3Var = this.o;
        ai3Var.o = ai3.d(q3bVar, (zw6) ai3Var.b, (yj8) ai3Var.X, (hue) ai3Var.a);
        fd fdVarB = b();
        I(fdVarB, 11, new id0(fdVarB, i, p3bVar, p3bVar2));
    }

    @Override // defpackage.n3b
    public final void q0(k3b k3bVar) {
        I(b(), 13, new b74(0));
    }

    @Override // defpackage.ik8
    public final void r(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1002, new b74(fdVarE, yn7Var, pc8Var, 21));
    }

    @Override // defpackage.n3b
    public final void r0(PlaybackException playbackException) {
        yj8 yj8Var;
        I((!(playbackException instanceof ExoPlaybackException) || (yj8Var = ((ExoPlaybackException) playbackException).z0) == null) ? b() : g(yj8Var), 10, new yv3(27));
    }

    @Override // defpackage.nr4
    public final void s(int i, yj8 yj8Var, Exception exc) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new d74(fdVarE, 2, exc));
    }

    @Override // defpackage.n3b
    public final void s0(f99 f99Var) {
        fd fdVarB = b();
        I(fdVarB, 28, new f9(fdVarB, 26, f99Var));
    }

    @Override // defpackage.ik8
    public final void t(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, new b74(fdVarE, yn7Var, pc8Var, 23));
    }

    @Override // defpackage.n3b
    public final void t0(ui4 ui4Var) {
        I(b(), 29, new v64(8));
    }

    @Override // defpackage.n3b
    public final void u(h30 h30Var) {
        fd fdVarF = F();
        I(fdVarF, 20, new d74(fdVarF, 0, h30Var));
    }

    @Override // defpackage.n3b
    public final void u0(long j) {
        I(b(), 18, new b74(15));
    }

    @Override // defpackage.n3b
    public final void v(jlf jlfVar) {
        fd fdVarF = F();
        I(fdVarF, 25, new d74(fdVarF, 1, jlfVar));
    }

    @Override // defpackage.nr4
    public final void w(int i, yj8 yj8Var, int i2) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1022, new s64(fdVarE, i2, 4));
    }

    @Override // defpackage.ik8
    public final void x(int i, yj8 yj8Var, yn7 yn7Var, pc8 pc8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1000, new b74(fdVarE, yn7Var, pc8Var, 19));
    }

    @Override // defpackage.n3b
    public final void x0(PlaybackException playbackException) {
        yj8 yj8Var;
        fd fdVarB = (!(playbackException instanceof ExoPlaybackException) || (yj8Var = ((ExoPlaybackException) playbackException).z0) == null) ? b() : g(yj8Var);
        I(fdVarB, 10, new f9(fdVarB, 28, playbackException));
    }

    @Override // defpackage.n3b
    public final void y(j0f j0fVar) {
        I(b(), 19, new v64(26));
    }

    @Override // defpackage.nr4
    public final void z(int i, yj8 yj8Var) {
        fd fdVarE = E(i, yj8Var);
        I(fdVarE, 1025, new w64(fdVarE, 5));
    }
}
