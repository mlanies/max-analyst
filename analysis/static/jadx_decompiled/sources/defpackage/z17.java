package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class z17 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z17(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z17 z17Var = (z17) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z17Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        z17 z17Var = new z17(continuation, this.Y);
        z17Var.X = obj;
        return z17Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof x17) {
            x37 x37Var = (x37) this.Y.A0.getValue();
            x17 x17Var = (x17) wm9Var;
            String str = x17Var.b;
            x37Var.getClass();
            x37Var.a(i24.e(new ConfirmPhoneScreen(str, x17Var.c, x17Var.d), null, null), "ConfirmPhoneScreen");
        } else if (wm9Var instanceof c64) {
            du7.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
