package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class i68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ u4d Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i68(Continuation continuation, u4d u4dVar) {
        super(2, continuation);
        this.Y = u4dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        i68 i68Var = (i68) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        i68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i68 i68Var = new i68(continuation, this.Y);
        i68Var.X = obj;
        return i68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.E((List) this.X);
        return e5f.a;
    }
}
