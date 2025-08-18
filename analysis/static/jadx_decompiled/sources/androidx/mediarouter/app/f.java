package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import defpackage.dvb;
import defpackage.ng8;
import defpackage.qtb;

/* loaded from: classes.dex */
public final class f extends e {
    public final TextView J0;
    public final int K0;
    public final /* synthetic */ ng8 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ng8 ng8Var, View view) throws Resources.NotFoundException {
        super(ng8Var.x0, view, (ImageButton) view.findViewById(dvb.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(dvb.mr_cast_volume_slider));
        this.L0 = ng8Var;
        this.J0 = (TextView) view.findViewById(dvb.mr_group_volume_route_name);
        Resources resources = ng8Var.x0.y0.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(qtb.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.K0 = (int) typedValue.getDimension(displayMetrics);
    }
}
