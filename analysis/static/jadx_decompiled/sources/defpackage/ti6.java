package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class ti6 extends ClickableSpan {
    public final String a;
    public final int b;
    public fk7 c;

    public ti6(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        fk7 fk7Var = this.c;
        if (fk7Var != null) {
            fk7Var.a.b(view, this.a, lk7.b, (ClickableSpan) fk7Var.b);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
