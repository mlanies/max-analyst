package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ir extends ffe implements a66 {
    public int X;
    public final /* synthetic */ kr Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(kr krVar, Continuation continuation) {
        super(2, continuation);
        this.Y = krVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ir) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ir(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        eqe eqeVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        kr krVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = kr.E0;
            nx3 nx3VarB = ((w9a) ((kke) krVar.t0.getValue())).b();
            hr hrVar = new hr(krVar, null);
            this.X = 1;
            if (j47.t0(nx3VarB, hrVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        List listE0 = x53.e0(((ConcurrentHashMap) ((je7) ((adb) krVar.y0.X).c).getValue()).values());
        ArrayList arrayList = new ArrayList(z53.S(listE0, 10));
        Iterator it = ((ArrayList) listE0).iterator();
        while (it.hasNext()) {
            sba sbaVar = (sba) it.next();
            boolean zF = tpa.f(sbaVar.a, krVar.y0.g().a);
            Map map = krVar.y0.j() ? krVar.w0 : krVar.x0;
            String str = sbaVar.a;
            Object obj2 = map.get(str);
            rre rreVar = obj2 instanceof rre ? (rre) obj2 : null;
            arrayList.add(new wre(zF, str, sbaVar, rreVar != null ? rreVar.a(0.45f) : null));
        }
        List<bq> listD0 = x53.D0(bq.X);
        ArrayList arrayList2 = new ArrayList(z53.S(listD0, 10));
        for (bq bqVar : listD0) {
            Boolean boolValueOf = Boolean.valueOf(bqVar == krVar.B0);
            int i2 = fr.$EnumSwitchMapping$0[bqVar.ordinal()];
            if (i2 == 1) {
                eqeVar = new eqe(o4a.e);
            } else if (i2 == 2) {
                eqeVar = new eqe(o4a.b);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                eqeVar = new eqe(o4a.l);
            }
            arrayList2.add(new fq(bqVar, boolValueOf, eqeVar));
        }
        q0e q0eVar = krVar.z0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, new er(arrayList, arrayList2, krVar.s())));
        return e5f.a;
    }
}
