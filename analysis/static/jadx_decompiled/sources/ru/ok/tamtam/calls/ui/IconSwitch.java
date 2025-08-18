package ru.ok.tamtam.calls.ui;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.c3c;
import defpackage.ee4;
import defpackage.fk4;
import defpackage.fm9;
import defpackage.khe;
import defpackage.kt3;
import defpackage.ns6;
import defpackage.os6;
import defpackage.ote;
import defpackage.sme;
import defpackage.tu0;
import defpackage.wme;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ok/tamtam/calls/ui/IconSwitch;", "Landroid/widget/LinearLayout;", "Lwme;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "Le5f;", "setText", "(I)V", "", "(Ljava/lang/CharSequence;)V", "res", "setIconDrawable", "orientation", "setOrientation", "Los6;", "listener", "setListener", "(Los6;)V", "", "checked", "setChecked", "(Z)V", "Landroidx/appcompat/widget/AppCompatImageView;", "a", "Landroidx/appcompat/widget/AppCompatImageView;", "getIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Landroidx/appcompat/widget/SwitchCompat;", "b", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitch", "()Landroidx/appcompat/widget/SwitchCompat;", "switch", "call-dialog_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class IconSwitch extends LinearLayout implements wme, Checkable {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public final AppCompatImageView icon;

    /* renamed from: b, reason: from kotlin metadata */
    public final SwitchCompat switch;

    public IconSwitch(Context context, AttributeSet attributeSet) {
        sme smeVarR;
        super(context, attributeSet);
        setOrientation(0);
        setClickable(false);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
        this.icon = appCompatImageView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        addView(appCompatImageView, layoutParams);
        SwitchCompat switchCompat = new SwitchCompat(context, attributeSet);
        switchCompat.setTextAlignment(2);
        switchCompat.setTextSize(16.0f);
        if (context.getResources().getConfiguration().orientation == 2) {
            switchCompat.setSwitchPadding(tu0.G(52 * fk4.d().getDisplayMetrics().density));
        }
        this.switch = switchCompat;
        addView(switchCompat, new LinearLayout.LayoutParams(-1, -2));
        switchCompat.setOnCheckedChangeListener(new ns6());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c3c.IconSwitch);
            appCompatImageView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(c3c.IconSwitch_icon_switch_start_drawable));
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context2 = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context2);
        }
        z(smeVarR);
    }

    public final AppCompatImageView getIcon() {
        return this.icon;
    }

    public final SwitchCompat getSwitch() {
        return this.switch;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.switch.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) throws Resources.NotFoundException {
        this.switch.setChecked(checked);
    }

    public final void setIconDrawable(int res) {
        this.icon.setImageDrawable(kt3.b(getContext(), res));
    }

    public final void setListener(os6 listener) {
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int orientation) {
        super.setOrientation(0);
    }

    public final void setText(int text) {
        this.switch.setText(text);
    }

    @Override // android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        this.switch.toggle();
    }

    @Override // defpackage.wme
    public final void z(sme smeVar) {
        AppCompatImageView appCompatImageView = this.icon;
        int i = smeVar.w;
        appCompatImageView.setColorFilter(i);
        SwitchCompat switchCompat = this.switch;
        switchCompat.setTextColor(i);
        int[][] iArr = {new int[]{R.attr.state_checked}, new int[0]};
        int i2 = smeVar.l;
        int i3 = smeVar.k;
        switchCompat.setThumbTintList(new ColorStateList(iArr, new int[]{i3, i2}));
        switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{ote.b0(i3, 0.3f), ote.b0(smeVar.M, 0.3f)}));
    }

    public final void setText(CharSequence text) {
        this.switch.setText(text);
    }
}
