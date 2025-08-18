package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class med extends ffe implements a66 {
    public final /* synthetic */ ped X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public med(ped pedVar, Continuation continuation) {
        super(2, continuation);
        this.X = pedVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        med medVar = (med) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        medVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new med(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        LinkedHashMap linkedHashMap;
        od2.a0(obj);
        ped pedVar = this.X;
        ds3 ds3Var = (ds3) pedVar.o.getValue();
        ds3Var.getClass();
        List<uj3> listJ = ds3Var.a.j(el3.r, el3.u);
        oq3 oq3Var = (oq3) pedVar.Y.getValue();
        oq3Var.getClass();
        Collections.sort(listJ, new ca3(2, oq3Var));
        do {
            q0eVar = pedVar.t0;
            value = q0eVar.getValue();
            int iZ = mz7.Z(z53.S(listJ, 10));
            if (iZ < 16) {
                iZ = 16;
            }
            linkedHashMap = new LinkedHashMap(iZ);
            for (uj3 uj3Var : listJ) {
                Long l = new Long(uj3Var.n());
                long jN = uj3Var.n();
                String strP = uj3Var.p(kk0.b);
                String strD = uj3Var.d();
                if (strD == null) {
                    strD = "";
                }
                linkedHashMap.put(l, new wo0(jN, strP, strD, uj3Var.m()));
            }
        } while (!q0eVar.c(value, linkedHashMap));
        return e5f.a;
    }
}
