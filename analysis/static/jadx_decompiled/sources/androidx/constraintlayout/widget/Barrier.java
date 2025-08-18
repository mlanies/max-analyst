package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.hj3;
import defpackage.i3c;
import defpackage.nh0;
import defpackage.ri3;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends ri3 {
    public int v0;
    public int w0;
    public nh0 x0;

    public Barrier(Context context) {
        super(context);
        this.a = new int[32];
        this.u0 = new HashMap();
        this.c = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.x0.t0;
    }

    public int getMargin() {
        return this.x0.u0;
    }

    public int getType() {
        return this.v0;
    }

    @Override // defpackage.ri3
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        nh0 nh0Var = new nh0();
        nh0Var.s0 = 0;
        nh0Var.t0 = true;
        nh0Var.u0 = 0;
        nh0Var.v0 = false;
        this.x0 = nh0Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i3c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i3c.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i3c.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.x0.t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == i3c.ConstraintLayout_Layout_barrierMargin) {
                    this.x0.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.o = this.x0;
        k();
    }

    @Override // defpackage.ri3
    public final void i(hj3 hj3Var, boolean z) {
        int i = this.v0;
        this.w0 = i;
        if (z) {
            if (i == 5) {
                this.w0 = 1;
            } else if (i == 6) {
                this.w0 = 0;
            }
        } else if (i == 5) {
            this.w0 = 0;
        } else if (i == 6) {
            this.w0 = 1;
        }
        if (hj3Var instanceof nh0) {
            ((nh0) hj3Var).s0 = this.w0;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.x0.t0 = z;
    }

    public void setDpMargin(int i) {
        this.x0.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.x0.u0 = i;
    }

    public void setType(int i) {
        this.v0 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
