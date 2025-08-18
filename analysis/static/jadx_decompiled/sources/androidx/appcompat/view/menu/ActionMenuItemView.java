package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a7;
import defpackage.br8;
import defpackage.f7;
import defpackage.p3c;
import defpackage.pr8;
import defpackage.swe;
import defpackage.vq8;
import defpackage.wq8;
import defpackage.z6;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements pr8, View.OnClickListener, f7 {
    public boolean A0;
    public boolean B0;
    public final int C0;
    public int D0;
    public final int E0;
    public br8 u0;
    public CharSequence v0;
    public Drawable w0;
    public vq8 x0;
    public z6 y0;
    public a7 z0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.A0 = j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3c.ActionMenuItemView, 0, 0);
        this.C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p3c.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.E0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.D0 = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.f7
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.pr8
    public final void d(br8 br8Var) {
        this.u0 = br8Var;
        setIcon(br8Var.getIcon());
        setTitle(br8Var.getTitleCondensed());
        setId(br8Var.a);
        setVisibility(br8Var.isVisible() ? 0 : 8);
        setEnabled(br8Var.isEnabled());
        if (br8Var.hasSubMenu() && this.y0 == null) {
            this.y0 = new z6(this);
        }
    }

    @Override // defpackage.f7
    public final boolean e() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.u0.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.pr8
    public br8 getItemData() {
        return this.u0;
    }

    public final boolean j() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void k() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.v0);
        if (this.w0 != null && ((this.u0.J0 & 4) != 4 || (!this.A0 && !this.B0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.v0 : null);
        CharSequence charSequence = this.u0.B0;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.u0.X);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.u0.C0;
        if (TextUtils.isEmpty(charSequence2)) {
            swe.a(this, z3 ? null : this.u0.X);
        } else {
            swe.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vq8 vq8Var = this.x0;
        if (vq8Var != null) {
            vq8Var.a(this.u0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0 = j();
        k();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.D0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.C0;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (z || this.w0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.w0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z6 z6Var;
        if (this.u0.hasSubMenu() && (z6Var = this.y0) != null && z6Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.B0 != z) {
            this.B0 = z;
            br8 br8Var = this.u0;
            if (br8Var != null) {
                wq8 wq8Var = br8Var.y0;
                wq8Var.v0 = true;
                wq8Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.w0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.E0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        k();
    }

    public void setItemInvoker(vq8 vq8Var) {
        this.x0 = vq8Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.D0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(a7 a7Var) {
        this.z0 = a7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.v0 = charSequence;
        k();
    }
}
