package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k91 extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k91) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k91 k91Var = new k91(2, continuation);
        k91Var.X = obj;
        return k91Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return j47.T((sx3) this.X, null, null, new j91(2, null), 3);
    }
}
