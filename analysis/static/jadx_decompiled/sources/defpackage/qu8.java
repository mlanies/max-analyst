package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class qu8 extends ClickableSpan {
    public final nu8 a;
    public int b;
    public jk7 c;

    public qu8(nu8 nu8Var, int i) {
        this.a = nu8Var;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        jk7 jk7Var = this.c;
        if (jk7Var != null) {
            kk7 kk7Var = jk7Var.a;
            kk7Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            l7 l7Var = kk7Var.e;
            if (jCurrentTimeMillis - l7Var.c > l7Var.b) {
                l7Var.c = jCurrentTimeMillis;
                hk7 hk7Var = kk7Var.a;
                if (hk7Var == null) {
                    hk7Var = view instanceof hk7 ? (hk7) view : null;
                }
                if (hk7Var != null) {
                    hk7Var.a(this.a);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
