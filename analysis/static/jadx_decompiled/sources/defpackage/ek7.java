package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class ek7 extends ClickableSpan implements yz7 {
    public int a;
    public final String b;
    public dk7 c;
    public final int o = 6;

    public ek7(String str, int i) {
        this.a = i;
        this.b = w9e.b1(str).toString();
    }

    @Override // defpackage.uw3
    public final uw3 copy() {
        return new ek7(this.b, this.a);
    }

    @Override // defpackage.yz7
    public final int getType() {
        return this.o;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        dk7 dk7Var = this.c;
        if (dk7Var != null) {
            dk7Var.b(view, this.b);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
        textPaint.linkColor = this.a;
        textPaint.setUnderlineText(true);
    }
}
