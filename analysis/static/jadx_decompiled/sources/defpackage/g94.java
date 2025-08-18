package defpackage;

import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g94 {
    public final lo7 a;
    public final die b;
    public final int[] c;
    public final int d;
    public final t24 e;
    public final long f;
    public final int g;
    public final d4b h;
    public final c94[] i;
    public n85 j;
    public i14 k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    public g94(cb4 cb4Var, lo7 lo7Var, i14 i14Var, die dieVar, int i, int[] iArr, n85 n85Var, int i2, t24 t24Var, long j, int i3, boolean z, ArrayList arrayList, d4b d4bVar) {
        this.a = lo7Var;
        this.k = i14Var;
        this.b = dieVar;
        this.c = iArr;
        this.j = n85Var;
        this.d = i2;
        this.e = t24Var;
        this.l = i;
        this.f = j;
        this.g = i3;
        this.h = d4bVar;
        long jD = i14Var.d(i);
        ArrayList arrayListA = a();
        this.i = new c94[n85Var.length()];
        int i4 = 0;
        while (i4 < this.i.length) {
            lhc lhcVar = (lhc) arrayListA.get(n85Var.f(i4));
            mk0 mk0VarO = dieVar.O(lhcVar.b);
            int i5 = i4;
            this.i[i5] = new c94(jD, lhcVar, mk0VarO == null ? (mk0) lhcVar.b.get(0) : mk0VarO, cb4Var.b(i2, lhcVar.a, z, arrayList, d4bVar), 0L, lhcVar.c(), 1);
            i4 = i5 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((u8) list.get(i)).c);
        }
        return arrayList;
    }

    public final c94 b(int i) {
        c94[] c94VarArr = this.i;
        c94 c94Var = c94VarArr[i];
        mk0 mk0VarO = this.b.O(((lhc) c94Var.e).b);
        if (mk0VarO == null || mk0VarO.equals((mk0) c94Var.f)) {
            return c94Var;
        }
        c94 c94Var2 = new c94(c94Var.b, (lhc) c94Var.e, mk0VarO, (k13) c94Var.d, c94Var.c, (a24) c94Var.g, 1);
        c94VarArr[i] = c94Var2;
        return c94Var2;
    }

    public final void c(n85 n85Var) {
        this.j = n85Var;
    }
}
