package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class pn extends SeekBar {
    public final qn a;

    public pn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        qn qnVar = this.a;
        Drawable drawable = qnVar.Y;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = qnVar.X;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.Y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.H(canvas);
    }

    public pn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gse.a(getContext(), this);
        qn qnVar = new qn(this);
        this.a = qnVar;
        qnVar.A(attributeSet, i);
    }
}
