package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class eg8 extends dec {
    public final View F0;
    public final ImageView G0;
    public final ProgressBar H0;
    public final TextView I0;
    public final /* synthetic */ fg8 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg8(fg8 fg8Var, View view) {
        super(view);
        this.J0 = fg8Var;
        this.F0 = view;
        this.G0 = (ImageView) view.findViewById(dvb.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(dvb.mr_picker_route_progress_bar);
        this.H0 = progressBar;
        this.I0 = (TextView) view.findViewById(dvb.mr_picker_route_name);
        lh8.j(fg8Var.u0.s0, progressBar);
    }
}
