package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vfe extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cge Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfe(cge cgeVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cgeVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vfe vfeVar = (vfe) n((v6f) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vfeVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vfe vfeVar = new vfe(this.Y, continuation);
        vfeVar.X = obj;
        return vfeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        v6f v6fVar = (v6f) this.X;
        String str = this.Y.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "uploadFile: " + v6fVar, null);
        }
        return e5f.a;
    }
}
