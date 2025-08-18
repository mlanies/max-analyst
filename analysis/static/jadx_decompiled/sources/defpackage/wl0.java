package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wl0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ yl0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl0(yl0 yl0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = yl0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wl0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wl0(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        yl0 yl0Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long j = yl0Var.l.get();
            this.X = 1;
            obj = yl0.f(yl0Var, null, j, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        kpa kpaVar = (kpa) obj;
        e5f e5fVar = e5f.a;
        if (kpaVar == null) {
            return e5fVar;
        }
        long jLongValue = ((Number) kpaVar.a).longValue();
        List list = (List) kpaVar.b;
        yl0Var.l.set(jLongValue);
        do {
            q0eVar = yl0Var.h;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, x53.t0((List) value, list)));
        return e5fVar;
    }
}
