package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zd2 implements sk6 {
    public final /* synthetic */ x82 b;
    public final /* synthetic */ c8d c;

    public zd2(c8d c8dVar, x82 x82Var) {
        this.c = c8dVar;
        this.b = x82Var;
    }

    @Override // defpackage.sk6
    public final long g() {
        return this.b.c;
    }

    @Override // defpackage.sk6
    public final long h() {
        long j = this.b.d;
        if (j == 0) {
            c8d c8dVar = this.c;
            long j2 = ((e52) c8dVar.a).b.j;
            long j3 = ((cu8) c8dVar.b).b;
            if (j2 == j3) {
                return j3;
            }
        }
        return j;
    }

    @Override // defpackage.sk6
    public final List i() {
        ArrayList arrayList = new ArrayList(this.b.e);
        c8d c8dVar = this.c;
        arrayList.addAll(((e52) c8dVar.a).b.n.d(mg4.REGULAR));
        hm9.O(arrayList);
        cu8 cu8Var = (cu8) c8dVar.b;
        if (((d92) hm9.u(cu8Var.o, arrayList).b) == null) {
            long j = cu8Var.o;
            arrayList.add(new d92(j, j));
        }
        return new ArrayList(arrayList);
    }
}
