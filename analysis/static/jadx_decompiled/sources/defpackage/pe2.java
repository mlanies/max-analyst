package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pe2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ye2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe2(ye2 ye2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ye2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pe2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pe2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ye2 ye2Var = this.Y;
            ne2 ne2Var = (ne2) ye2Var.z0.getAndUpdate(new oe2(0));
            if (ne2Var == null) {
                return e5fVar;
            }
            en4 en4Var = ne2Var.d;
            en4Var.getClass();
            if ((en4Var == en4.b || en4Var == en4.c) && !ne2Var.e) {
                dfe dfeVar = (dfe) ye2Var.Y.getValue();
                File fileS = ((kk5) ((zi5) ye2Var.s0.getValue())).s(ne2Var.b);
                this.X = 1;
                if (dfeVar.a.c(fileS, ne2Var.c, this) == tx3Var) {
                    return tx3Var;
                }
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
