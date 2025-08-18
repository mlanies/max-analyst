package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public class w98 implements z88 {
    public k4b A;
    public final a98 a;
    public final cd6 b;
    public final ga8 c;
    public final Context d;
    public final obd e;
    public final Bundle f;
    public final p98 g;
    public final pm7 h;
    public final va8 i;
    public final xs j;
    public obd k;
    public v98 l;
    public boolean m;
    public zw6 o;
    public ffc p;
    public k3b r;
    public k3b s;
    public k3b t;
    public Surface u;
    public qr6 w;
    public long x;
    public long y;
    public m4b z;
    public m4b n = m4b.F;
    public lsd v = lsd.c;
    public z9d q = z9d.b;

    /* JADX WARN: Type inference failed for: r5v4, types: [p98] */
    public w98(Context context, a98 a98Var, obd obdVar, Bundle bundle, Looper looper) {
        ffc ffcVar = ffc.X;
        this.o = ffcVar;
        this.p = ffcVar;
        k3b k3bVar = k3b.b;
        this.r = k3bVar;
        this.s = k3bVar;
        this.t = i(k3bVar, k3bVar);
        this.h = new pm7(looper, she.a, new k98(this, 6));
        this.a = a98Var;
        fm9.i(context, "context must not be null");
        fm9.i(obdVar, "token must not be null");
        this.d = context;
        this.b = new cd6();
        this.c = new ga8(this);
        this.j = new xs(0);
        this.e = obdVar;
        this.f = bundle;
        this.g = new IBinder.DeathRecipient() { // from class: p98
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                a98 a98Var2 = this.a.a;
                Objects.requireNonNull(a98Var2);
                a98Var2.G(new nn6(9, a98Var2));
            }
        };
        Bundle bundle2 = Bundle.EMPTY;
        this.l = obdVar.a.getType() == 0 ? null : new v98(this, bundle);
        this.i = new va8(this, looper);
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
    }

    public static int P(m4b m4bVar) {
        int i = m4bVar.c.a.b;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static m4b W(m4b m4bVar, int i, List list, long j, long j2) {
        int size;
        int size2;
        mue mueVar = m4bVar.j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < mueVar.p(); i2++) {
            arrayList.add(mueVar.n(i2, new kue(), 0L));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            tb8 tb8Var = (tb8) list.get(i3);
            kue kueVar = new kue();
            kueVar.b(0, tb8Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i3 + i, kueVar);
        }
        X0(mueVar, arrayList, arrayList2);
        iue iueVarJ = j(arrayList, arrayList2);
        if (m4bVar.j.q()) {
            size2 = 0;
            size = 0;
        } else {
            qad qadVar = m4bVar.c;
            size = qadVar.a.b;
            if (size >= i) {
                size += list.size();
            }
            size2 = qadVar.a.e;
            if (size2 >= i) {
                size2 += list.size();
            }
        }
        return i0(m4bVar, iueVarJ, size, size2, j, j2, 5);
    }

    public static void X0(mue mueVar, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            kue kueVar = (kue) arrayList.get(i);
            int i2 = kueVar.n;
            int i3 = kueVar.o;
            if (i2 == -1 || i3 == -1) {
                kueVar.n = arrayList2.size();
                kueVar.o = arrayList2.size();
                hue hueVar = new hue();
                hueVar.j(null, null, i, -9223372036854775807L, 0L, s8.g, true);
                arrayList2.add(hueVar);
            } else {
                kueVar.n = arrayList2.size();
                kueVar.o = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    hue hueVar2 = new hue();
                    mueVar.g(i2, hueVar2, false);
                    hueVar2.c = i;
                    arrayList2.add(hueVar2);
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        r8 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.m4b c0(defpackage.m4b r46, int r47, int r48, boolean r49, long r50, long r52) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w98.c0(m4b, int, int, boolean, long, long):m4b");
    }

    public static k3b i(k3b k3bVar, k3b k3bVar2) {
        k3b k3bVarR = j47.R(k3bVar, k3bVar2);
        if (k3bVarR.a(32)) {
            return k3bVarR;
        }
        rm5 rm5Var = new rm5(1);
        rm5Var.b(k3bVarR.a);
        rm5Var.a(32);
        return new k3b(rm5Var.e());
    }

    public static m4b i0(m4b m4bVar, iue iueVar, int i, int i2, long j, long j2, int i3) {
        kue kueVar = new kue();
        iueVar.n(i, kueVar, 0L);
        tb8 tb8Var = kueVar.c;
        p3b p3bVar = m4bVar.c.a;
        p3b p3bVar2 = new p3b(null, i, tb8Var, null, i2, j, j2, p3bVar.h, p3bVar.i);
        qad qadVar = m4bVar.c;
        return y0(m4bVar, iueVar, p3bVar2, new qad(p3bVar2, qadVar.b, SystemClock.elapsedRealtime(), qadVar.d, qadVar.e, qadVar.f, qadVar.g, qadVar.h, qadVar.i, qadVar.j), i3);
    }

    public static iue j(ArrayList arrayList, ArrayList arrayList2) {
        ww6 ww6Var = new ww6(4);
        ww6Var.e(arrayList);
        ffc ffcVarJ = ww6Var.j();
        ww6 ww6Var2 = new ww6(4);
        ww6Var2.e(arrayList2);
        ffc ffcVarJ2 = ww6Var2.j();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new iue(ffcVarJ, ffcVarJ2, iArr);
    }

    public static m4b y0(m4b m4bVar, mue mueVar, p3b p3bVar, qad qadVar, int i) {
        PlaybackException playbackException = m4bVar.a;
        p3b p3bVar2 = m4bVar.c.a;
        fm9.k(mueVar.q() || qadVar.a.b < mueVar.p());
        return new m4b(playbackException, m4bVar.b, qadVar, p3bVar2, p3bVar, i, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
    }

    @Override // defpackage.z88
    public final long A() {
        return this.n.c.i;
    }

    @Override // defpackage.z88
    public final void A0(int i, tb8 tb8Var) {
        if (T(20)) {
            fm9.f(i >= 0);
            G(new ui0(this, i, tb8Var, 7));
            Z0(zw6.n(tb8Var), i, i + 1);
        }
    }

    @Override // defpackage.z88
    public final int B() {
        return this.n.c.a.e;
    }

    public final void B0(int i, int i2) {
        lsd lsdVar = this.v;
        if (lsdVar.a == i && lsdVar.b == i2) {
            return;
        }
        this.v = new lsd(i, i2);
        this.h.f(24, new h75(i, i2, 2));
    }

    @Override // defpackage.z88
    public final jlf C() {
        return this.n.l;
    }

    @Override // defpackage.z88
    public final void C0(tb8 tb8Var) {
        if (T(31)) {
            G(new xd5(this, tb8Var, 4));
            d1(Collections.singletonList(tb8Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.z88
    public final void D() {
        if (T(6)) {
            G(new k98(this, 3));
            if (R0() != -1) {
                a1(R0(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.z88
    public final void D0() {
        if (T(26)) {
            G(new k98(this, 10));
            m4b m4bVar = this.n;
            int i = m4bVar.r + 1;
            int i2 = m4bVar.q.c;
            if (i2 == 0 || i <= i2) {
                this.n = m4bVar.c(i, m4bVar.s);
                j98 j98Var = new j98(this, i, 3);
                pm7 pm7Var = this.h;
                pm7Var.c(30, j98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void E() {
        if (T(4)) {
            G(new k98(this, 2));
            a1(P(this.n), -9223372036854775807L);
        }
    }

    @Override // defpackage.z88
    public final boolean E0() {
        return this.n.i;
    }

    @Override // defpackage.z88
    public final h30 F() {
        return this.n.o;
    }

    @Override // defpackage.z88
    public final j0f F0() {
        return this.n.E;
    }

    public final void G(u98 u98Var) {
        va8 va8Var = this.i;
        if (((w98) va8Var.c).w != null) {
            Handler handler = (Handler) va8Var.b;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        o(this.w, u98Var, true);
    }

    @Override // defpackage.z88
    public final long G0() {
        return this.n.c.j;
    }

    @Override // defpackage.z88
    public final void H(int i, boolean z) {
        if (T(34)) {
            G(new u64(this, z, i));
            m4b m4bVar = this.n;
            if (m4bVar.s != z) {
                this.n = m4bVar.c(m4bVar.r, z);
                o98 o98Var = new o98(this, z, 0);
                pm7 pm7Var = this.h;
                pm7Var.c(30, o98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void H0(final int i, final long j, final List list) {
        if (T(20)) {
            G(new u98() { // from class: q98
                @Override // defpackage.u98
                public final void c(qr6 qr6Var, int i2) {
                    w98 w98Var = this.a;
                    w98Var.getClass();
                    ww6 ww6VarI = zw6.i();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            qr6Var.v(w98Var.c, i2, new pu0(ww6VarI.j()), i, j);
                            return;
                        }
                        ww6VarI.a(((tb8) list2.get(i3)).d(true));
                        i3++;
                    }
                }
            });
            d1(list, i, j, false);
        }
    }

    @Override // defpackage.z88
    public final ui4 I() {
        return this.n.q;
    }

    @Override // defpackage.z88
    public final void I0(int i) {
        if (T(25)) {
            G(new j98(this, i, 7));
            m4b m4bVar = this.n;
            ui4 ui4Var = m4bVar.q;
            if (m4bVar.r == i || ui4Var.b > i) {
                return;
            }
            int i2 = ui4Var.c;
            if (i2 == 0 || i <= i2) {
                this.n = m4bVar.c(i, m4bVar.s);
                j98 j98Var = new j98(this, i, 8);
                pm7 pm7Var = this.h;
                pm7Var.c(30, j98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void J() {
        if (T(26)) {
            G(new k98(this, 15));
            m4b m4bVar = this.n;
            int i = m4bVar.r - 1;
            if (i >= m4bVar.q.b) {
                this.n = m4bVar.c(i, m4bVar.s);
                j98 j98Var = new j98(this, i, 9);
                pm7 pm7Var = this.h;
                pm7Var.c(30, j98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void J0() {
        if (T(9)) {
            G(new k98(this, 8));
            mue mueVar = this.n.j;
            if (mueVar.q() || n()) {
                return;
            }
            if (j0()) {
                a1(T0(), -9223372036854775807L);
                return;
            }
            kue kueVarN = mueVar.n(P(this.n), new kue(), 0L);
            if (kueVarN.i && kueVarN.a()) {
                a1(P(this.n), -9223372036854775807L);
            }
        }
    }

    public final void K(u98 u98Var) {
        va8 va8Var = this.i;
        if (((w98) va8Var.c).w != null) {
            Handler handler = (Handler) va8Var.b;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        bm7 bm7VarO = o(this.w, u98Var, true);
        try {
            gf7.v(bm7VarO);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        } catch (TimeoutException e2) {
            if (bm7VarO instanceof k6d) {
                int i = ((k6d) bm7VarO).s0;
                this.j.remove(Integer.valueOf(i));
                this.b.s(i, new sad(-1));
            }
            z04.d0("Synchronous command takes too long on the session side.", e2);
        }
    }

    @Override // defpackage.z88
    public final void K0() {
        if (T(12)) {
            G(new k98(this, 1));
            b1(this.n.B);
        }
    }

    @Override // defpackage.z88
    public final void L(int i, int i2) {
        if (T(33)) {
            G(new l98(this, i, i2, 1));
            m4b m4bVar = this.n;
            ui4 ui4Var = m4bVar.q;
            if (m4bVar.r == i || ui4Var.b > i) {
                return;
            }
            int i3 = ui4Var.c;
            if (i3 == 0 || i <= i3) {
                this.n = m4bVar.c(i, m4bVar.s);
                j98 j98Var = new j98(this, i, 1);
                pm7 pm7Var = this.h;
                pm7Var.c(30, j98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void L0() {
        if (T(11)) {
            G(new k98(this, 7));
            b1(-this.n.A);
        }
    }

    @Override // defpackage.z88
    public final boolean M() {
        return R0() != -1;
    }

    public final void M0(int i, int i2, int i3) {
        int i4;
        int i5;
        mue mueVar = this.n.j;
        int iP = mueVar.p();
        int iMin = Math.min(i2, iP);
        int i6 = iMin - i;
        int iMin2 = Math.min(i3, iP - i6);
        if (i >= iP || i == iMin || i == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < iP; i7++) {
            arrayList.add(mueVar.n(i7, new kue(), 0L));
        }
        oaf.R(arrayList, i, iMin, iMin2);
        X0(mueVar, arrayList, arrayList2);
        iue iueVarJ = j(arrayList, arrayList2);
        if (iueVarJ.q()) {
            return;
        }
        int iP2 = P(this.n);
        if (iP2 >= i && iP2 < iMin) {
            i5 = (iP2 - i) + iMin2;
        } else {
            if (iMin > iP2 || iMin2 <= iP2) {
                i4 = (iMin <= iP2 || iMin2 > iP2) ? iP2 : i6 + iP2;
                kue kueVar = new kue();
                int i8 = this.n.c.a.e - mueVar.n(iP2, kueVar, 0L).n;
                iueVarJ.n(i4, kueVar, 0L);
                f1(i0(this.n, iueVarJ, i4, kueVar.n + i8, k(), b0(), 5), 0, null, null, null);
            }
            i5 = iP2 - i6;
        }
        i4 = i5;
        kue kueVar2 = new kue();
        int i82 = this.n.c.a.e - mueVar.n(iP2, kueVar2, 0L).n;
        iueVarJ.n(i4, kueVar2, 0L);
        f1(i0(this.n, iueVarJ, i4, kueVar2.n + i82, k(), b0(), 5), 0, null, null, null);
    }

    @Override // defpackage.z88
    public final void N(int i) {
        if (T(34)) {
            G(new j98(this, i, 4));
            m4b m4bVar = this.n;
            int i2 = m4bVar.r + 1;
            int i3 = m4bVar.q.c;
            if (i3 == 0 || i2 <= i3) {
                this.n = m4bVar.c(i2, m4bVar.s);
                j98 j98Var = new j98(this, i2, 5);
                pm7 pm7Var = this.h;
                pm7Var.c(30, j98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final gd8 N0() {
        return this.n.z;
    }

    @Override // defpackage.z88
    public final int O() {
        return this.n.c.a.i;
    }

    @Override // defpackage.z88
    public final void O0(List list) {
        if (T(20)) {
            G(new xd5(this, list, 3));
            d1(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.z88
    public final long P0() {
        return this.n.A;
    }

    @Override // defpackage.z88
    public final void Q(j0f j0fVar) {
        if (T(29)) {
            G(new d74(this, 25, j0fVar));
            m4b m4bVar = this.n;
            if (j0fVar != m4bVar.E) {
                this.n = m4bVar.o(j0fVar);
                k75 k75Var = new k75(j0fVar, 1);
                pm7 pm7Var = this.h;
                pm7Var.c(19, k75Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final z9d Q0() {
        return this.q;
    }

    public final b11 R(mue mueVar, int i, long j) {
        int i2;
        if (mueVar.q()) {
            return null;
        }
        kue kueVar = new kue();
        hue hueVar = new hue();
        if (i == -1 || i >= mueVar.p()) {
            i = mueVar.a(this.n.i);
            j = oaf.h0(mueVar.n(i, kueVar, 0L).l);
        }
        long jS = oaf.S(j);
        fm9.g(i, mueVar.p());
        mueVar.o(i, kueVar);
        if (jS == -9223372036854775807L) {
            jS = kueVar.l;
            if (jS == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = kueVar.n;
        mueVar.g(i3, hueVar, false);
        do {
            i2 = i3;
            if (i2 >= kueVar.o || hueVar.e == jS) {
                break;
            }
            i3 = i2 + 1;
        } while (mueVar.g(i3, hueVar, false).e <= jS);
        mueVar.g(i2, hueVar, false);
        return new b11(jS - hueVar.e, i2, 6, false);
    }

    @Override // defpackage.z88
    public final int R0() {
        if (this.n.j.q()) {
            return -1;
        }
        m4b m4bVar = this.n;
        mue mueVar = m4bVar.j;
        int iP = P(m4bVar);
        m4b m4bVar2 = this.n;
        int i = m4bVar2.h;
        if (i == 1) {
            i = 0;
        }
        return mueVar.l(iP, i, m4bVar2.i);
    }

    @Override // defpackage.z88
    public final void S(int i) {
        if (T(20)) {
            fm9.f(i >= 0);
            G(new j98(this, i, 2));
            Y0(i, i + 1);
        }
    }

    @Override // defpackage.z88
    public final bm7 S0(y9d y9dVar, Bundle bundle) {
        qr6 qr6Var;
        u00 u00Var = new u00(this, y9dVar, bundle, 15);
        fm9.f(y9dVar.a == 0);
        z9d z9dVar = this.q;
        z9dVar.getClass();
        if (z9dVar.a.contains(y9dVar)) {
            qr6Var = this.w;
        } else {
            z04.c0("Controller isn't allowed to call custom session command:" + y9dVar.b);
            qr6Var = null;
        }
        return o(qr6Var, u00Var, false);
    }

    public final boolean T(int i) {
        if (this.t.a(i)) {
            return true;
        }
        ey8.k(i, "Controller isn't allowed to call command= ");
        return false;
    }

    @Override // defpackage.z88
    public final int T0() {
        if (this.n.j.q()) {
            return -1;
        }
        m4b m4bVar = this.n;
        mue mueVar = m4bVar.j;
        int iP = P(m4bVar);
        m4b m4bVar2 = this.n;
        int i = m4bVar2.h;
        if (i == 1) {
            i = 0;
        }
        return mueVar.e(iP, i, m4bVar2.i);
    }

    @Override // defpackage.z88
    public final void U(int i, int i2) {
        if (T(20)) {
            fm9.f(i >= 0 && i2 >= i);
            G(new l98(this, i, i2, 0));
            Y0(i, i2);
        }
    }

    @Override // defpackage.z88
    public final void U0(tb8 tb8Var) {
        if (T(31)) {
            G(new d74(this, 26, tb8Var));
            d1(Collections.singletonList(tb8Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.z88
    public final void V() {
        if (T(7)) {
            G(new k98(this, 4));
            mue mueVar = this.n.j;
            if (mueVar.q() || n()) {
                return;
            }
            boolean zM = M();
            kue kueVarN = mueVar.n(P(this.n), new kue(), 0L);
            if (kueVarN.i && kueVarN.a()) {
                if (zM) {
                    a1(R0(), -9223372036854775807L);
                }
            } else if (!zM || k() > this.n.C) {
                a1(P(this.n), 0L);
            } else {
                a1(R0(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.z88
    public final zw6 V0() {
        return this.p;
    }

    public final void W0(m4b m4bVar, final m4b m4bVar2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        pm7 pm7Var = this.h;
        if (num != null) {
            final int i = 0;
            pm7Var.c(0, new km7() { // from class: r98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i) {
                        case 0:
                            n3bVar.f0(m4bVar2.j, num.intValue());
                            break;
                        case 1:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.q(m4bVar3.d, m4bVar3.e, num.intValue());
                            break;
                        default:
                            n3bVar.d(num.intValue(), m4bVar2.t);
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i2 = 1;
            pm7Var.c(11, new km7() { // from class: r98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i2) {
                        case 0:
                            n3bVar.f0(m4bVar2.j, num3.intValue());
                            break;
                        case 1:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.q(m4bVar3.d, m4bVar3.e, num3.intValue());
                            break;
                        default:
                            n3bVar.d(num3.intValue(), m4bVar2.t);
                            break;
                    }
                }
            });
        }
        tb8 tb8VarS = m4bVar2.s();
        if (num4 != null) {
            pm7Var.c(1, new d74(tb8VarS, 28, num4));
        }
        PlaybackException playbackException = m4bVar.a;
        PlaybackException playbackException2 = m4bVar2.a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            pm7Var.c(10, new t98(0, playbackException2));
            if (playbackException2 != null) {
                pm7Var.c(10, new t98(1, playbackException2));
            }
        }
        if (!m4bVar.D.equals(m4bVar2.D)) {
            final int i3 = 17;
            pm7Var.c(2, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i3) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (!m4bVar.z.equals(m4bVar2.z)) {
            final int i4 = 18;
            pm7Var.c(14, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i4) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.w != m4bVar2.w) {
            final int i5 = 19;
            pm7Var.c(3, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i5) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.y != m4bVar2.y) {
            final int i6 = 20;
            pm7Var.c(4, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i6) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i7 = 2;
            pm7Var.c(5, new km7() { // from class: r98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i7) {
                        case 0:
                            n3bVar.f0(m4bVar2.j, num2.intValue());
                            break;
                        case 1:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.q(m4bVar3.d, m4bVar3.e, num2.intValue());
                            break;
                        default:
                            n3bVar.d(num2.intValue(), m4bVar2.t);
                            break;
                    }
                }
            });
        }
        if (m4bVar.x != m4bVar2.x) {
            final int i8 = 0;
            pm7Var.c(6, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i8) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.v != m4bVar2.v) {
            final int i9 = 1;
            pm7Var.c(7, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i9) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (!m4bVar.g.equals(m4bVar2.g)) {
            final int i10 = 2;
            pm7Var.c(12, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i10) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.h != m4bVar2.h) {
            final int i11 = 3;
            pm7Var.c(8, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i11) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.i != m4bVar2.i) {
            final int i12 = 4;
            pm7Var.c(9, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i12) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (!m4bVar.m.equals(m4bVar2.m)) {
            final int i13 = 5;
            pm7Var.c(15, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i13) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.n != m4bVar2.n) {
            final int i14 = 6;
            pm7Var.c(22, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i14) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (!m4bVar.o.equals(m4bVar2.o)) {
            final int i15 = 7;
            pm7Var.c(20, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i15) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (!m4bVar.p.a.equals(m4bVar2.p.a)) {
            final int i16 = 8;
            pm7Var.c(27, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i16) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
            final int i17 = 9;
            pm7Var.c(27, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i17) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (!m4bVar.q.equals(m4bVar2.q)) {
            final int i18 = 10;
            pm7Var.c(29, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i18) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.r != m4bVar2.r || m4bVar.s != m4bVar2.s) {
            final int i19 = 11;
            pm7Var.c(30, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i19) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (!m4bVar.l.equals(m4bVar2.l)) {
            final int i20 = 12;
            pm7Var.c(25, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i20) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.A != m4bVar2.A) {
            final int i21 = 13;
            pm7Var.c(16, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i21) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.B != m4bVar2.B) {
            final int i22 = 14;
            pm7Var.c(17, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i22) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (m4bVar.C != m4bVar2.C) {
            final int i23 = 15;
            pm7Var.c(18, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i23) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        if (!m4bVar.E.equals(m4bVar2.E)) {
            final int i24 = 16;
            pm7Var.c(19, new km7() { // from class: s98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i24) {
                        case 0:
                            n3bVar.a(m4bVar2.x);
                            break;
                        case 1:
                            n3bVar.n(m4bVar2.v);
                            break;
                        case 2:
                            n3bVar.p0(m4bVar2.g);
                            break;
                        case 3:
                            n3bVar.onRepeatModeChanged(m4bVar2.h);
                            break;
                        case 4:
                            n3bVar.O(m4bVar2.i);
                            break;
                        case 5:
                            n3bVar.c0(m4bVar2.m);
                            break;
                        case 6:
                            n3bVar.f(m4bVar2.n);
                            break;
                        case 7:
                            n3bVar.u(m4bVar2.o);
                            break;
                        case 8:
                            n3bVar.k(m4bVar2.p.a);
                            break;
                        case 9:
                            n3bVar.S(m4bVar2.p);
                            break;
                        case 10:
                            n3bVar.t0(m4bVar2.q);
                            break;
                        case 11:
                            m4b m4bVar3 = m4bVar2;
                            n3bVar.i(m4bVar3.r, m4bVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            n3bVar.v(m4bVar2.l);
                            break;
                        case 13:
                            n3bVar.a0(m4bVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            n3bVar.d0(m4bVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            n3bVar.u0(m4bVar2.C);
                            break;
                        case 16:
                            n3bVar.y(m4bVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            n3bVar.X(m4bVar2.D);
                            break;
                        case 18:
                            n3bVar.b0(m4bVar2.z);
                            break;
                        case 19:
                            n3bVar.c(m4bVar2.w);
                            break;
                        default:
                            n3bVar.h(m4bVar2.y);
                            break;
                    }
                }
            });
        }
        pm7Var.b();
    }

    @Override // defpackage.z88
    public final PlaybackException X() {
        return this.n.a;
    }

    @Override // defpackage.z88
    public final void Y(boolean z) {
        if (T(1)) {
            G(new o98(this, z, 4));
            e1(z);
        } else if (z) {
            z04.c0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    public final void Y0(int i, int i2) {
        int iP = this.n.j.p();
        int iMin = Math.min(i2, iP);
        if (i >= iP || i == iMin || iP == 0) {
            return;
        }
        boolean z = P(this.n) >= i && P(this.n) < iMin;
        m4b m4bVarC0 = c0(this.n, i, iMin, false, k(), b0());
        int i3 = this.n.c.a.b;
        f1(m4bVarC0, 0, null, z ? 4 : null, i3 >= i && i3 < iMin ? 3 : null);
    }

    @Override // defpackage.z88
    public final void Z(int i) {
        if (T(10)) {
            fm9.f(i >= 0);
            G(new j98(this, i, 0));
            a1(i, -9223372036854775807L);
        }
    }

    public final void Z0(List list, int i, int i2) {
        int iP = this.n.j.p();
        if (i > iP) {
            return;
        }
        if (this.n.j.q()) {
            d1(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i2, iP);
        m4b m4bVarC0 = c0(W(this.n, iMin, list, k(), b0()), i, iMin, true, k(), b0());
        int i3 = this.n.c.a.b;
        boolean z = i3 >= i && i3 < iMin;
        f1(m4bVarC0, 0, null, z ? 4 : null, z ? 3 : null);
    }

    @Override // defpackage.z88
    public final boolean a() {
        return this.n.w;
    }

    @Override // defpackage.z88
    public final long a0() {
        return this.n.B;
    }

    public final void a1(int i, long j) {
        int i2;
        int i3;
        m4b m4bVarJ;
        m4b m4bVarY0;
        mue mueVar = this.n.j;
        if ((mueVar.q() || i < mueVar.p()) && !n()) {
            m4b m4bVar = this.n;
            m4b m4bVarF = m4bVar.f(m4bVar.y == 1 ? 1 : 2, m4bVar.a);
            b11 b11VarR = R(mueVar, i, j);
            if (b11VarR == null) {
                i2 = 1;
                p3b p3bVar = new p3b(null, i, null, null, i, j == -9223372036854775807L ? 0L : j, j == -9223372036854775807L ? 0L : j, -1, -1);
                m4b m4bVar2 = this.n;
                mue mueVar2 = m4bVar2.j;
                boolean z = this.n.c.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                qad qadVar = this.n.c;
                m4bVarY0 = y0(m4bVar2, mueVar2, p3bVar, new qad(p3bVar, z, jElapsedRealtime, qadVar.d, j == -9223372036854775807L ? 0L : j, 0, 0L, qadVar.h, qadVar.i, j == -9223372036854775807L ? 0L : j), 1);
                i3 = 0;
            } else {
                i2 = 1;
                qad qadVar2 = m4bVarF.c;
                int i4 = qadVar2.a.e;
                hue hueVar = new hue();
                mueVar.g(i4, hueVar, false);
                hue hueVar2 = new hue();
                int i5 = b11VarR.b;
                mueVar.g(i5, hueVar2, false);
                boolean z2 = i4 != i5;
                long jS = oaf.S(k()) - hueVar.e;
                long j2 = b11VarR.c;
                if (z2 || j2 != jS) {
                    p3b p3bVar2 = qadVar2.a;
                    fm9.k(p3bVar2.h == -1);
                    boolean z3 = z2;
                    p3b p3bVar3 = new p3b(null, hueVar.c, p3bVar2.c, null, i4, oaf.h0(hueVar.e + jS), oaf.h0(hueVar.e + jS), -1, -1);
                    i3 = 0;
                    mueVar.g(i5, hueVar2, false);
                    kue kueVar = new kue();
                    mueVar.o(hueVar2.c, kueVar);
                    p3b p3bVar4 = new p3b(null, hueVar2.c, kueVar.c, null, i5, oaf.h0(hueVar2.e + j2), oaf.h0(hueVar2.e + j2), -1, -1);
                    m4b m4bVarH = m4bVarF.h(p3bVar3, p3bVar4, 1);
                    if (z3 || j2 < jS) {
                        m4bVarJ = m4bVarH.j(new qad(p3bVar4, false, SystemClock.elapsedRealtime(), oaf.h0(kueVar.m), oaf.h0(hueVar2.e + j2), j47.n(oaf.h0(hueVar2.e + j2), oaf.h0(kueVar.m)), 0L, -9223372036854775807L, -9223372036854775807L, oaf.h0(hueVar2.e + j2)));
                    } else {
                        long jMax = Math.max(0L, oaf.S(m4bVarH.c.g) - (j2 - jS));
                        long j3 = j2 + jMax;
                        m4bVarJ = m4bVarH.j(new qad(p3bVar4, false, SystemClock.elapsedRealtime(), oaf.h0(kueVar.m), oaf.h0(j3), j47.n(oaf.h0(j3), oaf.h0(kueVar.m)), oaf.h0(jMax), -9223372036854775807L, -9223372036854775807L, oaf.h0(j3)));
                    }
                    m4bVarF = m4bVarJ;
                } else {
                    i3 = 0;
                }
                m4bVarY0 = m4bVarF;
            }
            boolean zQ = this.n.j.q();
            qad qadVar3 = m4bVarY0.c;
            int i6 = (zQ || qadVar3.a.b == this.n.c.a.b) ? i3 : i2;
            if (i6 == 0 && qadVar3.a.f == this.n.c.a.f) {
                return;
            }
            f1(m4bVarY0, null, null, Integer.valueOf(i2), i6 != 0 ? 2 : null);
        }
    }

    @Override // defpackage.z88
    public final boolean b() {
        return this.n.v;
    }

    @Override // defpackage.z88
    public final long b0() {
        qad qadVar = this.n.c;
        return !qadVar.b ? k() : qadVar.a.g;
    }

    public final void b1(long j) {
        long jK = k() + j;
        long jC = c();
        if (jC != -9223372036854775807L) {
            jK = Math.min(jK, jC);
        }
        a1(P(this.n), Math.max(jK, 0L));
    }

    @Override // defpackage.z88
    public final long c() {
        return this.n.c.d;
    }

    public final void c1(int i, ew6 ew6Var) {
        ew6Var.d(new si1(this, ew6Var, i, 13), nk4.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [qr6] */
    @Override // defpackage.z88
    public final void connect() {
        or6 or6Var;
        obd obdVar = this.e;
        int type = obdVar.a.getType();
        nbd nbdVar = obdVar.a;
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.l = null;
            Object objC = nbdVar.c();
            fm9.l(objC);
            IBinder iBinder = (IBinder) objC;
            int i = sj8.i;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qr6)) {
                or6 or6Var2 = new or6();
                or6Var2.c = iBinder;
                or6Var = or6Var2;
            } else {
                or6Var = (qr6) iInterfaceQueryLocalInterface;
            }
            try {
                or6Var.j0(this.c, this.b.i(), new oh3(context.getPackageName(), Process.myPid(), bundle).b());
                return;
            } catch (RemoteException e) {
                z04.d0("Failed to call connection request.", e);
            }
        } else {
            this.l = new v98(this, bundle);
            int i2 = oaf.a >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(nbdVar.getPackageName(), nbdVar.d());
            if (context.bindService(intent, this.l, i2)) {
                return;
            }
            z04.c0("bind to " + obdVar + " failed");
        }
        a98 a98Var = this.a;
        Objects.requireNonNull(a98Var);
        a98Var.G(new nn6(9, a98Var));
    }

    @Override // defpackage.z88
    public final c3b d() {
        return this.n.g;
    }

    @Override // defpackage.z88
    public final void d0(int i, List list) {
        if (T(20)) {
            fm9.f(i >= 0);
            G(new ui0(this, i, list, 8));
            h(i, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(java.util.List r66, int r67, long r68, boolean r70) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w98.d1(java.util.List, int, long, boolean):void");
    }

    @Override // defpackage.z88
    public final float e() {
        return this.n.n;
    }

    @Override // defpackage.z88
    public final long e0() {
        return this.n.c.e;
    }

    public final void e1(boolean z) {
        m4b m4bVar = this.n;
        int i = m4bVar.x;
        int i2 = i == 1 ? 0 : i;
        if (m4bVar.t == z && i == i2) {
            return;
        }
        this.x = j47.M(m4bVar, this.x, this.y, this.a.Y);
        this.y = SystemClock.elapsedRealtime();
        f1(this.n.d(1, i2, z), null, 1, null, null);
    }

    @Override // defpackage.z88
    public final void f(c3b c3bVar) {
        if (T(13)) {
            G(new d74(this, 27, c3bVar));
            if (this.n.g.equals(c3bVar)) {
                return;
            }
            this.n = this.n.e(c3bVar);
            n98 n98Var = new n98(c3bVar, 1);
            pm7 pm7Var = this.h;
            pm7Var.c(12, n98Var);
            pm7Var.b();
        }
    }

    @Override // defpackage.z88
    public final void f0() {
        if (T(8)) {
            G(new k98(this, 14));
            if (T0() != -1) {
                a1(T0(), -9223372036854775807L);
            }
        }
    }

    public final void f1(m4b m4bVar, Integer num, Integer num2, Integer num3, Integer num4) {
        m4b m4bVar2 = this.n;
        this.n = m4bVar;
        W0(m4bVar2, m4bVar, num, num2, num3, num4);
    }

    @Override // defpackage.z88
    public final void g(float f) {
        if (T(24)) {
            G(new m98(this, f, 1));
            m4b m4bVar = this.n;
            if (m4bVar.n != f) {
                this.n = m4bVar.p(f);
                b75 b75Var = new b75(2, f);
                pm7 pm7Var = this.h;
                pm7Var.c(22, b75Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void g0(int i) {
        if (T(34)) {
            G(new j98(this, i, 10));
            m4b m4bVar = this.n;
            int i2 = m4bVar.r - 1;
            if (i2 >= m4bVar.q.b) {
                this.n = m4bVar.c(i2, m4bVar.s);
                j98 j98Var = new j98(this, i2, 11);
                pm7 pm7Var = this.h;
                pm7Var.c(30, j98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final int getPlaybackState() {
        return this.n.y;
    }

    @Override // defpackage.z88
    public final int getRepeatMode() {
        return this.n.h;
    }

    public final void h(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.n.j.q()) {
            d1(list, -1, -9223372036854775807L, false);
        } else {
            f1(W(this.n, Math.min(i, this.n.j.p()), list, k(), b0()), 0, null, null, this.n.j.q() ? 3 : null);
        }
    }

    @Override // defpackage.z88
    public final p0f h0() {
        return this.n.D;
    }

    @Override // defpackage.z88
    public final boolean isConnected() {
        return this.w != null;
    }

    @Override // defpackage.z88
    public final boolean j0() {
        return T0() != -1;
    }

    @Override // defpackage.z88
    public final long k() {
        long jM = j47.M(this.n, this.x, this.y, this.a.Y);
        this.x = jM;
        return jM;
    }

    @Override // defpackage.z88
    public final gd8 k0() {
        return this.n.m;
    }

    @Override // defpackage.z88
    public final int l() {
        return this.n.r;
    }

    @Override // defpackage.z88
    public final zz3 l0() {
        return this.n.p;
    }

    @Override // defpackage.z88
    public final void m(Surface surface) {
        if (T(27)) {
            if (this.u != null) {
                this.u = null;
            }
            this.u = surface;
            K(new d74(this, 24, surface));
            int i = surface == null ? 0 : -1;
            B0(i, i);
        }
    }

    @Override // defpackage.z88
    public final void m0(h30 h30Var, boolean z) {
        if (T(35)) {
            G(new xd5(this, h30Var, z, 2));
            if (this.n.o.equals(h30Var)) {
                return;
            }
            this.n = this.n.a(h30Var);
            j75 j75Var = new j75(h30Var, 1);
            pm7 pm7Var = this.h;
            pm7Var.c(20, j75Var);
            pm7Var.b();
        }
    }

    @Override // defpackage.z88
    public final boolean n() {
        return this.n.c.b;
    }

    @Override // defpackage.z88
    public final void n0(gd8 gd8Var) {
        if (T(19)) {
            G(new d74(this, 23, gd8Var));
            if (this.n.m.equals(gd8Var)) {
                return;
            }
            this.n = this.n.g(gd8Var);
            f75 f75Var = new f75(gd8Var, 1);
            pm7 pm7Var = this.h;
            pm7Var.c(15, f75Var);
            pm7Var.b();
        }
    }

    public final bm7 o(qr6 qr6Var, u98 u98Var, boolean z) {
        int i;
        k6d k6dVar;
        if (qr6Var == null) {
            return fm9.F(new sad(-4));
        }
        cd6 cd6Var = this.b;
        sad sadVar = new sad(1);
        synchronized (cd6Var.o) {
            try {
                i = cd6Var.i();
                k6dVar = new k6d(i, sadVar);
                if (cd6Var.b) {
                    k6dVar.n();
                } else {
                    ((us) cd6Var.X).put(Integer.valueOf(i), k6dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.j.add(Integer.valueOf(i));
        }
        try {
            u98Var.c(qr6Var, i);
        } catch (RemoteException e) {
            z04.d0("Cannot connect to the service or the session is gone", e);
            this.j.remove(Integer.valueOf(i));
            this.b.s(i, new sad(-100));
        }
        return k6dVar;
    }

    @Override // defpackage.z88
    public final int o0() {
        return this.n.c.a.h;
    }

    @Override // defpackage.z88
    public final long p() {
        return this.n.c.h;
    }

    @Override // defpackage.z88
    public final int p0() {
        return P(this.n);
    }

    @Override // defpackage.z88
    public final void pause() {
        if (T(1)) {
            G(new k98(this, 9));
            e1(false);
        }
    }

    @Override // defpackage.z88
    public final void play() {
        if (!T(1)) {
            z04.c0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            G(new k98(this, 11));
            e1(true);
        }
    }

    @Override // defpackage.z88
    public final void prepare() {
        if (T(2)) {
            G(new k98(this, 13));
            m4b m4bVar = this.n;
            if (m4bVar.y == 1) {
                f1(m4bVar.f(m4bVar.j.q() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // defpackage.z88
    public final long q() {
        return this.n.c.g;
    }

    @Override // defpackage.z88
    public final void q0(boolean z) {
        if (T(26)) {
            G(new o98(this, z, 2));
            m4b m4bVar = this.n;
            if (m4bVar.s != z) {
                this.n = m4bVar.c(m4bVar.r, z);
                o98 o98Var = new o98(this, z, 3);
                pm7 pm7Var = this.h;
                pm7Var.c(30, o98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void r(int i, long j) {
        if (T(10)) {
            fm9.f(i >= 0);
            G(new e74(this, i, j, 3));
            a1(i, j);
        }
    }

    @Override // defpackage.z88
    public final void r0(n3b n3bVar) {
        this.h.e(n3bVar);
    }

    @Override // defpackage.z88
    public final void release() {
        qr6 qr6Var = this.w;
        if (this.m) {
            return;
        }
        this.m = true;
        this.k = null;
        va8 va8Var = this.i;
        Handler handler = (Handler) va8Var.b;
        if (handler.hasMessages(1)) {
            try {
                w98 w98Var = (w98) va8Var.c;
                w98Var.w.m0(w98Var.c);
            } catch (RemoteException unused) {
                z04.c0("Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.w = null;
        if (qr6Var != null) {
            int i = this.b.i();
            try {
                qr6Var.asBinder().unlinkToDeath(this.g, 0);
                qr6Var.e0(this.c, i);
            } catch (RemoteException unused2) {
            }
        }
        this.h.d();
        cd6 cd6Var = this.b;
        nn6 nn6Var = new nn6(10, this);
        synchronized (cd6Var.o) {
            try {
                Handler handlerO = oaf.o(null);
                cd6Var.Y = handlerO;
                cd6Var.c = nn6Var;
                if (((us) cd6Var.X).isEmpty()) {
                    cd6Var.k();
                } else {
                    handlerO.postDelayed(new u3c(13, cd6Var), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z88
    public final k3b s() {
        return this.t;
    }

    @Override // defpackage.z88
    public final void s0(List list, int i, int i2) {
        if (T(20)) {
            fm9.f(i >= 0 && i <= i2);
            G(new r84(this, list, i, i2));
            Z0(list, i, i2);
        }
    }

    @Override // defpackage.z88
    public final void seekTo(long j) {
        if (T(5)) {
            G(new lt1(this, j, 5));
            a1(P(this.n), j);
        }
    }

    @Override // defpackage.z88
    public final void setPlaybackSpeed(float f) {
        if (T(13)) {
            G(new m98(this, f, 0));
            c3b c3bVar = this.n.g;
            if (c3bVar.a != f) {
                c3b c3bVar2 = new c3b(f, c3bVar.b);
                this.n = this.n.e(c3bVar2);
                n98 n98Var = new n98(c3bVar2, 0);
                pm7 pm7Var = this.h;
                pm7Var.c(12, n98Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void setRepeatMode(int i) {
        if (T(15)) {
            G(new j98(this, i, 6));
            m4b m4bVar = this.n;
            if (m4bVar.h != i) {
                this.n = m4bVar.i(i);
                z64 z64Var = new z64(i, 5);
                pm7 pm7Var = this.h;
                pm7Var.c(8, z64Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void stop() {
        if (T(3)) {
            G(new k98(this, 12));
            m4b m4bVar = this.n;
            qad qadVar = this.n.c;
            p3b p3bVar = qadVar.a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            qad qadVar2 = this.n.c;
            long j = qadVar2.d;
            long j2 = qadVar2.a.f;
            int iN = j47.n(j2, j);
            qad qadVar3 = this.n.c;
            m4b m4bVarJ = m4bVar.j(new qad(p3bVar, qadVar.b, jElapsedRealtime, j, j2, iN, 0L, qadVar3.h, qadVar3.i, qadVar3.a.f));
            this.n = m4bVarJ;
            if (m4bVarJ.y != 1) {
                this.n = m4bVarJ.f(1, m4bVarJ.a);
                kp7 kp7Var = new kp7(22);
                pm7 pm7Var = this.h;
                pm7Var.c(4, kp7Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void t(tb8 tb8Var, long j) {
        if (T(31)) {
            G(new x72(this, tb8Var, j, 8));
            d1(Collections.singletonList(tb8Var), -1, j, false);
        }
    }

    @Override // defpackage.z88
    public final void t0(int i, int i2) {
        if (T(20)) {
            fm9.f(i >= 0 && i2 >= 0);
            G(new l98(this, i, i2, 2));
            M0(i, i + 1, i2);
        }
    }

    @Override // defpackage.z88
    public final boolean u() {
        return this.n.t;
    }

    @Override // defpackage.z88
    public final void u0(int i, int i2, int i3) {
        if (T(20)) {
            fm9.f(i >= 0 && i <= i2 && i3 >= 0);
            G(new ot1(this, i, i2, i3));
            M0(i, i2, i3);
        }
    }

    @Override // defpackage.z88
    public final void v() {
        if (T(20)) {
            G(new k98(this, 5));
            Y0(0, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.z88
    public final int v0() {
        return this.n.x;
    }

    @Override // defpackage.z88
    public final void w(boolean z) {
        if (T(14)) {
            G(new o98(this, z, 1));
            m4b m4bVar = this.n;
            if (m4bVar.i != z) {
                this.n = m4bVar.k(z);
                l01 l01Var = new l01(z, 6);
                pm7 pm7Var = this.h;
                pm7Var.c(9, l01Var);
                pm7Var.b();
            }
        }
    }

    @Override // defpackage.z88
    public final void w0(List list) {
        if (T(20)) {
            G(new d74(this, 29, list));
            h(this.n.j.p(), list);
        }
    }

    @Override // defpackage.z88
    public final int x() {
        return this.n.c.f;
    }

    @Override // defpackage.z88
    public final mue x0() {
        return this.n.j;
    }

    @Override // defpackage.z88
    public final long y() {
        return this.n.C;
    }

    @Override // defpackage.z88
    public final void z(n3b n3bVar) {
        this.h.a(n3bVar);
    }

    @Override // defpackage.z88
    public final boolean z0() {
        return this.n.s;
    }
}
