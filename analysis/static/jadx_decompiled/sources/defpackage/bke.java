package defpackage;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import kotlin.coroutines.Continuation;
import ru.ok.TamBottomSheetDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* loaded from: classes2.dex */
public final class bke extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ TamBottomSheetDialogFragment Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bke(TamBottomSheetDialogFragment tamBottomSheetDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = tamBottomSheetDialogFragment;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bke bkeVar = (bke) n((sme) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bkeVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bke bkeVar = new bke(this.Y, continuation);
        bkeVar.X = obj;
        return bkeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Window window;
        od2.a0(obj);
        sme smeVar = (sme) this.X;
        TamBottomSheetDialogFragment tamBottomSheetDialogFragment = this.Y;
        Dialog dialog = tamBottomSheetDialogFragment.w1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(smeVar.c ? systemUiVisibility & (-17) : systemUiVisibility | 16);
            window.setNavigationBarColor(smeVar.H);
        }
        View view = tamBottomSheetDialogFragment.U0;
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setBackgroundTintList(ColorStateList.valueOf(smeVar.m));
        }
        ((ScheduledSendPickerDialogFragment) tamBottomSheetDialogFragment).z(smeVar);
        return e5f.a;
    }
}
