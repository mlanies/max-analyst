package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mza extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pza Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mza(pza pzaVar, Continuation continuation) {
        super(2, continuation);
        this.Z = pzaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mza) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mza mzaVar = new mza(this.Z, continuation);
        mzaVar.Y = obj;
        return mzaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            List listQ = (List) this.Y;
            bc7[] bc7VarArr = pza.s0;
            pza pzaVar = this.Z;
            if (pzaVar.r()) {
                listQ = pza.q(pzaVar, listQ);
            }
            this.X = 1;
            pzaVar.Y.setValue(listQ);
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
