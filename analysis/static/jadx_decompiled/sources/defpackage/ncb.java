package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final class ncb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ncb ncbVar = (ncb) n((m22) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ncbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ncb ncbVar = new ncb(continuation, this.Y);
        ncbVar.X = obj;
        return ncbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        m22 m22Var = (m22) this.X;
        bc7[] bc7VarArr = ProfileChangeLinkScreen.v0;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.Y;
        profileChangeLinkScreen.o0().setTitle(m22Var.a);
        ProfileChangeLinkScreen.m0(profileChangeLinkScreen).setEnabled(m22Var.c);
        ProfileChangeLinkScreen.m0(profileChangeLinkScreen).setProgressEnabled(m22Var.d);
        int iOrdinal = profileChangeLinkScreen.n0().ordinal();
        if (iOrdinal == 0) {
            ProfileChangeLinkScreen.m0(profileChangeLinkScreen).setVisibility(0);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ProfileChangeLinkScreen.m0(profileChangeLinkScreen).setVisibility(m22Var.b ? 0 : 8);
        }
        return e5f.a;
    }
}
