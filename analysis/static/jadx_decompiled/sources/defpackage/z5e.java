package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z5e extends ffe implements a66 {
    public u4e X;
    public int Y;
    public final /* synthetic */ b6e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5e(b6e b6eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = b6eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((z5e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new z5e(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        u4e u4eVar;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        b6e b6eVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            Long l = (Long) b6eVar.f.get();
            y4e y4eVar = (y4e) b6eVar.b.getValue();
            long jLongValue = l.longValue();
            this.Y = 1;
            obj = y4e.d(y4eVar, null, jLongValue, this, 5);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u4eVar = this.X;
                od2.a0(obj);
                b6eVar.f.updateAndGet(new y5e(u4eVar, 0));
                q0e q0eVar = b6eVar.d;
                q0eVar.m(null, x53.t0((Collection) q0eVar.getValue(), (List) obj));
                return e5f.a;
            }
            od2.a0(obj);
        }
        u4e u4eVar2 = (u4e) obj;
        uqd uqdVarC = ((a4e) b6eVar.a.getValue()).c(u4eVar2.a);
        this.X = u4eVar2;
        this.Y = 2;
        Object objF = s36.f(uqdVarC, this);
        if (objF == tx3Var) {
            return tx3Var;
        }
        obj = objF;
        u4eVar = u4eVar2;
        b6eVar.f.updateAndGet(new y5e(u4eVar, 0));
        q0e q0eVar2 = b6eVar.d;
        q0eVar2.m(null, x53.t0((Collection) q0eVar2.getValue(), (List) obj));
        return e5f.a;
    }
}
