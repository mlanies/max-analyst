package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xh5 extends ffe implements a66 {
    public final /* synthetic */ bi5 X;
    public final /* synthetic */ List Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh5(bi5 bi5Var, List list, Continuation continuation) {
        super(2, continuation);
        this.X = bi5Var;
        this.Y = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xh5 xh5Var = (xh5) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xh5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xh5(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bi5.a(this.X, this.Y);
        return e5f.a;
    }
}
