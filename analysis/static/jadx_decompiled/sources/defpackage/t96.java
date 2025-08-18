package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t96 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ z96 Y;
    public final /* synthetic */ Set Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t96(z96 z96Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = z96Var;
        this.Z = set;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((t96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new t96(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        z96 z96Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            t03 t03Var = new t03(z96Var.w0, 13);
            this.X = 1;
            if (od2.A(t03Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        this.X = 2;
        Object objT0 = j47.t0(((w9a) z96Var.s()).e(), new f96(z96Var, this.Z, null), this);
        if (objT0 != tx3Var) {
            objT0 = e5fVar;
        }
        return objT0 == tx3Var ? tx3Var : e5fVar;
    }
}
