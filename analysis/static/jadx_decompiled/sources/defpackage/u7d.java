package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class u7d {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public static final List b(gy8 gy8Var, List list, m56 m56Var) {
        int iG;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            if (gy8Var.n().a() != 7) {
                gy8Var.z();
                return list;
            }
            ArrayList arrayList = new ArrayList();
            try {
                iG = lz7.G(gy8Var);
            } catch (Throwable th) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((r4a) it.next()).getClass();
                    r4a.a(th);
                }
                int iS = au1.s(k7d.a);
                if (iS != 0) {
                    if (iS != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th;
                }
                iG = 0;
            }
            for (int i = 0; i < iG; i++) {
                Object objInvoke = m56Var.invoke(gy8Var);
                if (objInvoke != null) {
                    arrayList.add(objInvoke);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                ((r4a) it2.next()).getClass();
                r4a.a(th2);
            }
            int iS2 = au1.s(k7d.a);
            if (iS2 == 0) {
                return list;
            }
            if (iS2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th2;
        }
    }

    public static final long[] c(gy8 gy8Var) {
        int iG;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            try {
                iG = lz7.G(gy8Var);
            } catch (Throwable th) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((r4a) it.next()).getClass();
                    r4a.a(th);
                }
                int iS = au1.s(k7d.a);
                if (iS != 0) {
                    if (iS != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th;
                }
                iG = 0;
            }
            if (iG == 0) {
                return null;
            }
            long[] jArr = new long[iG];
            for (int i = 0; i < iG; i++) {
                jArr[i] = lz7.M(gy8Var, 0L);
            }
            return jArr;
        } catch (Throwable th2) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                ((r4a) it2.next()).getClass();
                r4a.a(th2);
            }
            int iS2 = au1.s(k7d.a);
            if (iS2 == 0) {
                return null;
            }
            if (iS2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th2;
        }
    }
}
