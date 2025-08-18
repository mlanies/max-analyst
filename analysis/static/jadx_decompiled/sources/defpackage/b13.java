package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public final class b13 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qp4 Z;
    public final /* synthetic */ k56 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b13(qp4 qp4Var, k56 k56Var, Continuation continuation) {
        super(2, continuation);
        this.Z = qp4Var;
        this.s0 = k56Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((b13) n((fka) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b13 b13Var = new b13(this.Z, this.s0, continuation);
        b13Var.Y = obj;
        return b13Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            fka fkaVar = (fka) this.Y;
            String str = (String) this.Z.a;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "themeFlow " + fkaVar, null);
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
