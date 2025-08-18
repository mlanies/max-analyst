package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class i14 implements ok5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final bdb i;
    public final fb8 j;
    public final Uri k;
    public final enb l;
    public final List m;

    public i14(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, enb enbVar, bdb bdbVar, fb8 fb8Var, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = enbVar;
        this.i = bdbVar;
        this.k = uri;
        this.j = fb8Var;
        this.m = arrayList;
    }

    @Override // defpackage.ok5
    public final Object a(List list) {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new x8e(-1, -1, -1));
        ArrayList arrayList3 = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((x8e) linkedList.peek()).a != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j2 += jC;
                }
                j = j2;
                arrayList2 = arrayList3;
            } else {
                kta ktaVarB = b(i);
                List list2 = ktaVarB.c;
                x8e x8eVar = (x8e) linkedList.poll();
                int i2 = x8eVar.a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i3 = x8eVar.b;
                    u8 u8Var = (u8) list2.get(i3);
                    List list3 = u8Var.c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((lhc) list3.get(x8eVar.c));
                        x8eVar = (x8e) linkedList.poll();
                        if (x8eVar.a != i2) {
                            break;
                        }
                    } while (x8eVar.b == i3);
                    arrayList = arrayList3;
                    j = j2;
                    arrayList4.add(new u8(u8Var.a, u8Var.b, arrayList5, u8Var.d, u8Var.e, u8Var.f));
                    if (x8eVar.a != i2) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j2 = j;
                }
                linkedList.addFirst(x8eVar);
                arrayList2 = arrayList;
                arrayList2.add(new kta(ktaVarB.a, ktaVarB.b - j, arrayList4, ktaVarB.d));
            }
            i++;
            arrayList3 = arrayList2;
            j2 = j;
        }
        long j3 = j2;
        ArrayList arrayList6 = arrayList3;
        long j4 = this.b;
        return new i14(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList6);
    }

    public final kta b(int i) {
        return (kta) this.m.get(i);
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
            j2 = ((kta) list.get(i)).b;
        } else {
            j = ((kta) list.get(i + 1)).b;
            j2 = ((kta) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return oaf.S(c(i));
    }
}
