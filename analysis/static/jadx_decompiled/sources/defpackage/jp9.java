package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class jp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jp9 jp9Var = (jp9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jp9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jp9 jp9Var = new jp9(continuation, this.Y);
        jp9Var.X = obj;
        return jp9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        k4d k4dVar = (k4d) this.X;
        j4d j4dVar = k4dVar.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (j4dVar != null) {
            bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
            neuroAvatarsScreen.p0().setAvatarUrl(k4dVar.a.a());
        } else {
            bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
            neuroAvatarsScreen.p0().setCloseBadgeVisibility(false);
            i2b i2bVar = i2b.a;
            l2b l2bVar = k4dVar.b;
            if (tpa.f(l2bVar, i2bVar)) {
                neuroAvatarsScreen.p0().setAvatarUrl(null);
                s5a.j(neuroAvatarsScreen.p0(), (Drawable) neuroAvatarsScreen.L0.getValue(), null, 30);
            } else if (l2bVar instanceof h2b) {
                h2b h2bVar = (h2b) l2bVar;
                s5a.i(neuroAvatarsScreen.p0(), null, new Long(h2bVar.b), h2bVar.a);
            } else if (l2bVar instanceof k2b) {
                neuroAvatarsScreen.p0().setAvatarUrl(((k2b) l2bVar).a);
            } else {
                if (!(l2bVar instanceof j2b)) {
                    throw new NoWhenBranchMatchedException();
                }
                neuroAvatarsScreen.p0().setAvatarUrl(((j2b) l2bVar).a);
            }
        }
        return e5f.a;
    }
}
