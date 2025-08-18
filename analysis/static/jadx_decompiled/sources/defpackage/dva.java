package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dva extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jva Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dva(jva jvaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = jvaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dva) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dva(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            jva jvaVar = this.Y;
            jvaVar.getClass();
            Object objK = j1e.k(new eva(jvaVar, null), this);
            if (objK != tx3Var) {
                objK = e5fVar;
            }
            if (objK == tx3Var) {
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
