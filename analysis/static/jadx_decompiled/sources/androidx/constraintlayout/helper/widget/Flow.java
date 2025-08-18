package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cqf;
import defpackage.hj3;
import defpackage.i3c;
import defpackage.nn5;
import defpackage.xk0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Flow extends cqf {
    public nn5 x0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.cqf, defpackage.ri3
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        nn5 nn5Var = new nn5();
        nn5Var.s0 = 0;
        nn5Var.t0 = 0;
        nn5Var.u0 = 0;
        nn5Var.v0 = 0;
        nn5Var.w0 = 0;
        nn5Var.x0 = 0;
        nn5Var.y0 = false;
        nn5Var.z0 = 0;
        nn5Var.A0 = 0;
        nn5Var.B0 = new xk0(0);
        nn5Var.C0 = null;
        nn5Var.D0 = -1;
        nn5Var.E0 = -1;
        nn5Var.F0 = -1;
        nn5Var.G0 = -1;
        nn5Var.H0 = -1;
        nn5Var.I0 = -1;
        nn5Var.J0 = 0.5f;
        nn5Var.K0 = 0.5f;
        nn5Var.L0 = 0.5f;
        nn5Var.M0 = 0.5f;
        nn5Var.N0 = 0.5f;
        nn5Var.O0 = 0.5f;
        nn5Var.P0 = 0;
        nn5Var.Q0 = 0;
        nn5Var.R0 = 2;
        nn5Var.S0 = 2;
        nn5Var.T0 = 0;
        nn5Var.U0 = -1;
        nn5Var.V0 = 0;
        nn5Var.W0 = new ArrayList();
        nn5Var.X0 = null;
        nn5Var.Y0 = null;
        nn5Var.Z0 = null;
        nn5Var.b1 = 0;
        this.x0 = nn5Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i3c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i3c.ConstraintLayout_Layout_android_orientation) {
                    this.x0.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_padding) {
                    nn5 nn5Var2 = this.x0;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    nn5Var2.s0 = dimensionPixelSize;
                    nn5Var2.t0 = dimensionPixelSize;
                    nn5Var2.u0 = dimensionPixelSize;
                    nn5Var2.v0 = dimensionPixelSize;
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingStart) {
                    nn5 nn5Var3 = this.x0;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    nn5Var3.u0 = dimensionPixelSize2;
                    nn5Var3.w0 = dimensionPixelSize2;
                    nn5Var3.x0 = dimensionPixelSize2;
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingEnd) {
                    this.x0.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingLeft) {
                    this.x0.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingTop) {
                    this.x0.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingRight) {
                    this.x0.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_android_paddingBottom) {
                    this.x0.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_wrapMode) {
                    this.x0.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.x0.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.x0.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.x0.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.x0.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.x0.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.x0.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.x0.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.x0.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.x0.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.x0.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.x0.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_verticalBias) {
                    this.x0.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == i3c.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.x0.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == i3c.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.x0.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == i3c.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.x0.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_verticalGap) {
                    this.x0.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == i3c.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.x0.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.o = this.x0;
        k();
    }

    @Override // defpackage.ri3
    public final void i(hj3 hj3Var, boolean z) {
        nn5 nn5Var = this.x0;
        int i = nn5Var.u0;
        if (i > 0 || nn5Var.v0 > 0) {
            if (z) {
                nn5Var.w0 = nn5Var.v0;
                nn5Var.x0 = i;
            } else {
                nn5Var.w0 = i;
                nn5Var.x0 = nn5Var.v0;
            }
        }
    }

    @Override // defpackage.cqf
    public final void l(nn5 nn5Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (nn5Var == null) {
            setMeasuredDimension(0, 0);
        } else {
            nn5Var.V(mode, size, mode2, size2);
            setMeasuredDimension(nn5Var.z0, nn5Var.A0);
        }
    }

    @Override // defpackage.ri3, android.view.View
    public final void onMeasure(int i, int i2) {
        l(this.x0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.x0.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.x0.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.x0.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.x0.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.x0.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.x0.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.x0.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.x0.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.x0.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.x0.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.x0.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.x0.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.x0.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.x0.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        nn5 nn5Var = this.x0;
        nn5Var.s0 = i;
        nn5Var.t0 = i;
        nn5Var.u0 = i;
        nn5Var.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.x0.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.x0.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.x0.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.x0.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.x0.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.x0.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.x0.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.x0.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.x0.T0 = i;
        requestLayout();
    }
}
