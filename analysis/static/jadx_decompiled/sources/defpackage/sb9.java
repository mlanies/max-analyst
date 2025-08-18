package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sb9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xb9 Y;
    public final /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb9(xb9 xb9Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = xb9Var;
        this.Z = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sb9(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            int i2 = ft4.o;
            long jR = z7.R(3, kt4.SECONDS);
            this.X = 1;
            obj = this.Y.j(jR, this.Z, this);
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
