package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class d5b implements r6d, px0 {
    public final String a;
    public final ga6 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final je7 i;
    public final je7 j;
    public final je7 k;

    public d5b(String str, ga6 ga6Var, int i) {
        this.a = str;
        this.b = ga6Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = oz4.a;
        final int i4 = 0;
        this.i = tu0.r(2, new k56(this) { // from class: c5b
            public final /* synthetic */ d5b b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ga6 ga6Var2 = this.b.b;
                        return ga6Var2 != null ? ga6Var2.c() : ote.c;
                    case 1:
                        return j1e.j(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        d5b d5bVar = this.b;
                        return Integer.valueOf(nu0.r(d5bVar, (r6d[]) d5bVar.j.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.j = tu0.r(2, new k56(this) { // from class: c5b
            public final /* synthetic */ d5b b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ga6 ga6Var2 = this.b.b;
                        return ga6Var2 != null ? ga6Var2.c() : ote.c;
                    case 1:
                        return j1e.j(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        d5b d5bVar = this.b;
                        return Integer.valueOf(nu0.r(d5bVar, (r6d[]) d5bVar.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = tu0.r(2, new k56(this) { // from class: c5b
            public final /* synthetic */ d5b b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        ga6 ga6Var2 = this.b.b;
                        return ga6Var2 != null ? ga6Var2.c() : ote.c;
                    case 1:
                        return j1e.j(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        d5b d5bVar = this.b;
                        return Integer.valueOf(nu0.r(d5bVar, (r6d[]) d5bVar.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.r6d
    public final String a() {
        return this.a;
    }

    @Override // defpackage.px0
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.r6d
    public final boolean c() {
        return false;
    }

    @Override // defpackage.r6d
    public final int d(String str) {
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.r6d
    public pag e() {
        return nae.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d5b) {
            r6d r6dVar = (r6d) obj;
            if (tpa.f(this.a, r6dVar.a()) && Arrays.equals((r6d[]) this.j.getValue(), (r6d[]) ((d5b) obj).j.getValue())) {
                int iF = r6dVar.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (tpa.f(i(i2).a(), r6dVar.i(i2).a()) && tpa.f(i(i2).e(), r6dVar.i(i2).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.r6d
    public final int f() {
        return this.c;
    }

    @Override // defpackage.r6d
    public final String g(int i) {
        return this.e[i];
    }

    @Override // defpackage.r6d
    public final List getAnnotations() {
        return nz4.a;
    }

    @Override // defpackage.r6d
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? nz4.a : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.r6d
    public r6d i(int i) {
        return ((cc7[]) this.i.getValue())[i].d();
    }

    @Override // defpackage.r6d
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.r6d
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return x53.n0(ote.Y(0, this.c), ", ", rh4.m(new StringBuilder(), this.a, '('), ")", new wz7(21, this), 24);
    }
}
