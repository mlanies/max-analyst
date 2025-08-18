package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uk1 extends ffe implements h66 {
    public /* synthetic */ pqa X;
    public /* synthetic */ gg1 Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ i95 s0;
    public /* synthetic */ boolean t0;
    public final /* synthetic */ el1 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk1(el1 el1Var, Continuation continuation) {
        super(6, continuation);
        this.u0 = el1Var;
    }

    @Override // defpackage.h66
    public final void k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) throws Throwable {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        uk1 uk1Var = new uk1(this.u0, (Continuation) obj6);
        uk1Var.X = (pqa) obj;
        uk1Var.Y = (gg1) obj2;
        uk1Var.Z = zBooleanValue;
        uk1Var.s0 = (i95) obj4;
        uk1Var.t0 = zBooleanValue2;
        uk1Var.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        el1 el1Var;
        Object value;
        od2.a0(obj);
        pqa pqaVar = this.X;
        gg1 gg1Var = this.Y;
        boolean z = this.Z;
        i95 i95Var = this.s0;
        boolean z2 = this.t0;
        Map map = pqaVar.c;
        Map map2 = pqaVar.g;
        Set<gg1> setG0 = x53.G0(x53.x0(map2.keySet(), new l45(1, map2)));
        ky7 ky7Var = new ky7();
        fqa fqaVar = pqaVar.a;
        ky7Var.put(fqaVar.a.getId(), fqaVar);
        fqa fqaVar2 = (fqa) map.get(gg1Var);
        if (fqaVar2 != null) {
            ig1 ig1Var = fqaVar2.a;
            ky7Var.put(ig1Var.getId(), fqaVar2);
            setG0.remove(ig1Var.getId());
        }
        for (gg1 gg1Var2 : setG0) {
            fqa fqaVar3 = (fqa) map.get(gg1Var2);
            if (fqaVar3 != null) {
                ky7Var.put(gg1Var2, fqaVar3);
            }
        }
        fqa fqaVar4 = (fqa) map.get(pqaVar.a());
        if (fqaVar4 != null) {
        }
        for (Map.Entry entry : map.entrySet()) {
            gg1 gg1Var3 = (gg1) entry.getKey();
            fqa fqaVar5 = (fqa) entry.getValue();
            if (!ky7Var.containsKey(gg1Var3)) {
                ky7Var.put(gg1Var3, fqaVar5);
            }
        }
        Collection collectionValues = ky7Var.b().values();
        int iZ = mz7.Z(z53.S(collectionValues, 10));
        if (iZ < 16) {
            iZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
        Iterator it = ((my7) collectionValues).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            el1Var = this.u0;
            if (!zHasNext) {
                break;
            }
            fqa fqaVar6 = (fqa) it.next();
            linkedHashMap.put(fqaVar6.a.getId(), dz7.c(fqaVar6, fqaVar6.a.o(), z, z2, el1Var.Y, i95Var, gg1Var));
        }
        q0e q0eVar = el1Var.D0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, linkedHashMap));
        return e5f.a;
    }
}
