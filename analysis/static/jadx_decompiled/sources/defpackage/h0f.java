package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class h0f {
    public HashMap A;
    public HashSet B;
    public int e;
    public int f;
    public int g;
    public int h;
    public zw6 l;
    public int m;
    public zw6 n;
    public int o;
    public int p;
    public int q;
    public zw6 r;
    public f0f s;
    public zw6 t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;

    public h0f() {
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        this.l = ffcVar;
        this.m = 0;
        this.n = ffcVar;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.r = ffcVar;
        this.s = f0f.d;
        this.t = ffcVar;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = new HashMap();
        this.B = new HashSet();
    }

    public static ffc e(String[] strArr) {
        ww6 ww6VarI = zw6.i();
        for (String str : strArr) {
            str.getClass();
            ww6VarI.a(oaf.T(str));
        }
        return ww6VarI.j();
    }

    public void a(c0f c0fVar) {
        this.A.put(c0fVar.a, c0fVar);
    }

    public j0f b() {
        return new j0f(this);
    }

    public h0f c() {
        this.A.clear();
        return this;
    }

    public final void d(j0f j0fVar) {
        this.a = j0fVar.a;
        this.b = j0fVar.b;
        this.c = j0fVar.c;
        this.d = j0fVar.d;
        this.e = j0fVar.e;
        this.f = j0fVar.f;
        this.g = j0fVar.g;
        this.h = j0fVar.h;
        this.i = j0fVar.i;
        this.j = j0fVar.j;
        this.k = j0fVar.k;
        this.l = j0fVar.l;
        this.m = j0fVar.m;
        this.n = j0fVar.n;
        this.o = j0fVar.o;
        this.p = j0fVar.p;
        this.q = j0fVar.q;
        this.r = j0fVar.r;
        this.s = j0fVar.s;
        this.t = j0fVar.t;
        this.u = j0fVar.u;
        this.v = j0fVar.v;
        this.w = j0fVar.w;
        this.x = j0fVar.x;
        this.y = j0fVar.y;
        this.z = j0fVar.z;
        this.B = new HashSet(j0fVar.B);
        this.A = new HashMap(j0fVar.A);
    }

    public h0f f(int i, int i2) {
        this.i = i;
        this.j = i2;
        this.k = true;
        return this;
    }
}
