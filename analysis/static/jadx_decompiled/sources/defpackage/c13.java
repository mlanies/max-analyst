package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public final class c13 extends ffe implements a66 {
    public int X;
    public /* synthetic */ int Y;
    public final /* synthetic */ qp4 Z;
    public final /* synthetic */ k56 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c13(qp4 qp4Var, k56 k56Var, Continuation continuation) {
        super(2, continuation);
        this.Z = qp4Var;
        this.s0 = k56Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((c13) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        c13 c13Var = new c13(this.Z, this.s0, continuation);
        c13Var.Y = ((Number) obj).intValue();
        return c13Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            int i2 = this.Y;
            String str = (String) this.Z.a;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, zr6.h(i2, "onNewActivityFlow "), null);
            }
            h7b h7bVar = (h7b) this.Z.b;
            List list = (List) this.s0.invoke();
            this.X = 1;
            h7bVar.getClass();
            jd4 jd4Var = ql4.a;
            Object objT0 = j47.t0(MainDispatcherLoader.dispatcher.getImmediate(), new o8(h7bVar, list, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
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
