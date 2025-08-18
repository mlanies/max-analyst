package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gc8 extends ffe implements a66 {
    public final /* synthetic */ hc8 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc8(hc8 hc8Var, Continuation continuation) {
        super(2, continuation);
        this.X = hc8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        gc8 gc8Var = (gc8) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gc8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gc8(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        hc8 hc8Var = this.X;
        hc8Var.e(!hc8Var.e);
        hc8Var.h.invoke();
        return e5f.a;
    }
}
