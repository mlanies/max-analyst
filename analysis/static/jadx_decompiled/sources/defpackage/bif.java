package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bif extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dif Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bif(dif difVar, Continuation continuation) {
        super(2, continuation);
        this.Y = difVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bif bifVar = (bif) n((ijf) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bifVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bif bifVar = new bif(this.Y, continuation);
        bifVar.X = obj;
        return bifVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        dif.i(this.Y, (ijf) this.X);
        return e5f.a;
    }
}
