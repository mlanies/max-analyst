package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public final class d7 extends AppCompatImageView implements f7 {
    public final /* synthetic */ e7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(e7 e7Var, Context context) {
        super(context, null, vsb.actionOverflowButtonStyle);
        this.o = e7Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        swe.a(this, getContentDescription());
        setOnTouchListener(new z6(this, this));
    }

    @Override // defpackage.f7
    public final boolean b() {
        return false;
    }

    @Override // defpackage.f7
    public final boolean e() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.o.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            aq4.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
