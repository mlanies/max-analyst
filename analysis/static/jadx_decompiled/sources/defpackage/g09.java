package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class g09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        g09 g09Var = (g09) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        g09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        g09 g09Var = new g09(continuation, this.Y);
        g09Var.X = obj;
        return g09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g09.o(java.lang.Object):java.lang.Object");
    }
}
