package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p96 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ z96 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p96(z96 z96Var, Continuation continuation) {
        super(2, continuation);
        this.Y = z96Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((p96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new p96(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            z96 z96Var = this.Y;
            s86 s86Var = z96Var.Y;
            ArrayList arrayListX = dy7.x(z96Var.F0);
            s86Var.getClass();
            pnf.o(s86Var.c, new m86(arrayListX));
            this.X = 1;
            Object objT0 = j47.t0(((w9a) z96Var.s()).e(), new y96(z96Var, false, null), this);
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
