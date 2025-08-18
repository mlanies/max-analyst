package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class kg8 extends dec {
    public final View F0;
    public final ImageView G0;
    public final ProgressBar H0;
    public final TextView I0;
    public final float J0;
    public dh8 K0;
    public final /* synthetic */ ng8 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg8(ng8 ng8Var, View view) {
        super(view);
        this.L0 = ng8Var;
        this.F0 = view;
        this.G0 = (ImageView) view.findViewById(dvb.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(dvb.mr_cast_group_progress_bar);
        this.H0 = progressBar;
        this.I0 = (TextView) view.findViewById(dvb.mr_cast_group_name);
        this.J0 = lh8.d(ng8Var.x0.y0);
        lh8.j(ng8Var.x0.y0, progressBar);
    }
}
