package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import defpackage.dy7;
import defpackage.fn;
import defpackage.gg8;
import defpackage.qf8;
import defpackage.wg8;
import defpackage.wsb;

/* loaded from: classes.dex */
public class MediaRouteChooserDialogFragment extends DialogFragment {
    public final boolean B1 = false;
    public fn C1;
    public wg8 D1;

    public MediaRouteChooserDialogFragment() {
        this.r1 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        if (this.B1) {
            gg8 gg8Var = new gg8(d0());
            this.C1 = gg8Var;
            l1();
            gg8Var.h(this.D1);
        } else {
            qf8 qf8Var = new qf8(d0());
            this.C1 = qf8Var;
            l1();
            qf8Var.h(this.D1);
        }
        return this.C1;
    }

    public final void l1() {
        if (this.D1 == null) {
            Bundle bundle = this.Z;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("selector");
                wg8 wg8Var = null;
                if (bundle2 != null) {
                    wg8Var = new wg8(null, bundle2);
                } else {
                    wg8 wg8Var2 = wg8.c;
                }
                this.D1 = wg8Var;
            }
            if (this.D1 == null) {
                this.D1 = wg8.c;
            }
        }
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        fn fnVar = this.C1;
        if (fnVar == null) {
            return;
        }
        if (!this.B1) {
            qf8 qf8Var = (qf8) fnVar;
            qf8Var.getWindow().setLayout(dy7.v(qf8Var.getContext()), -2);
        } else {
            gg8 gg8Var = (gg8) fnVar;
            Context context = gg8Var.s0;
            gg8Var.getWindow().setLayout(!context.getResources().getBoolean(wsb.is_tablet) ? -1 : dy7.v(context), context.getResources().getBoolean(wsb.is_tablet) ? -2 : -1);
        }
    }
}
