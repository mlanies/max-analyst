package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* loaded from: classes.dex */
public final class sz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz5(ForwardPickerScreen forwardPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
        this.Z = viewGroup;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sz5 sz5Var = (sz5) n((uy8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sz5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sz5 sz5Var = new sz5(this.Y, (ViewGroup) this.Z, continuation);
        sz5Var.X = obj;
        return sz5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        uy8 uy8Var = (uy8) this.X;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        znc zncVar = forwardPickerScreen.E0;
        if (zncVar != null) {
            int iS = au1.s(uy8Var.a);
            View view = this.Z;
            if (iS == 0) {
                hc8 hc8Var = forwardPickerScreen.G0;
                if (hc8Var != null) {
                    bc7[] bc7VarArr = hc8.m;
                    hc8Var.e(true);
                }
                forwardPickerScreen.y0().setLeftIcon(woc.a1);
                br7.d(view, ForwardPickerScreen.J0, null);
            } else if (iS == 1) {
                if (!zncVar.n()) {
                    zncVar.R(i24.e(new MediaKeyboardWidget(forwardPickerScreen.b, 0L, true, 2, null), null, null));
                }
                WeakHashMap weakHashMap = zmf.a;
                omf.u(view, null);
                hc8 hc8Var2 = forwardPickerScreen.G0;
                if (hc8Var2 != null) {
                    hc8Var2.f();
                }
                forwardPickerScreen.y0().setLeftIcon(woc.e1);
            } else if (iS == 2) {
                qm0 qm0Var = ((ForwardPickerScreen) forwardPickerScreen.F0.b).A0;
                if (qm0Var.a()) {
                    ((sv8) qm0Var.getValue()).e(true);
                }
                forwardPickerScreen.y0().setLeftIcon(woc.a1);
                od2.L(new zn5(od2.Z(new t03(vc7.f, 12), 1), new vz5((ViewGroup) view, null), 5), forwardPickerScreen.getViewLifecycleScope());
            }
        }
        return e5f.a;
    }
}
