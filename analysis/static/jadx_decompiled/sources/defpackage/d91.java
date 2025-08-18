package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d91 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ e91 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d91(e91 e91Var, Continuation continuation) {
        super(2, continuation);
        this.Y = e91Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((d91) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new d91(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            throw new KotlinNothingValueException();
        }
        od2.a0(obj);
        e91 e91Var = this.Y;
        i95 i95Var = ((wr1) e91Var.X).k().j;
        if ((i95Var instanceof c95) || (i95Var instanceof b95) || (i95Var instanceof d95)) {
            do {
                q0eVar = e91Var.t0;
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, new b91(false)));
            return e5f.a;
        }
        q0e q0eVar2 = ((l31) e91Var.o).k;
        xw xwVar = new xw(3, e91Var);
        this.X = 1;
        q0eVar2.d(xwVar, this);
        return tx3Var;
    }
}
