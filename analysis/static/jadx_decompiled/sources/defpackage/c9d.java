package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import ru.ok.tamtam.ExceptionHandler$HandledException;

/* loaded from: classes2.dex */
public final class c9d extends d8d {
    public final boolean b;
    public final boolean c;
    public final String o = c9d.class.getName();

    public c9d(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.d8d
    public final void x() throws Throwable {
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        if (!((EnumSet) ((js7) e8dVar.w.getValue()).s0.getValue()).contains(gs7.b)) {
            e8d e8dVar2 = this.a;
            if (e8dVar2 == null) {
                e8dVar2 = null;
            }
            if (!((ch3) e8dVar2.E.getValue()).e()) {
                hm9.n(this.o, "Not logged in session, skip task");
                return;
            }
        }
        if (this.c) {
            String str = this.o;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "Starting flushing all strategy", null);
            }
            kec kecVar = new kec();
            j47.f0(hz4.a, new a9d(this, kecVar, null));
            if (kecVar.a > 1000) {
                ((cba) j()).c(new ExceptionHandler$HandledException(wg0.g(kecVar.a, "Got ", " analytic events!"), null, 2, "ONEME-11049"), false);
                return;
            }
            return;
        }
        List list = (List) j47.f0(hz4.a, new b9d(this, null));
        String str2 = this.o;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, str2, "Starting critical ids=" + list, null);
        }
        if (!list.isEmpty()) {
            pk pkVarA = a();
            boolean z = this.b;
            k4a k4aVar = (k4a) pkVarA;
            k4aVar.getClass();
            if (!list.isEmpty()) {
                ArrayList arrayListI0 = x53.I0(list, 100, 100);
                int size = arrayListI0.size();
                long[] jArr = new long[size];
                int i = 0;
                while (i < size) {
                    int i2 = i;
                    long[] jArr2 = jArr;
                    jArr2[i2] = k4a.v(k4aVar, new bs7(((p7b) k4aVar.y()).a.o(), (List) arrayListI0.get(i), true, z));
                    i = i2 + 1;
                    jArr = jArr2;
                    size = size;
                }
            }
        }
        if (list.size() > 10) {
            ((cba) j()).c(new ExceptionHandler$HandledException(wg0.g(list.size(), "Got ", " critical analytic events!"), null, 2, "ONEME-11049"), false);
        }
    }
}
