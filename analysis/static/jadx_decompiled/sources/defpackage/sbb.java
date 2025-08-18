package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* loaded from: classes2.dex */
public final class sbb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbb(Continuation continuation, ProfileAvatarsScreen profileAvatarsScreen) {
        super(2, continuation);
        this.Y = profileAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sbb sbbVar = (sbb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sbbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sbb sbbVar = new sbb(continuation, this.Y);
        sbbVar.X = obj;
        return sbbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        acb acbVar = (acb) this.X;
        boolean zF = tpa.f(acbVar, zbb.a);
        ProfileAvatarsScreen profileAvatarsScreen = this.Y;
        if (zF) {
            bc7[] bc7VarArr = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.x0(true);
        } else if (tpa.f(acbVar, vbb.a)) {
            bc7[] bc7VarArr2 = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.x0(false);
        } else if (tpa.f(acbVar, ubb.a)) {
            bc7[] bc7VarArr3 = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.getRouter().C();
        } else if (acbVar instanceof xbb) {
            bc7[] bc7VarArr4 = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.getClass();
            String str = o37.a;
            o37.c(profileAvatarsScreen.getContext(), ((xbb) acbVar).a, "image/*");
        } else if (acbVar instanceof wbb) {
            wbb wbbVar = (wbb) acbVar;
            bc7[] bc7VarArr5 = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.getClass();
            CharSequence charSequenceB = wbbVar.a.b(profileAvatarsScreen.getContext());
            if (charSequenceB != null) {
                int i = wbbVar.b ? woc.I : woc.n;
                wha whaVar = new wha(profileAvatarsScreen);
                whaVar.e(new kia(i));
                whaVar.h(charSequenceB);
                whaVar.i();
            }
        } else {
            if (!(acbVar instanceof ybb)) {
                throw new NoWhenBranchMatchedException();
            }
            ybb ybbVar = (ybb) acbVar;
            int size = profileAvatarsScreen.w0.w0.size();
            int i2 = ybbVar.a;
            if (i2 >= 0 && i2 < size) {
                profileAvatarsScreen.C0().e(ybbVar.a, true);
            }
        }
        return e5f.a;
    }
}
