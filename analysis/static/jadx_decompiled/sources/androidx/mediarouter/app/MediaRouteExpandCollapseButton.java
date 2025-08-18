package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.kt3;
import defpackage.lh8;
import defpackage.n1c;
import defpackage.wub;

/* loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final AnimationDrawable o;
    public final AnimationDrawable s0;
    public final String t0;
    public final String u0;
    public boolean v0;
    public View.OnClickListener w0;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) kt3.b(context, wub.mr_group_expand);
        this.o = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) kt3.b(context, wub.mr_group_collapse);
        this.s0 = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(lh8.c(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(n1c.mr_controller_expand_group);
        this.t0 = string;
        this.u0 = context.getString(n1c.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new h(this));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.w0 = onClickListener;
    }
}
