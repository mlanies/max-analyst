package androidx.appcompat.app;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import defpackage.fn;

/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog h1() {
        return new fn(d0(), g1());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void j1(Dialog dialog, int i) {
        if (!(dialog instanceof fn)) {
            super.j1(dialog, i);
            return;
        }
        fn fnVar = (fn) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        fnVar.d().f(1);
    }
}
