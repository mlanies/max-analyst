package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xg0 extends ffe implements c66 {
    public /* synthetic */ boolean X;

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        xg0 xg0Var = new xg0(3, (Continuation) obj3);
        xg0Var.X = zBooleanValue;
        return xg0Var.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return Boolean.valueOf(this.X);
    }
}
