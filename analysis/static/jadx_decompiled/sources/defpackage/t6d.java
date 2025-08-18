package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t6d implements r6d, px0 {
    public final String a;
    public final pag b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final r6d[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final r6d[] k;
    public final khe l;

    public t6d(String str, pag pagVar, int i, List list, bg4 bg4Var) {
        this.a = str;
        this.b = pagVar;
        this.c = i;
        this.d = (List) bg4Var.b;
        ArrayList arrayList = (ArrayList) bg4Var.o;
        this.e = x53.B0(arrayList);
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = j1e.j((ArrayList) bg4Var.X);
        this.h = (List[]) ((ArrayList) bg4Var.c).toArray(new List[0]);
        ArrayList arrayList2 = (ArrayList) bg4Var.Y;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.i = zArr;
        zs zsVar = new zs(2, new ie(1, this.f));
        ArrayList arrayList3 = new ArrayList(z53.S(zsVar, 10));
        Iterator it2 = zsVar.iterator();
        while (true) {
            ms4 ms4Var = (ms4) it2;
            if (!ms4Var.b.hasNext()) {
                this.j = mz7.c0(arrayList3);
                this.k = j1e.j(list);
                this.l = new khe(new lwa(26, this));
                return;
            }
            yz6 yz6Var = (yz6) ms4Var.next();
            arrayList3.add(new kpa(yz6Var.b, Integer.valueOf(yz6Var.a)));
        }
    }

    @Override // defpackage.r6d
    public final String a() {
        return this.a;
    }

    @Override // defpackage.px0
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.r6d
    public final boolean c() {
        return false;
    }

    @Override // defpackage.r6d
    public final int d(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.r6d
    public final pag e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t6d) {
            r6d r6dVar = (r6d) obj;
            if (tpa.f(a(), r6dVar.a()) && Arrays.equals(this.k, ((t6d) obj).k) && f() == r6dVar.f()) {
                int iF = f();
                for (int i = 0; i < iF; i++) {
                    if (tpa.f(i(i).a(), r6dVar.i(i).a()) && tpa.f(i(i).e(), r6dVar.i(i).e())) {
                    }
                }
                return true;
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
        return this.f[i];
    }

    @Override // defpackage.r6d
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.r6d
    public final List h(int i) {
        return this.h[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.r6d
    public final r6d i(int i) {
        return this.g[i];
    }

    @Override // defpackage.r6d
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.r6d
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return x53.n0(ote.Y(0, this.c), ", ", rh4.m(new StringBuilder(), this.a, '('), ")", new rpc(2, this), 24);
    }
}
