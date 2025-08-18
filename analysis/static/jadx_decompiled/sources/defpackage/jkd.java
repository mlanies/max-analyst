package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class jkd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ShareDataPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkd(ShareDataPickerScreen shareDataPickerScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = shareDataPickerScreen;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jkd jkdVar = (jkd) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jkdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jkd jkdVar = new jkd(this.Y, this.Z, continuation);
        jkdVar.X = obj;
        return jkdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int size = ((Set) this.X).size();
        bc7[] bc7VarArr = ShareDataPickerScreen.D0;
        ShareDataPickerScreen shareDataPickerScreen = this.Y;
        boolean z = shareDataPickerScreen.x0().getVisibility() == 0;
        AutoTransition autoTransition = shareDataPickerScreen.w0;
        View view = this.Z;
        if (!z && size > 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            shareDataPickerScreen.x0().setVisibility(0);
        } else if (z && size == 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            qm0 qm0Var = shareDataPickerScreen.x0;
            if (qm0Var.a()) {
                ((sv8) qm0Var.getValue()).setVisibility(8);
            }
            znc zncVar = shareDataPickerScreen.A0;
            if (zncVar == null || !zncVar.n()) {
                int i = vc7.a;
                if (vc7.b(vc7.c)) {
                    shareDataPickerScreen.B0.m();
                }
            } else {
                ((ckd) shareDataPickerScreen.v0().c).k.z(1);
            }
        }
        return e5f.a;
    }
}
