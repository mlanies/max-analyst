package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class kp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kp9 kp9Var = (kp9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kp9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kp9 kp9Var = new kp9(continuation, this.Y);
        kp9Var.X = obj;
        return kp9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Integer numE;
        Integer numE2;
        od2.a0(obj);
        Object obj2 = this.X;
        boolean z = obj2 instanceof rt7;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (z) {
            jqe jqeVar = ((rt7) obj2).c;
            neuroAvatarsScreen.a.getClass();
            CharSequence charSequenceB = jqeVar.b(neuroAvatarsScreen.getContext());
            if (charSequenceB != null) {
                wha whaVar = new wha(neuroAvatarsScreen);
                whaVar.h(charSequenceB);
                whaVar.b(null);
                View view = neuroAvatarsScreen.getView();
                whaVar.c(new eia(1, (view == null || (numE2 = br7.E(view)) == null) ? 0 : numE2.intValue(), 0, 4));
                whaVar.i();
            }
        } else if (obj2 instanceof st7) {
            st7 st7Var = (st7) obj2;
            int i = st7Var.e;
            bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
            if (neuroAvatarsScreen.o0() != null) {
                ((d80) neuroAvatarsScreen.o.getValue()).a(new c80(i));
            }
            neuroAvatarsScreen.a.getClass();
            CharSequence charSequenceB2 = st7Var.c.b(neuroAvatarsScreen.getContext());
            if (charSequenceB2 != null) {
                jqe jqeVar2 = st7Var.d;
                CharSequence charSequenceB3 = jqeVar2 != null ? jqeVar2.b(neuroAvatarsScreen.getContext()) : null;
                wha whaVar2 = new wha(neuroAvatarsScreen);
                whaVar2.h(charSequenceB2);
                whaVar2.b(charSequenceB3);
                View view2 = neuroAvatarsScreen.getView();
                whaVar2.c(new eia(1, (view2 == null || (numE = br7.E(view2)) == null) ? 0 : numE.intValue(), 0, 4));
                whaVar2.i();
            }
        }
        bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
        neuroAvatarsScreen.getClass();
        OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.w0.T0(neuroAvatarsScreen, NeuroAvatarsScreen.M0[7]);
        oneMeButton.setProgressEnabled(false);
        oneMeButton.setClickable(true);
        return e5f.a;
    }
}
