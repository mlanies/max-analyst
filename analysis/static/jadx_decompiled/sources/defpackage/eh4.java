package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class eh4 {
    public final je7 a;

    public eh4(je7 je7Var) {
        this.a = je7Var;
    }

    public final void a(long j, long j2, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            pk pkVar = (pk) this.a.getValue();
            List listSingletonList = Collections.singletonList(new Long(jLongValue));
            int i = z ? -1 : 0;
            k4a k4aVar = (k4a) pkVar;
            if (k4aVar.o(j)) {
                rk2 rk2Var = new rk2(((p7b) k4aVar.y()).a.o(), j, j2, 2, listSingletonList, ek2.MEMBER, true, i, 0);
                if (i == 0) {
                    k4a.w(k4aVar, rk2Var);
                } else {
                    k4a.v(k4aVar, rk2Var);
                }
            }
        }
    }
}
