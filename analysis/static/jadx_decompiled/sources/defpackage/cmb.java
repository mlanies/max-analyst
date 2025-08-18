package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class cmb extends ClickableSpan {
    public final String a;
    public int b;
    public boolean c = true;
    public ik7 o;

    public cmb(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ik7 ik7Var = this.o;
        if (ik7Var != null) {
            kk7 kk7Var = ik7Var.a;
            kk7Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            l7 l7Var = kk7Var.e;
            if (jCurrentTimeMillis - l7Var.c > l7Var.b) {
                l7Var.c = jCurrentTimeMillis;
                hk7 hk7Var = kk7Var.a;
                if (hk7Var != null) {
                    hk7Var.b(this.a, lk7.X, null);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(this.c);
    }
}
