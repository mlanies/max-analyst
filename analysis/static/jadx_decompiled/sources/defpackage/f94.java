package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f94 {
    public final ko7 a;
    public final c8d b;
    public final int[] c;
    public final int d;
    public final r24 e;
    public final long f;
    public final c4b g;
    public final c94[] h;
    public m85 i;
    public h14 j;
    public int k;
    public BehindLiveWindowException l;
    public boolean m;

    public f94(ko7 ko7Var, h14 h14Var, c8d c8dVar, int i, int[] iArr, m85 m85Var, int i2, r24 r24Var, long j, boolean z, ArrayList arrayList, c4b c4bVar) {
        ka5 e26Var;
        this.a = ko7Var;
        this.j = h14Var;
        this.b = c8dVar;
        this.c = iArr;
        this.i = m85Var;
        this.d = i2;
        this.e = r24Var;
        this.k = i;
        this.f = j;
        this.g = c4bVar;
        long jD = h14Var.d(i);
        ArrayList arrayListA = a();
        this.h = new c94[m85Var.length()];
        int i3 = 0;
        while (i3 < this.h.length) {
            khc khcVar = (khc) arrayListA.get(m85Var.f(i3));
            lk0 lk0VarA = c8dVar.A(khcVar.b);
            c94[] c94VarArr = this.h;
            lk0 lk0Var = lk0VarA == null ? (lk0) khcVar.b.get(0) : lk0VarA;
            oy5 oy5Var = khcVar.a;
            String str = oy5Var.v0;
            wu0 wu0Var = null;
            if (ha9.i(str)) {
                if ("application/x-rawcc".equals(str)) {
                    e26Var = new i5c(oy5Var);
                } else {
                    int i4 = i3;
                    c94VarArr[i4] = new c94(jD, khcVar, lk0Var, wu0Var, 0L, khcVar.c(), 0);
                    i3 = i4 + 1;
                }
            } else if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                e26Var = new c28(1);
            } else {
                e26Var = new e26(z ? 4 : 0, null, arrayList, c4bVar);
            }
            wu0Var = new wu0(e26Var, i2, oy5Var);
            int i42 = i3;
            c94VarArr[i42] = new c94(jD, khcVar, lk0Var, wu0Var, 0L, khcVar.c(), 0);
            i3 = i42 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((t8) list.get(i)).c);
        }
        return arrayList;
    }

    public final c94 b(int i) {
        c94[] c94VarArr = this.h;
        c94 c94Var = c94VarArr[i];
        lk0 lk0VarA = this.b.A(((khc) c94Var.e).b);
        if (lk0VarA == null || lk0VarA.equals((lk0) c94Var.f)) {
            return c94Var;
        }
        c94 c94Var2 = new c94(c94Var.b, (khc) c94Var.e, lk0VarA, (wu0) c94Var.d, c94Var.c, (z14) c94Var.g, 0);
        c94VarArr[i] = c94Var2;
        return c94Var2;
    }
}
