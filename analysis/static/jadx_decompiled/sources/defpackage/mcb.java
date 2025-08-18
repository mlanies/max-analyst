package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final class mcb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mcb mcbVar = (mcb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mcbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mcb mcbVar = new mcb(continuation, this.Y);
        mcbVar.X = obj;
        return mcbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (((wm9) this.X) instanceof g43) {
            bc7[] bc7VarArr = ProfileChangeLinkScreen.v0;
            uu3 uu3Var = this.Y;
            View view = uu3Var.getView();
            if (view != null) {
                view.clearFocus();
            }
            mr0.G(uu3Var);
            uu3Var.getRouter().B(uu3Var);
        }
        return e5f.a;
    }
}
