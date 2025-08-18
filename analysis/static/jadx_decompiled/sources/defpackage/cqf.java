package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class cqf extends ri3 {
    public boolean v0;
    public boolean w0;

    @Override // defpackage.ri3
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.ri3
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i3c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i3c.ConstraintLayout_Layout_android_visibility) {
                    this.v0 = true;
                } else if (index == i3c.ConstraintLayout_Layout_android_elevation) {
                    this.w0 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void l(nn5 nn5Var, int i, int i2);

    @Override // defpackage.ri3, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v0 || this.w0) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.b; i++) {
                    View view = (View) constraintLayout.a.get(this.a[i]);
                    if (view != null) {
                        if (this.v0) {
                            view.setVisibility(visibility);
                        }
                        if (this.w0 && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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
