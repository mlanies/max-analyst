package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class t75 extends u2 {
    public final ArrayList A0;
    public final boolean B0;
    public final h74 C0;
    public final Looper D0;
    public final gg0 E0;
    public final rhe F0;
    public final n75 G0;
    public final p75 H0;
    public final n40 I0;
    public final f9e J0;
    public final huc K0;
    public final o84 L0;
    public final long M0;
    public int N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public int R0;
    public final w1d S0;
    public cod T0;
    public j3b U0;
    public fd8 V0;
    public final AudioTrack W0;
    public final ae3 X;
    public Object X0;
    public final Context Y;
    public Surface Y0;
    public final u2 Z;
    public final int Z0;
    public int a1;
    public int b1;
    public final l0f c;
    public final int c1;
    public final g30 d1;
    public float e1;
    public boolean f1;
    public final boolean g1;
    public boolean h1;
    public final si4 i1;
    public fd8 j1;
    public z2b k1;
    public int l1;
    public long m1;
    public final j3b o;
    public final uj0[] s0;
    public final gz7 t0;
    public final aie u0;
    public final g75 v0;
    public final f85 w0;
    public final z23 x0;
    public final CopyOnWriteArraySet y0;
    public final gue z0;

    static {
        h85.a("goog.exo.exoplayer");
    }

    public t75(w65 w65Var, u2 u2Var) {
        super(2);
        this.X = new ae3(false, 0);
        try {
            new StringBuilder(String.valueOf(Integer.toHexString(System.identityHashCode(this))).length() + 30 + String.valueOf(maf.e).length());
            Context context = w65Var.a;
            Looper looper = w65Var.i;
            this.Y = context.getApplicationContext();
            w56 w56Var = w65Var.h;
            rhe rheVar = w65Var.b;
            this.C0 = (h74) w56Var.mo131apply(rheVar);
            this.d1 = w65Var.j;
            this.Z0 = w65Var.k;
            this.f1 = false;
            this.M0 = w65Var.o;
            n75 n75Var = new n75(this);
            this.G0 = n75Var;
            this.H0 = new p75();
            Handler handler = new Handler(looper);
            uj0[] uj0VarArrA = ((cle) w65Var.c.get()).a(handler, n75Var, n75Var, n75Var, n75Var);
            this.s0 = uj0VarArrA;
            np8.f(uj0VarArrA.length > 0);
            this.t0 = (gz7) w65Var.e.get();
            this.E0 = (gg0) w65Var.g.get();
            this.B0 = w65Var.l;
            this.S0 = w65Var.m;
            this.D0 = looper;
            this.F0 = rheVar;
            this.Z = u2Var == null ? this : u2Var;
            this.x0 = new z23(looper, rheVar, new g75(this));
            this.y0 = new CopyOnWriteArraySet();
            this.A0 = new ArrayList();
            this.T0 = new cod();
            this.c = new l0f(new kgc[uj0VarArrA.length], new m85[uj0VarArrA.length], r0f.b, (ez7) null);
            this.z0 = new gue();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i = 0; i < 20; i++) {
                int i2 = iArr[i];
                np8.f(!false);
                sparseBooleanArray.append(i2, true);
            }
            this.t0.getClass();
            np8.f(!false);
            sparseBooleanArray.append(29, true);
            np8.f(!false);
            sm5 sm5Var = new sm5(sparseBooleanArray);
            this.o = new j3b(sm5Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < sm5Var.a.size(); i3++) {
                int iA = sm5Var.a(i3);
                np8.f(!false);
                sparseBooleanArray2.append(iA, true);
            }
            np8.f(!false);
            sparseBooleanArray2.append(4, true);
            np8.f(!false);
            sparseBooleanArray2.append(10, true);
            np8.f(!false);
            this.U0 = new j3b(new sm5(sparseBooleanArray2));
            this.u0 = this.F0.a(this.D0, null);
            g75 g75Var = new g75(this);
            this.v0 = g75Var;
            this.k1 = z2b.h(this.c);
            this.C0.R(this.Z, this.D0);
            int i4 = maf.a;
            this.w0 = new f85(this.s0, this.t0, this.c, (ec4) w65Var.f.get(), this.E0, this.N0, this.C0, this.S0, w65Var.n, false, this.D0, this.F0, g75Var, i4 < 31 ? new i4b() : l75.a());
            this.e1 = 1.0f;
            this.N0 = 0;
            fd8 fd8Var = fd8.S0;
            this.V0 = fd8Var;
            this.j1 = fd8Var;
            int iGenerateAudioSessionId = -1;
            this.l1 = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.W0;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.W0.release();
                    this.W0 = null;
                }
                if (this.W0 == null) {
                    this.W0 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.c1 = this.W0.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.Y.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.c1 = iGenerateAudioSessionId;
            }
            ffc ffcVar = ffc.X;
            this.g1 = true;
            h74 h74Var = this.C0;
            h74Var.getClass();
            z23 z23Var = this.x0;
            z23Var.getClass();
            ((CopyOnWriteArraySet) z23Var.d).add(new nm7(h74Var));
            ((h84) this.E0).b(this.C0, new Handler(this.D0));
            this.y0.add(this.G0);
            td tdVar = new td(context, handler, this.G0);
            k30 k30Var = (k30) tdVar.o;
            Context context2 = (Context) tdVar.c;
            if (tdVar.b) {
                context2.unregisterReceiver(k30Var);
                tdVar.b = false;
            }
            n40 n40Var = new n40(context, handler, this.G0);
            this.I0 = n40Var;
            if (!maf.a((g30) n40Var.i, null)) {
                n40Var.i = null;
                n40Var.d = 0;
            }
            f9e f9eVar = new f9e(context, handler, this.G0);
            this.J0 = f9eVar;
            int iX = maf.x(this.d1.c);
            if (f9eVar.d != iX) {
                f9eVar.d = iX;
                f9eVar.b();
                t75 t75Var = f9eVar.b.a;
                si4 si4VarA2 = a2(t75Var.J0);
                if (!si4VarA2.equals(t75Var.i1)) {
                    t75Var.i1 = si4VarA2;
                    t75Var.x0.i(29, new q64(21, si4VarA2));
                }
            }
            huc hucVar = new huc();
            this.K0 = hucVar;
            this.L0 = new o84(context);
            this.i1 = a2(f9eVar);
            k2(1, 10, Integer.valueOf(this.c1));
            k2(2, 10, Integer.valueOf(this.c1));
            k2(1, 3, this.d1);
            k2(2, 4, Integer.valueOf(this.Z0));
            k2(2, 5, 0);
            k2(1, 9, Boolean.valueOf(this.f1));
            k2(2, 7, this.H0);
            k2(6, 8, this.H0);
            this.X.g();
        } catch (Throwable th) {
            this.X.g();
            throw th;
        }
    }

    public static si4 a2(f9e f9eVar) {
        f9eVar.getClass();
        int i = maf.a;
        AudioManager audioManager = f9eVar.c;
        return new si4(0, i >= 28 ? audioManager.getStreamMinVolume(f9eVar.d) : 0, audioManager.getStreamMaxVolume(f9eVar.d));
    }

    public static long e2(z2b z2bVar) {
        jue jueVar = new jue();
        gue gueVar = new gue();
        z2bVar.a.h(z2bVar.b.a, gueVar);
        long j = z2bVar.c;
        if (j != -9223372036854775807L) {
            return gueVar.X + j;
        }
        return z2bVar.a.n(gueVar.c, jueVar, 0L).x0;
    }

    public static boolean f2(z2b z2bVar) {
        return z2bVar.e == 3 && z2bVar.l && z2bVar.m == 0;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int B() {
        s2();
        if (this.k1.a.q()) {
            return 0;
        }
        z2b z2bVar = this.k1;
        return z2bVar.a.b(z2bVar.b.a);
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int O() {
        s2();
        if (n()) {
            return this.k1.b.c;
        }
        return -1;
    }

    @Override // defpackage.u2
    public final lue O1() {
        s2();
        return this.k1.a;
    }

    @Override // defpackage.u2
    public final void Q1() {
        s2();
    }

    public final fd8 Z1() {
        lue lueVarO1 = O1();
        if (lueVarO1.q()) {
            return this.j1;
        }
        rb8 rb8Var = lueVarO1.n(p0(), (jue) this.b, 0L).c;
        dd8 dd8VarA = this.j1.a();
        fd8 fd8Var = rb8Var.o;
        if (fd8Var != null) {
            CharSequence charSequence = fd8Var.a;
            if (charSequence != null) {
                dd8VarA.a = charSequence;
            }
            CharSequence charSequence2 = fd8Var.b;
            if (charSequence2 != null) {
                dd8VarA.b = charSequence2;
            }
            CharSequence charSequence3 = fd8Var.c;
            if (charSequence3 != null) {
                dd8VarA.c = charSequence3;
            }
            CharSequence charSequence4 = fd8Var.o;
            if (charSequence4 != null) {
                dd8VarA.d = charSequence4;
            }
            CharSequence charSequence5 = fd8Var.X;
            if (charSequence5 != null) {
                dd8VarA.e = charSequence5;
            }
            CharSequence charSequence6 = fd8Var.Y;
            if (charSequence6 != null) {
                dd8VarA.f = charSequence6;
            }
            CharSequence charSequence7 = fd8Var.Z;
            if (charSequence7 != null) {
                dd8VarA.g = charSequence7;
            }
            Uri uri = fd8Var.s0;
            if (uri != null) {
                dd8VarA.h = uri;
            }
            d5c d5cVar = fd8Var.t0;
            if (d5cVar != null) {
                dd8VarA.i = d5cVar;
            }
            d5c d5cVar2 = fd8Var.u0;
            if (d5cVar2 != null) {
                dd8VarA.j = d5cVar2;
            }
            byte[] bArr = fd8Var.v0;
            if (bArr != null) {
                dd8VarA.k = (byte[]) bArr.clone();
                dd8VarA.l = fd8Var.w0;
            }
            Uri uri2 = fd8Var.x0;
            if (uri2 != null) {
                dd8VarA.m = uri2;
            }
            Integer num = fd8Var.y0;
            if (num != null) {
                dd8VarA.n = num;
            }
            Integer num2 = fd8Var.z0;
            if (num2 != null) {
                dd8VarA.o = num2;
            }
            Integer num3 = fd8Var.A0;
            if (num3 != null) {
                dd8VarA.p = num3;
            }
            Boolean bool = fd8Var.B0;
            if (bool != null) {
                dd8VarA.q = bool;
            }
            Integer num4 = fd8Var.C0;
            if (num4 != null) {
                dd8VarA.r = num4;
            }
            Integer num5 = fd8Var.D0;
            if (num5 != null) {
                dd8VarA.r = num5;
            }
            Integer num6 = fd8Var.E0;
            if (num6 != null) {
                dd8VarA.s = num6;
            }
            Integer num7 = fd8Var.F0;
            if (num7 != null) {
                dd8VarA.t = num7;
            }
            Integer num8 = fd8Var.G0;
            if (num8 != null) {
                dd8VarA.u = num8;
            }
            Integer num9 = fd8Var.H0;
            if (num9 != null) {
                dd8VarA.v = num9;
            }
            Integer num10 = fd8Var.I0;
            if (num10 != null) {
                dd8VarA.w = num10;
            }
            CharSequence charSequence8 = fd8Var.J0;
            if (charSequence8 != null) {
                dd8VarA.x = charSequence8;
            }
            CharSequence charSequence9 = fd8Var.K0;
            if (charSequence9 != null) {
                dd8VarA.y = charSequence9;
            }
            CharSequence charSequence10 = fd8Var.L0;
            if (charSequence10 != null) {
                dd8VarA.z = charSequence10;
            }
            Integer num11 = fd8Var.M0;
            if (num11 != null) {
                dd8VarA.A = num11;
            }
            Integer num12 = fd8Var.N0;
            if (num12 != null) {
                dd8VarA.B = num12;
            }
            CharSequence charSequence11 = fd8Var.O0;
            if (charSequence11 != null) {
                dd8VarA.C = charSequence11;
            }
            CharSequence charSequence12 = fd8Var.P0;
            if (charSequence12 != null) {
                dd8VarA.D = charSequence12;
            }
            CharSequence charSequence13 = fd8Var.Q0;
            if (charSequence13 != null) {
                dd8VarA.E = charSequence13;
            }
            Bundle bundle = fd8Var.R0;
            if (bundle != null) {
                dd8VarA.F = bundle;
            }
        }
        return new fd8(dd8VarA);
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long b0() {
        s2();
        if (!n()) {
            return k();
        }
        z2b z2bVar = this.k1;
        lue lueVar = z2bVar.a;
        Object obj = z2bVar.b.a;
        gue gueVar = this.z0;
        lueVar.h(obj, gueVar);
        z2b z2bVar2 = this.k1;
        return z2bVar2.c == -9223372036854775807L ? maf.M(z2bVar2.a.n(p0(), (jue) this.b, 0L).x0) : maf.M(gueVar.X) + maf.M(this.k1.c);
    }

    public final r4b b2(p4b p4bVar) {
        int iD2 = d2();
        lue lueVar = this.k1.a;
        if (iD2 == -1) {
            iD2 = 0;
        }
        f85 f85Var = this.w0;
        return new r4b(f85Var, p4bVar, lueVar, iD2, this.F0, f85Var.u0);
    }

    @Override // defpackage.q3b
    public final long c() {
        s2();
        if (!n()) {
            lue lueVarO1 = O1();
            if (lueVarO1.q()) {
                return -9223372036854775807L;
            }
            return maf.M(lueVarO1.n(p0(), (jue) this.b, 0L).y0);
        }
        z2b z2bVar = this.k1;
        xj8 xj8Var = z2bVar.b;
        lue lueVar = z2bVar.a;
        Object obj = xj8Var.a;
        gue gueVar = this.z0;
        lueVar.h(obj, gueVar);
        return maf.M(gueVar.a(xj8Var.b, xj8Var.c));
    }

    public final long c2(z2b z2bVar) {
        if (z2bVar.a.q()) {
            return maf.D(this.m1);
        }
        if (z2bVar.b.a()) {
            return z2bVar.s;
        }
        lue lueVar = z2bVar.a;
        xj8 xj8Var = z2bVar.b;
        long j = z2bVar.s;
        Object obj = xj8Var.a;
        gue gueVar = this.z0;
        lueVar.h(obj, gueVar);
        return j + gueVar.X;
    }

    public final int d2() {
        if (this.k1.a.q()) {
            return this.l1;
        }
        z2b z2bVar = this.k1;
        return z2bVar.a.h(z2bVar.b.a, this.z0).c;
    }

    public final z2b g2(z2b z2bVar, lue lueVar, Pair pair) {
        List list;
        np8.d(lueVar.q() || pair != null);
        lue lueVar2 = z2bVar.a;
        z2b z2bVarG = z2bVar.g(lueVar);
        if (lueVar.q()) {
            xj8 xj8Var = z2b.t;
            long jD = maf.D(this.m1);
            z2b z2bVarA = z2bVarG.b(xj8Var, jD, jD, jD, 0L, sze.o, this.c, ffc.X).a(xj8Var);
            z2bVarA.q = z2bVarA.s;
            return z2bVarA;
        }
        Object obj = z2bVarG.b.a;
        int i = maf.a;
        boolean z = !obj.equals(pair.first);
        xj8 xj8Var2 = z ? new xj8(pair.first) : z2bVarG.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jD2 = maf.D(b0());
        if (!lueVar2.q()) {
            jD2 -= lueVar2.h(obj, this.z0).X;
        }
        if (z || jLongValue < jD2) {
            np8.f(!xj8Var2.a());
            sze szeVar = z ? sze.o : z2bVarG.h;
            l0f l0fVar = z ? this.c : z2bVarG.i;
            if (z) {
                ls5 ls5Var = zw6.b;
                list = ffc.X;
            } else {
                list = z2bVarG.j;
            }
            z2b z2bVarA2 = z2bVarG.b(xj8Var2, jLongValue, jLongValue, jLongValue, 0L, szeVar, l0fVar, list).a(xj8Var2);
            z2bVarA2.q = jLongValue;
            return z2bVarA2;
        }
        if (jLongValue != jD2) {
            np8.f(!xj8Var2.a());
            long jMax = Math.max(0L, z2bVarG.r - (jLongValue - jD2));
            long j = z2bVarG.q;
            if (z2bVarG.k.equals(z2bVarG.b)) {
                j = jLongValue + jMax;
            }
            z2b z2bVarB = z2bVarG.b(xj8Var2, jLongValue, jLongValue, jLongValue, jMax, z2bVarG.h, z2bVarG.i, z2bVarG.j);
            z2bVarB.q = j;
            return z2bVarB;
        }
        int iB = lueVar.b(z2bVarG.k.a);
        if (iB != -1 && lueVar.g(iB, this.z0, false).c == lueVar.h(xj8Var2.a, this.z0).c) {
            return z2bVarG;
        }
        lueVar.h(xj8Var2.a, this.z0);
        long jA = xj8Var2.a() ? this.z0.a(xj8Var2.b, xj8Var2.c) : this.z0.o;
        z2b z2bVarA3 = z2bVarG.b(xj8Var2, z2bVarG.s, z2bVarG.s, z2bVarG.d, jA - z2bVarG.s, z2bVarG.h, z2bVarG.i, z2bVarG.j).a(xj8Var2);
        z2bVarA3.q = jA;
        return z2bVarA3;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int getRepeatMode() {
        s2();
        return this.N0;
    }

    public final Pair h2(lue lueVar, int i, long j) {
        if (lueVar.q()) {
            this.l1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.m1 = j;
            return null;
        }
        if (i == -1 || i >= lueVar.p()) {
            i = lueVar.a(false);
            j = maf.M(lueVar.n(i, (jue) this.b, 0L).x0);
        }
        return lueVar.j((jue) this.b, this.z0, i, maf.D(j));
    }

    public final void i2(int i, int i2) {
        if (i == this.a1 && i2 == this.b1) {
            return;
        }
        this.a1 = i;
        this.b1 = i2;
        this.x0.i(24, new h75(i, i2, 1));
    }

    public final void j2(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.A0.remove(i2);
        }
        cod codVar = this.T0;
        int[] iArr = codVar.b;
        int[] iArr2 = new int[iArr.length - i];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 >= i) {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i;
                }
                iArr2[i6] = i5;
            } else {
                i3++;
            }
        }
        this.T0 = new cod(iArr2, new Random(codVar.a.nextLong()));
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long k() {
        s2();
        return maf.M(c2(this.k1));
    }

    public final void k2(int i, int i2, Object obj) {
        for (uj0 uj0Var : this.s0) {
            if (uj0Var.a == i) {
                r4b r4bVarB2 = b2(uj0Var);
                np8.f(!r4bVarB2.g);
                r4bVarB2.d = i2;
                np8.f(!r4bVarB2.g);
                r4bVarB2.e = obj;
                r4bVarB2.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l2(java.util.List r15, int r16, long r17, boolean r19) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t75.l2(java.util.List, int, long, boolean):void");
    }

    public final void m2(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (uj0 uj0Var : this.s0) {
            if (uj0Var.a == 2) {
                r4b r4bVarB2 = b2(uj0Var);
                np8.f(!r4bVarB2.g);
                r4bVarB2.d = 1;
                np8.f(true ^ r4bVarB2.g);
                r4bVarB2.e = surface;
                r4bVarB2.c();
                arrayList.add(r4bVarB2);
            }
        }
        Object obj = this.X0;
        if (obj != null && obj != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r4b) it.next()).a(this.M0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj2 = this.X0;
            Surface surface2 = this.Y0;
            if (obj2 == surface2) {
                surface2.release();
                this.Y0 = null;
            }
        }
        this.X0 = surface;
        if (z) {
            n2(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
        }
    }

    @Override // defpackage.u2, defpackage.q3b
    public final boolean n() {
        s2();
        return this.k1.b.a();
    }

    public final void n2(ExoPlaybackException exoPlaybackException) {
        z2b z2bVar = this.k1;
        z2b z2bVarA = z2bVar.a(z2bVar.b);
        z2bVarA.q = z2bVarA.s;
        z2bVarA.r = 0L;
        z2b z2bVarF = z2bVarA.f(1);
        if (exoPlaybackException != null) {
            z2bVarF = z2bVarF.e(exoPlaybackException);
        }
        z2b z2bVar2 = z2bVarF;
        this.O0++;
        aie aieVar = this.w0.s0;
        aieVar.getClass();
        yhe yheVarB = aie.b();
        yheVarB.a = aieVar.a.obtainMessage(6);
        yheVarB.b();
        q2(z2bVar2, 0, 1, false, z2bVar2.a.q() && !this.k1.a.q(), 4, c2(z2bVar2), -1);
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int o0() {
        s2();
        if (n()) {
            return this.k1.b.b;
        }
        return -1;
    }

    public final void o2() {
        int iL;
        int iE;
        j3b j3bVar = this.U0;
        int i = maf.a;
        u2 u2Var = this.Z;
        boolean zN = u2Var.n();
        lue lueVarO1 = u2Var.O1();
        boolean zQ = lueVarO1.q();
        jue jueVar = (jue) u2Var.b;
        boolean z = !zQ && lueVarO1.n(u2Var.p0(), jueVar, 0L).s0;
        lue lueVarO12 = u2Var.O1();
        if (lueVarO12.q()) {
            iL = -1;
        } else {
            int iP0 = u2Var.p0();
            int repeatMode = u2Var.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            u2Var.Q1();
            iL = lueVarO12.l(iP0, repeatMode, false);
        }
        boolean z2 = iL != -1;
        lue lueVarO13 = u2Var.O1();
        if (lueVarO13.q()) {
            iE = -1;
        } else {
            int iP02 = u2Var.p0();
            int repeatMode2 = u2Var.getRepeatMode();
            if (repeatMode2 == 1) {
                repeatMode2 = 0;
            }
            u2Var.Q1();
            iE = lueVarO13.e(iP02, repeatMode2, false);
        }
        boolean z3 = iE != -1;
        lue lueVarO14 = u2Var.O1();
        boolean z4 = !lueVarO14.q() && lueVarO14.n(u2Var.p0(), jueVar, 0L).a();
        lue lueVarO15 = u2Var.O1();
        boolean z5 = !lueVarO15.q() && lueVarO15.n(u2Var.p0(), jueVar, 0L).t0;
        boolean zQ2 = u2Var.O1().q();
        o9g o9gVar = new o9g(23);
        sm5 sm5Var = this.o.a;
        rm5 rm5Var = (rm5) o9gVar.b;
        rm5Var.getClass();
        for (int i2 = 0; i2 < sm5Var.a.size(); i2++) {
            rm5Var.a(sm5Var.a(i2));
        }
        boolean z6 = !zN;
        o9gVar.n(4, z6);
        o9gVar.n(5, z && !zN);
        o9gVar.n(6, z2 && !zN);
        o9gVar.n(7, !zQ2 && (z2 || !z4 || z) && !zN);
        o9gVar.n(8, z3 && !zN);
        o9gVar.n(9, !zQ2 && (z3 || (z4 && z5)) && !zN);
        o9gVar.n(10, z6);
        o9gVar.n(11, z && !zN);
        o9gVar.n(12, z && !zN);
        j3b j3bVar2 = new j3b(rm5Var.d());
        this.U0 = j3bVar2;
        if (j3bVar2.equals(j3bVar)) {
            return;
        }
        this.x0.h(13, new g75(this));
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int p0() {
        s2();
        int iD2 = d2();
        if (iD2 == -1) {
            return 0;
        }
        return iD2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void p2(int i, int i2, boolean z) {
        int i3 = 0;
        ?? r4 = (!z || i == -1) ? 0 : 1;
        if (r4 != 0 && i != 1) {
            i3 = 1;
        }
        z2b z2bVar = this.k1;
        if (z2bVar.l == r4 && z2bVar.m == i3) {
            return;
        }
        this.O0++;
        z2b z2bVarD = z2bVar.d(i3, r4);
        aie aieVar = this.w0.s0;
        aieVar.getClass();
        yhe yheVarB = aie.b();
        yheVarB.a = aieVar.a.obtainMessage(1, r4, i3);
        yheVarB.b();
        q2(z2bVarD, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long q() {
        s2();
        return maf.M(this.k1.r);
    }

    public final void q2(final z2b z2bVar, final int i, final int i2, boolean z, boolean z2, int i3, long j, int i4) {
        Pair pair;
        int i5;
        rb8 rb8Var;
        boolean z3;
        boolean z4;
        int i6;
        Object obj;
        rb8 rb8Var2;
        Object obj2;
        int i7;
        long j2;
        long j3;
        long jE2;
        long jE22;
        Object obj3;
        rb8 rb8Var3;
        Object obj4;
        int i8;
        z2b z2bVar2 = this.k1;
        this.k1 = z2bVar;
        boolean z5 = !z2bVar2.a.equals(z2bVar.a);
        lue lueVar = z2bVar2.a;
        lue lueVar2 = z2bVar.a;
        if (lueVar2.q() && lueVar.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (lueVar2.q() != lueVar.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            xj8 xj8Var = z2bVar2.b;
            Object obj5 = xj8Var.a;
            gue gueVar = this.z0;
            int i9 = lueVar.h(obj5, gueVar).c;
            jue jueVar = (jue) this.b;
            Object obj6 = lueVar.n(i9, jueVar, 0L).a;
            xj8 xj8Var2 = z2bVar.b;
            if (obj6.equals(lueVar2.n(lueVar2.h(xj8Var2.a, gueVar).c, jueVar, 0L).a)) {
                pair = (z2 && i3 == 0 && xj8Var.d < xj8Var2.d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z2 && i3 == 0) {
                    i5 = 1;
                } else if (z2 && i3 == 1) {
                    i5 = 2;
                } else {
                    if (!z5) {
                        throw new IllegalStateException();
                    }
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        fd8 fd8VarZ1 = this.V0;
        if (zBooleanValue) {
            rb8Var = !z2bVar.a.q() ? z2bVar.a.n(z2bVar.a.h(z2bVar.b.a, this.z0).c, (jue) this.b, 0L).c : null;
            this.j1 = fd8.S0;
        } else {
            rb8Var = null;
        }
        if (zBooleanValue || !z2bVar2.j.equals(z2bVar.j)) {
            dd8 dd8VarA = this.j1.a();
            List list = z2bVar.j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                e99 e99Var = (e99) list.get(i10);
                int i11 = 0;
                while (true) {
                    c99[] c99VarArr = e99Var.a;
                    if (i11 < c99VarArr.length) {
                        c99VarArr[i11].p(dd8VarA);
                        i11++;
                    }
                }
            }
            this.j1 = new fd8(dd8VarA);
            fd8VarZ1 = Z1();
        }
        boolean z6 = !fd8VarZ1.equals(this.V0);
        this.V0 = fd8VarZ1;
        boolean z7 = z2bVar2.l != z2bVar.l;
        boolean z8 = z2bVar2.e != z2bVar.e;
        if (z8 || z7) {
            r2();
        }
        boolean z9 = z2bVar2.g != z2bVar.g;
        if (!z2bVar2.a.equals(z2bVar.a)) {
            final int i12 = 0;
            this.x0.h(0, new jm7() { // from class: e75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj7) {
                    m3b m3bVar = (m3b) obj7;
                    switch (i12) {
                        case 0:
                            lue lueVar3 = z2bVar.a;
                            m3bVar.x(i);
                            break;
                        default:
                            m3bVar.d(i, z2bVar.l);
                            break;
                    }
                }
            });
        }
        if (z2) {
            gue gueVar2 = new gue();
            if (z2bVar2.a.q()) {
                z3 = z8;
                z4 = z9;
                i6 = i4;
                obj = null;
                rb8Var2 = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj7 = z2bVar2.b.a;
                z2bVar2.a.h(obj7, gueVar2);
                int i13 = gueVar2.c;
                int iB = z2bVar2.a.b(obj7);
                z3 = z8;
                z4 = z9;
                obj2 = obj7;
                obj = z2bVar2.a.n(i13, (jue) this.b, 0L).a;
                rb8Var2 = ((jue) this.b).c;
                i6 = i13;
                i7 = iB;
            }
            if (i3 == 0) {
                if (z2bVar2.b.a()) {
                    xj8 xj8Var3 = z2bVar2.b;
                    jE2 = gueVar2.a(xj8Var3.b, xj8Var3.c);
                    jE22 = e2(z2bVar2);
                } else if (z2bVar2.b.e != -1) {
                    jE2 = e2(this.k1);
                    jE22 = jE2;
                } else {
                    j2 = gueVar2.X;
                    j3 = gueVar2.o;
                    jE2 = j2 + j3;
                    jE22 = jE2;
                }
            } else if (z2bVar2.b.a()) {
                jE2 = z2bVar2.s;
                jE22 = e2(z2bVar2);
            } else {
                j2 = gueVar2.X;
                j3 = z2bVar2.s;
                jE2 = j2 + j3;
                jE22 = jE2;
            }
            long jM = maf.M(jE2);
            long jM2 = maf.M(jE22);
            xj8 xj8Var4 = z2bVar2.b;
            o3b o3bVar = new o3b(obj, i6, rb8Var2, obj2, i7, jM, jM2, xj8Var4.b, xj8Var4.c);
            int iP0 = p0();
            if (this.k1.a.q()) {
                obj3 = null;
                rb8Var3 = null;
                obj4 = null;
                i8 = -1;
            } else {
                z2b z2bVar3 = this.k1;
                Object obj8 = z2bVar3.b.a;
                z2bVar3.a.h(obj8, this.z0);
                int iB2 = this.k1.a.b(obj8);
                lue lueVar3 = this.k1.a;
                jue jueVar2 = (jue) this.b;
                i8 = iB2;
                obj3 = lueVar3.n(iP0, jueVar2, 0L).a;
                rb8Var3 = jueVar2.c;
                obj4 = obj8;
            }
            long jM3 = maf.M(j);
            long jM4 = this.k1.b.a() ? maf.M(e2(this.k1)) : jM3;
            xj8 xj8Var5 = this.k1.b;
            this.x0.h(11, new ui0(i3, o3bVar, new o3b(obj3, iP0, rb8Var3, obj4, i8, jM3, jM4, xj8Var5.b, xj8Var5.c), 5));
        } else {
            z3 = z8;
            z4 = z9;
        }
        if (zBooleanValue) {
            this.x0.h(1, new hd0(iIntValue, 5, rb8Var));
        }
        if (z2bVar2.f != z2bVar.f) {
            final int i14 = 0;
            this.x0.h(10, new jm7() { // from class: c75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj9) {
                    m3b m3bVar = (m3b) obj9;
                    switch (i14) {
                        case 0:
                            m3bVar.D(z2bVar.f);
                            break;
                        case 1:
                            m3bVar.r(z2bVar.f);
                            break;
                        case 2:
                            m3bVar.t((r0f) z2bVar.i.Y);
                            break;
                        case 3:
                            z2b z2bVar4 = z2bVar;
                            boolean z10 = z2bVar4.g;
                            m3bVar.getClass();
                            m3bVar.c(z2bVar4.g);
                            break;
                        case 4:
                            z2b z2bVar5 = z2bVar;
                            m3bVar.l(z2bVar5.e, z2bVar5.l);
                            break;
                        case 5:
                            m3bVar.h(z2bVar.e);
                            break;
                        case 6:
                            m3bVar.a(z2bVar.m);
                            break;
                        case 7:
                            m3bVar.n(t75.f2(z2bVar));
                            break;
                        default:
                            m3bVar.w(z2bVar.n);
                            break;
                    }
                }
            });
            if (z2bVar.f != null) {
                final int i15 = 1;
                this.x0.h(10, new jm7() { // from class: c75
                    @Override // defpackage.jm7, defpackage.km7
                    public final void invoke(Object obj9) {
                        m3b m3bVar = (m3b) obj9;
                        switch (i15) {
                            case 0:
                                m3bVar.D(z2bVar.f);
                                break;
                            case 1:
                                m3bVar.r(z2bVar.f);
                                break;
                            case 2:
                                m3bVar.t((r0f) z2bVar.i.Y);
                                break;
                            case 3:
                                z2b z2bVar4 = z2bVar;
                                boolean z10 = z2bVar4.g;
                                m3bVar.getClass();
                                m3bVar.c(z2bVar4.g);
                                break;
                            case 4:
                                z2b z2bVar5 = z2bVar;
                                m3bVar.l(z2bVar5.e, z2bVar5.l);
                                break;
                            case 5:
                                m3bVar.h(z2bVar.e);
                                break;
                            case 6:
                                m3bVar.a(z2bVar.m);
                                break;
                            case 7:
                                m3bVar.n(t75.f2(z2bVar));
                                break;
                            default:
                                m3bVar.w(z2bVar.n);
                                break;
                        }
                    }
                });
            }
        }
        l0f l0fVar = z2bVar2.i;
        l0f l0fVar2 = z2bVar.i;
        if (l0fVar != l0fVar2) {
            gz7 gz7Var = this.t0;
            Object obj9 = l0fVar2.c;
            gz7Var.getClass();
            gz7Var.c = (ez7) obj9;
            this.x0.h(2, new d74(z2bVar, 12, new b0f((m85[]) z2bVar.i.X)));
            final int i16 = 2;
            this.x0.h(2, new jm7() { // from class: c75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj92) {
                    m3b m3bVar = (m3b) obj92;
                    switch (i16) {
                        case 0:
                            m3bVar.D(z2bVar.f);
                            break;
                        case 1:
                            m3bVar.r(z2bVar.f);
                            break;
                        case 2:
                            m3bVar.t((r0f) z2bVar.i.Y);
                            break;
                        case 3:
                            z2b z2bVar4 = z2bVar;
                            boolean z10 = z2bVar4.g;
                            m3bVar.getClass();
                            m3bVar.c(z2bVar4.g);
                            break;
                        case 4:
                            z2b z2bVar5 = z2bVar;
                            m3bVar.l(z2bVar5.e, z2bVar5.l);
                            break;
                        case 5:
                            m3bVar.h(z2bVar.e);
                            break;
                        case 6:
                            m3bVar.a(z2bVar.m);
                            break;
                        case 7:
                            m3bVar.n(t75.f2(z2bVar));
                            break;
                        default:
                            m3bVar.w(z2bVar.n);
                            break;
                    }
                }
            });
        }
        if (z6) {
            this.x0.h(14, new q64(15, this.V0));
        }
        if (z4) {
            final int i17 = 3;
            this.x0.h(3, new jm7() { // from class: c75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj92) {
                    m3b m3bVar = (m3b) obj92;
                    switch (i17) {
                        case 0:
                            m3bVar.D(z2bVar.f);
                            break;
                        case 1:
                            m3bVar.r(z2bVar.f);
                            break;
                        case 2:
                            m3bVar.t((r0f) z2bVar.i.Y);
                            break;
                        case 3:
                            z2b z2bVar4 = z2bVar;
                            boolean z10 = z2bVar4.g;
                            m3bVar.getClass();
                            m3bVar.c(z2bVar4.g);
                            break;
                        case 4:
                            z2b z2bVar5 = z2bVar;
                            m3bVar.l(z2bVar5.e, z2bVar5.l);
                            break;
                        case 5:
                            m3bVar.h(z2bVar.e);
                            break;
                        case 6:
                            m3bVar.a(z2bVar.m);
                            break;
                        case 7:
                            m3bVar.n(t75.f2(z2bVar));
                            break;
                        default:
                            m3bVar.w(z2bVar.n);
                            break;
                    }
                }
            });
        }
        if (z3 || z7) {
            final int i18 = 4;
            this.x0.h(-1, new jm7() { // from class: c75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj92) {
                    m3b m3bVar = (m3b) obj92;
                    switch (i18) {
                        case 0:
                            m3bVar.D(z2bVar.f);
                            break;
                        case 1:
                            m3bVar.r(z2bVar.f);
                            break;
                        case 2:
                            m3bVar.t((r0f) z2bVar.i.Y);
                            break;
                        case 3:
                            z2b z2bVar4 = z2bVar;
                            boolean z10 = z2bVar4.g;
                            m3bVar.getClass();
                            m3bVar.c(z2bVar4.g);
                            break;
                        case 4:
                            z2b z2bVar5 = z2bVar;
                            m3bVar.l(z2bVar5.e, z2bVar5.l);
                            break;
                        case 5:
                            m3bVar.h(z2bVar.e);
                            break;
                        case 6:
                            m3bVar.a(z2bVar.m);
                            break;
                        case 7:
                            m3bVar.n(t75.f2(z2bVar));
                            break;
                        default:
                            m3bVar.w(z2bVar.n);
                            break;
                    }
                }
            });
        }
        if (z3) {
            final int i19 = 5;
            this.x0.h(4, new jm7() { // from class: c75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj92) {
                    m3b m3bVar = (m3b) obj92;
                    switch (i19) {
                        case 0:
                            m3bVar.D(z2bVar.f);
                            break;
                        case 1:
                            m3bVar.r(z2bVar.f);
                            break;
                        case 2:
                            m3bVar.t((r0f) z2bVar.i.Y);
                            break;
                        case 3:
                            z2b z2bVar4 = z2bVar;
                            boolean z10 = z2bVar4.g;
                            m3bVar.getClass();
                            m3bVar.c(z2bVar4.g);
                            break;
                        case 4:
                            z2b z2bVar5 = z2bVar;
                            m3bVar.l(z2bVar5.e, z2bVar5.l);
                            break;
                        case 5:
                            m3bVar.h(z2bVar.e);
                            break;
                        case 6:
                            m3bVar.a(z2bVar.m);
                            break;
                        case 7:
                            m3bVar.n(t75.f2(z2bVar));
                            break;
                        default:
                            m3bVar.w(z2bVar.n);
                            break;
                    }
                }
            });
        }
        if (z7) {
            final int i20 = 1;
            this.x0.h(5, new jm7() { // from class: e75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj72) {
                    m3b m3bVar = (m3b) obj72;
                    switch (i20) {
                        case 0:
                            lue lueVar32 = z2bVar.a;
                            m3bVar.x(i2);
                            break;
                        default:
                            m3bVar.d(i2, z2bVar.l);
                            break;
                    }
                }
            });
        }
        if (z2bVar2.m != z2bVar.m) {
            final int i21 = 6;
            this.x0.h(6, new jm7() { // from class: c75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj92) {
                    m3b m3bVar = (m3b) obj92;
                    switch (i21) {
                        case 0:
                            m3bVar.D(z2bVar.f);
                            break;
                        case 1:
                            m3bVar.r(z2bVar.f);
                            break;
                        case 2:
                            m3bVar.t((r0f) z2bVar.i.Y);
                            break;
                        case 3:
                            z2b z2bVar4 = z2bVar;
                            boolean z10 = z2bVar4.g;
                            m3bVar.getClass();
                            m3bVar.c(z2bVar4.g);
                            break;
                        case 4:
                            z2b z2bVar5 = z2bVar;
                            m3bVar.l(z2bVar5.e, z2bVar5.l);
                            break;
                        case 5:
                            m3bVar.h(z2bVar.e);
                            break;
                        case 6:
                            m3bVar.a(z2bVar.m);
                            break;
                        case 7:
                            m3bVar.n(t75.f2(z2bVar));
                            break;
                        default:
                            m3bVar.w(z2bVar.n);
                            break;
                    }
                }
            });
        }
        if (f2(z2bVar2) != f2(z2bVar)) {
            final int i22 = 7;
            this.x0.h(7, new jm7() { // from class: c75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj92) {
                    m3b m3bVar = (m3b) obj92;
                    switch (i22) {
                        case 0:
                            m3bVar.D(z2bVar.f);
                            break;
                        case 1:
                            m3bVar.r(z2bVar.f);
                            break;
                        case 2:
                            m3bVar.t((r0f) z2bVar.i.Y);
                            break;
                        case 3:
                            z2b z2bVar4 = z2bVar;
                            boolean z10 = z2bVar4.g;
                            m3bVar.getClass();
                            m3bVar.c(z2bVar4.g);
                            break;
                        case 4:
                            z2b z2bVar5 = z2bVar;
                            m3bVar.l(z2bVar5.e, z2bVar5.l);
                            break;
                        case 5:
                            m3bVar.h(z2bVar.e);
                            break;
                        case 6:
                            m3bVar.a(z2bVar.m);
                            break;
                        case 7:
                            m3bVar.n(t75.f2(z2bVar));
                            break;
                        default:
                            m3bVar.w(z2bVar.n);
                            break;
                    }
                }
            });
        }
        if (!z2bVar2.n.equals(z2bVar.n)) {
            final int i23 = 8;
            this.x0.h(12, new jm7() { // from class: c75
                @Override // defpackage.jm7, defpackage.km7
                public final void invoke(Object obj92) {
                    m3b m3bVar = (m3b) obj92;
                    switch (i23) {
                        case 0:
                            m3bVar.D(z2bVar.f);
                            break;
                        case 1:
                            m3bVar.r(z2bVar.f);
                            break;
                        case 2:
                            m3bVar.t((r0f) z2bVar.i.Y);
                            break;
                        case 3:
                            z2b z2bVar4 = z2bVar;
                            boolean z10 = z2bVar4.g;
                            m3bVar.getClass();
                            m3bVar.c(z2bVar4.g);
                            break;
                        case 4:
                            z2b z2bVar5 = z2bVar;
                            m3bVar.l(z2bVar5.e, z2bVar5.l);
                            break;
                        case 5:
                            m3bVar.h(z2bVar.e);
                            break;
                        case 6:
                            m3bVar.a(z2bVar.m);
                            break;
                        case 7:
                            m3bVar.n(t75.f2(z2bVar));
                            break;
                        default:
                            m3bVar.w(z2bVar.n);
                            break;
                    }
                }
            });
        }
        if (z) {
            this.x0.h(-1, new ta4(18));
        }
        o2();
        this.x0.e();
        if (z2bVar2.o != z2bVar.o) {
            Iterator it = this.y0.iterator();
            while (it.hasNext()) {
                ((n75) it.next()).getClass();
            }
        }
        if (z2bVar2.p != z2bVar.p) {
            Iterator it2 = this.y0.iterator();
            while (it2.hasNext()) {
                ((n75) it2.next()).a.r2();
            }
        }
    }

    @Override // defpackage.u2, defpackage.q3b
    public final void r(int i, long j) {
        s2();
        h74 h74Var = this.C0;
        if (!h74Var.s0) {
            ed edVarE = h74Var.e();
            h74Var.s0 = true;
            h74Var.Q(edVarE, -1, new yv3(21));
        }
        lue lueVar = this.k1.a;
        if (i < 0 || (!lueVar.q() && i >= lueVar.p())) {
            throw new IllegalSeekPositionException();
        }
        this.O0++;
        if (n()) {
            a85 a85Var = new a85(this.k1);
            a85Var.a(1);
            t75 t75Var = this.v0.a;
            t75Var.u0.a.post(new kl4(t75Var, 19, a85Var));
            return;
        }
        s2();
        int i2 = this.k1.e != 1 ? 2 : 1;
        int iP0 = p0();
        z2b z2bVarG2 = g2(this.k1.f(i2), lueVar, h2(lueVar, i, j));
        this.w0.s0.a(3, new d85(lueVar, i, maf.D(j))).b();
        q2(z2bVarG2, 0, 1, true, true, 1, c2(z2bVarG2), iP0);
    }

    public final void r2() {
        s2();
        int i = this.k1.e;
        o84 o84Var = this.L0;
        huc hucVar = this.K0;
        if (i != 1) {
            if (i == 2 || i == 3) {
                s2();
                boolean z = this.k1.p;
                u();
                hucVar.getClass();
                u();
                o84Var.getClass();
                return;
            }
            if (i != 4) {
                throw new IllegalStateException();
            }
        }
        hucVar.getClass();
        o84Var.getClass();
    }

    public final void s2() {
        this.X.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.D0;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = maf.a;
            Locale locale = Locale.US;
            String strJ = k7d.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.g1) {
                throw new IllegalStateException(strJ);
            }
            fm9.c(strJ, this.h1 ? null : new IllegalStateException());
            this.h1 = true;
        }
    }

    @Override // defpackage.q3b
    public final boolean u() {
        s2();
        return this.k1.l;
    }
}
