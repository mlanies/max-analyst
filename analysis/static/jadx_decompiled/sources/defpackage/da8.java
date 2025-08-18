package defpackage;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class da8 implements z88 {
    public final Context a;
    public final a98 b;
    public final obd c;
    public final pm7 d;
    public final ba8 e;
    public final ao0 f;
    public qz7 g;
    public q68 h;
    public boolean i;
    public boolean j;
    public ca8 k = new ca8();
    public ca8 l = new ca8();
    public ai3 m;
    public long n;
    public long o;

    public da8(Context context, a98 a98Var, obd obdVar, Looper looper, imc imcVar) {
        ai3 ai3Var = new ai3();
        ai3Var.a = m4b.F.l(xqb.g);
        ai3Var.b = z9d.b;
        ai3Var.c = k3b.b;
        ai3Var.o = ffc.X;
        ai3Var.X = Bundle.EMPTY;
        ai3Var.Y = null;
        this.m = ai3Var;
        this.d = new pm7(looper, she.a, new z98(this));
        this.a = context;
        this.b = a98Var;
        this.e = new ba8(this, looper);
        this.c = obdVar;
        this.f = imcVar;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public static List i(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ph4 ph4Var = j47.X;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static i3b j(i3b i3bVar) {
        if (i3bVar == null) {
            return null;
        }
        if (i3bVar.o > 0.0f) {
            return i3bVar;
        }
        z04.c0("Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        AbstractCollection abstractCollection = i3bVar.t0;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new i3b(i3bVar.a, i3bVar.b, i3bVar.c, 1.0f, i3bVar.X, i3bVar.Y, i3bVar.Z, i3bVar.s0, arrayList, i3bVar.u0, i3bVar.v0);
    }

    public static p3b o(int i, tb8 tb8Var, long j, boolean z) {
        return new p3b(null, i, tb8Var, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    @Override // defpackage.z88
    public final long A() {
        return c();
    }

    @Override // defpackage.z88
    public final void A0(int i, tb8 tb8Var) {
        s0(zw6.n(tb8Var), i, i + 1);
    }

    @Override // defpackage.z88
    public final int B() {
        return p0();
    }

    @Override // defpackage.z88
    public final jlf C() {
        z04.c0("Session doesn't support getting VideoSize");
        return jlf.e;
    }

    @Override // defpackage.z88
    public final void C0(tb8 tb8Var) {
        U0(tb8Var);
    }

    @Override // defpackage.z88
    public final void D() {
        this.g.R().g.skipToPrevious();
    }

    @Override // defpackage.z88
    public final void D0() {
        N(1);
    }

    @Override // defpackage.z88
    public final void E() {
        T(p0(), 0L);
    }

    @Override // defpackage.z88
    public final boolean E0() {
        return ((m4b) this.m.a).i;
    }

    @Override // defpackage.z88
    public final h30 F() {
        return ((m4b) this.m.a).o;
    }

    @Override // defpackage.z88
    public final j0f F0() {
        return j0f.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05df  */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.util.AbstractCollection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(boolean r86, defpackage.ca8 r87) {
        /*
            Method dump skipped, instructions count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da8.G(boolean, ca8):void");
    }

    @Override // defpackage.z88
    public final long G0() {
        return e0();
    }

    @Override // defpackage.z88
    public final void H(int i, boolean z) {
        if (oaf.a < 23) {
            z04.c0("Session doesn't support setting mute state at API level less than 23");
            return;
        }
        if (z != z0()) {
            m4b m4bVarC = ((m4b) this.m.a).c(l(), z);
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarC, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        }
        ((e98) this.g.b).a.adjustVolume(z ? -100 : 100, i);
    }

    @Override // defpackage.z88
    public final void H0(int i, long j, List list) {
        if (list.isEmpty()) {
            v();
            return;
        }
        m4b m4bVarN = ((m4b) this.m.a).n(xqb.g.t(0, list), new qad(o(i, (tb8) list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        ai3 ai3Var = this.m;
        i0(new ai3(m4bVarN, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        if (P()) {
            K();
        }
    }

    @Override // defpackage.z88
    public final ui4 I() {
        return ((m4b) this.m.a).q;
    }

    @Override // defpackage.z88
    public final void I0(int i) {
        L(i, 1);
    }

    @Override // defpackage.z88
    public final void J() {
        g0(1);
    }

    @Override // defpackage.z88
    public final void J0() {
        this.g.R().g.skipToNext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da8.K():void");
    }

    @Override // defpackage.z88
    public final void K0() {
        this.g.R().g.fastForward();
    }

    @Override // defpackage.z88
    public final void L(int i, int i2) {
        int i3;
        ui4 ui4VarI = I();
        if (ui4VarI.b <= i && ((i3 = ui4VarI.c) == 0 || i <= i3)) {
            m4b m4bVarC = ((m4b) this.m.a).c(i, z0());
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarC, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        }
        ((e98) this.g.b).a.setVolumeTo(i, i2);
    }

    @Override // defpackage.z88
    public final void L0() {
        this.g.R().g.rewind();
    }

    @Override // defpackage.z88
    public final boolean M() {
        return this.j;
    }

    @Override // defpackage.z88
    public final void N(int i) {
        int iL = l();
        int i2 = I().c;
        if (i2 == 0 || iL + 1 <= i2) {
            m4b m4bVarC = ((m4b) this.m.a).c(iL + 1, z0());
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarC, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        }
        ((e98) this.g.b).a.adjustVolume(1, i);
    }

    @Override // defpackage.z88
    public final gd8 N0() {
        tb8 tb8VarS = ((m4b) this.m.a).s();
        return tb8VarS == null ? gd8.J : tb8VarS.d;
    }

    @Override // defpackage.z88
    public final int O() {
        return -1;
    }

    @Override // defpackage.z88
    public final void O0(List list) {
        W(list);
    }

    public final boolean P() {
        return ((m4b) this.m.a).y != 1;
    }

    @Override // defpackage.z88
    public final long P0() {
        return ((m4b) this.m.a).A;
    }

    @Override // defpackage.z88
    public final void Q(j0f j0fVar) {
    }

    @Override // defpackage.z88
    public final z9d Q0() {
        return (z9d) this.m.b;
    }

    public final void R() {
        hd8 hd8VarCreateFromParcel;
        int repeatMode;
        int shuffleMode;
        if (this.i || this.j) {
            return;
        }
        this.j = true;
        f98 f98VarP = this.g.P();
        i3b i3bVarJ = j(this.g.Q());
        MediaMetadata metadata = ((e98) this.g.b).a.getMetadata();
        if (metadata != null) {
            us usVar = hd8.c;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            hd8VarCreateFromParcel = hd8.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            hd8VarCreateFromParcel.b = metadata;
        } else {
            hd8VarCreateFromParcel = null;
        }
        List<MediaSession.QueueItem> queue = ((e98) this.g.b).a.getQueue();
        List listI = i(queue != null ? yh8.a(queue) : null);
        CharSequence queueTitle = ((e98) this.g.b).a.getQueueTitle();
        pr6 pr6VarA = ((e98) this.g.b).e.a();
        if (pr6VarA != null) {
            try {
                repeatMode = pr6VarA.getRepeatMode();
            } catch (RemoteException unused) {
            }
        } else {
            repeatMode = -1;
        }
        pr6 pr6VarA2 = ((e98) this.g.b).e.a();
        if (pr6VarA2 != null) {
            try {
                shuffleMode = pr6VarA2.getShuffleMode();
            } catch (RemoteException unused2) {
            }
        } else {
            shuffleMode = -1;
        }
        G(true, new ca8(f98VarP, i3bVarJ, hd8VarCreateFromParcel, listI, queueTitle, repeatMode, shuffleMode, ((e98) this.g.b).a.getExtras()));
    }

    @Override // defpackage.z88
    public final int R0() {
        return -1;
    }

    @Override // defpackage.z88
    public final void S(int i) {
        U(i, i + 1);
    }

    @Override // defpackage.z88
    public final bm7 S0(y9d y9dVar, Bundle bundle) {
        z9d z9dVar = (z9d) this.m.b;
        z9dVar.getClass();
        boolean zContains = z9dVar.a.contains(y9dVar);
        String str = y9dVar.b;
        if (zContains) {
            this.g.R().i0(str, bundle);
            return fm9.F(new sad(0));
        }
        ccd ccdVar = new ccd();
        c98 c98Var = new c98(1, this.b.X, ccdVar);
        qz7 qz7Var = this.g;
        qz7Var.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        ((e98) qz7Var.b).a.sendCommand(str, bundle, c98Var);
        return ccdVar;
    }

    public final void T(int i, long j) {
        Integer num;
        Integer num2;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3 = i;
        long j5 = j;
        fm9.f(i3 >= 0);
        int iP0 = p0();
        mue mueVar = ((m4b) this.m.a).j;
        if ((mueVar.q() || i3 < mueVar.p()) && !n()) {
            if (i3 != iP0) {
                long jU = ((xqb) ((m4b) this.m.a).j).u(i3);
                if (jU != -1) {
                    this.g.R().g.skipToQueueItem(jU);
                    num = 2;
                } else {
                    ey8.k(i3, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=");
                    i3 = iP0;
                    num = null;
                }
            } else {
                i3 = iP0;
                num = null;
            }
            long jK = k();
            if (j5 == -9223372036854775807L) {
                j5 = jK;
                num2 = null;
            } else {
                this.g.R().g.seekTo(j5);
                num2 = 1;
            }
            if (num == null) {
                long jE0 = e0();
                long jC = c();
                long jMax = j5 < jK ? j5 : Math.max(j5, jE0);
                j3 = jMax;
                i2 = jC == -9223372036854775807L ? 0 : (int) ((100 * jMax) / jC);
                j2 = jMax - j5;
                j4 = jC;
            } else {
                j2 = 0;
                j3 = 0;
                j4 = -9223372036854775807L;
                i2 = 0;
            }
            m4b m4bVarJ = ((m4b) this.m.a).j(new qad(o(i3, !mueVar.q() ? mueVar.n(i3, new kue(), 0L).c : null, j5, false), false, SystemClock.elapsedRealtime(), j4, j3, i2, j2, -9223372036854775807L, j4, j3));
            if (m4bVarJ.y != 1) {
                m4bVarJ = m4bVarJ.f(2, null);
            }
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarJ, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), num2, num);
        }
    }

    @Override // defpackage.z88
    public final int T0() {
        return -1;
    }

    @Override // defpackage.z88
    public final void U(int i, int i2) {
        fm9.f(i >= 0 && i2 >= i);
        int iP = x0().p();
        int iMin = Math.min(i2, iP);
        if (i >= iP || i == iMin) {
            return;
        }
        xqb xqbVar = (xqb) ((m4b) this.m.a).j;
        xqbVar.getClass();
        ww6 ww6Var = new ww6(4);
        zw6 zw6Var = xqbVar.e;
        ww6Var.e(zw6Var.subList(0, i));
        ww6Var.e(zw6Var.subList(iMin, zw6Var.size()));
        xqb xqbVar2 = new xqb(ww6Var.j(), xqbVar.f);
        int iP0 = p0();
        int i3 = iMin - i;
        if (iP0 >= i) {
            iP0 = iP0 < iMin ? -1 : iP0 - i3;
        }
        if (iP0 == -1) {
            iP0 = oaf.j(i, 0, xqbVar2.p() - 1);
            z04.c0("Currently playing item is removed. Assumes item at " + iP0 + " is the new current item");
        }
        m4b m4bVarM = ((m4b) this.m.a).m(xqbVar2, iP0);
        ai3 ai3Var = this.m;
        i0(new ai3(m4bVarM, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        if (P()) {
            while (i < iMin && i < this.k.d.size()) {
                this.g.W(((yh8) this.k.d.get(i)).a);
                i++;
            }
        }
    }

    @Override // defpackage.z88
    public final void U0(tb8 tb8Var) {
        t(tb8Var, -9223372036854775807L);
    }

    @Override // defpackage.z88
    public final void V() {
        this.g.R().g.skipToPrevious();
    }

    @Override // defpackage.z88
    public final zw6 V0() {
        return (zw6) this.m.o;
    }

    public final void W(List list) {
        H0(0, -9223372036854775807L, list);
    }

    @Override // defpackage.z88
    public final PlaybackException X() {
        return ((m4b) this.m.a).a;
    }

    @Override // defpackage.z88
    public final void Y(boolean z) {
        m4b m4bVar = (m4b) this.m.a;
        if (m4bVar.t == z) {
            return;
        }
        this.n = j47.M(m4bVar, this.n, this.o, this.b.Y);
        this.o = SystemClock.elapsedRealtime();
        m4b m4bVarD = ((m4b) this.m.a).d(1, 0, z);
        ai3 ai3Var = this.m;
        i0(new ai3(m4bVarD, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        if (P() && (!((m4b) this.m.a).j.q())) {
            if (z) {
                this.g.R().g.play();
            } else {
                this.g.R().g.pause();
            }
        }
    }

    @Override // defpackage.z88
    public final void Z(int i) {
        T(i, 0L);
    }

    @Override // defpackage.z88
    public final boolean a() {
        return false;
    }

    @Override // defpackage.z88
    public final long a0() {
        return ((m4b) this.m.a).B;
    }

    @Override // defpackage.z88
    public final boolean b() {
        return ((m4b) this.m.a).v;
    }

    @Override // defpackage.z88
    public final long b0() {
        return k();
    }

    @Override // defpackage.z88
    public final long c() {
        return ((m4b) this.m.a).c.d;
    }

    public final void c0(boolean z, ca8 ca8Var, final ai3 ai3Var, Integer num, Integer num2) {
        ca8 ca8Var2 = this.k;
        ai3 ai3Var2 = this.m;
        if (ca8Var2 != ca8Var) {
            this.k = new ca8(ca8Var);
        }
        this.l = this.k;
        this.m = ai3Var;
        a98 a98Var = this.b;
        zw6 zw6Var = (zw6) ai3Var.o;
        if (z) {
            a98Var.j();
            if (((zw6) ai3Var2.o).equals(zw6Var)) {
                return;
            }
            fm9.k(Looper.myLooper() == a98Var.X.getLooper());
            y88 y88Var = a98Var.o;
            y88Var.getClass();
            y88.r();
            y88Var.g();
            return;
        }
        mue mueVar = ((m4b) ai3Var2.a).j;
        m4b m4bVar = (m4b) ai3Var.a;
        boolean zEquals = mueVar.equals(m4bVar.j);
        pm7 pm7Var = this.d;
        if (!zEquals) {
            final int i = 4;
            pm7Var.c(0, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar2 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar2.r, m4bVar2.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (!oaf.a(ca8Var2.e, ca8Var.e)) {
            final int i2 = 5;
            pm7Var.c(15, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i2) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar2 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar2.r, m4bVar2.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (num != null) {
            pm7Var.c(11, new u00(ai3Var2, ai3Var, num, 16));
        }
        if (num2 != null) {
            pm7Var.c(1, new y98(ai3Var, 0, num2));
        }
        i3b i3bVar = ca8Var2.b;
        boolean z2 = i3bVar != null && i3bVar.a == 7;
        i3b i3bVar2 = ca8Var.b;
        boolean z3 = i3bVar2 != null && i3bVar2.a == 7;
        if (!z2 || !z3 ? z2 != z3 : i3bVar.Y != i3bVar2.Y || !TextUtils.equals(i3bVar.Z, i3bVar2.Z)) {
            PlaybackException playbackExceptionM = gf7.m(i3bVar2);
            pm7Var.c(10, new t98(2, playbackExceptionM));
            if (playbackExceptionM != null) {
                pm7Var.c(10, new t98(3, playbackExceptionM));
            }
        }
        if (ca8Var2.c != ca8Var.c) {
            pm7Var.c(14, new z98(this));
        }
        m4b m4bVar2 = (m4b) ai3Var2.a;
        if (m4bVar2.y != m4bVar.y) {
            final int i3 = 6;
            pm7Var.c(4, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i3) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (m4bVar2.t != m4bVar.t) {
            final int i4 = 7;
            pm7Var.c(5, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i4) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (m4bVar2.v != m4bVar.v) {
            final int i5 = 8;
            pm7Var.c(7, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i5) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (!m4bVar2.g.equals(m4bVar.g)) {
            final int i6 = 9;
            pm7Var.c(12, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i6) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (m4bVar2.h != m4bVar.h) {
            final int i7 = 10;
            pm7Var.c(8, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i7) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (m4bVar2.i != m4bVar.i) {
            final int i8 = 11;
            pm7Var.c(9, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i8) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (!m4bVar2.o.equals(m4bVar.o)) {
            final int i9 = 0;
            pm7Var.c(20, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i9) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (!m4bVar2.q.equals(m4bVar.q)) {
            final int i10 = 1;
            pm7Var.c(29, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i10) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (m4bVar2.r != m4bVar.r || m4bVar2.s != m4bVar.s) {
            final int i11 = 2;
            pm7Var.c(30, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i11) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (!((k3b) ai3Var2.c).equals((k3b) ai3Var.c)) {
            final int i12 = 3;
            pm7Var.c(13, new km7() { // from class: x98
                @Override // defpackage.km7
                public final void invoke(Object obj) {
                    n3b n3bVar = (n3b) obj;
                    switch (i12) {
                        case 0:
                            n3bVar.u(((m4b) ai3Var.a).o);
                            break;
                        case 1:
                            n3bVar.t0(((m4b) ai3Var.a).q);
                            break;
                        case 2:
                            m4b m4bVar22 = (m4b) ai3Var.a;
                            n3bVar.i(m4bVar22.r, m4bVar22.s);
                            break;
                        case 3:
                            n3bVar.q0((k3b) ai3Var.c);
                            break;
                        case 4:
                            m4b m4bVar3 = (m4b) ai3Var.a;
                            n3bVar.f0(m4bVar3.j, m4bVar3.k);
                            break;
                        case 5:
                            n3bVar.c0(((m4b) ai3Var.a).m);
                            break;
                        case 6:
                            n3bVar.h(((m4b) ai3Var.a).y);
                            break;
                        case 7:
                            n3bVar.d(4, ((m4b) ai3Var.a).t);
                            break;
                        case 8:
                            n3bVar.n(((m4b) ai3Var.a).v);
                            break;
                        case 9:
                            n3bVar.p0(((m4b) ai3Var.a).g);
                            break;
                        case 10:
                            n3bVar.onRepeatModeChanged(((m4b) ai3Var.a).h);
                            break;
                        default:
                            n3bVar.O(((m4b) ai3Var.a).i);
                            break;
                    }
                }
            });
        }
        if (!((z9d) ai3Var2.b).equals((z9d) ai3Var.b)) {
            a98Var.getClass();
            fm9.k(Looper.myLooper() == a98Var.X.getLooper());
            a98Var.o.e();
        }
        if (!((zw6) ai3Var2.o).equals(zw6Var)) {
            a98Var.getClass();
            fm9.k(Looper.myLooper() == a98Var.X.getLooper());
            y88 y88Var2 = a98Var.o;
            y88Var2.getClass();
            y88.r();
            y88Var2.g();
        }
        if (((iad) ai3Var.Y) != null) {
            a98Var.getClass();
            fm9.k(Looper.myLooper() == a98Var.X.getLooper());
            a98Var.o.getClass();
        }
        pm7Var.b();
    }

    @Override // defpackage.z88
    public final void connect() {
        obd obdVar = this.c;
        int type = obdVar.a.getType();
        a98 a98Var = this.b;
        if (type != 0) {
            a98Var.G(new aa8(this, 1));
            return;
        }
        Object objC = obdVar.a.c();
        fm9.l(objC);
        a98Var.G(new vs5(this, 16, (ai8) objC));
        a98Var.X.post(new aa8(this, 0));
    }

    @Override // defpackage.z88
    public final c3b d() {
        return ((m4b) this.m.a).g;
    }

    @Override // defpackage.z88
    public final void d0(int i, List list) {
        fm9.f(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        xqb xqbVar = (xqb) ((m4b) this.m.a).j;
        if (xqbVar.q()) {
            H0(0, -9223372036854775807L, list);
            return;
        }
        int iMin = Math.min(i, x0().p());
        xqb xqbVarT = xqbVar.t(iMin, list);
        int iP0 = p0();
        int size = list.size();
        if (iP0 >= iMin) {
            iP0 += size;
        }
        m4b m4bVarM = ((m4b) this.m.a).m(xqbVarT, iP0);
        ai3 ai3Var = this.m;
        i0(new ai3(m4bVarM, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        if (P()) {
            h(iMin, list);
        }
    }

    @Override // defpackage.z88
    public final float e() {
        return 1.0f;
    }

    @Override // defpackage.z88
    public final long e0() {
        return ((m4b) this.m.a).c.e;
    }

    @Override // defpackage.z88
    public final void f(c3b c3bVar) {
        if (!c3bVar.equals(d())) {
            m4b m4bVarE = ((m4b) this.m.a).e(c3bVar);
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarE, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        }
        h98 h98VarR = this.g.R();
        float f = c3bVar.a;
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        h98VarR.g.setPlaybackSpeed(f);
    }

    @Override // defpackage.z88
    public final void f0() {
        this.g.R().g.skipToNext();
    }

    @Override // defpackage.z88
    public final void g(float f) {
        z04.c0("Session doesn't support setting player volume");
    }

    @Override // defpackage.z88
    public final void g0(int i) {
        int iL = l() - 1;
        if (iL >= I().b) {
            m4b m4bVarC = ((m4b) this.m.a).c(iL, z0());
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarC, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        }
        ((e98) this.g.b).a.adjustVolume(-1, i);
    }

    @Override // defpackage.z88
    public final int getPlaybackState() {
        return ((m4b) this.m.a).y;
    }

    @Override // defpackage.z88
    public final int getRepeatMode() {
        return ((m4b) this.m.a).h;
    }

    public final void h(int i, List list) {
        ArrayList arrayList = new ArrayList();
        cy0 cy0Var = new cy0(this, new AtomicInteger(0), list, arrayList, i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = ((tb8) list.get(i2)).d.k;
            if (bArr == null) {
                arrayList.add(null);
                cy0Var.run();
            } else {
                bm7 bm7VarB = this.f.B(bArr);
                arrayList.add(bm7VarB);
                Handler handler = this.b.X;
                Objects.requireNonNull(handler);
                bm7VarB.d(cy0Var, new a84(handler, 0));
            }
        }
    }

    @Override // defpackage.z88
    public final p0f h0() {
        return p0f.b;
    }

    public final void i0(ai3 ai3Var, Integer num, Integer num2) {
        c0(false, this.k, ai3Var, num, num2);
    }

    @Override // defpackage.z88
    public final boolean isConnected() {
        return this.j;
    }

    @Override // defpackage.z88
    public final boolean j0() {
        return this.j;
    }

    @Override // defpackage.z88
    public final long k() {
        long jM = j47.M((m4b) this.m.a, this.n, this.o, this.b.Y);
        this.n = jM;
        return jM;
    }

    @Override // defpackage.z88
    public final gd8 k0() {
        return ((m4b) this.m.a).m;
    }

    @Override // defpackage.z88
    public final int l() {
        m4b m4bVar = (m4b) this.m.a;
        if (m4bVar.q.a == 1) {
            return m4bVar.r;
        }
        qz7 qz7Var = this.g;
        if (qz7Var == null) {
            return 0;
        }
        f98 f98VarP = qz7Var.P();
        jx6 jx6Var = gf7.a;
        if (f98VarP == null) {
            return 0;
        }
        return f98VarP.e;
    }

    @Override // defpackage.z88
    public final zz3 l0() {
        z04.c0("Session doesn't support getting Cue");
        return zz3.c;
    }

    @Override // defpackage.z88
    public final void m(Surface surface) {
        z04.c0("Session doesn't support setting Surface");
    }

    @Override // defpackage.z88
    public final void m0(h30 h30Var, boolean z) {
        z04.c0("Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // defpackage.z88
    public final boolean n() {
        return ((m4b) this.m.a).c.b;
    }

    @Override // defpackage.z88
    public final void n0(gd8 gd8Var) {
        z04.c0("Session doesn't support setting playlist metadata");
    }

    @Override // defpackage.z88
    public final int o0() {
        return -1;
    }

    @Override // defpackage.z88
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // defpackage.z88
    public final int p0() {
        return ((m4b) this.m.a).c.a.b;
    }

    @Override // defpackage.z88
    public final void pause() {
        Y(false);
    }

    @Override // defpackage.z88
    public final void play() {
        Y(true);
    }

    @Override // defpackage.z88
    public final void prepare() {
        m4b m4bVar = (m4b) this.m.a;
        if (m4bVar.y != 1) {
            return;
        }
        m4b m4bVarF = m4bVar.f(m4bVar.j.q() ? 4 : 2, null);
        ai3 ai3Var = this.m;
        i0(new ai3(m4bVarF, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        if (!((m4b) this.m.a).j.q()) {
            K();
        }
    }

    @Override // defpackage.z88
    public final long q() {
        return ((m4b) this.m.a).c.g;
    }

    @Override // defpackage.z88
    public final void q0(boolean z) {
        H(1, z);
    }

    @Override // defpackage.z88
    public final void r(int i, long j) {
        T(i, j);
    }

    @Override // defpackage.z88
    public final void r0(n3b n3bVar) {
        this.d.e(n3bVar);
    }

    @Override // defpackage.z88
    public final void release() {
        Messenger messenger;
        if (this.i) {
            return;
        }
        this.i = true;
        q68 q68Var = this.h;
        if (q68Var != null) {
            o68 o68Var = q68Var.a;
            y7g y7gVar = o68Var.f;
            if (y7gVar != null && (messenger = o68Var.g) != null) {
                try {
                    y7gVar.E(7, null, messenger);
                } catch (RemoteException unused) {
                }
            }
            o68Var.b.disconnect();
            this.h = null;
        }
        qz7 qz7Var = this.g;
        if (qz7Var != null) {
            ba8 ba8Var = this.e;
            if (ba8Var == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (((Set) qz7Var.c).remove(ba8Var)) {
                try {
                    ((e98) qz7Var.b).b(ba8Var);
                } finally {
                    ba8Var.j(null);
                }
            }
            ba8Var.d.removeCallbacksAndMessages(null);
            this.g = null;
        }
        this.j = false;
        this.d.d();
    }

    @Override // defpackage.z88
    public final k3b s() {
        return (k3b) this.m.c;
    }

    @Override // defpackage.z88
    public final void s0(List list, int i, int i2) {
        fm9.f(i >= 0 && i <= i2);
        int iP = ((xqb) ((m4b) this.m.a).j).p();
        if (i > iP) {
            return;
        }
        int iMin = Math.min(i2, iP);
        d0(iMin, list);
        U(i, iMin);
    }

    @Override // defpackage.z88
    public final void seekTo(long j) {
        T(p0(), j);
    }

    @Override // defpackage.z88
    public final void setPlaybackSpeed(float f) {
        if (f != d().a) {
            m4b m4bVarE = ((m4b) this.m.a).e(new c3b(f));
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarE, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        }
        h98 h98VarR = this.g.R();
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        h98VarR.g.setPlaybackSpeed(f);
    }

    @Override // defpackage.z88
    public final void setRepeatMode(int i) {
        if (i != getRepeatMode()) {
            m4b m4bVarI = ((m4b) this.m.a).i(i);
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarI, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        }
        h98 h98VarR = this.g.R();
        int iN = gf7.n(i);
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, iN);
        h98VarR.i0(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
    }

    @Override // defpackage.z88
    public final void stop() {
        m4b m4bVar = (m4b) this.m.a;
        if (m4bVar.y == 1) {
            return;
        }
        qad qadVar = m4bVar.c;
        p3b p3bVar = qadVar.a;
        long j = p3bVar.f;
        long j2 = qadVar.d;
        m4b m4bVarJ = m4bVar.j(new qad(p3bVar, false, SystemClock.elapsedRealtime(), j2, j, j47.n(j, j2), 0L, -9223372036854775807L, j2, j));
        m4b m4bVar2 = (m4b) this.m.a;
        if (m4bVar2.y != 1) {
            m4bVarJ = m4bVarJ.f(1, m4bVar2.a);
        }
        ai3 ai3Var = this.m;
        i0(new ai3(m4bVarJ, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        this.g.R().g.stop();
    }

    @Override // defpackage.z88
    public final void t(tb8 tb8Var, long j) {
        H0(0, j, zw6.n(tb8Var));
    }

    @Override // defpackage.z88
    public final void t0(int i, int i2) {
        u0(i, i + 1, i2);
    }

    @Override // defpackage.z88
    public final boolean u() {
        return ((m4b) this.m.a).t;
    }

    @Override // defpackage.z88
    public final void u0(int i, int i2, int i3) {
        fm9.f(i >= 0 && i <= i2 && i3 >= 0);
        xqb xqbVar = (xqb) ((m4b) this.m.a).j;
        int iP = xqbVar.p();
        int iMin = Math.min(i2, iP);
        int i4 = iMin - i;
        int i5 = iP - i4;
        int i6 = i5 - 1;
        int iMin2 = Math.min(i3, i5);
        if (i >= iP || i == iMin || i == iMin2) {
            return;
        }
        int iP0 = p0();
        if (iP0 >= i) {
            iP0 = iP0 < iMin ? -1 : iP0 - i4;
        }
        if (iP0 == -1) {
            iP0 = oaf.j(i, 0, i6);
            z04.c0("Currently playing item will be removed and added back to mimic move. Assumes item at " + iP0 + " would be the new current item");
        }
        if (iP0 >= iMin2) {
            iP0 += i4;
        }
        ArrayList arrayList = new ArrayList(xqbVar.e);
        oaf.R(arrayList, i, iMin, iMin2);
        m4b m4bVarM = ((m4b) this.m.a).m(new xqb(zw6.j(arrayList), xqbVar.f), iP0);
        ai3 ai3Var = this.m;
        i0(new ai3(m4bVarM, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        if (P()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < i4; i7++) {
                arrayList2.add((yh8) this.k.d.get(i));
                this.g.W(((yh8) this.k.d.get(i)).a);
            }
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                this.g.p(((yh8) arrayList2.get(i8)).a, i8 + iMin2);
            }
        }
    }

    @Override // defpackage.z88
    public final void v() {
        U(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.z88
    public final int v0() {
        return 0;
    }

    @Override // defpackage.z88
    public final void w(boolean z) {
        if (z != E0()) {
            m4b m4bVarK = ((m4b) this.m.a).k(z);
            ai3 ai3Var = this.m;
            i0(new ai3(m4bVarK, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, (Bundle) ai3Var.X, null), null, null);
        }
        h98 h98VarR = this.g.R();
        jx6 jx6Var = gf7.a;
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, z ? 1 : 0);
        h98VarR.i0(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
    }

    @Override // defpackage.z88
    public final void w0(List list) {
        d0(Integer.MAX_VALUE, list);
    }

    @Override // defpackage.z88
    public final int x() {
        return ((m4b) this.m.a).c.f;
    }

    @Override // defpackage.z88
    public final mue x0() {
        return ((m4b) this.m.a).j;
    }

    @Override // defpackage.z88
    public final long y() {
        return ((m4b) this.m.a).C;
    }

    @Override // defpackage.z88
    public final void z(n3b n3bVar) {
        this.d.a(n3bVar);
    }

    @Override // defpackage.z88
    public final boolean z0() {
        m4b m4bVar = (m4b) this.m.a;
        if (m4bVar.q.a == 1) {
            return m4bVar.s;
        }
        qz7 qz7Var = this.g;
        if (qz7Var != null) {
            f98 f98VarP = qz7Var.P();
            jx6 jx6Var = gf7.a;
            if (f98VarP != null && f98VarP.e == 0) {
                return true;
            }
        }
        return false;
    }
}
