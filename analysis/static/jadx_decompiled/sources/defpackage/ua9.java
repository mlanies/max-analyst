package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ua9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wa9 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua9(wa9 wa9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = wa9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ua9 ua9Var = (ua9) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ua9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ua9 ua9Var = new ua9(this.Y, continuation);
        ua9Var.X = obj;
        return ua9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        eca ecaVar = this.Y.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null) {
            ecaVar.getClass();
            if (ir6Var.c()) {
                ir6Var.d(us7.X, "OneMeInitialDataStorage", zr6.h(list.size(), "updateMiniChats by count: "), null);
            }
        }
        ((AtomicReference) ((na9) ecaVar.b.getValue()).c).set(list);
        ((na9) ecaVar.b.getValue()).G();
        return e5f.a;
    }
}
