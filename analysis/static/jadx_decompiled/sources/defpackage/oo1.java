package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class oo1 extends ffe implements a66 {
    public final /* synthetic */ Set X;
    public final /* synthetic */ so1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo1(Set set, so1 so1Var, Continuation continuation) {
        super(2, continuation);
        this.X = set;
        this.Y = so1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((oo1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new oo1(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        Set set = this.X;
        boolean zIsEmpty = set.isEmpty();
        oz4 oz4Var = oz4.a;
        if (zIsEmpty) {
            return oz4Var;
        }
        el3 el3Var = ((ds3) this.Y.b.getValue()).a;
        el3Var.b();
        us usVar = new us(0);
        el3Var.a.forEach(new k82(set, 2, usVar));
        if (usVar.isEmpty()) {
            return oz4Var;
        }
        us usVar2 = new us(usVar.c);
        Iterator it = ((ps) usVar.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long jLongValue = ((Number) entry.getKey()).longValue();
            uj3 uj3Var = (uj3) entry.getValue();
            Long l = new Long(jLongValue);
            String strD = uj3Var.d();
            if (strD == null) {
                strD = "";
            }
            long jN = uj3Var.n();
            usVar2.put(l, new baf(jN, strD, uj3Var.m(), uj3Var.w(), uj3Var.p(kk0.o)));
        }
        return usVar2;
    }
}
