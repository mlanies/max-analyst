package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yqa extends ffe implements a66 {
    public final /* synthetic */ cra X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqa(cra craVar, Continuation continuation) {
        super(2, continuation);
        this.X = craVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yqa yqaVar = (yqa) n((mm3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yqaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yqa(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.d();
        return e5f.a;
    }
}
