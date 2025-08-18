package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bb5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cb5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb5(cb5 cb5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cb5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((bb5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bb5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = cb5.i;
            cb5 cb5Var = this.Y;
            w7c w7cVar = cb5Var.b().X;
            xw xwVar = new xw(6, cb5Var);
            this.X = 1;
            if (w7cVar.a.d(xwVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
