package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aif extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dif Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aif(dif difVar, Continuation continuation) {
        super(2, continuation);
        this.Y = difVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        aif aifVar = (aif) n((b00) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        aifVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        aif aifVar = new aif(this.Y, continuation);
        aifVar.X = obj;
        return aifVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        b00 b00Var = (b00) this.X;
        bc7[] bc7VarArr = dif.L0;
        this.Y.y(b00Var);
        return e5f.a;
    }
}
