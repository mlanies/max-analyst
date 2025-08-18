package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class g85 implements Handler.Callback, xd8, k0f, uk8, gc4, o4b {
    public static final long f1 = oaf.h0(WorkRequest.MIN_BACKOFF_MILLIS);
    public final ArrayList A0;
    public final she B0;
    public final i75 C0;
    public final ge8 D0;
    public final vk8 E0;
    public final cc4 F0;
    public final long G0;
    public final j4b H0;
    public x1d I0;
    public a3b J0;
    public b85 K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public long P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public int W0;
    public final l0f X;
    public e85 X0;
    public final pn7 Y;
    public long Y0;
    public final hg0 Z;
    public long Z0;
    public final vj0[] a;
    public int a1;
    public final Set b;
    public boolean b1;
    public final vj0[] c;
    public ExoPlaybackException c1;
    public long d1;
    public y65 e1;
    public final hz7 o;
    public final bie s0;
    public final HandlerThread t0;
    public final Looper u0;
    public final kue v0;
    public final hue w0;
    public final long x0;
    public final boolean y0;
    public final dk z0;

    public g85(vj0[] vj0VarArr, hz7 hz7Var, l0f l0fVar, pn7 pn7Var, hg0 hg0Var, int i, boolean z, i74 i74Var, x1d x1dVar, cc4 cc4Var, long j, Looper looper, she sheVar, i75 i75Var, j4b j4bVar) {
        y65 y65Var = y65.a;
        this.C0 = i75Var;
        this.a = vj0VarArr;
        this.o = hz7Var;
        this.X = l0fVar;
        this.Y = pn7Var;
        this.Z = hg0Var;
        this.R0 = i;
        this.S0 = z;
        this.I0 = x1dVar;
        this.F0 = cc4Var;
        this.G0 = j;
        this.M0 = false;
        this.B0 = sheVar;
        this.H0 = j4bVar;
        this.e1 = y65Var;
        this.d1 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.x0 = pn7Var.f();
        this.y0 = pn7Var.a();
        fue fueVar = mue.a;
        a3b a3bVarI = a3b.i(l0fVar);
        this.J0 = a3bVarI;
        this.K0 = new b85(a3bVarI);
        this.c = new vj0[vj0VarArr.length];
        cf4 cf4Var = (cf4) hz7Var;
        cf4Var.getClass();
        for (int i2 = 0; i2 < vj0VarArr.length; i2++) {
            vj0 vj0Var = vj0VarArr[i2];
            vj0Var.X = i2;
            vj0Var.Y = j4bVar;
            vj0Var.Z = sheVar;
            vj0[] vj0VarArr2 = this.c;
            vj0Var.getClass();
            vj0VarArr2[i2] = vj0Var;
            vj0 vj0Var2 = this.c[i2];
            synchronized (vj0Var2.a) {
                vj0Var2.B0 = cf4Var;
            }
        }
        this.z0 = new dk(this, sheVar);
        this.A0 = new ArrayList();
        this.b = ngg.B();
        this.v0 = new kue();
        this.w0 = new hue();
        hz7Var.a = this;
        hz7Var.b = hg0Var;
        this.b1 = true;
        bie bieVarA = sheVar.a(looper, null);
        this.D0 = new ge8(i74Var, bieVarA, new q64(23, this));
        this.E0 = new vk8(this, i74Var, bieVarA, j4bVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.t0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.u0 = looper2;
        this.s0 = sheVar.a(looper2, this);
    }

    public static Pair F(mue mueVar, e85 e85Var, boolean z, int i, boolean z2, kue kueVar, hue hueVar) {
        Pair pairJ;
        int iG;
        mue mueVar2 = e85Var.a;
        if (mueVar.q()) {
            return null;
        }
        mue mueVar3 = mueVar2.q() ? mueVar : mueVar2;
        try {
            pairJ = mueVar3.j(kueVar, hueVar, e85Var.b, e85Var.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (mueVar.equals(mueVar3)) {
            return pairJ;
        }
        if (mueVar.b(pairJ.first) != -1) {
            return (mueVar3.h(pairJ.first, hueVar).f && mueVar3.n(hueVar.c, kueVar, 0L).n == mueVar3.b(pairJ.first)) ? mueVar.j(kueVar, hueVar, mueVar.h(pairJ.first, hueVar).c, e85Var.c) : pairJ;
        }
        if (z && (iG = G(kueVar, hueVar, i, z2, pairJ.first, mueVar3, mueVar)) != -1) {
            return mueVar.j(kueVar, hueVar, iG, -9223372036854775807L);
        }
        return null;
    }

    public static int G(kue kueVar, hue hueVar, int i, boolean z, Object obj, mue mueVar, mue mueVar2) {
        Object obj2 = mueVar.n(mueVar.h(obj, hueVar).c, kueVar, 0L).a;
        for (int i2 = 0; i2 < mueVar2.p(); i2++) {
            if (mueVar2.n(i2, kueVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = mueVar.b(obj);
        int i3 = mueVar.i();
        int iD = iB;
        int iB2 = -1;
        for (int i4 = 0; i4 < i3 && iB2 == -1; i4++) {
            iD = mueVar.d(iD, hueVar, kueVar, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = mueVar2.b(mueVar.m(iD));
        }
        if (iB2 == -1) {
            return -1;
        }
        return mueVar2.g(iB2, hueVar, false).c;
    }

    public static void M(vj0 vj0Var, long j) {
        vj0Var.y0 = true;
        if (vj0Var instanceof xpe) {
            xpe xpeVar = (xpe) vj0Var;
            fm9.k(xpeVar.y0);
            xpeVar.V0 = j;
        }
    }

    public static boolean q(vj0 vj0Var) {
        return vj0Var.s0 != 0;
    }

    public final void A() throws ExoPlaybackException {
        float f = this.z0.mo1d().a;
        ge8 ge8Var = this.D0;
        be8 be8Var = ge8Var.i;
        be8 be8Var2 = ge8Var.j;
        l0f l0fVar = null;
        be8 be8Var3 = be8Var;
        boolean z = true;
        while (be8Var3 != null && be8Var3.d) {
            l0f l0fVarH = be8Var3.h(f, this.J0.a);
            l0f l0fVar2 = be8Var3 == this.D0.i ? l0fVarH : l0fVar;
            l0f l0fVar3 = be8Var3.n;
            if (l0fVar3 != null) {
                int length = ((n85[]) l0fVar3.X).length;
                n85[] n85VarArr = (n85[]) l0fVarH.X;
                if (length == n85VarArr.length) {
                    for (int i = 0; i < n85VarArr.length; i++) {
                        if (l0fVarH.G(l0fVar3, i)) {
                        }
                    }
                    if (be8Var3 == be8Var2) {
                        z = false;
                    }
                    be8Var3 = be8Var3.l;
                    l0fVar = l0fVar2;
                }
            }
            if (z) {
                ge8 ge8Var2 = this.D0;
                be8 be8Var4 = ge8Var2.i;
                boolean zL = ge8Var2.l(be8Var4);
                boolean[] zArr = new boolean[this.a.length];
                l0fVar2.getClass();
                long jA = be8Var4.a(l0fVar2, this.J0.s, zL, zArr);
                a3b a3bVar = this.J0;
                boolean z2 = (a3bVar.e == 4 || jA == a3bVar.s) ? false : true;
                a3b a3bVar2 = this.J0;
                this.J0 = o(a3bVar2.b, jA, a3bVar2.c, a3bVar2.d, z2, 5);
                if (z2) {
                    D(jA);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    vj0[] vj0VarArr = this.a;
                    if (i2 >= vj0VarArr.length) {
                        break;
                    }
                    vj0 vj0Var = vj0VarArr[i2];
                    boolean zQ = q(vj0Var);
                    zArr2[i2] = zQ;
                    grc grcVar = be8Var4.c[i2];
                    if (zQ) {
                        if (grcVar != vj0Var.t0) {
                            b(vj0Var);
                        } else if (zArr[i2]) {
                            long j = this.Y0;
                            vj0Var.y0 = false;
                            vj0Var.w0 = j;
                            vj0Var.x0 = j;
                            vj0Var.r(j, false);
                        }
                    }
                    i2++;
                }
                d(zArr2, this.Y0);
            } else {
                this.D0.l(be8Var3);
                if (be8Var3.d) {
                    be8Var3.a(l0fVarH, Math.max(be8Var3.f.b, this.Y0 - be8Var3.o), false, new boolean[be8Var3.i.length]);
                }
            }
            k(true);
            if (this.J0.e != 4) {
                s();
                e0();
                this.s0.f(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf A[PHI: r5 r6 r8
      0x00bf: PHI (r5v4 yj8) = (r5v3 yj8), (r5v13 yj8) binds: [B:32:0x0093, B:34:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r6v2 long) = (r6v1 long), (r6v25 long) binds: [B:32:0x0093, B:34:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:32:0x0093, B:34:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        be8 be8Var = this.D0.i;
        this.N0 = be8Var != null && be8Var.f.h && this.M0;
    }

    public final void D(long j) {
        be8 be8Var = this.D0.i;
        long j2 = j + (be8Var == null ? 1000000000000L : be8Var.o);
        this.Y0 = j2;
        ((fh8) this.z0.o).a(j2);
        for (vj0 vj0Var : this.a) {
            if (q(vj0Var)) {
                long j3 = this.Y0;
                vj0Var.y0 = false;
                vj0Var.w0 = j3;
                vj0Var.x0 = j3;
                vj0Var.r(j3, false);
            }
        }
        for (be8 be8Var2 = r0.i; be8Var2 != null; be8Var2 = be8Var2.l) {
            for (n85 n85Var : (n85[]) be8Var2.n.X) {
                if (n85Var != null) {
                    n85Var.n();
                }
            }
        }
    }

    public final void E(mue mueVar, mue mueVar2) {
        if (mueVar.q() && mueVar2.q()) {
            return;
        }
        ArrayList arrayList = this.A0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            au1.r(arrayList.get(size));
            throw null;
        }
    }

    public final void H(long j) {
        this.s0.a.sendEmptyMessageAtTime(2, j + ((this.J0.e != 3 || X()) ? f1 : 1000L));
    }

    public final void I(boolean z) throws ExoPlaybackException {
        yj8 yj8Var = this.D0.i.f.a;
        long jK = K(yj8Var, this.J0.s, true, false);
        if (jK != this.J0.s) {
            a3b a3bVar = this.J0;
            this.J0 = o(yj8Var, jK, a3bVar.c, a3bVar.d, z, 5);
        }
    }

    public final void J(e85 e85Var) throws Throwable {
        long j;
        long j2;
        boolean z;
        yj8 yj8Var;
        long j3;
        long j4;
        long j5;
        a3b a3bVar;
        int i;
        this.K0.d(1);
        Pair pairF = F(this.J0.a, e85Var, true, this.R0, this.S0, this.v0, this.w0);
        if (pairF == null) {
            Pair pairG = g(this.J0.a);
            yj8Var = (yj8) pairG.first;
            long jLongValue = ((Long) pairG.second).longValue();
            z = !this.J0.a.q();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairF.first;
            long jLongValue2 = ((Long) pairF.second).longValue();
            long j6 = e85Var.c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            yj8 yj8VarN = this.D0.n(this.J0.a, obj, jLongValue2);
            if (yj8VarN.b()) {
                this.J0.a.h(yj8VarN.a, this.w0);
                j = this.w0.f(yj8VarN.b) == yj8VarN.c ? this.w0.g.c : 0L;
                j2 = j6;
                yj8Var = yj8VarN;
                z = true;
            } else {
                j = jLongValue2;
                j2 = j6;
                z = e85Var.c == -9223372036854775807L;
                yj8Var = yj8VarN;
            }
        }
        try {
            if (this.J0.a.q()) {
                this.X0 = e85Var;
            } else {
                if (pairF != null) {
                    if (yj8Var.equals(this.J0.b)) {
                        be8 be8Var = this.D0.i;
                        long jH = (be8Var == null || !be8Var.d || j == 0) ? j : be8Var.a.h(j, this.I0);
                        if (oaf.h0(jH) == oaf.h0(this.J0.s) && ((i = (a3bVar = this.J0).e) == 2 || i == 3)) {
                            long j7 = a3bVar.s;
                            this.J0 = o(yj8Var, j7, j2, j7, z, 2);
                            return;
                        }
                        j4 = jH;
                    } else {
                        j4 = j;
                    }
                    boolean z2 = this.J0.e == 4;
                    ge8 ge8Var = this.D0;
                    long jK = K(yj8Var, j4, ge8Var.i != ge8Var.j, z2);
                    z |= j != jK;
                    try {
                        a3b a3bVar2 = this.J0;
                        mue mueVar = a3bVar2.a;
                        f0(mueVar, yj8Var, mueVar, a3bVar2.b, j2, true);
                        j5 = jK;
                        this.J0 = o(yj8Var, j5, j2, j5, z, 2);
                    } catch (Throwable th) {
                        th = th;
                        j3 = jK;
                        this.J0 = o(yj8Var, j3, j2, j3, z, 2);
                        throw th;
                    }
                }
                if (this.J0.e != 1) {
                    W(4);
                }
                B(false, true, false, true);
            }
            j5 = j;
            this.J0 = o(yj8Var, j5, j2, j5, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
        }
    }

    public final long K(yj8 yj8Var, long j, boolean z, boolean z2) throws ExoPlaybackException {
        b0();
        g0(false, true);
        if (z2 || this.J0.e == 3) {
            W(2);
        }
        ge8 ge8Var = this.D0;
        be8 be8Var = ge8Var.i;
        be8 be8Var2 = be8Var;
        while (be8Var2 != null && !yj8Var.equals(be8Var2.f.a)) {
            be8Var2 = be8Var2.l;
        }
        if (z || be8Var != be8Var2 || (be8Var2 != null && be8Var2.o + j < 0)) {
            vj0[] vj0VarArr = this.a;
            for (vj0 vj0Var : vj0VarArr) {
                b(vj0Var);
            }
            if (be8Var2 != null) {
                while (ge8Var.i != be8Var2) {
                    ge8Var.a();
                }
                ge8Var.l(be8Var2);
                be8Var2.o = 1000000000000L;
                d(new boolean[vj0VarArr.length], ge8Var.j.e());
            }
        }
        if (be8Var2 != null) {
            ge8Var.l(be8Var2);
            if (!be8Var2.d) {
                be8Var2.f = be8Var2.f.b(j);
            } else if (be8Var2.e) {
                zd8 zd8Var = be8Var2.a;
                j = zd8Var.l(j);
                zd8Var.s(j - this.x0, this.y0);
            }
            D(j);
            s();
        } else {
            ge8Var.b();
            D(j);
        }
        k(false);
        this.s0.f(2);
        return j;
    }

    public final void L(s4b s4bVar) {
        Looper looper = s4bVar.f;
        if (looper.getThread().isAlive()) {
            this.B0.a(looper, null).d(new kl4(this, 21, s4bVar));
        } else {
            z04.c0("Trying to send message on a dead thread.");
            s4bVar.b(false);
        }
    }

    public final void N(AtomicBoolean atomicBoolean, boolean z) {
        if (this.T0 != z) {
            this.T0 = z;
            if (!z) {
                for (vj0 vj0Var : this.a) {
                    if (!q(vj0Var) && this.b.remove(vj0Var)) {
                        vj0Var.B();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(y75 y75Var) throws Throwable {
        this.K0.d(1);
        int i = y75Var.c;
        dod dodVar = y75Var.b;
        List list = y75Var.a;
        if (i != -1) {
            this.X0 = new e85(new b5b(list, dodVar), y75Var.c, y75Var.d);
        }
        vk8 vk8Var = this.E0;
        ArrayList arrayList = (ArrayList) vk8Var.b;
        vk8Var.p(0, arrayList.size());
        l(vk8Var.b(arrayList.size(), list, dodVar), false);
    }

    public final void P(boolean z) throws ExoPlaybackException {
        this.M0 = z;
        C();
        if (this.N0) {
            ge8 ge8Var = this.D0;
            if (ge8Var.j != ge8Var.i) {
                I(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z, boolean z2) {
        this.K0.d(z2 ? 1 : 0);
        this.J0 = this.J0.d(i2, i, z);
        g0(false, false);
        for (be8 be8Var = this.D0.i; be8Var != null; be8Var = be8Var.l) {
            for (n85 n85Var : (n85[]) be8Var.n.X) {
                if (n85Var != null) {
                    n85Var.c(z);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i3 = this.J0.e;
        bie bieVar = this.s0;
        if (i3 != 3) {
            if (i3 == 2) {
                bieVar.f(2);
            }
        } else {
            dk dkVar = this.z0;
            dkVar.c = true;
            ((fh8) dkVar.o).b();
            Z();
            bieVar.f(2);
        }
    }

    public final void R(c3b c3bVar) {
        this.s0.e(16);
        dk dkVar = this.z0;
        dkVar.f(c3bVar);
        c3b c3bVarMo1d = dkVar.mo1d();
        n(c3bVarMo1d, c3bVarMo1d.a, true, true);
    }

    public final void S(y65 y65Var) {
        this.e1 = y65Var;
        mue mueVar = this.J0.a;
        ge8 ge8Var = this.D0;
        ge8Var.getClass();
        y65Var.getClass();
        if (ge8Var.o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ge8Var.o.size(); i++) {
            ((be8) ge8Var.o.get(i)).g();
        }
        ge8Var.o = arrayList;
    }

    public final void T(int i) throws ExoPlaybackException {
        this.R0 = i;
        mue mueVar = this.J0.a;
        ge8 ge8Var = this.D0;
        ge8Var.g = i;
        if (!ge8Var.p(mueVar)) {
            I(true);
        }
        k(false);
    }

    public final void U(boolean z) throws ExoPlaybackException {
        this.S0 = z;
        mue mueVar = this.J0.a;
        ge8 ge8Var = this.D0;
        ge8Var.h = z;
        if (!ge8Var.p(mueVar)) {
            I(true);
        }
        k(false);
    }

    public final void V(dod dodVar) throws Throwable {
        this.K0.d(1);
        vk8 vk8Var = this.E0;
        int size = ((ArrayList) vk8Var.b).size();
        if (dodVar.b.length != size) {
            dodVar = new dod(new Random(dodVar.a.nextLong())).a(0, size);
        }
        vk8Var.l = dodVar;
        l(vk8Var.f(), false);
    }

    public final void W(int i) {
        a3b a3bVar = this.J0;
        if (a3bVar.e != i) {
            if (i != 2) {
                this.d1 = -9223372036854775807L;
            }
            this.J0 = a3bVar.g(i);
        }
    }

    public final boolean X() {
        a3b a3bVar = this.J0;
        return a3bVar.l && a3bVar.n == 0;
    }

    public final boolean Y(mue mueVar, yj8 yj8Var) {
        if (yj8Var.b() || mueVar.q()) {
            return false;
        }
        int i = mueVar.h(yj8Var.a, this.w0).c;
        kue kueVar = this.v0;
        mueVar.o(i, kueVar);
        return kueVar.a() && kueVar.i && kueVar.f != -9223372036854775807L;
    }

    public final void Z() {
        be8 be8Var = this.D0.i;
        if (be8Var == null) {
            return;
        }
        l0f l0fVar = be8Var.n;
        int i = 0;
        while (true) {
            vj0[] vj0VarArr = this.a;
            if (i >= vj0VarArr.length) {
                return;
            }
            if (l0fVar.I(i)) {
                vj0 vj0Var = vj0VarArr[i];
                int i2 = vj0Var.s0;
                if (i2 == 1) {
                    fm9.k(i2 == 1);
                    vj0Var.s0 = 2;
                    vj0Var.v();
                }
            }
            i++;
        }
    }

    public final void a(y75 y75Var, int i) throws Throwable {
        this.K0.d(1);
        vk8 vk8Var = this.E0;
        if (i == -1) {
            i = ((ArrayList) vk8Var.b).size();
        }
        l(vk8Var.b(i, y75Var.a, y75Var.b), false);
    }

    public final void a0(boolean z, boolean z2) {
        B(z || !this.T0, false, true, false);
        this.K0.d(z2 ? 1 : 0);
        this.Y.d(this.H0);
        W(1);
    }

    public final void b(vj0 vj0Var) {
        if (q(vj0Var)) {
            dk dkVar = this.z0;
            if (vj0Var == ((vj0) dkVar.Y)) {
                dkVar.Z = null;
                dkVar.Y = null;
                dkVar.b = true;
            }
            int i = vj0Var.s0;
            if (i == 2) {
                fm9.k(i == 2);
                vj0Var.s0 = 1;
                vj0Var.w();
            }
            fm9.k(vj0Var.s0 == 1);
            vj0Var.c.t();
            vj0Var.s0 = 0;
            vj0Var.t0 = null;
            vj0Var.u0 = null;
            vj0Var.y0 = false;
            vj0Var.p();
            this.W0--;
        }
    }

    public final void b0() {
        int i;
        dk dkVar = this.z0;
        dkVar.c = false;
        fh8 fh8Var = (fh8) dkVar.o;
        if (fh8Var.b) {
            fh8Var.a(fh8Var.t());
            fh8Var.b = false;
        }
        for (vj0 vj0Var : this.a) {
            if (q(vj0Var) && (i = vj0Var.s0) == 2) {
                fm9.k(i == 2);
                vj0Var.s0 = 1;
                vj0Var.w();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARN: Type inference failed for: r0v67, types: [l0f] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [int] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39, types: [int] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.c():void");
    }

    public final void c0() {
        be8 be8Var = this.D0.k;
        boolean z = this.Q0 || (be8Var != null && be8Var.a.a());
        a3b a3bVar = this.J0;
        if (z != a3bVar.g) {
            this.J0 = new a3b(a3bVar.a, a3bVar.b, a3bVar.c, a3bVar.d, a3bVar.e, a3bVar.f, z, a3bVar.h, a3bVar.i, a3bVar.j, a3bVar.k, a3bVar.l, a3bVar.m, a3bVar.n, a3bVar.o, a3bVar.q, a3bVar.r, a3bVar.s, a3bVar.t, a3bVar.p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean[] r24, long r25) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.d(boolean[], long):void");
    }

    public final void d0(List list, int i, int i2) throws Throwable {
        this.K0.d(1);
        vk8 vk8Var = this.E0;
        vk8Var.getClass();
        ArrayList arrayList = (ArrayList) vk8Var.b;
        fm9.f(i >= 0 && i <= i2 && i2 <= arrayList.size());
        fm9.f(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((tk8) arrayList.get(i3)).a.t((tb8) list.get(i3 - i));
        }
        l(vk8Var.f(), false);
    }

    @Override // defpackage.xd8
    public final void e(zd8 zd8Var) {
        this.s0.a(8, zd8Var).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.e0():void");
    }

    public final long f(mue mueVar, Object obj, long j) {
        hue hueVar = this.w0;
        int i = mueVar.h(obj, hueVar).c;
        kue kueVar = this.v0;
        mueVar.o(i, kueVar);
        if (kueVar.f != -9223372036854775807L && kueVar.a() && kueVar.i) {
            return oaf.S(oaf.B(kueVar.g) - kueVar.f) - (j + hueVar.e);
        }
        return -9223372036854775807L;
    }

    public final void f0(mue mueVar, yj8 yj8Var, mue mueVar2, yj8 yj8Var2, long j, boolean z) {
        if (!Y(mueVar, yj8Var)) {
            c3b c3bVar = yj8Var.b() ? c3b.d : this.J0.o;
            dk dkVar = this.z0;
            if (dkVar.mo1d().equals(c3bVar)) {
                return;
            }
            this.s0.e(16);
            dkVar.f(c3bVar);
            n(this.J0.o, c3bVar.a, false, false);
            return;
        }
        Object obj = yj8Var.a;
        hue hueVar = this.w0;
        int i = mueVar.h(obj, hueVar).c;
        kue kueVar = this.v0;
        mueVar.o(i, kueVar);
        hb8 hb8Var = kueVar.j;
        cc4 cc4Var = this.F0;
        cc4Var.getClass();
        cc4Var.e = oaf.S(hb8Var.a);
        cc4Var.h = oaf.S(hb8Var.b);
        cc4Var.i = oaf.S(hb8Var.c);
        float f = hb8Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        cc4Var.l = f;
        float f2 = hb8Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        cc4Var.k = f2;
        if (f == 1.0f && f2 == 1.0f) {
            cc4Var.e = -9223372036854775807L;
        }
        cc4Var.a();
        if (j != -9223372036854775807L) {
            cc4Var.f = f(mueVar, obj, j);
            cc4Var.a();
            return;
        }
        if (!oaf.a(!mueVar2.q() ? mueVar2.n(mueVar2.h(yj8Var2.a, hueVar).c, kueVar, 0L).a : null, kueVar.a) || z) {
            cc4Var.f = -9223372036854775807L;
            cc4Var.a();
        }
    }

    public final Pair g(mue mueVar) {
        if (mueVar.q()) {
            return Pair.create(a3b.u, 0L);
        }
        Pair pairJ = mueVar.j(this.v0, this.w0, mueVar.a(this.S0), -9223372036854775807L);
        yj8 yj8VarN = this.D0.n(mueVar, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (yj8VarN.b()) {
            Object obj = yj8VarN.a;
            hue hueVar = this.w0;
            mueVar.h(obj, hueVar);
            jLongValue = yj8VarN.c == hueVar.f(yj8VarN.b) ? hueVar.g.c : 0L;
        }
        return Pair.create(yj8VarN, Long.valueOf(jLongValue));
    }

    public final void g0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.O0 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.B0.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.P0 = jElapsedRealtime;
    }

    public final void h(zd8 zd8Var) {
        be8 be8Var = this.D0.k;
        if (be8Var == null || be8Var.a != zd8Var) {
            return;
        }
        long j = this.Y0;
        if (be8Var != null) {
            fm9.k(be8Var.l == null);
            if (be8Var.d) {
                be8Var.a.t(j - be8Var.o);
            }
        }
        s();
    }

    public final synchronized void h0(lc4 lc4Var, long j) {
        this.B0.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) lc4Var.get()).booleanValue() && j > 0) {
            try {
                this.B0.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.B0.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        be8 be8Var;
        int i;
        be8 be8Var2;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    Q(i3 >> 4, i3 & 15, z, true);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    J((e85) message.obj);
                    break;
                case 4:
                    R((c3b) message.obj);
                    break;
                case 5:
                    this.I0 = (x1d) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((zd8) message.obj);
                    break;
                case 9:
                    h((zd8) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    U(message.arg1 != 0);
                    break;
                case 13:
                    N((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    s4b s4bVar = (s4b) message.obj;
                    s4bVar.getClass();
                    Looper looper = s4bVar.f;
                    Looper looper2 = this.u0;
                    bie bieVar = this.s0;
                    if (looper != looper2) {
                        bieVar.a(15, s4bVar).b();
                        break;
                    } else {
                        synchronized (s4bVar) {
                        }
                        try {
                            s4bVar.a.a(s4bVar.d, s4bVar.e);
                            s4bVar.b(true);
                            int i4 = this.J0.e;
                            if (i4 == 3 || i4 == 2) {
                                bieVar.f(2);
                                break;
                            }
                        } catch (Throwable th) {
                            s4bVar.b(true);
                            throw th;
                        }
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    L((s4b) message.obj);
                    break;
                case 16:
                    c3b c3bVar = (c3b) message.obj;
                    n(c3bVar, c3bVar.a, true, false);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    O((y75) message.obj);
                    break;
                case 18:
                    a((y75) message.obj, message.arg1);
                    break;
                case 19:
                    v((z75) message.obj);
                    break;
                case 20:
                    z(message.arg1, message.arg2, (dod) message.obj);
                    break;
                case 21:
                    V((dod) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                default:
                    return false;
                case 25:
                    A();
                    I(true);
                    break;
                case 26:
                    A();
                    I(true);
                    break;
                case 27:
                    d0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    S((y65) message.obj);
                    break;
                case 29:
                    w();
                    break;
            }
        } catch (ParserException e) {
            boolean z2 = e.a;
            int i5 = e.b;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                i(i, e);
            }
            i = i2;
            i(i, e);
        } catch (DataSourceException e2) {
            i(e2.a, e2);
        } catch (ExoPlaybackException e3) {
            ExoPlaybackException exoPlaybackExceptionD = e3;
            int i6 = exoPlaybackExceptionD.u0;
            ge8 ge8Var = this.D0;
            if (i6 == 1 && (be8Var2 = ge8Var.j) != null) {
                exoPlaybackExceptionD = exoPlaybackExceptionD.d(be8Var2.f.a);
            }
            if (exoPlaybackExceptionD.A0 && (this.c1 == null || (i = exoPlaybackExceptionD.a) == 5004 || i == 5003)) {
                z04.d0("Recoverable renderer error", exoPlaybackExceptionD);
                ExoPlaybackException exoPlaybackException = this.c1;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(exoPlaybackExceptionD);
                    exoPlaybackExceptionD = this.c1;
                } else {
                    this.c1 = exoPlaybackExceptionD;
                }
                bie bieVar2 = this.s0;
                zhe zheVarA = bieVar2.a(25, exoPlaybackExceptionD);
                bieVar2.getClass();
                Message message2 = zheVarA.a;
                message2.getClass();
                bieVar2.a.sendMessageAtFrontOfQueue(message2);
                zheVarA.a();
            } else {
                ExoPlaybackException exoPlaybackException2 = this.c1;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackExceptionD);
                    exoPlaybackExceptionD = this.c1;
                }
                ExoPlaybackException exoPlaybackException3 = exoPlaybackExceptionD;
                z04.v("Playback error", exoPlaybackException3);
                if (exoPlaybackException3.u0 == 1 && ge8Var.i != ge8Var.j) {
                    while (true) {
                        be8Var = ge8Var.i;
                        if (be8Var == ge8Var.j) {
                            break;
                        }
                        ge8Var.a();
                    }
                    be8Var.getClass();
                    t();
                    ee8 ee8Var = be8Var.f;
                    yj8 yj8Var = ee8Var.a;
                    long j = ee8Var.b;
                    this.J0 = o(yj8Var, j, ee8Var.c, j, true, 0);
                }
                a0(true, false);
                this.J0 = this.J0.e(exoPlaybackException3);
            }
        } catch (DrmSession$DrmSessionException e4) {
            i(e4.a, e4);
        } catch (BehindLiveWindowException e5) {
            i(1002, e5);
        } catch (IOException e6) {
            i(2000, e6);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException4 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            z04.v("Playback error", exoPlaybackException4);
            a0(true, false);
            this.J0 = this.J0.e(exoPlaybackException4);
        }
        t();
        return true;
    }

    public final void i(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        be8 be8Var = this.D0.i;
        if (be8Var != null) {
            exoPlaybackException = exoPlaybackException.d(be8Var.f.a);
        }
        z04.v("Playback error", exoPlaybackException);
        a0(false, false);
        this.J0 = this.J0.e(exoPlaybackException);
    }

    @Override // defpackage.h6d
    public final void j(j6d j6dVar) {
        this.s0.a(9, (zd8) j6dVar).b();
    }

    public final void k(boolean z) {
        be8 be8Var = this.D0.k;
        yj8 yj8Var = be8Var == null ? this.J0.b : be8Var.f.a;
        boolean z2 = !this.J0.k.equals(yj8Var);
        if (z2) {
            this.J0 = this.J0.b(yj8Var);
        }
        a3b a3bVar = this.J0;
        a3bVar.q = be8Var == null ? a3bVar.s : be8Var.d();
        a3b a3bVar2 = this.J0;
        long j = a3bVar2.q;
        be8 be8Var2 = this.D0.k;
        a3bVar2.r = be8Var2 != null ? Math.max(0L, j - (this.Y0 - be8Var2.o)) : 0L;
        if ((z2 || z) && be8Var != null && be8Var.d) {
            yj8 yj8Var2 = be8Var.f.a;
            l0f l0fVar = be8Var.n;
            mue mueVar = this.J0.a;
            this.Y.h(this.H0, this.a, (n85[]) l0fVar.X);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.Object, mue] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ge8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.mue r40, boolean r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.l(mue, boolean):void");
    }

    public final void m(zd8 zd8Var) throws ExoPlaybackException {
        ge8 ge8Var = this.D0;
        be8 be8Var = ge8Var.k;
        if (be8Var == null || be8Var.a != zd8Var) {
            return;
        }
        float f = this.z0.mo1d().a;
        mue mueVar = this.J0.a;
        be8Var.d = true;
        be8Var.m = be8Var.a.q();
        l0f l0fVarH = be8Var.h(f, mueVar);
        ee8 ee8Var = be8Var.f;
        long jMax = ee8Var.b;
        long j = ee8Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = be8Var.a(l0fVarH, jMax, false, new boolean[be8Var.i.length]);
        long j2 = be8Var.o;
        ee8 ee8Var2 = be8Var.f;
        be8Var.o = (ee8Var2.b - jA) + j2;
        be8Var.f = ee8Var2.b(jA);
        l0f l0fVar = be8Var.n;
        mue mueVar2 = this.J0.a;
        n85[] n85VarArr = (n85[]) l0fVar.X;
        pn7 pn7Var = this.Y;
        j4b j4bVar = this.H0;
        vj0[] vj0VarArr = this.a;
        pn7Var.h(j4bVar, vj0VarArr, n85VarArr);
        if (be8Var == ge8Var.i) {
            D(be8Var.f.b);
            d(new boolean[vj0VarArr.length], ge8Var.j.e());
            a3b a3bVar = this.J0;
            yj8 yj8Var = a3bVar.b;
            long j3 = be8Var.f.b;
            this.J0 = o(yj8Var, j3, a3bVar.c, j3, false, 5);
        }
        s();
    }

    public final void n(c3b c3bVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.K0.d(1);
            }
            this.J0 = this.J0.f(c3bVar);
        }
        float f2 = c3bVar.a;
        be8 be8Var = this.D0.i;
        while (true) {
            i = 0;
            if (be8Var == null) {
                break;
            }
            n85[] n85VarArr = (n85[]) be8Var.n.X;
            int length = n85VarArr.length;
            while (i < length) {
                n85 n85Var = n85VarArr[i];
                if (n85Var != null) {
                    n85Var.l(f2);
                }
                i++;
            }
            be8Var = be8Var.l;
        }
        vj0[] vj0VarArr = this.a;
        int length2 = vj0VarArr.length;
        while (i < length2) {
            vj0 vj0Var = vj0VarArr[i];
            if (vj0Var != null) {
                vj0Var.C(f, c3bVar.a);
            }
            i++;
        }
    }

    public final a3b o(yj8 yj8Var, long j, long j2, long j3, boolean z, int i) {
        l0f l0fVar;
        List list;
        tze tzeVar;
        ffc ffcVarJ;
        boolean z2;
        int i2;
        int i3;
        this.b1 = (!this.b1 && j == this.J0.s && yj8Var.equals(this.J0.b)) ? false : true;
        C();
        a3b a3bVar = this.J0;
        tze tzeVar2 = a3bVar.h;
        l0f l0fVar2 = a3bVar.i;
        List list2 = a3bVar.j;
        if (this.E0.g) {
            be8 be8Var = this.D0.i;
            tze tzeVar3 = be8Var == null ? tze.d : be8Var.m;
            l0f l0fVar3 = be8Var == null ? this.X : be8Var.n;
            n85[] n85VarArr = (n85[]) l0fVar3.X;
            ww6 ww6Var = new ww6(4);
            int length = n85VarArr.length;
            int i4 = 0;
            boolean z3 = false;
            while (i4 < length) {
                n85 n85Var = n85VarArr[i4];
                if (n85Var == null) {
                    i3 = 1;
                } else {
                    f99 f99Var = n85Var.d(0).k;
                    if (f99Var == null) {
                        ww6Var.a(new f99(new d99[0]));
                        i3 = 1;
                    } else {
                        ww6Var.a(f99Var);
                        i3 = 1;
                        z3 = true;
                    }
                }
                i4 += i3;
            }
            if (z3) {
                ffcVarJ = ww6Var.j();
            } else {
                ls5 ls5Var = zw6.b;
                ffcVarJ = ffc.X;
            }
            if (be8Var != null) {
                ee8 ee8Var = be8Var.f;
                if (ee8Var.c != j2) {
                    be8Var.f = ee8Var.a(j2);
                }
            }
            be8 be8Var2 = this.D0.i;
            if (be8Var2 != null) {
                l0f l0fVar4 = be8Var2.n;
                boolean z4 = false;
                int i5 = 0;
                while (true) {
                    vj0[] vj0VarArr = this.a;
                    if (i5 >= vj0VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (l0fVar4.I(i5)) {
                        i2 = 1;
                        if (vj0VarArr[i5].b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((lgc[]) l0fVar4.o)[i5].a != 0) {
                            z4 = true;
                        }
                    } else {
                        i2 = 1;
                    }
                    i5 += i2;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.V0) {
                    this.V0 = z5;
                    if (!z5 && this.J0.p) {
                        this.s0.f(2);
                    }
                }
            }
            list = ffcVarJ;
            tzeVar = tzeVar3;
            l0fVar = l0fVar3;
        } else if (yj8Var.equals(a3bVar.b)) {
            l0fVar = l0fVar2;
            list = list2;
            tzeVar = tzeVar2;
        } else {
            tzeVar = tze.d;
            l0fVar = this.X;
            list = ffc.X;
        }
        if (z) {
            b85 b85Var = this.K0;
            if (!b85Var.e || b85Var.c == 5) {
                b85Var.d = true;
                b85Var.e = true;
                b85Var.c = i;
            } else {
                fm9.f(i == 5);
            }
        }
        a3b a3bVar2 = this.J0;
        long j4 = a3bVar2.q;
        be8 be8Var3 = this.D0.k;
        return a3bVar2.c(yj8Var, j, j2, j3, be8Var3 == null ? 0L : Math.max(0L, j4 - (this.Y0 - be8Var3.o)), tzeVar, l0fVar, list);
    }

    public final boolean p() {
        be8 be8Var = this.D0.k;
        if (be8Var == null) {
            return false;
        }
        try {
            zd8 zd8Var = be8Var.a;
            if (be8Var.d) {
                for (grc grcVar : be8Var.c) {
                    if (grcVar != null) {
                        grcVar.c();
                    }
                }
            } else {
                zd8Var.k();
            }
            return (!be8Var.d ? 0L : zd8Var.f()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean r() {
        be8 be8Var = this.D0.i;
        long j = be8Var.f.e;
        return be8Var.d && (j == -9223372036854775807L || this.J0.s < j || !X());
    }

    public final void s() {
        long j;
        long j2;
        boolean zI;
        if (p()) {
            be8 be8Var = this.D0.k;
            long jF = !be8Var.d ? 0L : be8Var.a.f();
            be8 be8Var2 = this.D0.k;
            long jMax = be8Var2 == null ? 0L : Math.max(0L, jF - (this.Y0 - be8Var2.o));
            if (be8Var == this.D0.i) {
                j = this.Y0;
                j2 = be8Var.o;
            } else {
                j = this.Y0 - be8Var.o;
                j2 = be8Var.f.b;
            }
            long j3 = j - j2;
            long j4 = Y(this.J0.a, be8Var.f.a) ? this.F0.j : -9223372036854775807L;
            j4b j4bVar = this.H0;
            mue mueVar = this.J0.a;
            yj8 yj8Var = be8Var.f.a;
            float f = this.z0.mo1d().a;
            boolean z = this.J0.l;
            on7 on7Var = new on7(j4bVar, mueVar, yj8Var, j3, jMax, f, this.O0, j4);
            zI = this.Y.i(on7Var);
            be8 be8Var3 = this.D0.i;
            if (!zI && be8Var3.d && jMax < 500000 && (this.x0 > 0 || this.y0)) {
                be8Var3.a.s(this.J0.s, false);
                zI = this.Y.i(on7Var);
            }
        } else {
            zI = false;
        }
        this.Q0 = zI;
        if (zI) {
            be8 be8Var4 = this.D0.k;
            long j5 = this.Y0;
            float f2 = this.z0.mo1d().a;
            long j6 = this.P0;
            fm9.k(be8Var4.l == null);
            long j7 = j5 - be8Var4.o;
            zd8 zd8Var = be8Var4.a;
            po7 po7Var = new po7();
            po7Var.a = j7;
            fm9.f(f2 > 0.0f || f2 == -3.4028235E38f);
            po7Var.b = f2;
            fm9.f(j6 >= 0 || j6 == -9223372036854775807L);
            po7Var.c = j6;
            zd8Var.o(new qo7(po7Var));
        }
        c0();
    }

    public final void t() {
        b85 b85Var = this.K0;
        a3b a3bVar = this.J0;
        boolean z = b85Var.d | (((a3b) b85Var.f) != a3bVar);
        b85Var.d = z;
        b85Var.f = a3bVar;
        if (z) {
            u75 u75Var = this.C0.b;
            u75Var.u0.d(new kl4(u75Var, 18, b85Var));
            this.K0 = new b85(this.J0);
        }
    }

    public final void u() throws Throwable {
        l(this.E0.f(), true);
    }

    public final void v(z75 z75Var) throws Throwable {
        mue mueVarF;
        this.K0.d(1);
        int i = z75Var.a;
        vk8 vk8Var = this.E0;
        vk8Var.getClass();
        ArrayList arrayList = (ArrayList) vk8Var.b;
        int i2 = z75Var.b;
        int i3 = z75Var.c;
        fm9.f(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        vk8Var.l = z75Var.d;
        if (i == i2 || i == i3) {
            mueVarF = vk8Var.f();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iP = ((tk8) arrayList.get(iMin)).d;
            oaf.R(arrayList, i, i2, i3);
            while (iMin <= iMax) {
                tk8 tk8Var = (tk8) arrayList.get(iMin);
                tk8Var.d = iP;
                iP += tk8Var.a.o.e.p();
                iMin++;
            }
            mueVarF = vk8Var.f();
        }
        l(mueVarF, false);
    }

    public final void w() {
        this.K0.d(1);
        int i = 0;
        B(false, false, false, true);
        this.Y.g(this.H0);
        W(this.J0.a.q() ? 4 : 2);
        i84 i84Var = (i84) this.Z;
        i84Var.getClass();
        vk8 vk8Var = this.E0;
        fm9.k(!vk8Var.g);
        vk8Var.m = i84Var;
        while (true) {
            ArrayList arrayList = (ArrayList) vk8Var.b;
            if (i >= arrayList.size()) {
                vk8Var.g = true;
                this.s0.f(2);
                return;
            } else {
                tk8 tk8Var = (tk8) arrayList.get(i);
                vk8Var.l(tk8Var);
                ((HashSet) vk8Var.f).add(tk8Var);
                i++;
            }
        }
    }

    public final void x() {
        try {
            B(true, false, true, false);
            y();
            this.Y.c(this.H0);
            W(1);
            HandlerThread handlerThread = this.t0;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.L0 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.t0;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.L0 = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void y() {
        for (int i = 0; i < this.a.length; i++) {
            vj0 vj0Var = this.c[i];
            synchronized (vj0Var.a) {
                vj0Var.B0 = null;
            }
            vj0 vj0Var2 = this.a[i];
            fm9.k(vj0Var2.s0 == 0);
            vj0Var2.s();
        }
    }

    public final void z(int i, int i2, dod dodVar) throws Throwable {
        this.K0.d(1);
        vk8 vk8Var = this.E0;
        vk8Var.getClass();
        fm9.f(i >= 0 && i <= i2 && i2 <= ((ArrayList) vk8Var.b).size());
        vk8Var.l = dodVar;
        vk8Var.p(i, i2);
        l(vk8Var.f(), false);
    }
}
