package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ti3;

/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        ti3 ti3Var = (ti3) getLayoutParams();
        if (this.a && ti3Var.a == i) {
            return;
        }
        ti3Var.a = i;
        setLayoutParams(ti3Var);
    }

    public void setGuidelineEnd(int i) {
        ti3 ti3Var = (ti3) getLayoutParams();
        if (this.a && ti3Var.b == i) {
            return;
        }
        ti3Var.b = i;
        setLayoutParams(ti3Var);
    }

    public void setGuidelinePercent(float f) {
        ti3 ti3Var = (ti3) getLayoutParams();
        if (this.a && ti3Var.c == f) {
            return;
        }
        ti3Var.c = f;
        setLayoutParams(ti3Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }
}
