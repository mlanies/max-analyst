package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.deeplink.LinkInterceptorWidget;

/* loaded from: classes.dex */
public final class ak7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ LinkInterceptorWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak7(LinkInterceptorWidget linkInterceptorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = linkInterceptorWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ak7 ak7Var = (ak7) n((ej7) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ak7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ak7 ak7Var = new ak7(this.Y, continuation);
        ak7Var.X = obj;
        return ak7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x02da  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak7.o(java.lang.Object):java.lang.Object");
    }
}
