package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class oa3 extends pnf {
    public final s35 X;
    public final long b;
    public final je7 c;
    public final w7c o;

    public oa3(long j) {
        mg3 mg3Var;
        Object njcVar;
        String[] strArr;
        ja3 ja3Var = ja3.a;
        db6 db6Var = (db6) ja3Var.getAccessor().c(db6.class);
        khe kheVarD = ja3Var.getAccessor().d(pk.class);
        this.b = j;
        this.c = kheVarD;
        q0e q0eVarA = r0e.a(nz4.a);
        this.o = new w7c(q0eVarA);
        this.X = new s35(0);
        EnumSet<da3> enumSetNoneOf = EnumSet.noneOf(da3.class);
        qyc qycVar = (qyc) ((y7d) db6Var.a.getValue());
        qycVar.getClass();
        List listH = qycVar.h(PmsKey.f8availablecomplaints.name(), null);
        for (String str : (listH == null || (strArr = (String[]) listH.toArray(new String[0])) == null) ? new String[0] : strArr) {
            try {
                njcVar = da3.a(str);
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            da3 da3Var = (da3) (njcVar instanceof njc ? null : njcVar);
            if (da3Var != null) {
                enumSetNoneOf.add(da3Var);
            }
        }
        ArrayList arrayList = new ArrayList(z53.S(enumSetNoneOf, 10));
        for (da3 da3Var2 : enumSetNoneOf) {
            int iOrdinal = da3Var2.ordinal();
            int iOrdinal2 = da3Var2.ordinal();
            if (iOrdinal2 == 0) {
                mg3Var = new mg3(iOrdinal, new eqe(maa.i), 2, false);
            } else if (iOrdinal2 == 1) {
                mg3Var = new mg3(iOrdinal, new eqe(maa.h), 2, false);
            } else if (iOrdinal2 == 2) {
                mg3Var = new mg3(iOrdinal, new eqe(maa.e), 2, false);
            } else if (iOrdinal2 == 3) {
                mg3Var = new mg3(iOrdinal, new eqe(maa.f), 2, false);
            } else if (iOrdinal2 == 4) {
                mg3Var = new mg3(iOrdinal, new eqe(maa.j), 2, false);
            } else {
                if (iOrdinal2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                mg3Var = new mg3(iOrdinal, new eqe(maa.g), 2, false);
            }
            arrayList.add(mg3Var);
        }
        q0eVarA.m(null, arrayList);
    }
}
