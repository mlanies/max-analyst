package defpackage;

import androidx.recyclerview.widget.a;
import com.google.android.material.tabs.TabLayout;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class mp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mp9 mp9Var = (mp9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mp9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mp9 mp9Var = new mp9(continuation, this.Y);
        mp9Var.X = obj;
        return mp9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ro9 ro9Var = (ro9) this.X;
        Integer num = ro9Var.b;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (num != null && num.intValue() >= 0) {
            bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
            neuroAvatarsScreen.n0().E0();
            neuroAvatarsScreen.J0.c = true;
            dp9 dp9Var = new dp9(neuroAvatarsScreen.getContext(), 0);
            dp9Var.a = num.intValue();
            a layoutManager = neuroAvatarsScreen.n0().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.J0(dp9Var);
            }
        }
        int i = ro9Var.a;
        if (i >= 0) {
            bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
            if (neuroAvatarsScreen.q0().getSelectedTabPosition() != i) {
                neuroAvatarsScreen.q0().stopNestedScroll();
                eje ejeVarH = neuroAvatarsScreen.q0().h(i);
                if (ejeVarH != null) {
                    TabLayout tabLayout = ejeVarH.f;
                    if (tabLayout == null) {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    tabLayout.o(ejeVarH, true);
                }
            }
        }
        return e5f.a;
    }
}
