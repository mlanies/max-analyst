package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gq5 extends ffe implements a66 {
    public /* synthetic */ int X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gq5) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gq5 gq5Var = new gq5(2, continuation);
        gq5Var.X = ((Number) obj).intValue();
        return gq5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return Boolean.valueOf(this.X > 0);
    }
}
