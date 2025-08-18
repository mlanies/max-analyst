package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dhf extends ffe implements a66 {
    public final /* synthetic */ jhf X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhf(jhf jhfVar, Continuation continuation) {
        super(2, continuation);
        this.X = jhfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dhf dhfVar = (dhf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dhfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dhf(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        dkf dkfVar = this.X.d().X;
        if (dkfVar != null) {
            dkfVar.N0();
        }
        return e5f.a;
    }
}
