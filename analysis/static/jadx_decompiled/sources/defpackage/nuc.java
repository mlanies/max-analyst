package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class nuc {
    public static final String a = a14.O("Schedulers");

    public static void a(me3 me3Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        i8g i8gVarY = workDatabase.y();
        workDatabase.c();
        try {
            ArrayList arrayListG = i8gVarY.g(me3Var.h);
            ArrayList arrayListF = i8gVarY.f();
            if (arrayListG.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    i8gVarY.n(jCurrentTimeMillis, ((h8g) it.next()).a);
                }
            }
            workDatabase.r();
            workDatabase.l();
            if (arrayListG.size() > 0) {
                h8g[] h8gVarArr = (h8g[]) arrayListG.toArray(new h8g[arrayListG.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    auc aucVar = (auc) it2.next();
                    if (aucVar.c()) {
                        aucVar.e(h8gVarArr);
                    }
                }
            }
            if (arrayListF.size() > 0) {
                h8g[] h8gVarArr2 = (h8g[]) arrayListF.toArray(new h8g[arrayListF.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    auc aucVar2 = (auc) it3.next();
                    if (!aucVar2.c()) {
                        aucVar2.e(h8gVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}
