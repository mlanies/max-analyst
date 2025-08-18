package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zhb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jib Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(jib jibVar, Continuation continuation) {
        super(2, continuation);
        this.Y = jibVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zhb zhbVar = (zhb) n((e52) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zhbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zhb zhbVar = new zhb(this.Y, continuation);
        zhbVar.X = obj;
        return zhbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e52 e52Var = (e52) this.X;
        if (e52Var.J() && !e52Var.z()) {
            pnf.o(this.Y.B0, g43.b);
        }
        return e5f.a;
    }
}
