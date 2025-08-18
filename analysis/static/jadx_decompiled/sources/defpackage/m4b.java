package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class m4b {
    public static final m4b F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public final long A;
    public final long B;
    public final long C;
    public final p0f D;
    public final j0f E;
    public final PlaybackException a;
    public final int b;
    public final qad c;
    public final p3b d;
    public final p3b e;
    public final int f;
    public final c3b g;
    public final int h;
    public final boolean i;
    public final mue j;
    public final int k;
    public final jlf l;
    public final gd8 m;
    public final float n;
    public final h30 o;
    public final zz3 p;
    public final ui4 q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final gd8 z;

    static {
        qad qadVar = qad.l;
        p3b p3bVar = qad.k;
        c3b c3bVar = c3b.d;
        jlf jlfVar = jlf.e;
        fue fueVar = mue.a;
        gd8 gd8Var = gd8.J;
        F = new m4b(null, 0, qadVar, p3bVar, p3bVar, 0, c3bVar, 0, false, jlfVar, fueVar, 0, gd8Var, 1.0f, h30.g, zz3.c, ui4.e, 0, false, false, 1, 0, 1, false, false, gd8Var, MultiFileUploader.UPLOAD_NEXT_INTERVAL, 15000L, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, p0f.b, j0f.C);
        int i = oaf.a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        c0 = Integer.toString(23, 36);
        d0 = Integer.toString(24, 36);
        e0 = Integer.toString(25, 36);
        f0 = Integer.toString(26, 36);
        g0 = Integer.toString(27, 36);
        h0 = Integer.toString(28, 36);
        i0 = Integer.toString(29, 36);
        j0 = Integer.toString(30, 36);
        k0 = Integer.toString(31, 36);
        l0 = Integer.toString(32, 36);
    }

    public m4b(PlaybackException playbackException, int i, qad qadVar, p3b p3bVar, p3b p3bVar2, int i2, c3b c3bVar, int i3, boolean z, jlf jlfVar, mue mueVar, int i4, gd8 gd8Var, float f, h30 h30Var, zz3 zz3Var, ui4 ui4Var, int i5, boolean z2, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, gd8 gd8Var2, long j, long j2, long j3, p0f p0fVar, j0f j0fVar) {
        this.a = playbackException;
        this.b = i;
        this.c = qadVar;
        this.d = p3bVar;
        this.e = p3bVar2;
        this.f = i2;
        this.g = c3bVar;
        this.h = i3;
        this.i = z;
        this.l = jlfVar;
        this.j = mueVar;
        this.k = i4;
        this.m = gd8Var;
        this.n = f;
        this.o = h30Var;
        this.p = zz3Var;
        this.q = ui4Var;
        this.r = i5;
        this.s = z2;
        this.t = z3;
        this.u = i6;
        this.x = i7;
        this.y = i8;
        this.v = z4;
        this.w = z5;
        this.z = gd8Var2;
        this.A = j;
        this.B = j2;
        this.C = j3;
        this.D = p0fVar;
        this.E = j0fVar;
    }

    public static m4b r(int i, Bundle bundle) {
        PlaybackException playbackException;
        ffc ffcVarI;
        ffc ffcVarI2;
        mue iueVar;
        ffc ffcVarJ;
        zz3 zz3Var;
        ui4 ui4VarB;
        p0f p0fVar;
        IBinder binder = bundle.getBinder(l0);
        if (binder instanceof l4b) {
            return ((l4b) binder).c;
        }
        Bundle bundle2 = bundle.getBundle(X);
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.Y);
            String string2 = bundle2.getString(PlaybackException.Z);
            String string3 = bundle2.getString(PlaybackException.s0);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i2 = bundle2.getInt(PlaybackException.o, 1000);
            Bundle bundle3 = bundle2.getBundle(PlaybackException.t0);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th, i2, bundle3, bundle2.getLong(PlaybackException.X, SystemClock.elapsedRealtime()));
        }
        int i3 = bundle.getInt(Z, 0);
        Bundle bundle4 = bundle.getBundle(Y);
        qad qadVarB = bundle4 == null ? qad.l : qad.b(bundle4);
        Bundle bundle5 = bundle.getBundle(a0);
        p3b p3bVarC = bundle5 == null ? qad.k : p3b.c(bundle5);
        Bundle bundle6 = bundle.getBundle(b0);
        p3b p3bVarC2 = bundle6 == null ? qad.k : p3b.c(bundle6);
        int i4 = bundle.getInt(c0, 0);
        Bundle bundle7 = bundle.getBundle(G);
        c3b c3bVar = bundle7 == null ? c3b.d : new c3b(bundle7.getFloat(c3b.e, 1.0f), bundle7.getFloat(c3b.f, 1.0f));
        int i5 = bundle.getInt(H, 0);
        boolean z = bundle.getBoolean(I, false);
        Bundle bundle8 = bundle.getBundle(J);
        if (bundle8 == null) {
            iueVar = mue.a;
        } else {
            hme hmeVar = new hme(9);
            IBinder binder2 = bundle8.getBinder(mue.b);
            if (binder2 == null) {
                ls5 ls5Var = zw6.b;
                ffcVarI = ffc.X;
            } else {
                ffcVarI = nu0.i(hmeVar, pu0.a(binder2));
            }
            hme hmeVar2 = new hme(10);
            IBinder binder3 = bundle8.getBinder(mue.c);
            if (binder3 == null) {
                ls5 ls5Var2 = zw6.b;
                ffcVarI2 = ffc.X;
            } else {
                ffcVarI2 = nu0.i(hmeVar2, pu0.a(binder3));
            }
            int[] intArray = bundle8.getIntArray(mue.d);
            if (intArray == null) {
                int i6 = ffcVarI.o;
                int[] iArr = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr[i7] = i7;
                }
                intArray = iArr;
            }
            iueVar = new iue(ffcVarI, ffcVarI2, intArray);
        }
        int i8 = bundle.getInt(k0, 0);
        Bundle bundle9 = bundle.getBundle(K);
        jlf jlfVar = bundle9 == null ? jlf.e : new jlf(bundle9.getFloat(jlf.i, 1.0f), bundle9.getInt(jlf.f, 0), bundle9.getInt(jlf.g, 0), bundle9.getInt(jlf.h, 0));
        Bundle bundle10 = bundle.getBundle(L);
        gd8 gd8VarB = bundle10 == null ? gd8.J : gd8.b(bundle10);
        float f = bundle.getFloat(M, 1.0f);
        Bundle bundle11 = bundle.getBundle(N);
        h30 h30VarA = bundle11 == null ? h30.g : h30.a(bundle11);
        Bundle bundle12 = bundle.getBundle(d0);
        if (bundle12 == null) {
            zz3Var = zz3.c;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(zz3.d);
            if (parcelableArrayList == null) {
                ffcVarJ = ffc.X;
            } else {
                ww6 ww6VarI = zw6.i();
                for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i9);
                    bundle13.getClass();
                    ww6VarI.a(yz3.a(bundle13));
                }
                ffcVarJ = ww6VarI.j();
            }
            zz3Var = new zz3(bundle12.getLong(zz3.e), ffcVarJ);
        }
        zz3 zz3Var2 = zz3Var;
        Bundle bundle14 = bundle.getBundle(O);
        if (bundle14 == null) {
            ui4VarB = ui4.e;
        } else {
            int i10 = bundle14.getInt(ui4.f, 0);
            int i11 = bundle14.getInt(ui4.g, 0);
            int i12 = bundle14.getInt(ui4.h, 0);
            String string4 = bundle14.getString(ui4.i);
            sv0 sv0Var = new sv0(i10);
            sv0Var.c = i11;
            sv0Var.d = i12;
            fm9.f(i10 != 0 || string4 == null);
            sv0Var.e = string4;
            ui4VarB = sv0Var.b();
        }
        ui4 ui4Var = ui4VarB;
        int i13 = bundle.getInt(P, 0);
        boolean z2 = bundle.getBoolean(Q, false);
        boolean z3 = bundle.getBoolean(R, false);
        int i14 = bundle.getInt(S, 1);
        int i15 = bundle.getInt(T, 0);
        int i16 = bundle.getInt(U, 1);
        boolean z4 = bundle.getBoolean(V, false);
        boolean z5 = bundle.getBoolean(W, false);
        Bundle bundle15 = bundle.getBundle(e0);
        gd8 gd8VarB2 = bundle15 == null ? gd8.J : gd8.b(bundle15);
        long j = bundle.getLong(f0, i < 4 ? 0L : MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        long j2 = bundle.getLong(g0, i < 4 ? 0L : 15000L);
        long j3 = bundle.getLong(h0, i >= 4 ? CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS : 0L);
        Bundle bundle16 = bundle.getBundle(j0);
        if (bundle16 == null) {
            p0fVar = p0f.b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(p0f.c);
            p0fVar = new p0f(parcelableArrayList2 == null ? ffc.X : nu0.i(new hme(21), parcelableArrayList2));
        }
        Bundle bundle17 = bundle.getBundle(i0);
        return new m4b(playbackException, i3, qadVarB, p3bVarC, p3bVarC2, i4, c3bVar, i5, z, jlfVar, iueVar, i8, gd8VarB, f, h30VarA, zz3Var2, ui4Var, i13, z2, z3, i14, i15, i16, z4, z5, gd8VarB2, j, j2, j3, p0fVar, bundle17 == null ? j0f.C : j0f.b(bundle17));
    }

    public final m4b a(h30 h30Var) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, h30Var, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b b(p0f p0fVar) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, p0fVar, this.E);
    }

    public final m4b c(int i, boolean z) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, i, z, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b d(int i, int i2, boolean z) {
        boolean z2 = this.y == 3 && z && i2 == 0;
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, i, i2, this.y, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b e(c3b c3bVar) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, c3bVar, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b f(int i, PlaybackException playbackException) {
        boolean z = i == 3 && this.t && this.x == 0;
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(playbackException, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, i, z, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b g(gd8 gd8Var) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, gd8Var, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b h(p3b p3bVar, p3b p3bVar2, int i) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, p3bVar, p3bVar2, i, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b i(int i) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, i, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b j(qad qadVar) {
        mue mueVar = this.j;
        fm9.k(mueVar.q() || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b k(boolean z) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, z, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b l(mue mueVar) {
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b m(xqb xqbVar, int i) {
        qad qadVar = this.c;
        p3b p3bVar = qadVar.a;
        qad qadVar2 = new qad(new p3b(p3bVar.a, i, p3bVar.c, p3bVar.d, p3bVar.e, p3bVar.f, p3bVar.g, p3bVar.h, p3bVar.i), qadVar.b, qadVar.c, qadVar.d, qadVar.e, qadVar.f, qadVar.g, qadVar.h, qadVar.i, qadVar.j);
        fm9.k(xqbVar.q() || qadVar2.a.b < xqbVar.p());
        return new m4b(this.a, this.b, qadVar2, this.d, this.e, this.f, this.g, this.h, this.i, this.l, xqbVar, 0, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b n(mue mueVar, qad qadVar, int i) {
        fm9.k(mueVar.q() || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, i, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b o(j0f j0fVar) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, j0fVar);
    }

    public final m4b p(float f) {
        mue mueVar = this.j;
        boolean zQ = mueVar.q();
        qad qadVar = this.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        return new m4b(this.a, this.b, qadVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mueVar, this.k, this.m, f, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.m4b q(defpackage.k3b r41, boolean r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4b.q(k3b, boolean, boolean):m4b");
    }

    public final tb8 s() {
        mue mueVar = this.j;
        if (mueVar.q()) {
            return null;
        }
        return mueVar.n(this.c.a.b, new kue(), 0L).c;
    }

    public final Bundle t(int i) {
        long j;
        long j2;
        int i2;
        Bundle bundle;
        int i3;
        hue hueVar;
        long j3;
        tb8[] tb8VarArr;
        Bundle bundleD;
        Bundle bundle2 = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            bundle2.putBundle(X, playbackException.c());
        }
        int i4 = this.b;
        if (i4 != 0) {
            bundle2.putInt(Z, i4);
        }
        qad qadVar = this.c;
        if (i < 3 || !qadVar.equals(qad.l)) {
            bundle2.putBundle(Y, qadVar.c(i));
        }
        p3b p3bVar = this.d;
        if (i < 3 || !qad.k.a(p3bVar)) {
            bundle2.putBundle(a0, p3bVar.d(i));
        }
        p3b p3bVar2 = this.e;
        if (i < 3 || !qad.k.a(p3bVar2)) {
            bundle2.putBundle(b0, p3bVar2.d(i));
        }
        int i5 = this.f;
        if (i5 != 0) {
            bundle2.putInt(c0, i5);
        }
        c3b c3bVar = c3b.d;
        c3b c3bVar2 = this.g;
        if (!c3bVar2.equals(c3bVar)) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(c3b.e, c3bVar2.a);
            bundle3.putFloat(c3b.f, c3bVar2.b);
            bundle2.putBundle(G, bundle3);
        }
        int i6 = this.h;
        if (i6 != 0) {
            bundle2.putInt(H, i6);
        }
        boolean z = this.i;
        if (z) {
            bundle2.putBoolean(I, z);
        }
        fue fueVar = mue.a;
        mue mueVar = this.j;
        boolean z2 = false;
        long j4 = 0;
        if (mueVar.equals(fueVar)) {
            j = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            int iP = mueVar.p();
            kue kueVar = new kue();
            int i7 = 0;
            while (true) {
                j2 = -9223372036854775807L;
                if (i7 >= iP) {
                    break;
                }
                kue kueVarN = mueVar.n(i7, kueVar, j4);
                kueVarN.getClass();
                Bundle bundle4 = new Bundle();
                if (!tb8.g.equals(kueVarN.c)) {
                    bundle4.putBundle(kue.t, kueVarN.c.d(false));
                }
                long j5 = kueVarN.e;
                if (j5 != -9223372036854775807L) {
                    bundle4.putLong(kue.u, j5);
                }
                long j6 = kueVarN.f;
                if (j6 != -9223372036854775807L) {
                    bundle4.putLong(kue.v, j6);
                }
                long j7 = kueVarN.g;
                if (j7 != -9223372036854775807L) {
                    bundle4.putLong(kue.w, j7);
                }
                boolean z3 = kueVarN.h;
                if (z3) {
                    bundle4.putBoolean(kue.x, z3);
                }
                boolean z4 = kueVarN.i;
                if (z4) {
                    bundle4.putBoolean(kue.y, z4);
                }
                hb8 hb8Var = kueVarN.j;
                if (hb8Var != null) {
                    bundle4.putBundle(kue.z, hb8Var.c());
                }
                boolean z5 = kueVarN.k;
                if (z5) {
                    bundle4.putBoolean(kue.A, z5);
                }
                long j8 = kueVarN.l;
                if (j8 != 0) {
                    bundle4.putLong(kue.B, j8);
                }
                long j9 = kueVarN.m;
                if (j9 != -9223372036854775807L) {
                    bundle4.putLong(kue.C, j9);
                }
                int i8 = kueVarN.n;
                if (i8 != 0) {
                    bundle4.putInt(kue.D, i8);
                }
                int i9 = kueVarN.o;
                if (i9 != 0) {
                    bundle4.putInt(kue.E, i9);
                }
                long j10 = kueVarN.p;
                if (j10 != 0) {
                    bundle4.putLong(kue.F, j10);
                }
                arrayList.add(bundle4);
                i7++;
                j4 = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            int i10 = mueVar.i();
            hue hueVar2 = new hue();
            int i11 = 0;
            while (i11 < i10) {
                hue hueVarG = mueVar.g(i11, hueVar2, z2);
                hueVarG.getClass();
                Bundle bundle5 = new Bundle();
                int i12 = hueVarG.c;
                if (i12 != 0) {
                    bundle5.putInt(hue.h, i12);
                }
                int i13 = i10;
                hue hueVar3 = hueVar2;
                long j11 = hueVarG.d;
                if (j11 != j2) {
                    bundle5.putLong(hue.i, j11);
                }
                long j12 = hueVarG.e;
                if (j12 != 0) {
                    bundle5.putLong(hue.j, j12);
                }
                boolean z6 = hueVarG.f;
                if (z6) {
                    bundle5.putBoolean(hue.k, z6);
                }
                if (hueVarG.g.equals(s8.g)) {
                    bundle = bundle2;
                    i3 = i13;
                    hueVar = hueVar3;
                    j3 = -9223372036854775807L;
                } else {
                    s8 s8Var = hueVarG.g;
                    s8Var.getClass();
                    Bundle bundle6 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    q8[] q8VarArr = s8Var.f;
                    int length = q8VarArr.length;
                    i3 = i13;
                    int i14 = 0;
                    while (i14 < length) {
                        int i15 = length;
                        q8 q8Var = q8VarArr[i14];
                        q8Var.getClass();
                        q8[] q8VarArr2 = q8VarArr;
                        Bundle bundle7 = new Bundle();
                        hue hueVar4 = hueVar3;
                        bundle7.putLong(q8.j, q8Var.a);
                        bundle7.putInt(q8.k, q8Var.b);
                        bundle7.putInt(q8.q, q8Var.c);
                        bundle7.putParcelableArrayList(q8.l, new ArrayList<>(Arrays.asList(q8Var.d)));
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        tb8[] tb8VarArr2 = q8Var.e;
                        int length2 = tb8VarArr2.length;
                        Bundle bundle8 = bundle2;
                        int i16 = 0;
                        while (i16 < length2) {
                            int i17 = length2;
                            tb8 tb8Var = tb8VarArr2[i16];
                            if (tb8Var == null) {
                                bundleD = null;
                                tb8VarArr = tb8VarArr2;
                            } else {
                                tb8VarArr = tb8VarArr2;
                                bundleD = tb8Var.d(true);
                            }
                            arrayList4.add(bundleD);
                            i16++;
                            length2 = i17;
                            tb8VarArr2 = tb8VarArr;
                        }
                        bundle7.putParcelableArrayList(q8.r, arrayList4);
                        bundle7.putIntArray(q8.m, q8Var.f);
                        bundle7.putLongArray(q8.n, q8Var.g);
                        bundle7.putLong(q8.o, q8Var.h);
                        bundle7.putBoolean(q8.p, q8Var.i);
                        arrayList3.add(bundle7);
                        i14++;
                        length = i15;
                        q8VarArr = q8VarArr2;
                        hueVar3 = hueVar4;
                        bundle2 = bundle8;
                    }
                    bundle = bundle2;
                    hueVar = hueVar3;
                    if (!arrayList3.isEmpty()) {
                        bundle6.putParcelableArrayList(s8.i, arrayList3);
                    }
                    long j13 = s8Var.c;
                    if (j13 != 0) {
                        bundle6.putLong(s8.j, j13);
                    }
                    long j14 = s8Var.d;
                    j3 = -9223372036854775807L;
                    if (j14 != -9223372036854775807L) {
                        bundle6.putLong(s8.k, j14);
                    }
                    int i18 = s8Var.e;
                    if (i18 != 0) {
                        bundle6.putInt(s8.l, i18);
                    }
                    bundle5.putBundle(hue.l, bundle6);
                }
                arrayList2.add(bundle5);
                i11++;
                j2 = j3;
                i10 = i3;
                hueVar2 = hueVar;
                bundle2 = bundle;
                z2 = false;
            }
            Bundle bundle9 = bundle2;
            j = 0;
            int[] iArr = new int[iP];
            boolean z7 = true;
            if (iP > 0) {
                i2 = 0;
                iArr[0] = mueVar.a(true);
            } else {
                i2 = 0;
            }
            int i19 = 1;
            while (i19 < iP) {
                iArr[i19] = mueVar.e(iArr[i19 - 1], i2, z7);
                i19++;
                z7 = true;
                i2 = 0;
            }
            Bundle bundle10 = new Bundle();
            bundle10.putBinder(mue.b, new pu0(arrayList));
            bundle10.putBinder(mue.c, new pu0(arrayList2));
            bundle10.putIntArray(mue.d, iArr);
            bundle2 = bundle9;
            bundle2.putBundle(J, bundle10);
        }
        int i20 = this.k;
        if (i20 != 0) {
            bundle2.putInt(k0, i20);
        }
        jlf jlfVar = jlf.e;
        jlf jlfVar2 = this.l;
        if (!jlfVar2.equals(jlfVar)) {
            Bundle bundle11 = new Bundle();
            bundle11.putInt(jlf.f, jlfVar2.a);
            bundle11.putInt(jlf.g, jlfVar2.b);
            bundle11.putInt(jlf.h, jlfVar2.c);
            bundle11.putFloat(jlf.i, jlfVar2.d);
            bundle2.putBundle(K, bundle11);
        }
        gd8 gd8Var = gd8.J;
        gd8 gd8Var2 = this.m;
        if (!gd8Var2.equals(gd8Var)) {
            bundle2.putBundle(L, gd8Var2.c());
        }
        float f = this.n;
        if (f != 1.0f) {
            bundle2.putFloat(M, f);
        }
        h30 h30Var = h30.g;
        h30 h30Var2 = this.o;
        if (!h30Var2.equals(h30Var)) {
            bundle2.putBundle(N, h30Var2.c());
        }
        zz3 zz3Var = zz3.c;
        zz3 zz3Var2 = this.p;
        if (!zz3Var2.equals(zz3Var)) {
            Bundle bundle12 = new Bundle();
            ww6 ww6VarI = zw6.i();
            int i21 = 0;
            while (true) {
                zw6 zw6Var = zz3Var2.a;
                if (i21 >= zw6Var.size()) {
                    break;
                }
                if (((yz3) zw6Var.get(i21)).d == null) {
                    ww6VarI.a((yz3) zw6Var.get(i21));
                }
                i21++;
            }
            ffc ffcVarJ = ww6VarI.j();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>(ffcVarJ.o);
            ls5 ls5VarListIterator = ffcVarJ.listIterator(0);
            while (ls5VarListIterator.hasNext()) {
                yz3 yz3Var = (yz3) ls5VarListIterator.next();
                Bundle bundleB = yz3Var.b();
                Bitmap bitmap = yz3Var.d;
                if (bitmap != null) {
                    bundleB.putParcelable(yz3.v, bitmap);
                }
                arrayList5.add(bundleB);
            }
            bundle12.putParcelableArrayList(zz3.d, arrayList5);
            bundle12.putLong(zz3.e, zz3Var2.b);
            bundle2.putBundle(d0, bundle12);
        }
        ui4 ui4Var = ui4.e;
        ui4 ui4Var2 = this.q;
        if (!ui4Var2.equals(ui4Var)) {
            Bundle bundle13 = new Bundle();
            int i22 = ui4Var2.a;
            if (i22 != 0) {
                bundle13.putInt(ui4.f, i22);
            }
            int i23 = ui4Var2.b;
            if (i23 != 0) {
                bundle13.putInt(ui4.g, i23);
            }
            int i24 = ui4Var2.c;
            if (i24 != 0) {
                bundle13.putInt(ui4.h, i24);
            }
            String str = ui4Var2.d;
            if (str != null) {
                bundle13.putString(ui4.i, str);
            }
            bundle2.putBundle(O, bundle13);
        }
        int i25 = this.r;
        if (i25 != 0) {
            bundle2.putInt(P, i25);
        }
        boolean z8 = this.s;
        if (z8) {
            bundle2.putBoolean(Q, z8);
        }
        boolean z9 = this.t;
        if (z9) {
            bundle2.putBoolean(R, z9);
        }
        int i26 = this.u;
        if (i26 != 1) {
            bundle2.putInt(S, i26);
        }
        int i27 = this.x;
        if (i27 != 0) {
            bundle2.putInt(T, i27);
        }
        int i28 = this.y;
        if (i28 != 1) {
            bundle2.putInt(U, i28);
        }
        boolean z10 = this.v;
        if (z10) {
            bundle2.putBoolean(V, z10);
        }
        boolean z11 = this.w;
        if (z11) {
            bundle2.putBoolean(W, z11);
        }
        gd8 gd8Var3 = gd8.J;
        gd8 gd8Var4 = this.z;
        if (!gd8Var4.equals(gd8Var3)) {
            bundle2.putBundle(e0, gd8Var4.c());
        }
        long j15 = i < 6 ? j : MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        long j16 = this.A;
        if (j16 != j15) {
            bundle2.putLong(f0, j16);
        }
        long j17 = i < 6 ? j : 15000L;
        long j18 = this.B;
        if (j18 != j17) {
            bundle2.putLong(g0, j18);
        }
        long j19 = i < 6 ? j : CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        long j20 = this.C;
        if (j20 != j19) {
            bundle2.putLong(h0, j20);
        }
        p0f p0fVar = p0f.b;
        p0f p0fVar2 = this.D;
        if (!p0fVar2.equals(p0fVar)) {
            Bundle bundle14 = new Bundle();
            bundle14.putParcelableArrayList(p0f.c, nu0.R(p0fVar2.a, new hme(20)));
            bundle2.putBundle(j0, bundle14);
        }
        j0f j0fVar = j0f.C;
        j0f j0fVar2 = this.E;
        if (!j0fVar2.equals(j0fVar)) {
            bundle2.putBundle(i0, j0fVar2.c());
        }
        return bundle2;
    }
}
