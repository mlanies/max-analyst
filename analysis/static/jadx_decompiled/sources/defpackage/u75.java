package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class u75 extends u2 {
    public final ArrayList A0;
    public final boolean B0;
    public final wj8 C0;
    public final i74 D0;
    public final Looper E0;
    public final hg0 F0;
    public final long G0;
    public final long H0;
    public final long I0;
    public final she J0;
    public final o75 K0;
    public final q75 L0;
    public final td M0;
    public final n40 N0;
    public final crd O0;
    public final ae3 P0;
    public final long Q0;
    public int R0;
    public boolean S0;
    public int T0;
    public int U0;
    public boolean V0;
    public dod W0;
    public final ae3 X;
    public k3b X0;
    public final Context Y;
    public gd8 Y0;
    public final q3b Z;
    public gd8 Z0;
    public AudioTrack a1;
    public Object b1;
    public final l0f c;
    public Surface c1;
    public final int d1;
    public lsd e1;
    public final int f1;
    public h30 g1;
    public float h1;
    public boolean i1;
    public zz3 j1;
    public final boolean k1;
    public boolean l1;
    public final int m1;
    public boolean n1;
    public final k3b o;
    public final ui4 o1;
    public jlf p1;
    public gd8 q1;
    public a3b r1;
    public final vj0[] s0;
    public int s1;
    public final hz7 t0;
    public long t1;
    public final bie u0;
    public final i75 v0;
    public final g85 w0;
    public final pm7 x0;
    public final CopyOnWriteArraySet y0;
    public final hue z0;

    static {
        nc8.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [q3b, u2, u75] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v5, types: [u75] */
    public u75(x65 x65Var) throws Throwable {
        u75 u75Var;
        Context context;
        i74 i74Var;
        Handler handler;
        vj0[] vj0VarArrA;
        hz7 hz7Var;
        hg0 hg0Var;
        x1d x1dVar;
        Looper looper;
        she sheVar;
        CopyOnWriteArraySet copyOnWriteArraySet;
        l0f l0fVar;
        i75 i75Var;
        int i;
        j4b j4bVar;
        pn7 pn7Var;
        int i2;
        boolean z;
        ?? u2Var = new u2(3);
        u2Var.X = new ae3(false, 1);
        try {
            z04.J("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "]");
            context = x65Var.a;
            Context applicationContext = context.getApplicationContext();
            u2Var.Y = applicationContext;
            i74Var = (i74) x65Var.h.mo131apply(x65Var.b);
            u2Var.D0 = i74Var;
            u2Var.m1 = x65Var.j;
            u2Var.g1 = x65Var.k;
            u2Var.d1 = x65Var.l;
            u2Var.i1 = false;
            u2Var.Q0 = x65Var.t;
            o75 o75Var = new o75(u2Var);
            u2Var.K0 = o75Var;
            u2Var.L0 = new q75();
            handler = new Handler(x65Var.i);
            vj0VarArrA = ((mgc) x65Var.c.get()).a(handler, o75Var, o75Var, o75Var, o75Var);
            u2Var.s0 = vj0VarArrA;
            fm9.k(vj0VarArrA.length > 0);
            hz7Var = (hz7) x65Var.e.get();
            u2Var.t0 = hz7Var;
            u2Var.C0 = (wj8) x65Var.d.get();
            hg0Var = (hg0) x65Var.g.get();
            u2Var.F0 = hg0Var;
            u2Var.B0 = x65Var.m;
            x1dVar = x65Var.n;
            u2Var.G0 = x65Var.o;
            u2Var.H0 = x65Var.p;
            u2Var.I0 = x65Var.q;
            looper = x65Var.i;
            u2Var.E0 = looper;
            sheVar = x65Var.b;
            u2Var.J0 = sheVar;
            u2Var.Z = u2Var;
            u2Var.x0 = new pm7(looper, sheVar, new i75(u2Var, false ? 1 : 0));
            copyOnWriteArraySet = new CopyOnWriteArraySet();
            u2Var.y0 = copyOnWriteArraySet;
            u2Var.A0 = new ArrayList();
            u2Var.W0 = new dod();
            l0fVar = new l0f(new lgc[vj0VarArrA.length], new n85[vj0VarArrA.length], p0f.b, (fz7) null);
            u2Var.c = l0fVar;
            u2Var.z0 = new hue();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = length;
                int i5 = iArr[i3];
                fm9.k(!false);
                sparseBooleanArray.append(i5, true);
                i3++;
                length = i4;
                iArr = iArr;
            }
            hz7Var.getClass();
            fm9.k(!false);
            sparseBooleanArray.append(29, true);
            fm9.k(!false);
            tm5 tm5Var = new tm5(sparseBooleanArray);
            u2Var.o = new k3b(tm5Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            int i6 = 0;
            while (i6 < tm5Var.a.size()) {
                int iB = tm5Var.b(i6);
                fm9.k(!false);
                sparseBooleanArray2.append(iB, true);
                i6++;
                tm5Var = tm5Var;
            }
            fm9.k(!false);
            sparseBooleanArray2.append(4, true);
            fm9.k(!false);
            sparseBooleanArray2.append(10, true);
            fm9.k(!false);
            u2Var.X0 = new k3b(new tm5(sparseBooleanArray2));
            u2Var.u0 = sheVar.a(looper, null);
            i75Var = new i75(u2Var, 3);
            u2Var.v0 = i75Var;
            u2Var.r1 = a3b.i(l0fVar);
            i74Var.J(u2Var, looper);
            i = oaf.a;
            String str = x65Var.w;
            j4bVar = i < 31 ? new j4b(str) : m75.a(applicationContext, u2Var, x65Var.u, str);
            pn7Var = (pn7) x65Var.f.get();
            i2 = u2Var.R0;
            z = u2Var.S0;
        } catch (Throwable th) {
            th = th;
            u75Var = u2Var;
        }
        try {
            u2Var = this;
            u2Var.w0 = new g85(vj0VarArrA, hz7Var, l0fVar, pn7Var, hg0Var, i2, z, i74Var, x1dVar, x65Var.r, x65Var.s, looper, sheVar, i75Var, j4bVar);
            u2Var.h1 = 1.0f;
            u2Var.R0 = 0;
            gd8 gd8Var = gd8.J;
            u2Var.Y0 = gd8Var;
            u2Var.Z0 = gd8Var;
            u2Var.q1 = gd8Var;
            u2Var.s1 = -1;
            if (i < 21) {
                AudioTrack audioTrack = u2Var.a1;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    u2Var.a1.release();
                    u2Var.a1 = null;
                }
                if (u2Var.a1 == null) {
                    u2Var.a1 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                u2Var.f1 = u2Var.a1.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) u2Var.Y.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                u2Var.f1 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            u2Var.j1 = zz3.c;
            u2Var.k1 = true;
            u2Var.z(u2Var.D0);
            Handler handler2 = new Handler(looper);
            i74 i74Var2 = u2Var.D0;
            i84 i84Var = (i84) hg0Var;
            i84Var.getClass();
            i74Var2.getClass();
            re6 re6Var = i84Var.b;
            re6Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) re6Var.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                fg0 fg0Var = (fg0) it.next();
                if (fg0Var.b == i74Var2) {
                    fg0Var.c = true;
                    copyOnWriteArrayList.remove(fg0Var);
                }
            }
            copyOnWriteArrayList.add(new fg0(handler2, i74Var2));
            copyOnWriteArraySet.add(u2Var.K0);
            td tdVar = new td(context, handler, u2Var.K0);
            u2Var.M0 = tdVar;
            tdVar.v();
            n40 n40Var = new n40(context, handler, u2Var.K0);
            u2Var.N0 = n40Var;
            n40Var.b(null);
            crd crdVar = new crd();
            context.getApplicationContext();
            u2Var.O0 = crdVar;
            ae3 ae3Var = new ae3(context);
            u2Var.P0 = ae3Var;
            ae3Var.h();
            sv0 sv0Var = new sv0(0);
            sv0Var.c = 0;
            sv0Var.d = 0;
            u2Var.o1 = sv0Var.b();
            u2Var.p1 = jlf.e;
            u2Var.e1 = lsd.c;
            u2Var.t0.a(u2Var.g1);
            u2Var.n2(1, 10, Integer.valueOf(u2Var.f1));
            u2Var.n2(2, 10, Integer.valueOf(u2Var.f1));
            u2Var.n2(1, 3, u2Var.g1);
            u2Var.n2(2, 4, Integer.valueOf(u2Var.d1));
            u2Var.n2(2, 5, 0);
            u2Var.n2(1, 9, Boolean.valueOf(u2Var.i1));
            u2Var.n2(2, 7, u2Var.L0);
            u2Var.n2(6, 8, u2Var.L0);
            u2Var.n2(-1, 16, Integer.valueOf(u2Var.m1));
            u2Var.X.g();
        } catch (Throwable th2) {
            th = th2;
            u75Var = this;
            u75Var.X.g();
            throw th;
        }
    }

    public static long h2(a3b a3bVar) {
        kue kueVar = new kue();
        hue hueVar = new hue();
        a3bVar.a.h(a3bVar.b.a, hueVar);
        long j = a3bVar.c;
        if (j != -9223372036854775807L) {
            return hueVar.e + j;
        }
        return a3bVar.a.n(hueVar.c, kueVar, 0L).l;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int B() {
        w2();
        if (this.r1.a.q()) {
            return 0;
        }
        a3b a3bVar = this.r1;
        return a3bVar.a.b(a3bVar.b.a);
    }

    @Override // defpackage.q3b
    public final jlf C() {
        w2();
        return this.p1;
    }

    @Override // defpackage.q3b
    public final void D0() {
        w2();
    }

    @Override // defpackage.q3b
    public final boolean E0() {
        w2();
        return this.S0;
    }

    @Override // defpackage.q3b
    public final h30 F() {
        w2();
        return this.g1;
    }

    @Override // defpackage.q3b
    public final j0f F0() {
        w2();
        return ((cf4) this.t0).f();
    }

    @Override // defpackage.q3b
    public final long G0() {
        w2();
        if (this.r1.a.q()) {
            return this.t1;
        }
        a3b a3bVar = this.r1;
        if (a3bVar.k.d != a3bVar.b.d) {
            return oaf.h0(a3bVar.a.n(p0(), (kue) this.b, 0L).m);
        }
        long j = a3bVar.q;
        if (this.r1.k.b()) {
            a3b a3bVar2 = this.r1;
            hue hueVarH = a3bVar2.a.h(a3bVar2.k.a, this.z0);
            long jD = hueVarH.d(this.r1.k.b);
            j = jD == Long.MIN_VALUE ? hueVarH.d : jD;
        }
        a3b a3bVar3 = this.r1;
        mue mueVar = a3bVar3.a;
        Object obj = a3bVar3.k.a;
        hue hueVar = this.z0;
        mueVar.h(obj, hueVar);
        return oaf.h0(j + hueVar.e);
    }

    @Override // defpackage.q3b
    public final void H(int i, boolean z) {
        w2();
    }

    @Override // defpackage.q3b
    public final void H0(int i, long j, List list) {
        w2();
        ArrayList arrayListC2 = c2(list);
        w2();
        o2(arrayListC2, i, j, false);
    }

    @Override // defpackage.q3b
    public final ui4 I() {
        w2();
        return this.o1;
    }

    @Override // defpackage.q3b
    public final void I0(int i) {
        w2();
    }

    @Override // defpackage.q3b
    public final void J() {
        w2();
    }

    @Override // defpackage.q3b
    public final void L(int i, int i2) {
        w2();
    }

    @Override // defpackage.q3b
    public final void N(int i) {
        w2();
    }

    @Override // defpackage.q3b
    public final gd8 N0() {
        w2();
        return this.Y0;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int O() {
        w2();
        if (n()) {
            return this.r1.b.c;
        }
        return -1;
    }

    @Override // defpackage.q3b
    public final void O0(List list) {
        w2();
        ArrayList arrayListC2 = c2(list);
        w2();
        o2(arrayListC2, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.q3b
    public final long P0() {
        w2();
        return this.G0;
    }

    @Override // defpackage.q3b
    public final void Q(j0f j0fVar) {
        w2();
        hz7 hz7Var = this.t0;
        hz7Var.getClass();
        if (j0fVar.equals(((cf4) hz7Var).f())) {
            return;
        }
        hz7Var.b(j0fVar);
        this.x0.f(19, new k75(j0fVar, 0));
    }

    @Override // defpackage.q3b
    public final void U(int i, int i2) {
        w2();
        fm9.f(i >= 0 && i2 >= i);
        int size = this.A0.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        a3b a3bVarL2 = l2(this.r1, i, iMin);
        t2(a3bVarL2, 0, !a3bVarL2.b.a.equals(this.r1.b.a), 4, e2(a3bVarL2), -1, false);
    }

    @Override // defpackage.u2
    public final void V1(int i, long j, boolean z) {
        w2();
        if (i == -1) {
            return;
        }
        fm9.f(i >= 0);
        mue mueVar = this.r1.a;
        if (mueVar.q() || i < mueVar.p()) {
            i74 i74Var = this.D0;
            if (!i74Var.t0) {
                fd fdVarB = i74Var.b();
                i74Var.t0 = true;
                i74Var.I(fdVarB, -1, new v64(13));
            }
            this.T0++;
            if (n()) {
                z04.c0("seekTo ignored because an ad is playing");
                b85 b85Var = new b85(this.r1);
                b85Var.d(1);
                u75 u75Var = this.v0.b;
                u75Var.u0.d(new kl4(u75Var, 18, b85Var));
                return;
            }
            a3b a3bVarG = this.r1;
            int i2 = a3bVarG.e;
            if (i2 == 3 || (i2 == 4 && !mueVar.q())) {
                a3bVarG = this.r1.g(2);
            }
            int iP0 = p0();
            a3b a3bVarI2 = i2(a3bVarG, mueVar, j2(mueVar, i, j));
            this.w0.s0.a(3, new e85(mueVar, i, oaf.S(j))).b();
            t2(a3bVarI2, 0, true, 1, e2(a3bVarI2), iP0, z);
        }
    }

    @Override // defpackage.q3b
    public final PlaybackException X() {
        w2();
        return this.r1.f;
    }

    @Override // defpackage.q3b
    public final void Y(boolean z) {
        w2();
        int iD = this.N0.d(getPlaybackState(), z);
        s2(iD, iD == -1 ? 2 : 1, z);
    }

    public final ArrayList Z1(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            tk8 tk8Var = new tk8((ej0) list.get(i2), this.B0);
            arrayList.add(tk8Var);
            this.A0.add(i2 + i, new s75(tk8Var.b, tk8Var.a));
        }
        this.W0 = this.W0.a(i, arrayList.size());
        return arrayList;
    }

    @Override // defpackage.q3b
    public final boolean a() {
        w2();
        return this.r1.g;
    }

    @Override // defpackage.q3b
    public final long a0() {
        w2();
        return this.H0;
    }

    public final a3b a2(a3b a3bVar, int i, ArrayList arrayList) {
        mue mueVar = a3bVar.a;
        this.T0++;
        ArrayList arrayListZ1 = Z1(i, arrayList);
        b5b b5bVar = new b5b(this.A0, this.W0);
        a3b a3bVarI2 = i2(a3bVar, b5bVar, g2(mueVar, b5bVar, f2(a3bVar), d2(a3bVar)));
        this.w0.s0.b(new y75(arrayListZ1, this.W0, -1, -9223372036854775807L), 18, i, 0).b();
        return a3bVarI2;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long b0() {
        w2();
        return d2(this.r1);
    }

    public final gd8 b2() {
        mue mueVarX0 = x0();
        if (mueVarX0.q()) {
            return this.q1;
        }
        tb8 tb8Var = mueVarX0.n(p0(), (kue) this.b, 0L).c;
        ed8 ed8VarA = this.q1.a();
        gd8 gd8Var = tb8Var.d;
        if (gd8Var != null) {
            CharSequence charSequence = gd8Var.a;
            if (charSequence != null) {
                ed8VarA.a = charSequence;
            }
            CharSequence charSequence2 = gd8Var.b;
            if (charSequence2 != null) {
                ed8VarA.b = charSequence2;
            }
            CharSequence charSequence3 = gd8Var.c;
            if (charSequence3 != null) {
                ed8VarA.c = charSequence3;
            }
            CharSequence charSequence4 = gd8Var.d;
            if (charSequence4 != null) {
                ed8VarA.d = charSequence4;
            }
            CharSequence charSequence5 = gd8Var.e;
            if (charSequence5 != null) {
                ed8VarA.e = charSequence5;
            }
            CharSequence charSequence6 = gd8Var.f;
            if (charSequence6 != null) {
                ed8VarA.f = charSequence6;
            }
            CharSequence charSequence7 = gd8Var.g;
            if (charSequence7 != null) {
                ed8VarA.g = charSequence7;
            }
            Long l = gd8Var.h;
            if (l != null) {
                ed8VarA.i(l);
            }
            e5c e5cVar = gd8Var.i;
            if (e5cVar != null) {
                ed8VarA.i = e5cVar;
            }
            e5c e5cVar2 = gd8Var.j;
            if (e5cVar2 != null) {
                ed8VarA.j = e5cVar2;
            }
            byte[] bArr = gd8Var.k;
            Uri uri = gd8Var.m;
            if (uri != null || bArr != null) {
                ed8VarA.m = uri;
                ed8VarA.f(bArr, gd8Var.l);
            }
            Integer num = gd8Var.n;
            if (num != null) {
                ed8VarA.n = num;
            }
            Integer num2 = gd8Var.o;
            if (num2 != null) {
                ed8VarA.o = num2;
            }
            Integer num3 = gd8Var.p;
            if (num3 != null) {
                ed8VarA.p = num3;
            }
            Boolean bool = gd8Var.q;
            if (bool != null) {
                ed8VarA.q = bool;
            }
            Boolean bool2 = gd8Var.r;
            if (bool2 != null) {
                ed8VarA.r = bool2;
            }
            Integer num4 = gd8Var.s;
            if (num4 != null) {
                ed8VarA.s = num4;
            }
            Integer num5 = gd8Var.t;
            if (num5 != null) {
                ed8VarA.s = num5;
            }
            Integer num6 = gd8Var.u;
            if (num6 != null) {
                ed8VarA.t = num6;
            }
            Integer num7 = gd8Var.v;
            if (num7 != null) {
                ed8VarA.u = num7;
            }
            Integer num8 = gd8Var.w;
            if (num8 != null) {
                ed8VarA.v = num8;
            }
            Integer num9 = gd8Var.x;
            if (num9 != null) {
                ed8VarA.w = num9;
            }
            Integer num10 = gd8Var.y;
            if (num10 != null) {
                ed8VarA.x = num10;
            }
            CharSequence charSequence8 = gd8Var.z;
            if (charSequence8 != null) {
                ed8VarA.y = charSequence8;
            }
            CharSequence charSequence9 = gd8Var.A;
            if (charSequence9 != null) {
                ed8VarA.z = charSequence9;
            }
            CharSequence charSequence10 = gd8Var.B;
            if (charSequence10 != null) {
                ed8VarA.A = charSequence10;
            }
            Integer num11 = gd8Var.C;
            if (num11 != null) {
                ed8VarA.B = num11;
            }
            Integer num12 = gd8Var.D;
            if (num12 != null) {
                ed8VarA.C = num12;
            }
            CharSequence charSequence11 = gd8Var.E;
            if (charSequence11 != null) {
                ed8VarA.D = charSequence11;
            }
            CharSequence charSequence12 = gd8Var.F;
            if (charSequence12 != null) {
                ed8VarA.E = charSequence12;
            }
            CharSequence charSequence13 = gd8Var.G;
            if (charSequence13 != null) {
                ed8VarA.F = charSequence13;
            }
            Integer num13 = gd8Var.H;
            if (num13 != null) {
                ed8VarA.G = num13;
            }
            Bundle bundle = gd8Var.I;
            if (bundle != null) {
                ed8VarA.H = bundle;
            }
        }
        return new gd8(ed8VarA);
    }

    @Override // defpackage.q3b
    public final long c() {
        w2();
        if (!n()) {
            return A();
        }
        a3b a3bVar = this.r1;
        yj8 yj8Var = a3bVar.b;
        mue mueVar = a3bVar.a;
        Object obj = yj8Var.a;
        hue hueVar = this.z0;
        mueVar.h(obj, hueVar);
        return oaf.h0(hueVar.a(yj8Var.b, yj8Var.c));
    }

    public final ArrayList c2(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.C0.e((tb8) list.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.q3b
    public final c3b d() {
        w2();
        return this.r1.o;
    }

    @Override // defpackage.q3b
    public final void d0(int i, List list) {
        w2();
        ArrayList arrayListC2 = c2(list);
        w2();
        fm9.f(i >= 0);
        ArrayList arrayList = this.A0;
        int iMin = Math.min(i, arrayList.size());
        if (!arrayList.isEmpty()) {
            t2(a2(this.r1, iMin, arrayListC2), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.s1 == -1;
        w2();
        o2(arrayListC2, -1, -9223372036854775807L, z);
    }

    public final long d2(a3b a3bVar) {
        if (!a3bVar.b.b()) {
            return oaf.h0(e2(a3bVar));
        }
        Object obj = a3bVar.b.a;
        mue mueVar = a3bVar.a;
        hue hueVar = this.z0;
        mueVar.h(obj, hueVar);
        long j = a3bVar.c;
        return j == -9223372036854775807L ? oaf.h0(mueVar.n(f2(a3bVar), (kue) this.b, 0L).l) : oaf.h0(hueVar.e) + oaf.h0(j);
    }

    @Override // defpackage.q3b
    public final float e() {
        w2();
        return this.h1;
    }

    @Override // defpackage.q3b
    public final long e0() {
        w2();
        if (!n()) {
            return G0();
        }
        a3b a3bVar = this.r1;
        return a3bVar.k.equals(a3bVar.b) ? oaf.h0(this.r1.q) : c();
    }

    public final long e2(a3b a3bVar) {
        if (a3bVar.a.q()) {
            return oaf.S(this.t1);
        }
        long j = a3bVar.p ? a3bVar.j() : a3bVar.s;
        if (a3bVar.b.b()) {
            return j;
        }
        mue mueVar = a3bVar.a;
        Object obj = a3bVar.b.a;
        hue hueVar = this.z0;
        mueVar.h(obj, hueVar);
        return j + hueVar.e;
    }

    @Override // defpackage.q3b
    public final void f(c3b c3bVar) {
        w2();
        if (this.r1.o.equals(c3bVar)) {
            return;
        }
        a3b a3bVarF = this.r1.f(c3bVar);
        this.T0++;
        this.w0.s0.a(4, c3bVar).b();
        t2(a3bVarF, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final int f2(a3b a3bVar) {
        if (a3bVar.a.q()) {
            return this.s1;
        }
        return a3bVar.a.h(a3bVar.b.a, this.z0).c;
    }

    @Override // defpackage.q3b
    public final void g(float f) {
        w2();
        float fI = oaf.i(f, 0.0f, 1.0f);
        if (this.h1 == fI) {
            return;
        }
        this.h1 = fI;
        n2(1, 2, Float.valueOf(this.N0.e * fI));
        this.x0.f(22, new b75(1, fI));
    }

    @Override // defpackage.q3b
    public final void g0(int i) {
        w2();
    }

    public final Pair g2(mue mueVar, b5b b5bVar, int i, long j) {
        if (mueVar.q() || b5bVar.q()) {
            boolean z = !mueVar.q() && b5bVar.q();
            return j2(b5bVar, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair pairJ = mueVar.j((kue) this.b, this.z0, i, oaf.S(j));
        Object obj = pairJ.first;
        if (b5bVar.b(obj) != -1) {
            return pairJ;
        }
        int iG = g85.G((kue) this.b, this.z0, this.R0, this.S0, obj, mueVar, b5bVar);
        if (iG == -1) {
            return j2(b5bVar, -1, -9223372036854775807L);
        }
        kue kueVar = (kue) this.b;
        b5bVar.n(iG, kueVar, 0L);
        return j2(b5bVar, iG, oaf.h0(kueVar.l));
    }

    @Override // defpackage.q3b
    public final int getPlaybackState() {
        w2();
        return this.r1.e;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int getRepeatMode() {
        w2();
        return this.R0;
    }

    @Override // defpackage.q3b
    public final p0f h0() {
        w2();
        return (p0f) this.r1.i.Y;
    }

    public final a3b i2(a3b a3bVar, mue mueVar, Pair pair) {
        List list;
        fm9.f(mueVar.q() || pair != null);
        mue mueVar2 = a3bVar.a;
        long jD2 = d2(a3bVar);
        a3b a3bVarH = a3bVar.h(mueVar);
        if (mueVar.q()) {
            yj8 yj8Var = a3b.u;
            long jS = oaf.S(this.t1);
            a3b a3bVarB = a3bVarH.c(yj8Var, jS, jS, jS, 0L, tze.d, this.c, ffc.X).b(yj8Var);
            a3bVarB.q = a3bVarB.s;
            return a3bVarB;
        }
        Object obj = a3bVarH.b.a;
        int i = oaf.a;
        boolean z = !obj.equals(pair.first);
        yj8 yj8Var2 = z ? new yj8(pair.first) : a3bVarH.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jS2 = oaf.S(jD2);
        if (!mueVar2.q()) {
            jS2 -= mueVar2.h(obj, this.z0).e;
        }
        if (z || jLongValue < jS2) {
            fm9.k(!yj8Var2.b());
            tze tzeVar = z ? tze.d : a3bVarH.h;
            l0f l0fVar = z ? this.c : a3bVarH.i;
            if (z) {
                ls5 ls5Var = zw6.b;
                list = ffc.X;
            } else {
                list = a3bVarH.j;
            }
            a3b a3bVarB2 = a3bVarH.c(yj8Var2, jLongValue, jLongValue, jLongValue, 0L, tzeVar, l0fVar, list).b(yj8Var2);
            a3bVarB2.q = jLongValue;
            return a3bVarB2;
        }
        if (jLongValue != jS2) {
            fm9.k(!yj8Var2.b());
            long jMax = Math.max(0L, a3bVarH.r - (jLongValue - jS2));
            long j = a3bVarH.q;
            if (a3bVarH.k.equals(a3bVarH.b)) {
                j = jLongValue + jMax;
            }
            a3b a3bVarC = a3bVarH.c(yj8Var2, jLongValue, jLongValue, jLongValue, jMax, a3bVarH.h, a3bVarH.i, a3bVarH.j);
            a3bVarC.q = j;
            return a3bVarC;
        }
        int iB = mueVar.b(a3bVarH.k.a);
        if (iB != -1 && mueVar.g(iB, this.z0, false).c == mueVar.h(yj8Var2.a, this.z0).c) {
            return a3bVarH;
        }
        mueVar.h(yj8Var2.a, this.z0);
        long jA = yj8Var2.b() ? this.z0.a(yj8Var2.b, yj8Var2.c) : this.z0.d;
        a3b a3bVarB3 = a3bVarH.c(yj8Var2, a3bVarH.s, a3bVarH.s, a3bVarH.d, jA - a3bVarH.s, a3bVarH.h, a3bVarH.i, a3bVarH.j).b(yj8Var2);
        a3bVarB3.q = jA;
        return a3bVarB3;
    }

    public final Pair j2(mue mueVar, int i, long j) {
        if (mueVar.q()) {
            this.s1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.t1 = j;
            return null;
        }
        if (i == -1 || i >= mueVar.p()) {
            i = mueVar.a(this.S0);
            j = oaf.h0(mueVar.n(i, (kue) this.b, 0L).l);
        }
        return mueVar.j((kue) this.b, this.z0, i, oaf.S(j));
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long k() {
        w2();
        return oaf.h0(e2(this.r1));
    }

    @Override // defpackage.q3b
    public final gd8 k0() {
        w2();
        return this.Z0;
    }

    public final void k2(int i, int i2) {
        lsd lsdVar = this.e1;
        if (i == lsdVar.a && i2 == lsdVar.b) {
            return;
        }
        this.e1 = new lsd(i, i2);
        this.x0.f(24, new h75(i, i2, 0));
        n2(2, 14, new lsd(i, i2));
    }

    @Override // defpackage.q3b
    public final int l() {
        w2();
        return 0;
    }

    @Override // defpackage.q3b
    public final zz3 l0() {
        w2();
        return this.j1;
    }

    public final a3b l2(a3b a3bVar, int i, int i2) {
        int iF2 = f2(a3bVar);
        long jD2 = d2(a3bVar);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        this.T0++;
        m2(i, i2);
        b5b b5bVar = new b5b(arrayList, this.W0);
        a3b a3bVarI2 = i2(a3bVar, b5bVar, g2(a3bVar.a, b5bVar, iF2, jD2));
        int i3 = a3bVarI2.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iF2 >= a3bVarI2.a.p()) {
            a3bVarI2 = a3bVarI2.g(4);
        }
        this.w0.s0.b(this.W0, 20, i, i2).b();
        return a3bVarI2;
    }

    @Override // defpackage.q3b
    public final void m(Surface surface) {
        w2();
        p2(surface);
        int i = surface == null ? 0 : -1;
        k2(i, i);
    }

    @Override // defpackage.q3b
    public final void m0(h30 h30Var, boolean z) {
        w2();
        if (this.n1) {
            return;
        }
        boolean zA = oaf.a(this.g1, h30Var);
        pm7 pm7Var = this.x0;
        if (!zA) {
            this.g1 = h30Var;
            n2(1, 3, h30Var);
            pm7Var.c(20, new j75(h30Var, 0));
        }
        h30 h30Var2 = z ? h30Var : null;
        n40 n40Var = this.N0;
        n40Var.b(h30Var2);
        this.t0.a(h30Var);
        boolean zU = u();
        int iD = n40Var.d(getPlaybackState(), zU);
        s2(iD, iD == -1 ? 2 : 1, zU);
        pm7Var.b();
    }

    public final void m2(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.A0.remove(i3);
        }
        dod dodVar = this.W0;
        int i4 = i2 - i;
        int[] iArr = dodVar.b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.W0 = new dod(iArr2, new Random(dodVar.a.nextLong()));
    }

    @Override // defpackage.u2, defpackage.q3b
    public final boolean n() {
        w2();
        return this.r1.b.b();
    }

    @Override // defpackage.q3b
    public final void n0(gd8 gd8Var) {
        w2();
        if (gd8Var.equals(this.Z0)) {
            return;
        }
        this.Z0 = gd8Var;
        this.x0.f(15, new i75(this, 1));
    }

    public final void n2(int i, int i2, Object obj) {
        for (vj0 vj0Var : this.s0) {
            if (i == -1 || vj0Var.b == i) {
                int iF2 = f2(this.r1);
                mue mueVar = this.r1.a;
                int i3 = iF2 == -1 ? 0 : iF2;
                g85 g85Var = this.w0;
                s4b s4bVar = new s4b(g85Var, vj0Var, mueVar, i3, this.J0, g85Var.u0);
                fm9.k(!s4bVar.g);
                s4bVar.d = i2;
                fm9.k(!s4bVar.g);
                s4bVar.e = obj;
                s4bVar.c();
            }
        }
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int o0() {
        w2();
        if (n()) {
            return this.r1.b.b;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o2(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            a3b r2 = r0.r1
            int r2 = r15.f2(r2)
            long r3 = r15.k()
            int r5 = r0.T0
            r6 = 1
            int r5 = r5 + r6
            r0.T0 = r5
            java.util.ArrayList r5 = r0.A0
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L23
            int r7 = r5.size()
            r15.m2(r8, r7)
        L23:
            r7 = r16
            java.util.ArrayList r10 = r15.Z1(r8, r7)
            b5b r7 = new b5b
            dod r9 = r0.W0
            r7.<init>(r5, r9)
            boolean r5 = r7.q()
            int r9 = r7.g
            if (r5 != 0) goto L41
            if (r1 >= r9) goto L3b
            goto L41
        L3b:
            androidx.media3.common.IllegalSeekPositionException r0 = new androidx.media3.common.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L41:
            r5 = -1
            if (r20 == 0) goto L51
            boolean r1 = r0.S0
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4f:
            r12 = r1
            goto L59
        L51:
            if (r1 != r5) goto L56
            r12 = r2
            r2 = r3
            goto L59
        L56:
            r2 = r18
            goto L4f
        L59:
            a3b r1 = r0.r1
            android.util.Pair r4 = r15.j2(r7, r12, r2)
            a3b r1 = r15.i2(r1, r7, r4)
            int r4 = r1.e
            if (r12 == r5) goto L75
            if (r4 == r6) goto L75
            boolean r4 = r7.q()
            if (r4 != 0) goto L74
            if (r12 < r9) goto L72
            goto L74
        L72:
            r4 = 2
            goto L75
        L74:
            r4 = 4
        L75:
            a3b r1 = r1.g(r4)
            long r13 = defpackage.oaf.S(r2)
            dod r11 = r0.W0
            g85 r2 = r0.w0
            bie r2 = r2.s0
            y75 r3 = new y75
            r9 = r3
            r9.<init>(r10, r11, r12, r13)
            r4 = 17
            zhe r2 = r2.a(r4, r3)
            r2.b()
            a3b r2 = r0.r1
            yj8 r2 = r2.b
            java.lang.Object r2 = r2.a
            yj8 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lae
            a3b r2 = r0.r1
            mue r2 = r2.a
            boolean r2 = r2.q()
            if (r2 != 0) goto Lae
            r3 = r6
            goto Laf
        Lae:
            r3 = r8
        Laf:
            long r5 = r15.e2(r1)
            r2 = 0
            r4 = 4
            r7 = -1
            r8 = 0
            r0 = r15
            r0.t2(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u75.o2(java.util.List, int, long, boolean):void");
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int p0() {
        w2();
        int iF2 = f2(this.r1);
        if (iF2 == -1) {
            return 0;
        }
        return iF2;
    }

    public final void p2(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (vj0 vj0Var : this.s0) {
            if (vj0Var.b == 2) {
                int iF2 = f2(this.r1);
                mue mueVar = this.r1.a;
                int i = iF2 == -1 ? 0 : iF2;
                g85 g85Var = this.w0;
                s4b s4bVar = new s4b(g85Var, vj0Var, mueVar, i, this.J0, g85Var.u0);
                fm9.k(!s4bVar.g);
                s4bVar.d = 1;
                fm9.k(!s4bVar.g);
                s4bVar.e = obj;
                s4bVar.c();
                arrayList.add(s4bVar);
            }
        }
        Object obj2 = this.b1;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s4b) it.next()).a(this.Q0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            z = false;
            Object obj3 = this.b1;
            Surface surface = this.c1;
            if (obj3 == surface) {
                surface.release();
                this.c1 = null;
            }
        }
        this.b1 = obj;
        if (z) {
            q2(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
        }
    }

    @Override // defpackage.q3b
    public final void prepare() {
        w2();
        boolean zU = u();
        int iD = this.N0.d(2, zU);
        s2(iD, iD == -1 ? 2 : 1, zU);
        a3b a3bVar = this.r1;
        if (a3bVar.e != 1) {
            return;
        }
        a3b a3bVarE = a3bVar.e(null);
        a3b a3bVarG = a3bVarE.g(a3bVarE.a.q() ? 4 : 2);
        this.T0++;
        bie bieVar = this.w0.s0;
        bieVar.getClass();
        zhe zheVarC = bie.c();
        zheVarC.a = bieVar.a.obtainMessage(29);
        zheVarC.b();
        t2(a3bVarG, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long q() {
        w2();
        return oaf.h0(this.r1.r);
    }

    @Override // defpackage.q3b
    public final void q0(boolean z) {
        w2();
    }

    public final void q2(ExoPlaybackException exoPlaybackException) {
        a3b a3bVar = this.r1;
        a3b a3bVarB = a3bVar.b(a3bVar.b);
        a3bVarB.q = a3bVarB.s;
        a3bVarB.r = 0L;
        a3b a3bVarG = a3bVarB.g(1);
        if (exoPlaybackException != null) {
            a3bVarG = a3bVarG.e(exoPlaybackException);
        }
        a3b a3bVar2 = a3bVarG;
        this.T0++;
        bie bieVar = this.w0.s0;
        bieVar.getClass();
        zhe zheVarC = bie.c();
        zheVarC.a = bieVar.a.obtainMessage(6);
        zheVarC.b();
        t2(a3bVar2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.q3b
    public final void r0(n3b n3bVar) {
        w2();
        n3bVar.getClass();
        this.x0.e(n3bVar);
    }

    public final void r2() {
        k3b k3bVar = this.X0;
        int i = oaf.a;
        q3b q3bVar = this.Z;
        boolean zN = q3bVar.n();
        boolean zN1 = q3bVar.n1();
        boolean zM = q3bVar.M();
        boolean zJ0 = q3bVar.j0();
        boolean zK1 = q3bVar.K1();
        boolean zY1 = q3bVar.y1();
        boolean zQ = q3bVar.x0().q();
        wd6 wd6Var = new wd6(1);
        tm5 tm5Var = this.o.a;
        rm5 rm5Var = (rm5) wd6Var.b;
        rm5Var.b(tm5Var);
        boolean z = !zN;
        wd6Var.s(4, z);
        wd6Var.s(5, zN1 && !zN);
        wd6Var.s(6, zM && !zN);
        wd6Var.s(7, !zQ && (zM || !zK1 || zN1) && !zN);
        wd6Var.s(8, zJ0 && !zN);
        wd6Var.s(9, !zQ && (zJ0 || (zK1 && zY1)) && !zN);
        wd6Var.s(10, z);
        wd6Var.s(11, zN1 && !zN);
        wd6Var.s(12, zN1 && !zN);
        k3b k3bVar2 = new k3b(rm5Var.e());
        this.X0 = k3bVar2;
        if (k3bVar2.equals(k3bVar)) {
            return;
        }
        this.x0.c(13, new i75(this, 2));
    }

    @Override // defpackage.q3b
    public final void release() {
        boolean z;
        re4 re4Var;
        AudioTrack audioTrack;
        z04.J("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "] [" + nc8.b() + "]");
        w2();
        int i = oaf.a;
        if (i < 21 && (audioTrack = this.a1) != null) {
            audioTrack.release();
            this.a1 = null;
        }
        this.M0.v();
        this.O0.getClass();
        ae3 ae3Var = this.P0;
        ae3Var.getClass();
        ae3Var.getClass();
        n40 n40Var = this.N0;
        n40Var.h = null;
        n40Var.a();
        n40Var.c(0);
        g85 g85Var = this.w0;
        synchronized (g85Var) {
            if (g85Var.L0 || !g85Var.u0.getThread().isAlive()) {
                z = true;
            } else {
                g85Var.s0.f(7);
                g85Var.h0(new lc4(8, g85Var), g85Var.G0);
                z = g85Var.L0;
            }
        }
        if (!z) {
            this.x0.f(10, new ta4(17));
        }
        this.x0.d();
        this.u0.a.removeCallbacksAndMessages(null);
        hg0 hg0Var = this.F0;
        i74 i74Var = this.D0;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((i84) hg0Var).b.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            fg0 fg0Var = (fg0) it.next();
            if (fg0Var.b == i74Var) {
                fg0Var.c = true;
                copyOnWriteArrayList.remove(fg0Var);
            }
        }
        a3b a3bVar = this.r1;
        if (a3bVar.p) {
            this.r1 = a3bVar.a();
        }
        a3b a3bVarG = this.r1.g(1);
        this.r1 = a3bVarG;
        a3b a3bVarB = a3bVarG.b(a3bVarG.b);
        this.r1 = a3bVarB;
        a3bVarB.q = a3bVarB.s;
        this.r1.r = 0L;
        i74 i74Var2 = this.D0;
        bie bieVar = i74Var2.s0;
        fm9.l(bieVar);
        bieVar.d(new cu1(24, i74Var2));
        cf4 cf4Var = (cf4) this.t0;
        synchronized (cf4Var.c) {
            if (i >= 32) {
                try {
                    w36 w36Var = cf4Var.h;
                    if (w36Var != null && (re4Var = (re4) w36Var.o) != null && ((Handler) w36Var.c) != null) {
                        ((Spatializer) w36Var.b).removeOnSpatializerStateChangedListener(re4Var);
                        ((Handler) w36Var.c).removeCallbacksAndMessages(null);
                        w36Var.c = null;
                        w36Var.o = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cf4Var.a = null;
        cf4Var.b = null;
        Surface surface = this.c1;
        if (surface != null) {
            surface.release();
            this.c1 = null;
        }
        this.j1 = zz3.c;
        this.n1 = true;
    }

    @Override // defpackage.q3b
    public final k3b s() {
        w2();
        return this.X0;
    }

    @Override // defpackage.q3b
    public final void s0(List list, int i, int i2) {
        w2();
        fm9.f(i >= 0 && i2 >= i);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            for (int i3 = i; i3 < iMin; i3++) {
                if (((s75) arrayList.get(i3)).b.k.a((tb8) list.get(i3 - i))) {
                }
            }
            this.T0++;
            this.w0.s0.b(list, 27, i, iMin).b();
            for (int i4 = i; i4 < iMin; i4++) {
                s75 s75Var = (s75) arrayList.get(i4);
                s75Var.c = new z4b(s75Var.c, (tb8) list.get(i4 - i));
            }
            t2(this.r1.h(new b5b(arrayList, this.W0)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList arrayListC2 = c2(list);
        if (!arrayList.isEmpty()) {
            a3b a3bVarL2 = l2(a2(this.r1, iMin, arrayListC2), i, iMin);
            t2(a3bVarL2, 0, !a3bVarL2.b.a.equals(this.r1.b.a), 4, e2(a3bVarL2), -1, false);
        } else {
            boolean z = this.s1 == -1;
            w2();
            o2(arrayListC2, -1, -9223372036854775807L, z);
        }
    }

    public final void s2(int i, int i2, boolean z) {
        boolean z2 = z && i != -1;
        int i3 = i == 0 ? 1 : 0;
        a3b a3bVar = this.r1;
        if (a3bVar.l == z2 && a3bVar.n == i3 && a3bVar.m == i2) {
            return;
        }
        u2(i2, i3, z2);
    }

    @Override // defpackage.q3b
    public final void setRepeatMode(int i) {
        w2();
        if (this.R0 != i) {
            this.R0 = i;
            bie bieVar = this.w0.s0;
            bieVar.getClass();
            zhe zheVarC = bie.c();
            zheVarC.a = bieVar.a.obtainMessage(11, i, 0);
            zheVarC.b();
            z64 z64Var = new z64(i, 2);
            pm7 pm7Var = this.x0;
            pm7Var.c(8, z64Var);
            r2();
            pm7Var.b();
        }
    }

    @Override // defpackage.q3b
    public final void stop() {
        w2();
        this.N0.d(1, u());
        q2(null);
        this.j1 = new zz3(this.r1.s, ffc.X);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t2(final defpackage.a3b r41, int r42, boolean r43, int r44, long r45, int r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u75.t2(a3b, int, boolean, int, long, int, boolean):void");
    }

    @Override // defpackage.q3b
    public final boolean u() {
        w2();
        return this.r1.l;
    }

    @Override // defpackage.q3b
    public final void u0(int i, int i2, int i3) {
        w2();
        fm9.f(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        mue mueVarX0 = x0();
        this.T0++;
        oaf.R(arrayList, i, iMin, iMin2);
        b5b b5bVar = new b5b(arrayList, this.W0);
        a3b a3bVar = this.r1;
        a3b a3bVarI2 = i2(a3bVar, b5bVar, g2(mueVarX0, b5bVar, f2(a3bVar), d2(this.r1)));
        dod dodVar = this.W0;
        g85 g85Var = this.w0;
        g85Var.getClass();
        g85Var.s0.a(19, new z75(i, iMin, iMin2, dodVar)).b();
        t2(a3bVarI2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void u2(int i, int i2, boolean z) {
        this.T0++;
        a3b a3bVarA = this.r1;
        if (a3bVarA.p) {
            a3bVarA = a3bVarA.a();
        }
        a3b a3bVarD = a3bVarA.d(i, i2, z);
        int i3 = i | (i2 << 4);
        bie bieVar = this.w0.s0;
        bieVar.getClass();
        zhe zheVarC = bie.c();
        zheVarC.a = bieVar.a.obtainMessage(1, z ? 1 : 0, i3);
        zheVarC.b();
        t2(a3bVarD, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.q3b
    public final int v0() {
        w2();
        return this.r1.n;
    }

    public final void v2() {
        int playbackState = getPlaybackState();
        ae3 ae3Var = this.P0;
        crd crdVar = this.O0;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                w2();
                boolean z = this.r1.p;
                u();
                crdVar.getClass();
                u();
                ae3Var.getClass();
                ae3Var.getClass();
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        crdVar.getClass();
        ae3Var.getClass();
        ae3Var.getClass();
    }

    @Override // defpackage.q3b
    public final void w(boolean z) {
        w2();
        if (this.S0 != z) {
            this.S0 = z;
            bie bieVar = this.w0.s0;
            bieVar.getClass();
            zhe zheVarC = bie.c();
            zheVarC.a = bieVar.a.obtainMessage(12, z ? 1 : 0, 0);
            zheVarC.b();
            l01 l01Var = new l01(z, 2);
            pm7 pm7Var = this.x0;
            pm7Var.c(9, l01Var);
            r2();
            pm7Var.b();
        }
    }

    public final void w2() {
        this.X.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.E0;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = oaf.a;
            Locale locale = Locale.US;
            String strJ = k7d.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.k1) {
                throw new IllegalStateException(strJ);
            }
            z04.d0(strJ, this.l1 ? null : new IllegalStateException());
            this.l1 = true;
        }
    }

    @Override // defpackage.q3b
    public final mue x0() {
        w2();
        return this.r1.a;
    }

    @Override // defpackage.q3b
    public final long y() {
        w2();
        return this.I0;
    }

    @Override // defpackage.q3b
    public final void z(n3b n3bVar) {
        n3bVar.getClass();
        this.x0.a(n3bVar);
    }

    @Override // defpackage.q3b
    public final boolean z0() {
        w2();
        return false;
    }

    @Override // defpackage.q3b
    public final Looper z1() {
        return this.E0;
    }
}
