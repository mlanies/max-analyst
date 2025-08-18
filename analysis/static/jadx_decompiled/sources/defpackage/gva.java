package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gva extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ jva Z;
    public final /* synthetic */ List s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gva(List list, jva jvaVar, List list2, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = jvaVar;
        this.s0 = list2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gva) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gva gvaVar = new gva(this.Y, this.Z, this.s0, continuation);
        gvaVar.X = obj;
        return gvaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        ArrayList arrayList = new ArrayList();
        for (wua wuaVar : this.Y) {
            if (!j1e.z(sx3Var)) {
                return nz4.a;
            }
            if (jva.b(this.Z, wuaVar, this.s0) == null) {
                arrayList.add(wuaVar);
            }
        }
        return arrayList;
    }
}
