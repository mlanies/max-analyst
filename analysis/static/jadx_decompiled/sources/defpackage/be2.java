package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class be2 implements sk6 {
    public final /* synthetic */ x82 b;
    public final /* synthetic */ e52 c;
    public final /* synthetic */ k70 d;

    public be2(x82 x82Var, e52 e52Var, k70 k70Var) {
        this.b = x82Var;
        this.c = e52Var;
        this.d = k70Var;
    }

    @Override // defpackage.sk6
    public final long g() {
        return this.b.c;
    }

    @Override // defpackage.sk6
    public final long h() {
        long j = this.b.d;
        if (j != 0) {
            return j;
        }
        long j2 = this.c.b.j;
        long j3 = this.d.b;
        return j2 == j3 ? j3 : j;
    }

    @Override // defpackage.sk6
    public final List i() {
        ArrayList arrayList = new ArrayList(this.b.e);
        arrayList.addAll(this.c.b.n.d(mg4.REGULAR));
        hm9.O(arrayList);
        k70 k70Var = this.d;
        if (((d92) hm9.u(k70Var.c, arrayList).b) == null) {
            long j = k70Var.c;
            arrayList.add(new d92(j, j));
        }
        return arrayList;
    }
}
