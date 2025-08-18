package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ri3;
import defpackage.ti3;

/* loaded from: classes.dex */
public class Group extends ri3 {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.ri3
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.ri3
    public final void j() {
        ti3 ti3Var = (ti3) getLayoutParams();
        ti3Var.p0.O(0);
        ti3Var.p0.L(0);
    }

    @Override // defpackage.ri3, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
