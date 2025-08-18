package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public final class ij4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment a;

    public ij4(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.w1;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
