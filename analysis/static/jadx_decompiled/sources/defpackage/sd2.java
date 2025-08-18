package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sd2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ td2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(td2 td2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = td2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sd2 sd2Var = (sd2) n((v50) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sd2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sd2 sd2Var = new sd2(this.Y, continuation);
        sd2Var.X = obj;
        return sd2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        td2.w(this.Y, (v50) this.X);
        return e5f.a;
    }
}
