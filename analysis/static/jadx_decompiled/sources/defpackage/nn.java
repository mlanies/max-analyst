package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public final class nn extends RatingBar {
    public final va8 a;

    /* JADX WARN: Illegal instructions before constructor call */
    public nn(Context context, AttributeSet attributeSet) {
        int i = vsb.ratingBarStyle;
        super(context, attributeSet, i);
        gse.a(getContext(), this);
        va8 va8Var = new va8(1, this);
        this.a = va8Var;
        va8Var.A(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
