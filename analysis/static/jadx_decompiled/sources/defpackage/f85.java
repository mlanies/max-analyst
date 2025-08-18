package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class f85 implements Handler.Callback, wd8 {
    public final ArrayList A0;
    public final rhe B0;
    public final g75 C0;
    public final fe8 D0;
    public final vk8 E0;
    public final cc4 F0;
    public w1d G0;
    public z2b H0;
    public a85 I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public d85 U0;
    public long V0;
    public int W0;
    public final l0f X;
    public boolean X0;
    public final ec4 Y;
    public ExoPlaybackException Y0;
    public final gg0 Z;
    public final uj0[] a;
    public final Set b;
    public final uj0[] c;
    public final gz7 o;
    public final aie s0;
    public final HandlerThread t0;
    public final Looper u0;
    public final jue v0;
    public final gue w0;
    public final long x0;
    public final boolean y0;
    public final dk z0;
    public boolean P0 = false;
    public long Z0 = -9223372036854775807L;

    public f85(uj0[] uj0VarArr, gz7 gz7Var, l0f l0fVar, ec4 ec4Var, gg0 gg0Var, int i, h74 h74Var, w1d w1dVar, cc4 cc4Var, boolean z, Looper looper, rhe rheVar, g75 g75Var, i4b i4bVar) {
        this.C0 = g75Var;
        this.a = uj0VarArr;
        this.o = gz7Var;
        this.X = l0fVar;
        this.Y = ec4Var;
        this.Z = gg0Var;
        this.O0 = i;
        this.G0 = w1dVar;
        this.F0 = cc4Var;
        this.K0 = z;
        this.B0 = rheVar;
        this.x0 = ec4Var.h;
        this.y0 = ec4Var.i;
        z2b z2bVarH = z2b.h(l0fVar);
        this.H0 = z2bVarH;
        this.I0 = new a85(z2bVarH);
        this.c = new uj0[uj0VarArr.length];
        for (int i2 = 0; i2 < uj0VarArr.length; i2++) {
            uj0 uj0Var = uj0VarArr[i2];
            uj0Var.o = i2;
            uj0Var.X = i4bVar;
            this.c[i2] = uj0Var;
        }
        this.z0 = new dk(this, rheVar);
        this.A0 = new ArrayList();
        this.b = ngg.B();
        this.v0 = new jue();
        this.w0 = new gue();
        gz7Var.a = this;
        gz7Var.b = gg0Var;
        this.X0 = true;
        Handler handler = new Handler(looper);
        this.D0 = new fe8(h74Var, handler);
        this.E0 = new vk8(this, h74Var, handler, i4bVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.t0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.u0 = looper2;
        this.s0 = rheVar.a(looper2, this);
    }

    public static Pair E(lue lueVar, d85 d85Var, boolean z, int i, boolean z2, jue jueVar, gue gueVar) {
        Pair pairJ;
        Object objF;
        lue lueVar2 = d85Var.a;
        if (lueVar.q()) {
            return null;
        }
        lue lueVar3 = lueVar2.q() ? lueVar : lueVar2;
        try {
            pairJ = lueVar3.j(jueVar, gueVar, d85Var.b, d85Var.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (lueVar.equals(lueVar3)) {
            return pairJ;
        }
        if (lueVar.b(pairJ.first) != -1) {
            return (lueVar3.h(pairJ.first, gueVar).Y && lueVar3.n(gueVar.c, jueVar, 0L).z0 == lueVar3.b(pairJ.first)) ? lueVar.j(jueVar, gueVar, lueVar.h(pairJ.first, gueVar).c, d85Var.c) : pairJ;
        }
        if (z && (objF = F(jueVar, gueVar, i, z2, pairJ.first, lueVar3, lueVar)) != null) {
            return lueVar.j(jueVar, gueVar, lueVar.h(objF, gueVar).c, -9223372036854775807L);
        }
        return null;
    }

    public static Object F(jue jueVar, gue gueVar, int i, boolean z, Object obj, lue lueVar, lue lueVar2) {
        int iB = lueVar.b(obj);
        int i2 = lueVar.i();
        int iD = iB;
        int iB2 = -1;
        for (int i3 = 0; i3 < i2 && iB2 == -1; i3++) {
            iD = lueVar.d(iD, gueVar, jueVar, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = lueVar2.b(lueVar.m(iD));
        }
        if (iB2 == -1) {
            return null;
        }
        return lueVar2.m(iB2);
    }

    public static void L(uj0 uj0Var, long j) {
        uj0Var.v0 = true;
        if (uj0Var instanceof wpe) {
            wpe wpeVar = (wpe) uj0Var;
            np8.f(wpeVar.v0);
            wpeVar.L0 = j;
        }
    }

    public static boolean q(uj0 uj0Var) {
        return uj0Var.Y != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[PHI: r5 r6 r8
      0x00c0: PHI (r5v4 xj8) = (r5v3 xj8), (r5v11 xj8) binds: [B:32:0x0094, B:34:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r6v2 long) = (r6v1 long), (r6v8 long) binds: [B:32:0x0094, B:34:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r8v2 long) = (r8v1 long), (r8v4 long) binds: [B:32:0x0094, B:34:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        ae8 ae8Var = this.D0.h;
        this.L0 = ae8Var != null && ae8Var.f.h && this.K0;
    }

    public final void C(long j) {
        ae8 ae8Var = this.D0.h;
        long j2 = j + (ae8Var == null ? 1000000000000L : ae8Var.o);
        this.V0 = j2;
        ((fh8) this.z0.o).a(j2);
        for (uj0 uj0Var : this.a) {
            if (q(uj0Var)) {
                long j3 = this.V0;
                uj0Var.v0 = false;
                uj0Var.u0 = j3;
                uj0Var.o(j3, false);
            }
        }
        for (ae8 ae8Var2 = r0.h; ae8Var2 != null; ae8Var2 = ae8Var2.l) {
            for (m85 m85Var : (m85[]) ae8Var2.n.X) {
                if (m85Var != null) {
                    m85Var.n();
                }
            }
        }
    }

    public final void D(lue lueVar, lue lueVar2) {
        if (lueVar.q() && lueVar2.q()) {
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

    public final void G(long j, long j2) {
        aie aieVar = this.s0;
        aieVar.a.removeMessages(2);
        aieVar.a.sendEmptyMessageAtTime(2, j + j2);
    }

    public final void H(boolean z) throws ExoPlaybackException {
        xj8 xj8Var = this.D0.h.f.a;
        long J = J(xj8Var, this.H0.s, true, false);
        if (J != this.H0.s) {
            z2b z2bVar = this.H0;
            this.H0 = o(xj8Var, J, z2bVar.c, z2bVar.d, z, 5);
        }
    }

    public final void I(d85 d85Var) throws Throwable {
        long j;
        long j2;
        boolean z;
        xj8 xj8Var;
        long j3;
        long j4;
        long j5;
        z2b z2bVar;
        int i;
        this.I0.a(1);
        Pair pairE = E(this.H0.a, d85Var, true, this.O0, this.P0, this.v0, this.w0);
        if (pairE == null) {
            Pair pairH = h(this.H0.a);
            xj8Var = (xj8) pairH.first;
            long jLongValue = ((Long) pairH.second).longValue();
            z = !this.H0.a.q();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairE.first;
            long jLongValue2 = ((Long) pairE.second).longValue();
            long j6 = d85Var.c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            xj8 xj8VarM = this.D0.m(this.H0.a, obj, jLongValue2);
            if (xj8VarM.a()) {
                this.H0.a.h(xj8VarM.a, this.w0);
                j = this.w0.e(xj8VarM.b) == xj8VarM.c ? this.w0.Z.b : 0L;
                j2 = j6;
                xj8Var = xj8VarM;
                z = true;
            } else {
                j = jLongValue2;
                j2 = j6;
                z = d85Var.c == -9223372036854775807L;
                xj8Var = xj8VarM;
            }
        }
        try {
            if (this.H0.a.q()) {
                this.U0 = d85Var;
            } else {
                if (pairE != null) {
                    if (xj8Var.equals(this.H0.b)) {
                        ae8 ae8Var = this.D0.h;
                        long jA = (ae8Var == null || !ae8Var.d || j == 0) ? j : ae8Var.a.A(j, this.G0);
                        if (maf.M(jA) == maf.M(this.H0.s) && ((i = (z2bVar = this.H0).e) == 2 || i == 3)) {
                            long j7 = z2bVar.s;
                            this.H0 = o(xj8Var, j7, j2, j7, z, 2);
                            return;
                        }
                        j4 = jA;
                    } else {
                        j4 = j;
                    }
                    boolean z2 = this.H0.e == 4;
                    fe8 fe8Var = this.D0;
                    long J = J(xj8Var, j4, fe8Var.h != fe8Var.i, z2);
                    boolean z3 = (j != J) | z;
                    try {
                        z2b z2bVar2 = this.H0;
                        lue lueVar = z2bVar2.a;
                        e0(lueVar, xj8Var, lueVar, z2bVar2.b, j2);
                        z = z3;
                        j5 = J;
                        this.H0 = o(xj8Var, j5, j2, j5, z, 2);
                    } catch (Throwable th) {
                        th = th;
                        z = z3;
                        j3 = J;
                        this.H0 = o(xj8Var, j3, j2, j3, z, 2);
                        throw th;
                    }
                }
                if (this.H0.e != 1) {
                    V(4);
                }
                A(false, true, false, true);
            }
            j5 = j;
            this.H0 = o(xj8Var, j5, j2, j5, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
        }
    }

    public final long J(xj8 xj8Var, long j, boolean z, boolean z2) throws ExoPlaybackException {
        a0();
        this.M0 = false;
        if (z2 || this.H0.e == 3) {
            V(2);
        }
        fe8 fe8Var = this.D0;
        ae8 ae8Var = fe8Var.h;
        ae8 ae8Var2 = ae8Var;
        while (ae8Var2 != null && !xj8Var.equals(ae8Var2.f.a)) {
            ae8Var2 = ae8Var2.l;
        }
        if (z || ae8Var != ae8Var2 || (ae8Var2 != null && ae8Var2.o + j < 0)) {
            uj0[] uj0VarArr = this.a;
            for (uj0 uj0Var : uj0VarArr) {
                b(uj0Var);
            }
            if (ae8Var2 != null) {
                while (fe8Var.h != ae8Var2) {
                    fe8Var.a();
                }
                fe8Var.k(ae8Var2);
                ae8Var2.o = 1000000000000L;
                f(new boolean[uj0VarArr.length]);
            }
        }
        if (ae8Var2 != null) {
            fe8Var.k(ae8Var2);
            if (!ae8Var2.d) {
                ae8Var2.f = ae8Var2.f.b(j);
            } else if (ae8Var2.e) {
                yd8 yd8Var = ae8Var2.a;
                j = yd8Var.l(j);
                yd8Var.s(j - this.x0, this.y0);
            }
            C(j);
            s();
        } else {
            fe8Var.b();
            C(j);
        }
        k(false);
        this.s0.c(2);
        return j;
    }

    public final void K(r4b r4bVar) {
        Looper looper = r4bVar.f;
        if (!looper.getThread().isAlive()) {
            r4bVar.b(false);
            return;
        }
        aie aieVarA = this.B0.a(looper, null);
        aieVarA.a.post(new kl4(this, 20, r4bVar));
    }

    public final void M(AtomicBoolean atomicBoolean, boolean z) {
        if (this.Q0 != z) {
            this.Q0 = z;
            if (!z) {
                for (uj0 uj0Var : this.a) {
                    if (!q(uj0Var) && this.b.remove(uj0Var)) {
                        uj0Var.y();
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

    public final void N(x75 x75Var) throws Throwable {
        this.I0.a(1);
        int i = x75Var.c;
        cod codVar = x75Var.b;
        List list = x75Var.a;
        if (i != -1) {
            this.U0 = new d85(new a5b(list, codVar), x75Var.c, x75Var.d);
        }
        vk8 vk8Var = this.E0;
        ArrayList arrayList = (ArrayList) vk8Var.b;
        vk8Var.p(0, arrayList.size());
        l(vk8Var.a(arrayList.size(), list, codVar), false);
    }

    public final void O(boolean z) {
        if (z == this.S0) {
            return;
        }
        this.S0 = z;
        z2b z2bVar = this.H0;
        int i = z2bVar.e;
        if (z || i == 4 || i == 1) {
            this.H0 = z2bVar.c(z);
        } else {
            this.s0.c(2);
        }
    }

    public final void P(boolean z) throws ExoPlaybackException {
        this.K0 = z;
        B();
        if (this.L0) {
            fe8 fe8Var = this.D0;
            if (fe8Var.i != fe8Var.h) {
                H(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z, boolean z2) {
        this.I0.a(z2 ? 1 : 0);
        a85 a85Var = this.I0;
        a85Var.a = true;
        a85Var.f = true;
        a85Var.g = i2;
        this.H0 = this.H0.d(i, z);
        this.M0 = false;
        for (ae8 ae8Var = this.D0.h; ae8Var != null; ae8Var = ae8Var.l) {
            for (m85 m85Var : (m85[]) ae8Var.n.X) {
                if (m85Var != null) {
                    m85Var.c(z);
                }
            }
        }
        if (!W()) {
            a0();
            d0();
            return;
        }
        int i3 = this.H0.e;
        aie aieVar = this.s0;
        if (i3 == 3) {
            Y();
            aieVar.c(2);
        } else if (i3 == 2) {
            aieVar.c(2);
        }
    }

    public final void R(b3b b3bVar) {
        dk dkVar = this.z0;
        dkVar.u(b3bVar);
        b3b b3bVarD = dkVar.d();
        n(b3bVarD, b3bVarD.a, true, true);
    }

    public final void S(int i) throws ExoPlaybackException {
        this.O0 = i;
        lue lueVar = this.H0.a;
        fe8 fe8Var = this.D0;
        fe8Var.f = i;
        if (!fe8Var.n(lueVar)) {
            H(true);
        }
        k(false);
    }

    public final void T(boolean z) throws ExoPlaybackException {
        this.P0 = z;
        lue lueVar = this.H0.a;
        fe8 fe8Var = this.D0;
        fe8Var.g = z;
        if (!fe8Var.n(lueVar)) {
            H(true);
        }
        k(false);
    }

    public final void U(cod codVar) throws Throwable {
        this.I0.a(1);
        vk8 vk8Var = this.E0;
        int size = ((ArrayList) vk8Var.b).size();
        if (codVar.b.length != size) {
            codVar = new cod(new Random(codVar.a.nextLong())).a(size);
        }
        vk8Var.l = codVar;
        l(vk8Var.e(), false);
    }

    public final void V(int i) {
        z2b z2bVar = this.H0;
        if (z2bVar.e != i) {
            if (i != 2) {
                this.Z0 = -9223372036854775807L;
            }
            this.H0 = z2bVar.f(i);
        }
    }

    public final boolean W() {
        z2b z2bVar = this.H0;
        return z2bVar.l && z2bVar.m == 0;
    }

    public final boolean X(lue lueVar, xj8 xj8Var) {
        if (xj8Var.a() || lueVar.q()) {
            return false;
        }
        int i = lueVar.h(xj8Var.a, this.w0).c;
        jue jueVar = this.v0;
        lueVar.o(i, jueVar);
        return jueVar.a() && jueVar.t0 && jueVar.Y != -9223372036854775807L;
    }

    public final void Y() {
        this.M0 = false;
        dk dkVar = this.z0;
        dkVar.c = true;
        ((fh8) dkVar.o).b();
        for (uj0 uj0Var : this.a) {
            if (q(uj0Var)) {
                np8.f(uj0Var.Y == 1);
                uj0Var.Y = 2;
                uj0Var.q();
            }
        }
    }

    public final void Z(boolean z, boolean z2) {
        A(z || !this.Q0, false, true, false);
        this.I0.a(z2 ? 1 : 0);
        this.Y.b(true);
        V(1);
    }

    public final void a(x75 x75Var, int i) throws Throwable {
        this.I0.a(1);
        vk8 vk8Var = this.E0;
        if (i == -1) {
            i = ((ArrayList) vk8Var.b).size();
        }
        l(vk8Var.a(i, x75Var.a, x75Var.b), false);
    }

    public final void a0() {
        int i;
        dk dkVar = this.z0;
        dkVar.c = false;
        fh8 fh8Var = (fh8) dkVar.o;
        if (fh8Var.b) {
            fh8Var.a(fh8Var.t());
            fh8Var.b = false;
        }
        for (uj0 uj0Var : this.a) {
            if (q(uj0Var) && (i = uj0Var.Y) == 2) {
                np8.f(i == 2);
                uj0Var.Y = 1;
                uj0Var.r();
            }
        }
    }

    public final void b(uj0 uj0Var) {
        if (q(uj0Var)) {
            dk dkVar = this.z0;
            if (uj0Var == ((uj0) dkVar.Y)) {
                dkVar.Z = null;
                dkVar.Y = null;
                dkVar.b = true;
            }
            int i = uj0Var.Y;
            if (i == 2) {
                np8.f(i == 2);
                uj0Var.Y = 1;
                uj0Var.r();
            }
            np8.f(uj0Var.Y == 1);
            uj0Var.b.N();
            uj0Var.Y = 0;
            uj0Var.Z = null;
            uj0Var.s0 = null;
            uj0Var.v0 = false;
            uj0Var.m();
            this.T0--;
        }
    }

    public final void b0() {
        ae8 ae8Var = this.D0.j;
        boolean z = this.N0 || (ae8Var != null && ae8Var.a.a());
        z2b z2bVar = this.H0;
        if (z != z2bVar.g) {
            this.H0 = new z2b(z2bVar.a, z2bVar.b, z2bVar.c, z2bVar.d, z2bVar.e, z2bVar.f, z, z2bVar.h, z2bVar.i, z2bVar.j, z2bVar.k, z2bVar.l, z2bVar.m, z2bVar.n, z2bVar.q, z2bVar.r, z2bVar.s, z2bVar.o, z2bVar.p);
        }
    }

    @Override // defpackage.g6d
    public final void c(i6d i6dVar) {
        this.s0.a(9, (yd8) i6dVar).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void c0(l0f l0fVar) {
        m85[] m85VarArr = (m85[]) l0fVar.X;
        ec4 ec4Var = this.Y;
        int iMax = ec4Var.f;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                uj0[] uj0VarArr = this.a;
                int i3 = 13107200;
                if (i < uj0VarArr.length) {
                    if (m85VarArr[i] != null) {
                        switch (uj0VarArr[i].a) {
                            case ContentLengthStrategy.CHUNKED /* -2 */:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        ec4Var.j = iMax;
        ec4Var.a.c(iMax);
    }

    @Override // defpackage.wd8
    public final void d(yd8 yd8Var) {
        this.s0.a(8, yd8Var).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0() {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.d0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x02e3 A[EDGE_INSN: B:438:0x02e3->B:181:0x02e3 BREAK  A[LOOP:0: B:153:0x0281->B:180:0x02e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c A[EDGE_INSN: B:466:0x012c->B:57:0x012c BREAK  A[LOOP:7: B:67:0x014a->B:84:0x017d], EDGE_INSN: B:467:0x012c->B:57:0x012c BREAK  A[LOOP:7: B:67:0x014a->B:84:0x017d], EDGE_INSN: B:468:0x012c->B:57:0x012c BREAK  A[LOOP:7: B:67:0x014a->B:84:0x017d], EDGE_INSN: B:469:0x012c->B:57:0x012c BREAK  A[LOOP:7: B:67:0x014a->B:84:0x017d]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.e():void");
    }

    public final void e0(lue lueVar, xj8 xj8Var, lue lueVar2, xj8 xj8Var2, long j) {
        if (!X(lueVar, xj8Var)) {
            b3b b3bVar = xj8Var.a() ? b3b.o : this.H0.n;
            dk dkVar = this.z0;
            if (dkVar.d().equals(b3bVar)) {
                return;
            }
            dkVar.u(b3bVar);
            return;
        }
        Object obj = xj8Var.a;
        gue gueVar = this.w0;
        int i = lueVar.h(obj, gueVar).c;
        jue jueVar = this.v0;
        lueVar.o(i, jueVar);
        gb8 gb8Var = jueVar.v0;
        int i2 = maf.a;
        cc4 cc4Var = this.F0;
        cc4Var.getClass();
        cc4Var.e = maf.D(gb8Var.a);
        cc4Var.h = maf.D(gb8Var.b);
        cc4Var.i = maf.D(gb8Var.c);
        float f = gb8Var.o;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        cc4Var.l = f;
        float f2 = gb8Var.X;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        cc4Var.k = f2;
        if (f == 1.0f && f2 == 1.0f) {
            cc4Var.e = -9223372036854775807L;
        }
        cc4Var.a();
        if (j != -9223372036854775807L) {
            cc4Var.f = g(lueVar, obj, j);
            cc4Var.a();
            return;
        }
        if (maf.a(!lueVar2.q() ? lueVar2.n(lueVar2.h(xj8Var2.a, gueVar).c, jueVar, 0L).a : null, jueVar.a)) {
            return;
        }
        cc4Var.f = -9223372036854775807L;
        cc4Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean[] r24) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.f(boolean[]):void");
    }

    public final long g(lue lueVar, Object obj, long j) {
        gue gueVar = this.w0;
        int i = lueVar.h(obj, gueVar).c;
        jue jueVar = this.v0;
        lueVar.o(i, jueVar);
        if (jueVar.Y != -9223372036854775807L && jueVar.a() && jueVar.t0) {
            return maf.D(maf.t(jueVar.Z) - jueVar.Y) - (j + gueVar.X);
        }
        return -9223372036854775807L;
    }

    public final Pair h(lue lueVar) {
        if (lueVar.q()) {
            return Pair.create(z2b.t, 0L);
        }
        Pair pairJ = lueVar.j(this.v0, this.w0, lueVar.a(this.P0), -9223372036854775807L);
        xj8 xj8VarM = this.D0.m(lueVar, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (xj8VarM.a()) {
            Object obj = xj8VarM.a;
            gue gueVar = this.w0;
            lueVar.h(obj, gueVar);
            jLongValue = xj8VarM.c == gueVar.e(xj8VarM.b) ? gueVar.Z.b : 0L;
        }
        return Pair.create(xj8VarM, Long.valueOf(jLongValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        ae8 ae8Var;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    Q(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    I((d85) message.obj);
                    break;
                case 4:
                    R((b3b) message.obj);
                    break;
                case 5:
                    this.G0 = (w1d) message.obj;
                    break;
                case 6:
                    Z(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((yd8) message.obj);
                    break;
                case 9:
                    i((yd8) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    S(message.arg1);
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    T(message.arg1 != 0);
                    break;
                case 13:
                    M((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    r4b r4bVar = (r4b) message.obj;
                    r4bVar.getClass();
                    Looper looper = r4bVar.f;
                    Looper looper2 = this.u0;
                    aie aieVar = this.s0;
                    if (looper != looper2) {
                        aieVar.a(15, r4bVar).b();
                        break;
                    } else {
                        synchronized (r4bVar) {
                        }
                        try {
                            r4bVar.a.a(r4bVar.d, r4bVar.e);
                            r4bVar.b(true);
                            int i2 = this.H0.e;
                            if (i2 == 3 || i2 == 2) {
                                aieVar.c(2);
                                break;
                            }
                        } catch (Throwable th) {
                            r4bVar.b(true);
                            throw th;
                        }
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    K((r4b) message.obj);
                    break;
                case 16:
                    b3b b3bVar = (b3b) message.obj;
                    n(b3bVar, b3bVar.a, true, false);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    N((x75) message.obj);
                    break;
                case 18:
                    a((x75) message.obj, message.arg1);
                    break;
                case 19:
                    au1.r(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (cod) message.obj);
                    break;
                case 21:
                    U((cod) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    O(message.arg1 == 1);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.c == 1 && (ae8Var = this.D0.i) != null) {
                e = e.a(ae8Var.f.a);
            }
            if (e.t0 && this.Y0 == null) {
                fm9.c("Recoverable renderer error", e);
                this.Y0 = e;
                aie aieVar2 = this.s0;
                yhe yheVarA = aieVar2.a(25, e);
                aieVar2.getClass();
                Message message2 = yheVarA.a;
                message2.getClass();
                aieVar2.a.sendMessageAtFrontOfQueue(message2);
                yheVarA.a();
            } else {
                ExoPlaybackException exoPlaybackException = this.Y0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.Y0;
                }
                fm9.c("Playback error", e);
                Z(true, false);
                this.H0 = this.H0.e(e);
            }
        } catch (ParserException e2) {
            boolean z = e2.a;
            int i3 = e2.b;
            if (i3 == 1) {
                i = z ? 3001 : 3003;
            } else {
                if (i3 == 4) {
                    i = z ? 3002 : 3004;
                }
                j(i, e2);
            }
            i = i;
            j(i, e2);
        } catch (DrmSession$DrmSessionException e3) {
            j(e3.a, e3);
        } catch (BehindLiveWindowException e4) {
            j(1002, e4);
        } catch (DataSourceException e5) {
            j(e5.a, e5);
        } catch (IOException e6) {
            j(2000, e6);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            fm9.c("Playback error", exoPlaybackException2);
            Z(true, false);
            this.H0 = this.H0.e(exoPlaybackException2);
        }
        t();
        return true;
    }

    public final void i(yd8 yd8Var) {
        ae8 ae8Var = this.D0.j;
        if (ae8Var == null || ae8Var.a != yd8Var) {
            return;
        }
        long j = this.V0;
        if (ae8Var != null) {
            np8.f(ae8Var.l == null);
            if (ae8Var.d) {
                ae8Var.a.t(j - ae8Var.o);
            }
        }
        s();
    }

    public final void j(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        ae8 ae8Var = this.D0.h;
        if (ae8Var != null) {
            exoPlaybackException = exoPlaybackException.a(ae8Var.f.a);
        }
        fm9.c("Playback error", exoPlaybackException);
        Z(false, false);
        this.H0 = this.H0.e(exoPlaybackException);
    }

    public final void k(boolean z) {
        ae8 ae8Var = this.D0.j;
        xj8 xj8Var = ae8Var == null ? this.H0.b : ae8Var.f.a;
        boolean z2 = !this.H0.k.equals(xj8Var);
        if (z2) {
            this.H0 = this.H0.a(xj8Var);
        }
        z2b z2bVar = this.H0;
        z2bVar.q = ae8Var == null ? z2bVar.s : ae8Var.d();
        z2b z2bVar2 = this.H0;
        long j = z2bVar2.q;
        ae8 ae8Var2 = this.D0.j;
        z2bVar2.r = ae8Var2 != null ? Math.max(0L, j - (this.V0 - ae8Var2.o)) : 0L;
        if ((z2 || z) && ae8Var != null && ae8Var.d) {
            c0(ae8Var.n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02eb A[Catch: all -> 0x02f0, TryCatch #0 {all -> 0x02f0, blocks: (B:166:0x02e5, B:168:0x02eb, B:173:0x02f7, B:175:0x0302, B:177:0x0308, B:179:0x0312, B:180:0x031f, B:181:0x0322, B:185:0x032d), top: B:245:0x0283 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0201  */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.lue r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.l(lue, boolean):void");
    }

    public final void m(yd8 yd8Var) throws ExoPlaybackException {
        fe8 fe8Var = this.D0;
        ae8 ae8Var = fe8Var.j;
        if (ae8Var == null || ae8Var.a != yd8Var) {
            return;
        }
        float f = this.z0.d().a;
        lue lueVar = this.H0.a;
        ae8Var.d = true;
        ae8Var.m = ae8Var.a.q();
        l0f l0fVarG = ae8Var.g(f, lueVar);
        de8 de8Var = ae8Var.f;
        long jMax = de8Var.b;
        long j = de8Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = ae8Var.a(l0fVarG, jMax, false, new boolean[ae8Var.i.length]);
        long j2 = ae8Var.o;
        de8 de8Var2 = ae8Var.f;
        ae8Var.o = (de8Var2.b - jA) + j2;
        ae8Var.f = de8Var2.b(jA);
        c0(ae8Var.n);
        if (ae8Var == fe8Var.h) {
            C(ae8Var.f.b);
            f(new boolean[this.a.length]);
            z2b z2bVar = this.H0;
            xj8 xj8Var = z2bVar.b;
            long j3 = ae8Var.f.b;
            this.H0 = o(xj8Var, j3, z2bVar.c, j3, false, 5);
        }
        s();
    }

    public final void n(b3b b3bVar, float f, boolean z, boolean z2) {
        int i;
        f85 f85Var = this;
        if (z) {
            if (z2) {
                f85Var.I0.a(1);
            }
            z2b z2bVar = f85Var.H0;
            f85Var = this;
            f85Var.H0 = new z2b(z2bVar.a, z2bVar.b, z2bVar.c, z2bVar.d, z2bVar.e, z2bVar.f, z2bVar.g, z2bVar.h, z2bVar.i, z2bVar.j, z2bVar.k, z2bVar.l, z2bVar.m, b3bVar, z2bVar.q, z2bVar.r, z2bVar.s, z2bVar.o, z2bVar.p);
        }
        float f2 = b3bVar.a;
        ae8 ae8Var = f85Var.D0.h;
        while (true) {
            i = 0;
            if (ae8Var == null) {
                break;
            }
            m85[] m85VarArr = (m85[]) ae8Var.n.X;
            int length = m85VarArr.length;
            while (i < length) {
                m85 m85Var = m85VarArr[i];
                if (m85Var != null) {
                    m85Var.l(f2);
                }
                i++;
            }
            ae8Var = ae8Var.l;
        }
        uj0[] uj0VarArr = f85Var.a;
        int length2 = uj0VarArr.length;
        while (i < length2) {
            uj0 uj0Var = uj0VarArr[i];
            if (uj0Var != null) {
                uj0Var.z(f, b3bVar.a);
            }
            i++;
        }
    }

    public final z2b o(xj8 xj8Var, long j, long j2, long j3, boolean z, int i) {
        l0f l0fVar;
        List list;
        sze szeVar;
        ffc ffcVarJ;
        int i2;
        this.X0 = (!this.X0 && j == this.H0.s && xj8Var.equals(this.H0.b)) ? false : true;
        B();
        z2b z2bVar = this.H0;
        sze szeVar2 = z2bVar.h;
        l0f l0fVar2 = z2bVar.i;
        List list2 = z2bVar.j;
        if (this.E0.g) {
            ae8 ae8Var = this.D0.h;
            sze szeVar3 = ae8Var == null ? sze.o : ae8Var.m;
            l0f l0fVar3 = ae8Var == null ? this.X : ae8Var.n;
            m85[] m85VarArr = (m85[]) l0fVar3.X;
            ww6 ww6Var = new ww6(4);
            int length = m85VarArr.length;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                m85 m85Var = m85VarArr[i3];
                if (m85Var == null) {
                    i2 = 1;
                } else {
                    e99 e99Var = m85Var.d(0).u0;
                    if (e99Var == null) {
                        ww6Var.a(new e99(new c99[0]));
                        i2 = 1;
                    } else {
                        ww6Var.a(e99Var);
                        i2 = 1;
                        z2 = true;
                    }
                }
                i3 += i2;
            }
            if (z2) {
                ffcVarJ = ww6Var.j();
            } else {
                ls5 ls5Var = zw6.b;
                ffcVarJ = ffc.X;
            }
            if (ae8Var != null) {
                de8 de8Var = ae8Var.f;
                if (de8Var.c != j2) {
                    ae8Var.f = de8Var.a(j2);
                }
            }
            list = ffcVarJ;
            szeVar = szeVar3;
            l0fVar = l0fVar3;
        } else if (xj8Var.equals(z2bVar.b)) {
            l0fVar = l0fVar2;
            list = list2;
            szeVar = szeVar2;
        } else {
            szeVar = sze.o;
            l0fVar = this.X;
            list = ffc.X;
        }
        if (z) {
            a85 a85Var = this.I0;
            if (!a85Var.d || a85Var.e == 5) {
                a85Var.a = true;
                a85Var.d = true;
                a85Var.e = i;
            } else {
                np8.d(i == 5);
            }
        }
        z2b z2bVar2 = this.H0;
        long j4 = z2bVar2.q;
        ae8 ae8Var2 = this.D0.j;
        return z2bVar2.b(xj8Var, j, j2, j3, ae8Var2 == null ? 0L : Math.max(0L, j4 - (this.V0 - ae8Var2.o)), szeVar, l0fVar, list);
    }

    public final boolean p() {
        ae8 ae8Var = this.D0.j;
        if (ae8Var == null) {
            return false;
        }
        return (!ae8Var.d ? 0L : ae8Var.a.f()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        ae8 ae8Var = this.D0.h;
        long j = ae8Var.f.e;
        return ae8Var.d && (j == -9223372036854775807L || this.H0.s < j || !W());
    }

    public final void s() {
        int i;
        boolean z;
        boolean zP = p();
        fe8 fe8Var = this.D0;
        if (zP) {
            ae8 ae8Var = fe8Var.j;
            long jF = !ae8Var.d ? 0L : ae8Var.a.f();
            ae8 ae8Var2 = this.D0.j;
            long jMax = ae8Var2 != null ? Math.max(0L, jF - (this.V0 - ae8Var2.o)) : 0L;
            if (ae8Var != fe8Var.h) {
                long j = ae8Var.f.b;
            }
            float f = this.z0.d().a;
            ec4 ec4Var = this.Y;
            n64 n64Var = ec4Var.a;
            synchronized (n64Var) {
                i = n64Var.e * n64Var.c;
            }
            boolean z2 = i >= ec4Var.j;
            long j2 = ec4Var.c;
            long jMin = ec4Var.b;
            if (f > 1.0f) {
                jMin = Math.min(maf.s(f, jMin), j2);
            }
            if (jMax < Math.max(jMin, 500000L)) {
                ec4Var.k = ec4Var.g || !z2;
            } else if (jMax >= j2 || z2) {
                ec4Var.k = false;
            }
            z = ec4Var.k;
        } else {
            z = false;
        }
        this.N0 = z;
        if (z) {
            ae8 ae8Var3 = fe8Var.j;
            long j3 = this.V0;
            np8.f(ae8Var3.l == null);
            ae8Var3.a.C(j3 - ae8Var3.o);
        }
        b0();
    }

    public final void t() {
        a85 a85Var = this.I0;
        z2b z2bVar = this.H0;
        boolean z = a85Var.a | (a85Var.b != z2bVar);
        a85Var.a = z;
        a85Var.b = z2bVar;
        if (z) {
            t75 t75Var = this.C0.a;
            t75Var.u0.a.post(new kl4(t75Var, 19, a85Var));
            this.I0 = new a85(this.H0);
        }
    }

    public final void u() throws Throwable {
        l(this.E0.e(), true);
    }

    public final void v() {
        this.I0.a(1);
        throw null;
    }

    public final void w() {
        this.I0.a(1);
        int i = 0;
        A(false, false, false, true);
        this.Y.b(false);
        V(this.H0.a.q() ? 4 : 2);
        h84 h84Var = (h84) this.Z;
        h84Var.getClass();
        vk8 vk8Var = this.E0;
        np8.f(!vk8Var.g);
        vk8Var.m = h84Var;
        while (true) {
            ArrayList arrayList = (ArrayList) vk8Var.b;
            if (i >= arrayList.size()) {
                vk8Var.g = true;
                this.s0.c(2);
                return;
            } else {
                sk8 sk8Var = (sk8) arrayList.get(i);
                vk8Var.k(sk8Var);
                ((HashSet) vk8Var.f).add(sk8Var);
                i++;
            }
        }
    }

    public final void x() {
        A(true, false, true, false);
        this.Y.b(true);
        V(1);
        this.t0.quit();
        synchronized (this) {
            this.J0 = true;
            notifyAll();
        }
    }

    public final void y(int i, int i2, cod codVar) throws Throwable {
        this.I0.a(1);
        vk8 vk8Var = this.E0;
        vk8Var.getClass();
        np8.d(i >= 0 && i <= i2 && i2 <= ((ArrayList) vk8Var.b).size());
        vk8Var.l = codVar;
        vk8Var.p(i, i2);
        l(vk8Var.e(), false);
    }

    public final void z() throws ExoPlaybackException {
        float f = this.z0.d().a;
        fe8 fe8Var = this.D0;
        ae8 ae8Var = fe8Var.h;
        ae8 ae8Var2 = fe8Var.i;
        boolean z = true;
        for (ae8 ae8Var3 = ae8Var; ae8Var3 != null && ae8Var3.d; ae8Var3 = ae8Var3.l) {
            l0f l0fVarG = ae8Var3.g(f, this.H0.a);
            l0f l0fVar = ae8Var3.n;
            if (l0fVar != null) {
                int length = ((m85[]) l0fVar.X).length;
                m85[] m85VarArr = (m85[]) l0fVarG.X;
                if (length == m85VarArr.length) {
                    for (int i = 0; i < m85VarArr.length; i++) {
                        if (l0fVarG.F(l0fVar, i)) {
                        }
                    }
                    if (ae8Var3 == ae8Var2) {
                        z = false;
                    }
                }
            }
            if (z) {
                fe8 fe8Var2 = this.D0;
                ae8 ae8Var4 = fe8Var2.h;
                boolean zK = fe8Var2.k(ae8Var4);
                boolean[] zArr = new boolean[this.a.length];
                long jA = ae8Var4.a(l0fVarG, this.H0.s, zK, zArr);
                z2b z2bVar = this.H0;
                boolean z2 = (z2bVar.e == 4 || jA == z2bVar.s) ? false : true;
                z2b z2bVar2 = this.H0;
                this.H0 = o(z2bVar2.b, jA, z2bVar2.c, z2bVar2.d, z2, 5);
                if (z2) {
                    C(jA);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    uj0[] uj0VarArr = this.a;
                    if (i2 >= uj0VarArr.length) {
                        break;
                    }
                    uj0 uj0Var = uj0VarArr[i2];
                    boolean zQ = q(uj0Var);
                    zArr2[i2] = zQ;
                    frc frcVar = ae8Var4.c[i2];
                    if (zQ) {
                        if (frcVar != uj0Var.Z) {
                            b(uj0Var);
                        } else if (zArr[i2]) {
                            long j = this.V0;
                            uj0Var.v0 = false;
                            uj0Var.u0 = j;
                            uj0Var.o(j, false);
                        }
                    }
                    i2++;
                }
                f(zArr2);
            } else {
                this.D0.k(ae8Var3);
                if (ae8Var3.d) {
                    ae8Var3.a(l0fVarG, Math.max(ae8Var3.f.b, this.V0 - ae8Var3.o), false, new boolean[ae8Var3.i.length]);
                }
            }
            k(true);
            if (this.H0.e != 4) {
                s();
                d0();
                this.s0.c(2);
                return;
            }
            return;
        }
    }
}
