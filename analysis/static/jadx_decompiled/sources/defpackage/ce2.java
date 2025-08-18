package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ce2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k70 Y;
    public final /* synthetic */ e52 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce2(k70 k70Var, e52 e52Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k70Var;
        this.Z = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ce2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ce2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            k70 k70Var = this.Y;
            iy2 iy2Var = (iy2) ((je7) k70Var.X).getValue();
            long j = this.Z.a;
            this.X = 1;
            obj = ((jz2) iy2Var).t(j, (Set) k70Var.o, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
