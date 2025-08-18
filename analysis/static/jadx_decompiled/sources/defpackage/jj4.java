package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public final class jj4 extends br7 {
    public final /* synthetic */ br7 t0;
    public final /* synthetic */ DialogFragment u0;

    public jj4(DialogFragment dialogFragment, v06 v06Var) {
        this.u0 = dialogFragment;
        this.t0 = v06Var;
    }

    @Override // defpackage.br7
    public final View J(int i) {
        br7 br7Var = this.t0;
        if (br7Var.K()) {
            return br7Var.J(i);
        }
        Dialog dialog = this.u0.w1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.br7
    public final boolean K() {
        return this.t0.K() || this.u0.A1;
    }
}
