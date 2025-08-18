package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yif extends ffe implements a66 {
    public /* synthetic */ boolean X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((yif) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yif yifVar = new yif(2, continuation);
        yifVar.X = ((Boolean) obj).booleanValue();
        return yifVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return Boolean.valueOf(this.X);
    }
}
