package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.aq4;
import defpackage.dh8;
import defpackage.dvb;
import defpackage.e0d;
import defpackage.gaa;
import defpackage.lh8;
import defpackage.lt3;
import defpackage.ng8;
import defpackage.pg8;
import defpackage.qtb;
import defpackage.rg8;
import defpackage.s36;
import defpackage.wub;

/* loaded from: classes.dex */
public final class g extends e {
    public final View J0;
    public final ImageView K0;
    public final ProgressBar L0;
    public final TextView M0;
    public final RelativeLayout N0;
    public final CheckBox O0;
    public final float P0;
    public final int Q0;
    public final e0d R0;
    public final /* synthetic */ ng8 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ng8 ng8Var, View view) throws Resources.NotFoundException {
        super(ng8Var.x0, view, (ImageButton) view.findViewById(dvb.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(dvb.mr_cast_volume_slider));
        this.S0 = ng8Var;
        this.R0 = new e0d(9, this);
        this.J0 = view;
        this.K0 = (ImageView) view.findViewById(dvb.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(dvb.mr_cast_route_progress_bar);
        this.L0 = progressBar;
        this.M0 = (TextView) view.findViewById(dvb.mr_cast_route_name);
        this.N0 = (RelativeLayout) view.findViewById(dvb.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(dvb.mr_cast_checkbox);
        this.O0 = checkBox;
        pg8 pg8Var = ng8Var.x0;
        Context context = pg8Var.y0;
        Drawable drawableN = s36.n(context, wub.mr_cast_checkbox);
        if (lh8.i(context)) {
            aq4.g(drawableN, lt3.a(context, lh8.a));
        }
        checkBox.setButtonDrawable(drawableN);
        lh8.j(pg8Var.y0, progressBar);
        this.P0 = lh8.d(pg8Var.y0);
        Resources resources = pg8Var.y0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(qtb.mr_dynamic_dialog_row_height, typedValue, true);
        this.Q0 = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean D(dh8 dh8Var) {
        if (dh8Var.g()) {
            return true;
        }
        gaa gaaVarB = this.S0.x0.t0.b(dh8Var);
        if (gaaVarB != null) {
            rg8 rg8Var = (rg8) gaaVarB.a;
            if ((rg8Var != null ? rg8Var.b : 1) == 3) {
                return true;
            }
        }
        return false;
    }

    public final void E(boolean z, boolean z2) {
        CheckBox checkBox = this.O0;
        checkBox.setEnabled(false);
        this.J0.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.K0.setVisibility(4);
            this.L0.setVisibility(0);
        }
        if (z2) {
            this.S0.C(this.N0, z ? this.Q0 : 0);
        }
    }
}
