package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class j0f {
    public static final j0f C = new j0f(new h0f());
    public static final String D;
    public static final String E;
    public static final String F;
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
    public final cx6 A;
    public final jx6 B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final zw6 l;
    public final int m;
    public final zw6 n;
    public final int o;
    public final int p;
    public final int q;
    public final zw6 r;
    public final f0f s;
    public final zw6 t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        int i = oaf.a;
        D = Integer.toString(1, 36);
        E = Integer.toString(2, 36);
        F = Integer.toString(3, 36);
        G = Integer.toString(4, 36);
        H = Integer.toString(5, 36);
        I = Integer.toString(6, 36);
        J = Integer.toString(7, 36);
        K = Integer.toString(8, 36);
        L = Integer.toString(9, 36);
        M = Integer.toString(10, 36);
        N = Integer.toString(11, 36);
        O = Integer.toString(12, 36);
        P = Integer.toString(13, 36);
        Q = Integer.toString(14, 36);
        R = Integer.toString(15, 36);
        S = Integer.toString(16, 36);
        T = Integer.toString(17, 36);
        U = Integer.toString(18, 36);
        V = Integer.toString(19, 36);
        W = Integer.toString(20, 36);
        X = Integer.toString(21, 36);
        Y = Integer.toString(22, 36);
        Z = Integer.toString(23, 36);
        a0 = Integer.toString(24, 36);
        b0 = Integer.toString(25, 36);
        c0 = Integer.toString(26, 36);
        d0 = Integer.toString(27, 36);
        e0 = Integer.toString(28, 36);
        f0 = Integer.toString(29, 36);
        g0 = Integer.toString(30, 36);
        h0 = Integer.toString(31, 36);
    }

    public j0f(h0f h0fVar) {
        this.a = h0fVar.a;
        this.b = h0fVar.b;
        this.c = h0fVar.c;
        this.d = h0fVar.d;
        this.e = h0fVar.e;
        this.f = h0fVar.f;
        this.g = h0fVar.g;
        this.h = h0fVar.h;
        this.i = h0fVar.i;
        this.j = h0fVar.j;
        this.k = h0fVar.k;
        this.l = h0fVar.l;
        this.m = h0fVar.m;
        this.n = h0fVar.n;
        this.o = h0fVar.o;
        this.p = h0fVar.p;
        this.q = h0fVar.q;
        this.r = h0fVar.r;
        this.s = h0fVar.s;
        this.t = h0fVar.t;
        this.u = h0fVar.u;
        this.v = h0fVar.v;
        this.w = h0fVar.w;
        this.x = h0fVar.x;
        this.y = h0fVar.y;
        this.z = h0fVar.z;
        this.A = cx6.b(h0fVar.A);
        this.B = jx6.j(h0fVar.B);
    }

    public static j0f b(Bundle bundle) {
        f0f f0fVar;
        ffc ffcVarJ;
        h0f h0fVar = new h0f();
        j0f j0fVar = C;
        h0fVar.a = bundle.getInt(I, j0fVar.a);
        h0fVar.b = bundle.getInt(J, j0fVar.b);
        h0fVar.c = bundle.getInt(K, j0fVar.c);
        h0fVar.d = bundle.getInt(L, j0fVar.d);
        h0fVar.e = bundle.getInt(M, j0fVar.e);
        h0fVar.f = bundle.getInt(N, j0fVar.f);
        h0fVar.g = bundle.getInt(O, j0fVar.g);
        h0fVar.h = bundle.getInt(P, j0fVar.h);
        h0fVar.i = bundle.getInt(Q, j0fVar.i);
        h0fVar.j = bundle.getInt(R, j0fVar.j);
        h0fVar.k = bundle.getBoolean(S, j0fVar.k);
        String[] stringArray = bundle.getStringArray(T);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        h0fVar.l = zw6.k(stringArray);
        h0fVar.m = bundle.getInt(b0, j0fVar.m);
        String[] stringArray2 = bundle.getStringArray(D);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        h0fVar.n = h0f.e(stringArray2);
        h0fVar.o = bundle.getInt(E, j0fVar.o);
        h0fVar.p = bundle.getInt(U, j0fVar.p);
        h0fVar.q = bundle.getInt(V, j0fVar.q);
        String[] stringArray3 = bundle.getStringArray(W);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        h0fVar.r = zw6.k(stringArray3);
        Bundle bundle2 = bundle.getBundle(g0);
        if (bundle2 != null) {
            qk9 qk9Var = new qk9();
            f0f f0fVar2 = f0f.d;
            qk9Var.a = bundle2.getInt(f0f.e, f0fVar2.a);
            qk9Var.b = bundle2.getBoolean(f0f.f, f0fVar2.b);
            qk9Var.c = bundle2.getBoolean(f0f.g, f0fVar2.c);
            f0fVar = new f0f(qk9Var);
        } else {
            qk9 qk9Var2 = new qk9();
            f0f f0fVar3 = f0f.d;
            qk9Var2.a = bundle.getInt(d0, f0fVar3.a);
            qk9Var2.b = bundle.getBoolean(e0, f0fVar3.b);
            qk9Var2.c = bundle.getBoolean(f0, f0fVar3.c);
            f0fVar = new f0f(qk9Var2);
        }
        h0fVar.s = f0fVar;
        String[] stringArray4 = bundle.getStringArray(F);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        h0fVar.t = h0f.e(stringArray4);
        h0fVar.u = bundle.getInt(G, j0fVar.u);
        h0fVar.v = bundle.getInt(c0, j0fVar.v);
        h0fVar.w = bundle.getBoolean(H, j0fVar.w);
        h0fVar.x = bundle.getBoolean(h0, j0fVar.x);
        h0fVar.y = bundle.getBoolean(X, j0fVar.y);
        h0fVar.z = bundle.getBoolean(Y, j0fVar.z);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Z);
        if (parcelableArrayList == null) {
            ffcVarJ = ffc.X;
        } else {
            ww6 ww6VarI = zw6.i();
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(c0f.c);
                bundle4.getClass();
                rze rzeVarB = rze.b(bundle4);
                int[] intArray = bundle3.getIntArray(c0f.d);
                intArray.getClass();
                ww6VarI.a(new c0f(rzeVarB, s5c.i(intArray)));
            }
            ffcVarJ = ww6VarI.j();
        }
        h0fVar.A = new HashMap();
        for (int i2 = 0; i2 < ffcVarJ.o; i2++) {
            c0f c0fVar = (c0f) ffcVarJ.get(i2);
            h0fVar.A.put(c0fVar.a, c0fVar);
        }
        int[] intArray2 = bundle.getIntArray(a0);
        int[] iArr = new int[0];
        if (intArray2 == null) {
            intArray2 = iArr;
        }
        h0fVar.B = new HashSet();
        for (int i3 : intArray2) {
            h0fVar.B.add(Integer.valueOf(i3));
        }
        return new j0f(h0fVar);
    }

    public h0f a() {
        h0f h0fVar = new h0f();
        h0fVar.d(this);
        return h0fVar;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(I, this.a);
        bundle.putInt(J, this.b);
        bundle.putInt(K, this.c);
        bundle.putInt(L, this.d);
        bundle.putInt(M, this.e);
        bundle.putInt(N, this.f);
        bundle.putInt(O, this.g);
        bundle.putInt(P, this.h);
        bundle.putInt(Q, this.i);
        bundle.putInt(R, this.j);
        bundle.putBoolean(S, this.k);
        bundle.putStringArray(T, (String[]) this.l.toArray(new String[0]));
        bundle.putInt(b0, this.m);
        bundle.putStringArray(D, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(E, this.o);
        bundle.putInt(U, this.p);
        bundle.putInt(V, this.q);
        bundle.putStringArray(W, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(F, (String[]) this.t.toArray(new String[0]));
        bundle.putInt(G, this.u);
        bundle.putInt(c0, this.v);
        bundle.putBoolean(H, this.w);
        f0f f0fVar = this.s;
        bundle.putInt(d0, f0fVar.a);
        bundle.putBoolean(e0, f0fVar.b);
        bundle.putBoolean(f0, f0fVar.c);
        f0fVar.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f0f.e, f0fVar.a);
        bundle2.putBoolean(f0f.f, f0fVar.b);
        bundle2.putBoolean(f0f.g, f0fVar.c);
        bundle.putBundle(g0, bundle2);
        bundle.putBoolean(h0, this.x);
        bundle.putBoolean(X, this.y);
        bundle.putBoolean(Y, this.z);
        bundle.putParcelableArrayList(Z, nu0.R(this.A.values(), new hme(19)));
        bundle.putIntArray(a0, s5c.c0(this.B));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j0f j0fVar = (j0f) obj;
        if (this.a == j0fVar.a && this.b == j0fVar.b && this.c == j0fVar.c && this.d == j0fVar.d && this.e == j0fVar.e && this.f == j0fVar.f && this.g == j0fVar.g && this.h == j0fVar.h && this.k == j0fVar.k && this.i == j0fVar.i && this.j == j0fVar.j && this.l.equals(j0fVar.l) && this.m == j0fVar.m && this.n.equals(j0fVar.n) && this.o == j0fVar.o && this.p == j0fVar.p && this.q == j0fVar.q && this.r.equals(j0fVar.r) && this.s.equals(j0fVar.s) && this.t.equals(j0fVar.t) && this.u == j0fVar.u && this.v == j0fVar.v && this.w == j0fVar.w && this.x == j0fVar.x && this.y == j0fVar.y && this.z == j0fVar.z) {
            cx6 cx6Var = this.A;
            cx6Var.getClass();
            if (ngg.q(cx6Var, j0fVar.A) && this.B.equals(j0fVar.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.B.hashCode() + ((this.A.hashCode() + ((((((((((((((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((((((((this.n.hashCode() + ((((this.l.hashCode() + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31)) * 31) + this.m) * 31)) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31)) * 31)) * 31)) * 31) + this.u) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31)) * 31);
    }
}
