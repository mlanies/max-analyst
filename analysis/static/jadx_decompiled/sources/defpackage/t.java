package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t extends ffe implements a66 {
    public int X;
    public final /* synthetic */ v Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((t) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new t(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            v vVar = this.Y;
            q0e q0eVar = vVar.o;
            int i2 = f4a.b;
            eqe eqeVar = new eqe(g4a.b);
            ((x6a) vVar.b.getValue()).getClass();
            List listSingletonList = Collections.singletonList(new opd(i2, eqeVar, new iqe("25.8.1")));
            this.X = 1;
            q0eVar.setValue(listSingletonList);
            if (e5fVar == tx3Var) {
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
