package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class h14 implements nk5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final m94 i;
    public final fb8 j;
    public final Uri k;
    public final dnb l;
    public final List m;

    public h14(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, dnb dnbVar, m94 m94Var, fb8 fb8Var, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = dnbVar;
        this.i = m94Var;
        this.k = uri;
        this.j = fb8Var;
        this.m = arrayList;
    }

    @Override // defpackage.nk5
    public final Object a(List list) {
        h14 h14Var = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new w8e());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (i < h14Var.m.size()) {
            if (((w8e) linkedList.peek()).a != i) {
                long jC = h14Var.c(i);
                if (jC != -9223372036854775807L) {
                    j += jC;
                }
            } else {
                jta jtaVarB = h14Var.b(i);
                List list2 = jtaVarB.c;
                w8e w8eVar = (w8e) linkedList.poll();
                int i2 = w8eVar.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = w8eVar.b;
                    t8 t8Var = (t8) list2.get(i3);
                    List list3 = t8Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((khc) list3.get(w8eVar.c));
                        w8eVar = (w8e) linkedList.poll();
                        if (w8eVar.a != i2) {
                            break;
                        }
                    } while (w8eVar.b == i3);
                    List list4 = list2;
                    arrayList2.add(new t8(t8Var.a, t8Var.b, arrayList3, t8Var.d, t8Var.e, t8Var.f));
                    if (w8eVar.a != i2) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(w8eVar);
                arrayList.add(new jta(jtaVarB.a, jtaVarB.b - j, arrayList2, jtaVarB.d));
            }
            i++;
            h14Var = this;
        }
        long j2 = h14Var.b;
        return new h14(h14Var.a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, h14Var.c, h14Var.d, h14Var.e, h14Var.f, h14Var.g, h14Var.h, h14Var.l, h14Var.i, h14Var.j, h14Var.k, arrayList);
    }

    public final jta b(int i) {
        return (jta) this.m.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((jta) list.get(i)).b;
        } else {
            j = ((jta) list.get(i + 1)).b;
            j2 = ((jta) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return maf.D(c(i));
    }
}
