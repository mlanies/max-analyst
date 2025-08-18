package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xy6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fz6 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy6(fz6 fz6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = fz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xy6(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            String str = fz6.E0;
            fz6 fz6Var = this.Y;
            fz6Var.getClass();
            Object objK = j1e.k(new sy6(fz6Var, null), this);
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
