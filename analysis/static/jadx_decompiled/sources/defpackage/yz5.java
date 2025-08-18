package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class yz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz5(ForwardPickerScreen forwardPickerScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yz5) n((Set) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yz5 yz5Var = new yz5(this.Y, this.Z, continuation);
        yz5Var.X = obj;
        return yz5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        Set set = (Set) this.X;
        bc7[] bc7VarArr = ForwardPickerScreen.I0;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        boolean zB0 = forwardPickerScreen.B0();
        e5f e5fVar = e5f.a;
        if (!zB0 && set.size() == 1) {
            ((iz5) forwardPickerScreen.v0().c).h(null, set, forwardPickerScreen.B0());
            return e5fVar;
        }
        int size = set.size();
        boolean z = forwardPickerScreen.y0().getVisibility() == 0;
        AutoTransition autoTransition = forwardPickerScreen.z0;
        View view = this.Z;
        if (!z && size > 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            ((iz5) forwardPickerScreen.v0().c).f();
            forwardPickerScreen.z0().setVisibility(0);
            forwardPickerScreen.y0().setVisibility(0);
        } else if (z && size == 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            forwardPickerScreen.z0().setVisibility(8);
            qm0 qm0Var = forwardPickerScreen.A0;
            if (qm0Var.a()) {
                ((sv8) qm0Var.getValue()).setVisibility(8);
            }
            znc zncVar = forwardPickerScreen.E0;
            if (zncVar == null || !zncVar.n()) {
                int i = vc7.a;
                if (vc7.b(vc7.c)) {
                    forwardPickerScreen.F0.m();
                }
            } else {
                ((iz5) forwardPickerScreen.v0().c).r.z(1);
            }
        }
        return e5fVar;
    }
}
