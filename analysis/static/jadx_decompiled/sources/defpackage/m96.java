package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m96 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ z96 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m96(z96 z96Var, Continuation continuation) {
        super(2, continuation);
        this.Y = z96Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        m96 m96Var = (m96) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        m96Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m96 m96Var = new m96(this.Y, continuation);
        m96Var.X = obj;
        return m96Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.u0.setValue((List) this.X);
        return e5f.a;
    }
}
