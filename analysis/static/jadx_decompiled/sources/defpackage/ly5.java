package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ForkJoinPool;

/* loaded from: classes2.dex */
public final class ly5 {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final ky5 b = new ky5(this);
    public final ArrayList c = new ArrayList();

    public final iy5 a(String str, Iterable iterable, k56 k56Var) {
        iy5 iy5Var = new iy5(str, new yg3(iterable, k56Var, this, str, 5));
        ArrayList arrayList = this.c;
        jy5 jy5Var = iy5Var.b;
        arrayList.add(0, jy5Var);
        ForkJoinPool.commonPool().execute(jy5Var);
        return iy5Var;
    }
}
