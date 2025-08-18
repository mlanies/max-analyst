package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import defpackage.aq4;
import defpackage.dec;
import defpackage.dh8;
import defpackage.dtb;
import defpackage.e0d;
import defpackage.lh8;
import defpackage.lt3;
import defpackage.pg8;
import defpackage.s36;
import defpackage.wub;

/* loaded from: classes.dex */
public abstract class e extends dec {
    public dh8 F0;
    public final ImageButton G0;
    public final MediaRouteVolumeSlider H0;
    public final /* synthetic */ pg8 I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pg8 pg8Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int iA;
        int iA2;
        super(view);
        this.I0 = pg8Var;
        this.G0 = imageButton;
        this.H0 = mediaRouteVolumeSlider;
        Context context = pg8Var.y0;
        int i = wub.mr_cast_mute_button;
        int i2 = lh8.a;
        Drawable drawableN = s36.n(context, i);
        if (lh8.i(context)) {
            aq4.g(drawableN, lt3.a(context, lh8.a));
        }
        imageButton.setImageDrawable(drawableN);
        Context context2 = pg8Var.y0;
        if (lh8.i(context2)) {
            iA = lt3.a(context2, dtb.mr_cast_progressbar_progress_and_thumb_light);
            iA2 = lt3.a(context2, dtb.mr_cast_progressbar_background_light);
        } else {
            iA = lt3.a(context2, dtb.mr_cast_progressbar_progress_and_thumb_dark);
            iA2 = lt3.a(context2, dtb.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(iA, iA2);
    }

    public final void A(dh8 dh8Var) {
        this.F0 = dh8Var;
        int i = dh8Var.o;
        boolean z = i == 0;
        ImageButton imageButton = this.G0;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new e0d(7, this));
        dh8 dh8Var2 = this.F0;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.H0;
        mediaRouteVolumeSlider.setTag(dh8Var2);
        mediaRouteVolumeSlider.setMax(dh8Var.p);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.I0.F0);
    }

    public final void B(boolean z) {
        ImageButton imageButton = this.G0;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        pg8 pg8Var = this.I0;
        if (z) {
            pg8Var.I0.put(this.F0.c, Integer.valueOf(this.H0.getProgress()));
        } else {
            pg8Var.I0.remove(this.F0.c);
        }
    }
}
