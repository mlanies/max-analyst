package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ya6 extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ya6) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ya6 ya6Var = new ya6(2, continuation);
        ya6Var.X = obj;
        return ya6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        uj3 uj3Var = (uj3) this.X;
        return Boolean.valueOf((uj3Var == null || uj3Var.w()) ? false : true);
    }
}
