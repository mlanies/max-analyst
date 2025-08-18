package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xqa extends ffe implements a66 {
    public final /* synthetic */ cra X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqa(cra craVar, Continuation continuation) {
        super(2, continuation);
        this.X = craVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        xqa xqaVar = (xqa) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xqaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xqa(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.d();
        return e5f.a;
    }
}
