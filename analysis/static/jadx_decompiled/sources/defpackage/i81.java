package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* loaded from: classes.dex */
public final class i81 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ CallHistoryPageScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = callHistoryPageScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        i81 i81Var = (i81) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        i81Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i81 i81Var = new i81(this.Y, continuation);
        i81Var.X = ((Boolean) obj).booleanValue();
        return i81Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        od2.a0(obj);
        boolean z = this.X;
        buc bucVar = CallHistoryPageScreen.u0;
        q0e q0eVar = this.Y.o0().v0;
        do {
            value = q0eVar.getValue();
            ((Boolean) value).getClass();
        } while (!q0eVar.c(value, Boolean.valueOf(z)));
        return e5f.a;
    }
}
