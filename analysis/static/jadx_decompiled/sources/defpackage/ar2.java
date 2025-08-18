package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;

/* loaded from: classes.dex */
public final class ar2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatStatusBottomWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar2(Continuation continuation, ChatStatusBottomWidget chatStatusBottomWidget) {
        super(2, continuation);
        this.Y = chatStatusBottomWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ar2 ar2Var = (ar2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ar2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ar2 ar2Var = new ar2(continuation, this.Y);
        ar2Var.X = obj;
        return ar2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar2.o(java.lang.Object):java.lang.Object");
    }
}
