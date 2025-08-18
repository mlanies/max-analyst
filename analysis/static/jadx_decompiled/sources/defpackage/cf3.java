package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final class cf3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cf3 cf3Var = (cf3) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cf3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cf3 cf3Var = new cf3(this.Y, continuation);
        cf3Var.X = obj;
        return cf3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof we3;
        e5f e5fVar = e5f.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.Y;
        if (z) {
            ((ita) lt7.a.getAccessor().c(ita.class)).c();
            mr0.G(confirmPhoneScreen);
            du7 du7Var = du7.c;
            du7Var.getClass();
            du7Var.P1().b(":chat-list", null);
        } else if (wm9Var instanceof xe3) {
            x37 x37Var = (x37) confirmPhoneScreen.s0.getValue();
            xe3 xe3Var = (xe3) wm9Var;
            String str = xe3Var.b;
            bc7 bc7Var = ConfirmPhoneScreen.C0[1];
            String str2 = (String) confirmPhoneScreen.o.a(confirmPhoneScreen);
            x37Var.getClass();
            x37Var.a(i24.e(new InputNameScreen(str, str2, xe3Var.c), null, null), "InputNameScreen");
        } else if (wm9Var instanceof c64) {
            mr0.G(confirmPhoneScreen);
            du7.c.R1((c64) wm9Var);
        }
        return e5fVar;
    }
}
