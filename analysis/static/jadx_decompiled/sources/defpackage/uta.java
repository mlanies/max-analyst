package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uta extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aua Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uta(aua auaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = auaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uta utaVar = (uta) n((bua) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        utaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uta utaVar = new uta(this.Y, continuation);
        utaVar.X = obj;
        return utaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bua buaVar = (bua) this.X;
        aua auaVar = this.Y;
        aua.a(auaVar, "push", aua.b(auaVar, buaVar));
        return e5f.a;
    }
}
