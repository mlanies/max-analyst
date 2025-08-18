package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dx5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jx5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx5(jx5 jx5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = jx5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dx5) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dx5 dx5Var = new dx5(this.Z, continuation);
        dx5Var.Y = obj;
        return dx5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            List<av5> list = (List) this.Y;
            eca ecaVar = this.Z.X;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (av5 av5Var : list) {
                arrayList.add(new xa9(av5Var.a, av5Var.b, av5Var.d, av5Var.e));
            }
            ir6 ir6Var = hm9.m;
            if (ir6Var != null) {
                ecaVar.getClass();
                if (ir6Var.c()) {
                    ir6Var.d(us7.X, "OneMeInitialDataStorage", zr6.h(arrayList.size(), "updateFolders by count: "), null);
                }
            }
            ((AtomicReference) ((ya9) ecaVar.c.getValue()).c).set(arrayList);
            ((ya9) ecaVar.c.getValue()).G();
            q0e q0eVar = this.Z.s0;
            this.X = 1;
            q0eVar.m(null, list);
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
