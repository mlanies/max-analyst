package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.c54;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

/* loaded from: classes2.dex */
public class ImageSpanEllipsizedTextView extends AnimojiTextView {
    public CharSequence w0;
    public final Rect x0;
    public final Rect y0;

    public ImageSpanEllipsizedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x0 = new Rect();
        this.y0 = new Rect();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        Rect rect = this.x0;
        if (zIsEmpty) {
            rect.setEmpty();
        } else {
            getPaint().getTextBounds(text.toString(), 0, text.length(), rect);
        }
        int width = getWidth() - (getPaddingRight() + getPaddingLeft());
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative[2];
        if (drawable != null) {
            Rect rect2 = this.y0;
            drawable.copyBounds(rect2);
            Drawable drawable2 = compoundDrawablesRelative[0];
            int compoundDrawablePadding = getCompoundDrawablePadding() + rect2.width() + (rect.right - width) + (drawable2 != null ? drawable2.getBounds().right + getCompoundDrawablePadding() : 0);
            if (c54.K(this)) {
                compoundDrawablePadding = -compoundDrawablePadding;
            }
            rect2.set(compoundDrawablePadding, rect2.top, rect2.width() + compoundDrawablePadding, rect2.bottom);
            compoundDrawablesRelative[2].setBounds(rect2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int compoundDrawablePadding;
        super.onMeasure(i, i2);
        Drawable[] compoundDrawables = getCompoundDrawables();
        int intrinsicWidth2 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            compoundDrawablePadding = getCompoundDrawablePadding();
        } else {
            intrinsicWidth = 0;
            compoundDrawablePadding = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            intrinsicWidth2 = drawable2.getIntrinsicWidth();
            compoundDrawablePadding += getCompoundDrawablePadding();
        }
        TextUtils.TruncateAt ellipsize = getEllipsize();
        if (ellipsize == null) {
            ellipsize = TextUtils.TruncateAt.END;
        }
        if (TextUtils.isEmpty(this.w0)) {
            setText((CharSequence) null);
        } else {
            setText(TextUtils.ellipsize(this.w0, getPaint(), ((((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) - intrinsicWidth) - intrinsicWidth2) - compoundDrawablePadding, ellipsize));
        }
    }

    @Override // ru.ok.tamtam.animoji.views.AnimojiTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.w0 = charSequence;
        super.setText(charSequence, bufferType);
    }
}
