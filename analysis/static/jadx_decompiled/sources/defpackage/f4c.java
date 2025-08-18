package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class f4c extends ConstraintLayout {
    public final u3c G0;
    public int H0;
    public final q18 I0;

    public f4c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(vyb.material_radial_view_group, this);
        q18 q18Var = new q18();
        this.I0 = q18Var;
        nfc nfcVar = new nfc(0.5f);
        i8g i8gVarE = q18Var.a.a.e();
        i8gVarE.e = nfcVar;
        i8gVarE.f = nfcVar;
        i8gVarE.g = nfcVar;
        i8gVarE.h = nfcVar;
        q18Var.setShapeAppearanceModel(i8gVarE.c());
        this.I0.l(ColorStateList.valueOf(-1));
        q18 q18Var2 = this.I0;
        WeakHashMap weakHashMap = zmf.a;
        setBackground(q18Var2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.RadialViewGroup, i, 0);
        this.H0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.RadialViewGroup_materialCircleRadius, 0);
        this.G0 = new u3c(1, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = zmf.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            u3c u3cVar = this.G0;
            handler.removeCallbacks(u3cVar);
            handler.post(u3cVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            u3c u3cVar = this.G0;
            handler.removeCallbacks(u3cVar);
            handler.post(u3cVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.I0.l(ColorStateList.valueOf(i));
    }

    public abstract void w();
}
