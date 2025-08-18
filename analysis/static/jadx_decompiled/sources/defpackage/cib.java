package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cib extends ffe implements a66 {
    public final /* synthetic */ jib X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cib(jib jibVar, Continuation continuation) {
        super(2, continuation);
        this.X = jibVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cib) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cib(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = jib.D0;
        jib jibVar = this.X;
        e52 e52VarR = jibVar.r();
        e5f e5fVar = e5f.a;
        if (e52VarR == null || !e52VarR.Z()) {
            return e5fVar;
        }
        pk pkVar = (pk) jibVar.X.getValue();
        jibVar.w0.set(((k4a) pkVar).l(e52VarR.a, e52VarR.b.a, 0, null, true, null));
        return e5fVar;
    }
}
