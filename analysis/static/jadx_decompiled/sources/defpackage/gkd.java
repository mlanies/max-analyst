package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class gkd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ShareDataPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkd(ShareDataPickerScreen shareDataPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.Y = shareDataPickerScreen;
        this.Z = viewGroup;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gkd gkdVar = (gkd) n((uy8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gkdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gkd gkdVar = new gkd(this.Y, (ViewGroup) this.Z, continuation);
        gkdVar.X = obj;
        return gkdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        uy8 uy8Var = (uy8) this.X;
        ShareDataPickerScreen shareDataPickerScreen = this.Y;
        znc zncVar = shareDataPickerScreen.A0;
        if (zncVar != null) {
            int iS = au1.s(uy8Var.a);
            View view = this.Z;
            if (iS == 0) {
                hc8 hc8Var = shareDataPickerScreen.C0;
                if (hc8Var != null) {
                    bc7[] bc7VarArr = hc8.m;
                    hc8Var.e(true);
                }
                shareDataPickerScreen.x0().setLeftIcon(woc.a1);
                br7.d(view, ShareDataPickerScreen.E0, null);
            } else if (iS == 1) {
                if (!zncVar.n()) {
                    zncVar.R(i24.e(new MediaKeyboardWidget(shareDataPickerScreen.b, 0L, true, 2, null), null, null));
                }
                WeakHashMap weakHashMap = zmf.a;
                omf.u(view, null);
                hc8 hc8Var2 = shareDataPickerScreen.C0;
                if (hc8Var2 != null) {
                    hc8Var2.f();
                }
                shareDataPickerScreen.x0().setLeftIcon(woc.e1);
            } else if (iS == 2) {
                qm0 qm0Var = ((ShareDataPickerScreen) shareDataPickerScreen.B0.b).x0;
                if (qm0Var.a()) {
                    ((sv8) qm0Var.getValue()).e(true);
                }
                shareDataPickerScreen.x0().setLeftIcon(woc.a1);
                od2.L(new zn5(od2.Z(new ovc(vc7.f, 3), 1), new ikd((ViewGroup) view, null), 5), shareDataPickerScreen.getViewLifecycleScope());
            }
        }
        return e5f.a;
    }
}
