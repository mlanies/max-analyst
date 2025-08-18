package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class h74 implements m3b, hk8, mr4 {
    public final SparseArray X;
    public z23 Y;
    public u2 Z;
    public final rhe a;
    public final gue b;
    public final jue c;
    public final z23 o;
    public boolean s0;

    public h74(rhe rheVar) {
        rheVar.getClass();
        this.a = rheVar;
        int i = maf.a;
        Looper looperMyLooper = Looper.myLooper();
        this.Y = new z23(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, rheVar, new v64(7));
        gue gueVar = new gue();
        this.b = gueVar;
        this.c = new jue();
        z23 z23Var = new z23();
        z23Var.b = gueVar;
        ls5 ls5Var = zw6.b;
        z23Var.a = ffc.X;
        z23Var.c = kfc.s0;
        this.o = z23Var;
        this.X = new SparseArray();
    }

    @Override // defpackage.m3b
    public final void A(rb8 rb8Var, int i) {
        Q(e(), 1, new yv3(29));
    }

    @Override // defpackage.mr4
    public final void B(int i, xj8 xj8Var) {
        Q(O(i, xj8Var), 1027, new v64(15));
    }

    @Override // defpackage.m3b
    public final void C(o3b o3bVar, o3b o3bVar2, int i) {
        if (i == 1) {
            this.s0 = false;
        }
        u2 u2Var = this.Z;
        u2Var.getClass();
        z23 z23Var = this.o;
        z23Var.d = z23.d(u2Var, (zw6) z23Var.a, (xj8) z23Var.e, (gue) z23Var.b);
        Q(e(), 11, new v64(29));
    }

    @Override // defpackage.m3b
    public final void D(PlaybackException playbackException) {
        ce8 ce8Var;
        Q((!(playbackException instanceof ExoPlaybackException) || (ce8Var = ((ExoPlaybackException) playbackException).s0) == null) ? e() : J(new xj8(ce8Var)), 10, new v64(17));
    }

    @Override // defpackage.hk8
    public final void E(int i, xj8 xj8Var, pc8 pc8Var) {
        Q(O(i, xj8Var), 1004, new yv3(23));
    }

    @Override // defpackage.hk8
    public final void F(int i, xj8 xj8Var, pc8 pc8Var) {
        Q(O(i, xj8Var), 1005, new v64(25));
    }

    @Override // defpackage.m3b
    public final void G(sze szeVar, b0f b0fVar) {
        Q(e(), 2, new b74(1));
    }

    @Override // defpackage.m3b
    public final void H(j3b j3bVar) {
        Q(e(), 13, new v64(1));
    }

    @Override // defpackage.mr4
    public final void I(int i, xj8 xj8Var) {
        Q(O(i, xj8Var), 1025, new b74(20));
    }

    public final ed J(xj8 xj8Var) {
        this.Z.getClass();
        lue lueVar = xj8Var == null ? null : (lue) ((cx6) this.o.c).get(xj8Var);
        if (xj8Var != null && lueVar != null) {
            return L(lueVar, lueVar.h(xj8Var.a, this.b).c, xj8Var);
        }
        int iP0 = this.Z.p0();
        lue lueVarO1 = this.Z.O1();
        if (iP0 >= lueVarO1.p()) {
            lueVarO1 = lue.a;
        }
        return L(lueVarO1, iP0, null);
    }

    @Override // defpackage.mr4
    public final void K(int i, xj8 xj8Var) {
        Q(O(i, xj8Var), 1026, new b74(13));
    }

    public final ed L(lue lueVar, int i, xj8 xj8Var) {
        long jB0;
        xj8 xj8Var2 = lueVar.q() ? null : xj8Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = lueVar.equals(this.Z.O1()) && i == this.Z.p0();
        long jM = 0;
        if (xj8Var2 == null || !xj8Var2.a()) {
            if (z) {
                jB0 = this.Z.b0();
                return new ed(jElapsedRealtime, lueVar, i, xj8Var2, jB0, this.Z.O1(), this.Z.p0(), (xj8) this.o.d, this.Z.k(), this.Z.q());
            }
            if (!lueVar.q()) {
                jM = maf.M(lueVar.n(i, this.c, 0L).x0);
            }
        } else if (z && this.Z.o0() == xj8Var2.b && this.Z.O() == xj8Var2.c) {
            jM = this.Z.k();
        }
        jB0 = jM;
        return new ed(jElapsedRealtime, lueVar, i, xj8Var2, jB0, this.Z.O1(), this.Z.p0(), (xj8) this.o.d, this.Z.k(), this.Z.q());
    }

    @Override // defpackage.hk8
    public final void M(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        Q(O(i, xj8Var), MultiFileUploader.MSG_TRY_UPLOAD_NEXT, new yv3(18));
    }

    @Override // defpackage.hk8
    public final void N(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        Q(O(i, xj8Var), 1000, new v64(23));
    }

    public final ed O(int i, xj8 xj8Var) {
        this.Z.getClass();
        lue lueVar = lue.a;
        if (xj8Var != null) {
            return ((lue) ((cx6) this.o.c).get(xj8Var)) != null ? J(xj8Var) : L(lueVar, i, xj8Var);
        }
        lue lueVarO1 = this.Z.O1();
        if (i < lueVarO1.p()) {
            lueVar = lueVarO1;
        }
        return L(lueVar, i, null);
    }

    public final ed P() {
        return J((xj8) this.o.f);
    }

    public final void Q(ed edVar, int i, jm7 jm7Var) {
        this.X.put(i, edVar);
        this.Y.i(i, jm7Var);
    }

    public final void R(u2 u2Var, Looper looper) {
        np8.f(this.Z == null || ((zw6) this.o.a).isEmpty());
        u2Var.getClass();
        this.Z = u2Var;
        this.a.a(looper, null);
        z23 z23Var = this.Y;
        this.Y = new z23((CopyOnWriteArraySet) z23Var.d, looper, (rhe) z23Var.b, new q64(this, 0, u2Var));
    }

    @Override // defpackage.m3b
    public final void a(int i) {
        Q(e(), 6, new v64(19));
    }

    @Override // defpackage.hk8
    public final void b(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        Q(O(i, xj8Var), 1002, new b74(22));
    }

    @Override // defpackage.m3b
    public final void c(boolean z) {
        ed edVarE = e();
        Q(edVarE, 3, new b74(edVarE, z));
    }

    @Override // defpackage.m3b
    public final void d(int i, boolean z) {
        Q(e(), 5, new yv3(13));
    }

    public final ed e() {
        return J((xj8) this.o.d);
    }

    @Override // defpackage.m3b
    public final void f(float f) {
        Q(P(), 22, new b74(6));
    }

    @Override // defpackage.mr4
    public final void g(int i, xj8 xj8Var, Exception exc) {
        Q(O(i, xj8Var), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new v64(27));
    }

    @Override // defpackage.m3b
    public final void h(int i) {
        Q(e(), 4, new v64(6));
    }

    @Override // defpackage.m3b
    public final void i(int i, boolean z) {
        Q(e(), 30, new b74(10));
    }

    @Override // defpackage.m3b
    public final void j(boolean z) {
        Q(P(), 23, new b74(16));
    }

    @Override // defpackage.m3b
    public final void k(List list) {
        Q(e(), 27, new v64(16));
    }

    @Override // defpackage.m3b
    public final void l(int i, boolean z) {
        Q(e(), -1, new yv3(19));
    }

    @Override // defpackage.m3b
    public final void m(int i, int i2) {
        Q(P(), 24, new yv3(24));
    }

    @Override // defpackage.m3b
    public final void n(boolean z) {
        Q(e(), 7, new b74(24));
    }

    @Override // defpackage.m3b
    public final void o(si4 si4Var) {
        Q(e(), 29, new b74(8));
    }

    @Override // defpackage.m3b
    public final void onRepeatModeChanged(int i) {
        Q(e(), 8, new v64(12));
    }

    @Override // defpackage.m3b
    public final void p() {
        Q(e(), -1, new yv3(22));
    }

    @Override // defpackage.m3b
    public final void q(fd8 fd8Var) {
        Q(e(), 14, new yv3(15));
    }

    @Override // defpackage.m3b
    public final void r(PlaybackException playbackException) {
        ce8 ce8Var;
        ed edVarE = (!(playbackException instanceof ExoPlaybackException) || (ce8Var = ((ExoPlaybackException) playbackException).s0) == null) ? e() : J(new xj8(ce8Var));
        Q(edVarE, 10, new q64(edVarE, playbackException));
    }

    @Override // defpackage.m3b
    public final void s(e99 e99Var) {
        Q(e(), 28, new b74(11));
    }

    @Override // defpackage.m3b
    public final void t(r0f r0fVar) {
        Q(e(), 2, new yv3(26));
    }

    @Override // defpackage.hk8
    public final void u(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        ed edVarO = O(i, xj8Var);
        Q(edVarO, 1003, new t64(edVarO, xn7Var, pc8Var, iOException, z));
    }

    @Override // defpackage.mr4
    public final void v(int i, xj8 xj8Var) {
        Q(O(i, xj8Var), 1023, new b74(18));
    }

    @Override // defpackage.m3b
    public final void w(b3b b3bVar) {
        Q(e(), 12, new yv3(16));
    }

    @Override // defpackage.m3b
    public final void x(int i) {
        u2 u2Var = this.Z;
        u2Var.getClass();
        z23 z23Var = this.o;
        z23Var.d = z23.d(u2Var, (zw6) z23Var.a, (xj8) z23Var.e, (gue) z23Var.b);
        z23Var.j(u2Var.O1());
        Q(e(), 0, new b74(3));
    }

    @Override // defpackage.mr4
    public final void y(int i, xj8 xj8Var, int i2) {
        ed edVarO = O(i, xj8Var);
        Q(edVarO, 1022, new b74(edVarO, i2));
    }

    @Override // defpackage.m3b
    public final void z(ilf ilfVar) {
        ed edVarP = P();
        Q(edVarP, 25, new f74(edVarP, ilfVar));
    }
}
