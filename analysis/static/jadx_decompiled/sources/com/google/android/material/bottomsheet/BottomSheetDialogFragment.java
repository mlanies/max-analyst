package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatDialogFragment;
import defpackage.gr0;
import defpackage.ir0;
import java.util.ArrayList;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public boolean B1;

    @Override // androidx.fragment.app.DialogFragment
    public final void e1() throws Resources.NotFoundException {
        Dialog dialog = this.w1;
        if (dialog instanceof ir0) {
            ir0 ir0Var = (ir0) dialog;
            BottomSheetBehavior bottomSheetBehaviorH = ir0Var.h();
            if (bottomSheetBehaviorH.I && ir0Var.u0) {
                this.B1 = true;
                if (bottomSheetBehaviorH.L == 5) {
                    l1();
                    return;
                }
                Dialog dialog2 = this.w1;
                if (dialog2 instanceof ir0) {
                    ir0 ir0Var2 = (ir0) dialog2;
                    BottomSheetBehavior bottomSheetBehavior = ir0Var2.Y;
                    bottomSheetBehavior.W.remove(ir0Var2.B0);
                }
                gr0 gr0Var = new gr0(1, (ScheduledSendPickerDialogFragment) this);
                ArrayList arrayList = bottomSheetBehaviorH.W;
                if (!arrayList.contains(gr0Var)) {
                    arrayList.add(gr0Var);
                }
                bottomSheetBehaviorH.K(5);
                return;
            }
        }
        super.e1();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog h1() {
        return new ir0(d0(), g1());
    }

    public final void l1() {
        if (this.B1) {
            super.e1();
        } else {
            f1(false, false);
        }
    }
}
