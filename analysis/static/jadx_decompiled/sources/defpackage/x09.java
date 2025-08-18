package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class x09 extends ffe implements a66 {
    public /* synthetic */ int X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        x09 x09Var = (x09) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        e5f e5fVar = e5f.a;
        x09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        x09 x09Var = new x09(continuation, this.Y);
        x09Var.X = ((Number) obj).intValue();
        return x09Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        od2.a0(obj);
        int i = this.X;
        bc7[] bc7VarArr = MessageWriteWidget.F0;
        q0e q0eVar = this.Y.w0().H0;
        do {
            value = q0eVar.getValue();
            ((Number) value).intValue();
        } while (!q0eVar.c(value, Integer.valueOf(i)));
        return e5f.a;
    }
}
