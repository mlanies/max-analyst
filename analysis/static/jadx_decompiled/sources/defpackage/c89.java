package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c89(l89 l89Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = l89Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((c89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new c89(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        l89 l89Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = l89.p;
            r79 r79Var = (r79) l89Var.j.getValue();
            long j = l89Var.a.a;
            this.X = 1;
            obj = r79Var.a.j(j, this.Z, this);
            if (obj == tx3Var) {
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
        cu8 cu8Var = (cu8) obj;
        if (cu8Var == null) {
            return e5fVar;
        }
        this.X = 2;
        return l89.a(l89Var, cu8Var.b, this) == tx3Var ? tx3Var : e5fVar;
    }
}
