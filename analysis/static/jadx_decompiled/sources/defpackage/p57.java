package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* loaded from: classes2.dex */
public final class p57 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p57(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p57 p57Var = (p57) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p57Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p57 p57Var = new p57(continuation, this.Y);
        p57Var.X = obj;
        return p57Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof c64) {
            e57.c.R1((c64) wm9Var);
        }
        InviteByPhoneScreen inviteByPhoneScreen = this.Y;
        mr0.G(inviteByPhoneScreen);
        View view = inviteByPhoneScreen.getView();
        if (view != null) {
            view.postDelayed(new nn6(4, inviteByPhoneScreen), 600L);
        }
        return e5f.a;
    }
}
