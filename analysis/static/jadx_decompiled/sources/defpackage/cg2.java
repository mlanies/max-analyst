package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes.dex */
public final class cg2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ eg2 Z;
    public final /* synthetic */ e52 s0;
    public cu8 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg2(Object obj, Continuation continuation, eg2 eg2Var, e52 e52Var) {
        super(2, continuation);
        this.Y = obj;
        this.Z = eg2Var;
        this.s0 = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cg2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cg2(this.Y, continuation, this.Z, this.s0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Exception e;
        cu8 cu8Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        eg2 eg2Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            cu8 cu8Var2 = (cu8) this.Y;
            try {
                u9a u9aVar = (u9a) eg2Var.e.getValue();
                e52 e52Var = this.s0;
                this.t0 = cu8Var2;
                this.X = 1;
                Object objJ = u9aVar.j(e52Var, cu8Var2, this);
                if (objJ == tx3Var) {
                    return tx3Var;
                }
                obj = objJ;
                cu8Var = cu8Var2;
            } catch (Exception e2) {
                e = e2;
                cu8Var = cu8Var2;
                ((cba) ((o45) eg2Var.f.getValue())).c(new RuntimeException("Error during mapping message=" + cu8Var, e), true);
                return null;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cu8Var = this.t0;
            try {
                od2.a0(obj);
            } catch (Exception e3) {
                e = e3;
                ((cba) ((o45) eg2Var.f.getValue())).c(new RuntimeException("Error during mapping message=" + cu8Var, e), true);
                return null;
            }
        }
        return (MessageModel) obj;
    }
}
