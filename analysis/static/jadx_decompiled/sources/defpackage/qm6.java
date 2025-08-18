package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class qm6 extends an6 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final dr4 q;
    public final zw6 r;
    public final zw6 s;
    public final cx6 t;
    public final long u;
    public final om6 v;

    public qm6(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, dr4 dr4Var, List list2, List list3, om6 om6Var, Map map) {
        super(str, z3, list);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = dr4Var;
        this.r = zw6.j(list2);
        this.s = zw6.j(list3);
        this.t = cx6.b(map);
        if (!list3.isEmpty()) {
            hm6 hm6Var = (hm6) mqd.m(list3);
            this.u = hm6Var.X + hm6Var.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            lm6 lm6Var = (lm6) mqd.m(list2);
            this.u = lm6Var.X + lm6Var.c;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = om6Var;
    }

    @Override // defpackage.ok5
    public final Object a(List list) {
        return this;
    }
}
