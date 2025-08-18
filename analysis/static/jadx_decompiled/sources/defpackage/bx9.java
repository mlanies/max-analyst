package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bx9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gx9 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx9(gx9 gx9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = gx9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bx9 bx9Var = (bx9) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bx9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bx9 bx9Var = new bx9(this.Y, continuation);
        bx9Var.X = obj;
        return bx9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.Z.setValue((List) this.X);
        return e5f.a;
    }
}
