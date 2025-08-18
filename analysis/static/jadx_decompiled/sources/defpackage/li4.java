package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuScreen;

/* loaded from: classes.dex */
public final class li4 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DevMenuScreen Y;
    public final /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li4(DevMenuScreen devMenuScreen, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.Y = devMenuScreen;
        this.Z = arrayList;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        li4 li4Var = (li4) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        li4Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        li4 li4Var = new li4(this.Y, (ArrayList) this.Z, continuation);
        li4Var.X = obj;
        return li4Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        mfd mfdVar = this.Y.X;
        kl7 kl7VarL = j1e.l();
        kl7VarL.addAll(this.Z);
        kl7VarL.addAll(list);
        mfdVar.E(j1e.d(kl7VarL));
        return e5f.a;
    }
}
