package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class eb9 extends ConstraintLayout implements kre {
    public db9 G0;
    public final ImageView H0;
    public final TextView I0;
    public final TextView J0;
    public final ImageView K0;
    public final ImageView L0;
    public final wh7 M0;

    public eb9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        db9 db9Var = db9.a;
        this.G0 = db9Var;
        ImageView imageView = new ImageView(getContext());
        cb9 cb9Var = cb9.PLAYBACK;
        imageView.setId(cb9Var.a);
        float f = 40;
        ti3 ti3Var = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti3Var.t = 0;
        float f2 = 4;
        ti3Var.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        ti3Var.i = 0;
        ti3Var.l = 0;
        imageView.setLayoutParams(ti3Var);
        imageView.setBackground(getSelectableItemOvalBackground());
        pq9 pq9Var = qp4.u0;
        imageView.setColorFilter(pq9Var.j(imageView).getIcon().k);
        rh4.p(8, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(pub.ic_play_24_filled);
        this.H0 = imageView;
        TextView textView = new TextView(getContext());
        cb9 cb9Var2 = cb9.TITLE;
        textView.setId(cb9Var2.a);
        ti3 ti3Var2 = new ti3(0, -2);
        int i = cb9Var2.a;
        textView.setId(i);
        ti3Var2.i = 0;
        int i2 = cb9Var.a;
        ti3Var2.s = i2;
        cb9 cb9Var3 = cb9.SPEED;
        ti3Var2.u = cb9Var3.a;
        cb9 cb9Var4 = cb9.SUBTITLE;
        ti3Var2.k = cb9Var4.a;
        ti3Var2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        float f3 = 6;
        ((ViewGroup.MarginLayoutParams) ti3Var2).topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        textView.setLayoutParams(ti3Var2);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        i4f.q.b(textView, du4.b);
        textView.setTextColor(pq9Var.j(textView).getText().e);
        this.I0 = textView;
        TextView textView2 = new TextView(getContext());
        textView2.setId(cb9Var4.a);
        ti3 ti3Var3 = new ti3(0, -2);
        ti3Var3.j = i;
        ((ViewGroup.MarginLayoutParams) ti3Var3).topMargin = tu0.G(3 * fk4.d().getDisplayMetrics().density);
        ti3Var3.s = i2;
        ti3Var3.setMarginStart(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        int i3 = cb9Var3.a;
        ti3Var3.u = i3;
        ti3Var3.l = 0;
        ((ViewGroup.MarginLayoutParams) ti3Var3).bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        textView2.setLayoutParams(ti3Var3);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        i4f.s.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().g);
        this.J0 = textView2;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(i3);
        ti3 ti3Var4 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        cb9 cb9Var5 = cb9.CLOSE;
        ti3Var4.u = cb9Var5.a;
        ti3Var4.i = 0;
        ti3Var4.l = 0;
        int iG = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
        imageView2.setPadding(iG, iG, iG, iG);
        imageView2.setLayoutParams(ti3Var4);
        imageView2.setBackground(getSelectableItemOvalBackground());
        w(imageView2, db9Var);
        this.K0 = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setId(cb9Var5.a);
        ti3 ti3Var5 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        ti3Var5.v = 0;
        ti3Var5.i = 0;
        ti3Var5.l = 0;
        int iG2 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        imageView3.setPadding(iG2, iG2, iG2, iG2);
        imageView3.setLayoutParams(ti3Var5);
        imageView3.setImageResource(pub.cross_16);
        imageView3.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView3).getIcon().j));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.L0 = imageView3;
        wh7 wh7Var = new wh7(getContext(), null, tsb.linearProgressIndicatorStyle, wh7.A0);
        xh7 xh7Var = (xh7) wh7Var.a;
        nh7 nh7Var = new nh7(xh7Var);
        nh7Var.b = 300.0f;
        Context context2 = wh7Var.getContext();
        wh7Var.setIndeterminateDrawable(new tz6(context2, xh7Var, nh7Var, xh7Var.h == 0 ? new oh7(xh7Var) : new qh7(context2, xh7Var)));
        wh7Var.setProgressDrawable(new di4(wh7Var.getContext(), xh7Var, nh7Var));
        wh7Var.setId(cb9.PROGRESS.a);
        float f4 = 2;
        ti3 ti3Var6 = new ti3(-1, tu0.G(fk4.d().getDisplayMetrics().density * f4));
        ti3Var6.l = 0;
        wh7Var.setLayoutParams(ti3Var6);
        wh7Var.setTrackCornerRadius(tu0.G(10 * fk4.d().getDisplayMetrics().density));
        wh7Var.setTrackThickness(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        wh7Var.setMin(0);
        wh7Var.setMax(1000);
        wh7Var.setProgress(0);
        wh7Var.setTrackColor(0);
        wh7Var.setIndicatorColor(pq9Var.j(wh7Var).b().a.m);
        this.M0 = wh7Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(imageView2);
        addView(imageView3);
        addView(wh7Var);
    }

    private final Drawable getSelectableItemOvalBackground() {
        return new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this).d().a.a.d), null, new ShapeDrawable(new OvalShape()));
    }

    public final ImageView getCloseButton() {
        return this.L0;
    }

    public final ImageView getPlaybackButton() {
        return this.H0;
    }

    public final db9 getPlaybackSpeed() {
        return this.G0;
    }

    public final ImageView getPlaybackSpeedButton() {
        return this.K0;
    }

    public final wh7 getProgress() {
        return this.M0;
    }

    public final TextView getSubtitle() {
        return this.J0;
    }

    public final TextView getTitle() {
        return this.I0;
    }

    public final View getTooltipAnchor() {
        return this.K0;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        ImageView imageView = this.H0;
        imageView.setBackground(getSelectableItemOvalBackground());
        pq9 pq9Var = qp4.u0;
        imageView.setColorFilter(pq9Var.j(imageView).getIcon().k);
        this.I0.setTextColor(pq9Var.j(this).getText().e);
        this.J0.setTextColor(pq9Var.j(this).getText().g);
        ImageView imageView2 = this.K0;
        Drawable drawable = imageView2.getDrawable();
        EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
        if (enhancedVectorDrawable != null) {
            c54.Z(enhancedVectorDrawable, "border", pq9Var.j(imageView2).getIcon().h);
            c54.Z(enhancedVectorDrawable, "text", pq9Var.j(imageView2).getIcon().j);
        }
        imageView2.setBackground(getSelectableItemOvalBackground());
        ImageView imageView3 = this.L0;
        imageView3.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView3).getIcon().j));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.M0.setIndicatorColor(pq9Var.j(this).b().a.m);
    }

    public final void setIsPlaying(boolean z) {
        this.H0.setImageResource(z ? pub.ic_pause_24_filled : pub.ic_play_24_filled);
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.L0;
        if (onClickListener == null) {
            imageView.setOnClickListener(null);
        } else {
            tu0.K(imageView, 1000L, onClickListener);
        }
    }

    public final void setOnPlaybackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.H0;
        if (onClickListener == null) {
            imageView.setOnClickListener(null);
        } else {
            tu0.K(imageView, 200L, onClickListener);
        }
    }

    public final void setOnPlaybackSpeedClick(m56 m56Var) {
        ImageView imageView = this.K0;
        if (m56Var == null) {
            imageView.setOnClickListener(null);
        } else {
            tu0.K(imageView, 200L, new vu5(m56Var, 19, this));
        }
    }

    public final void setPlaybackSpeed(db9 db9Var) {
        ImageView imageView = this.K0;
        if (db9Var != null) {
            w(imageView, db9Var);
        } else {
            imageView.setVisibility(8);
        }
    }

    public final void setProgress(float f) {
        wh7 wh7Var = this.M0;
        wh7Var.setProgress(ote.e((int) ((f * (wh7Var.getMax() - wh7Var.getMin())) + wh7Var.getMin()), wh7Var.getMin(), wh7Var.getMax()));
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.J0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.I0.setText(charSequence);
    }

    public final void w(ImageView imageView, db9 db9Var) {
        int i;
        imageView.setVisibility(0);
        int iOrdinal = db9Var.ordinal();
        if (iOrdinal == 0) {
            i = pub.speed_1x;
        } else if (iOrdinal == 1) {
            i = pub.speed_1_5x;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = pub.speed_2x;
        }
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(imageView.getContext(), i);
        pq9 pq9Var = qp4.u0;
        c54.Z(enhancedVectorDrawable, "border", pq9Var.j(imageView).getIcon().h);
        c54.Z(enhancedVectorDrawable, "text", pq9Var.j(imageView).getIcon().j);
        imageView.setImageDrawable(enhancedVectorDrawable);
        this.G0 = db9Var;
    }
}
