package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hva extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ jva Z;
    public final /* synthetic */ List s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hva(ArrayList arrayList, jva jvaVar, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.Y = arrayList;
        this.Z = jvaVar;
        this.s0 = arrayList2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hva) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hva hvaVar = new hva((ArrayList) this.Y, this.Z, (ArrayList) this.s0, continuation);
        hvaVar.X = obj;
        return hvaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        hva hvaVar = this;
        od2.a0(obj);
        sx3 sx3Var = (sx3) hvaVar.X;
        ArrayList arrayList = new ArrayList();
        for (wua wuaVar : hvaVar.Y) {
            if (!j1e.z(sx3Var)) {
                return nz4.a;
            }
            wua wuaVarB = jva.b(hvaVar.Z, wuaVar, hvaVar.s0);
            if (wuaVarB == null) {
                hvaVar = this;
            } else if (!wuaVarB.equals(wuaVar)) {
                String str = wuaVarB.X;
                Long lD = jva.d(str);
                String str2 = wuaVar.X;
                Long lD2 = jva.d(str2);
                if (lD == null || !lD.equals(lD2)) {
                    arrayList.add(new wua(wuaVarB.b, wuaVarB.c, wuaVar.o, wuaVar.X, wuaVarB.Y, null, wuaVar.s0, wuaVar.t0, wuaVar.u0, au1.s(str2.equals(str) ? wuaVarB.v0 : wuaVar.v0)));
                    hvaVar = this;
                    sx3Var = sx3Var;
                }
            }
        }
        return arrayList;
    }
}
