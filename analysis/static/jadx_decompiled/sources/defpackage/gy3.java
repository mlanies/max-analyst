package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class gy3 extends AppCompatTextView implements kre {
    public long u0;
    public final ValueAnimator v0;
    public final c23 w0;

    public gy3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v0 = ValueAnimator.ofFloat(360.0f, 0.0f);
        c23 c23Var = new c23();
        pq9 pq9Var = qp4.u0;
        c23Var.a.setColor(pq9Var.j(this).i().c);
        this.w0 = c23Var;
        setBackground(c23Var);
        i4f.o.b(this, du4.b);
        setTextAlignment(4);
        pq9Var.j(this).getText();
        setTextColor(-1);
        setGravity(17);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j = this.u0;
        ValueAnimator valueAnimator = this.v0;
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new z00(5, this));
        valueAnimator.start();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.cancel();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.w0.a.setColor(fkaVar.i().c);
        setTextColor(-1);
    }

    public final void setMaxValue(long j) {
        this.u0 = j;
    }
}
