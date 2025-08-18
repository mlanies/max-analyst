package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ycd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ add Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycd(add addVar, Continuation continuation) {
        super(2, continuation);
        this.Y = addVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ycd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ycd(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        add addVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            iy2 iy2Var = (iy2) addVar.w0.getValue();
            this.X = 1;
            if (((jz2) iy2Var).g(this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        s35 s35Var = addVar.z0;
        cgd.c.getClass();
        pnf.o(s35Var, new c64(":saved-messages"));
        return e5f.a;
    }
}
