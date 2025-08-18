package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class ip9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ip9 ip9Var = (ip9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ip9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ip9 ip9Var = new ip9(continuation, this.Y);
        ip9Var.X = obj;
        return ip9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ed0 ed0Var = (ed0) this.X;
        boolean zF = tpa.f(ed0Var, bd0.a);
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (zF) {
            bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
            ((eua) neuroAvatarsScreen.z0.getValue()).g(new l5g(neuroAvatarsScreen, 1));
        } else if (ed0Var instanceof cd0) {
            try {
                neuroAvatarsScreen.startActivityForResult(((cd0) ed0Var).a, 555);
                an9.g((an9) neuroAvatarsScreen.A0.getValue(), wuc.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                hm9.p(neuroAvatarsScreen.getClass().getName(), "failed open camera", null);
                neuroAvatarsScreen.r0().b.a();
            }
        } else {
            if (!(ed0Var instanceof dd0)) {
                throw new NoWhenBranchMatchedException();
            }
            neuroAvatarsScreen.startActivityForResult(((dd0) ed0Var).a, 666);
        }
        return e5f.a;
    }
}
