package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class gk7 extends URLSpan {
    public final l7 X;
    public hk7 a;
    public int b;
    public final boolean c;
    public final boolean o;

    public gk7(String str, int i, boolean z, boolean z2) {
        super(str);
        this.a = null;
        this.b = i;
        this.c = z;
        this.o = z2;
        this.X = new l7(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        l7 l7Var = this.X;
        if (jCurrentTimeMillis - l7Var.c > l7Var.b) {
            l7Var.c = jCurrentTimeMillis;
            if (!(view instanceof TextView) || ((TextView) view).getLinksClickable()) {
                hk7 hk7Var = this.a;
                if (hk7Var == null) {
                    hk7Var = view instanceof hk7 ? (hk7) view : null;
                }
                if (hk7Var != null) {
                    hk7Var.b(getURL(), lk7.a, this);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = textPaint.bgColor;
        int i2 = this.b;
        if (i != i2) {
            textPaint.setColor(i2);
        }
        textPaint.setUnderlineText(this.c);
        if (this.o) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
    }
}
