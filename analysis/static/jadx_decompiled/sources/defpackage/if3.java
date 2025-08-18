package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class if3 extends ffe implements a66 {
    public /* synthetic */ boolean X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((if3) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        if3 if3Var = new if3(2, continuation);
        if3Var.X = ((Boolean) obj).booleanValue();
        return if3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return Boolean.valueOf(this.X);
    }
}
