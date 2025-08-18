package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zi extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gj Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ Map s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(gj gjVar, List list, Map map, Continuation continuation) {
        super(2, continuation);
        this.Y = gjVar;
        this.Z = list;
        this.s0 = map;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zi) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zi(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (gj.c(this.Y, this.Z, this.s0, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
