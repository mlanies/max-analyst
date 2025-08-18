package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ji4 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ on5 Z;
    public /* synthetic */ Object[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        on5 on5Var = (on5) obj;
        Object[] objArr = (Object[]) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ji4 ji4Var = new ji4(3, continuation, 0);
                ji4Var.Z = on5Var;
                ji4Var.s0 = objArr;
                return ji4Var.o(e5f.a);
            case 1:
                ji4 ji4Var2 = new ji4(3, continuation, 1);
                ji4Var2.Z = on5Var;
                ji4Var2.s0 = objArr;
                return ji4Var2.o(e5f.a);
            case 2:
                ji4 ji4Var3 = new ji4(3, continuation, 2);
                ji4Var3.Z = on5Var;
                ji4Var3.s0 = objArr;
                return ji4Var3.o(e5f.a);
            default:
                ji4 ji4Var4 = new ji4(3, continuation, 3);
                ji4Var4.Z = on5Var;
                ji4Var4.s0 = objArr;
                return ji4Var4.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                tx3 tx3Var = tx3.a;
                int i = this.Y;
                if (i == 0) {
                    od2.a0(obj);
                    on5 on5Var = this.Z;
                    List[] listArr = (List[]) this.s0;
                    ArrayList arrayList = new ArrayList();
                    for (List list : listArr) {
                        d63.V(list, arrayList);
                    }
                    this.Y = 1;
                    if (on5Var.a(arrayList, this) == tx3Var) {
                        return tx3Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
            case 1:
                tx3 tx3Var2 = tx3.a;
                int i2 = this.Y;
                e5f e5fVar = e5f.a;
                if (i2 == 0) {
                    od2.a0(obj);
                    on5 on5Var2 = this.Z;
                    this.Y = 1;
                    if (on5Var2.a(e5fVar, this) == tx3Var2) {
                        return tx3Var2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5fVar;
            case 2:
                tx3 tx3Var3 = tx3.a;
                int i3 = this.Y;
                if (i3 == 0) {
                    od2.a0(obj);
                    on5 on5Var3 = this.Z;
                    kba[] kbaVarArr = (kba[]) this.s0;
                    int iZ = mz7.Z(kbaVarArr.length);
                    if (iZ < 16) {
                        iZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
                    for (kba kbaVar : kbaVarArr) {
                        linkedHashMap.put(kbaVar.a, kbaVar);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(mz7.Z(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), ((kba) entry.getValue()).b);
                    }
                    yv5 yv5Var = new yv5(linkedHashMap2);
                    this.Y = 1;
                    if (on5Var3.a(yv5Var, this) == tx3Var3) {
                        return tx3Var3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
            default:
                tx3 tx3Var4 = tx3.a;
                int i4 = this.Y;
                if (i4 == 0) {
                    od2.a0(obj);
                    on5 on5Var4 = this.Z;
                    rya[] ryaVarArr = (rya[]) this.s0;
                    int iZ2 = mz7.Z(ryaVarArr.length);
                    if (iZ2 < 16) {
                        iZ2 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iZ2);
                    for (rya ryaVar : ryaVarArr) {
                        linkedHashMap3.put(new Long(ryaVar.a), ryaVar);
                    }
                    this.Y = 1;
                    if (on5Var4.a(linkedHashMap3, this) == tx3Var4) {
                        return tx3Var4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
        }
    }
}
