package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes2.dex */
public final class tja extends SwitchCompat implements kre {
    public final je7 h1;
    public final je7 i1;

    public tja(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h1 = tu0.r(3, new s4a(5));
        this.i1 = tu0.r(3, new s4a(6));
        setThumbDrawable(f(getThumbStateDrawable()));
        setTrackDrawable(f(getTrackThumbDrawable()));
        setSwitchMinWidth(tu0.G(51 * fk4.d().getDisplayMetrics().density));
        setEnforceSwitchWidth(false);
        setSplitTrack(false);
        setShowText(false);
        setBackground(null);
        onThemeChanged(qp4.u0.j(this));
    }

    public static StateListDrawable f(yge ygeVar) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_checked}, ygeVar.a);
        stateListDrawable.addState(new int[]{R.attr.state_enabled, -16842912}, ygeVar.b);
        stateListDrawable.addState(new int[]{-16842910, -16842912}, ygeVar.d);
        stateListDrawable.addState(new int[]{-16842910, R.attr.state_checked}, ygeVar.c);
        return stateListDrawable;
    }

    private final yge getThumbStateDrawable() {
        return (yge) this.h1.getValue();
    }

    private final yge getTrackThumbDrawable() {
        return (yge) this.i1.getValue();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iG = tu0.G((((int) ((getThumbPosition() + 0.2f) * r1)) + 20) * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(((int) ((1 - getThumbPosition()) * 6)) * fk4.d().getDisplayMetrics().density);
        int iQ = rh4.q(4, fk4.d().getDisplayMetrics().density, getWidth() - iG);
        int i = getThumbDrawable().getBounds().left + iG2;
        int i2 = (i > iQ ? iQ : i) + iG;
        int height = (getHeight() / 2) - (iG / 2);
        int i3 = iG + height;
        Drawable thumbDrawable = getThumbDrawable();
        if (i <= iQ) {
            iQ = i;
        }
        thumbDrawable.setBounds(iQ, height, i2, i3);
        super.onDraw(canvas);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        GradientDrawable gradientDrawable = getThumbStateDrawable().a;
        fkaVar.getIcon();
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        getThumbStateDrawable().b.setColor(ColorStateList.valueOf(fkaVar.getIcon().j));
        getTrackThumbDrawable().a.setColor(ColorStateList.valueOf(fkaVar.b().a.m));
        float f = 2;
        getTrackThumbDrawable().a.setStroke(tu0.G(fk4.d().getDisplayMetrics().density * f), ColorStateList.valueOf(fkaVar.b().a.m));
        getTrackThumbDrawable().b.setColor(ColorStateList.valueOf(0));
        getTrackThumbDrawable().b.setStroke(tu0.G(f * fk4.d().getDisplayMetrics().density), ColorStateList.valueOf(fkaVar.i().b.b));
        getTrackThumbDrawable().c.setColor(ColorStateList.valueOf(fkaVar.d().a.b.l));
        getTrackThumbDrawable().d.setColor(ColorStateList.valueOf(fkaVar.d().a.b.f));
    }
}
