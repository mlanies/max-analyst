package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class al3 extends ClickableSpan {
    public final long a;
    public v02 b;

    public al3(long j) {
        this.a = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ey1 ey1Var;
        v02 v02Var = this.b;
        if (v02Var == null || (ey1Var = ((lu3) v02Var.b).I0) == null) {
            return;
        }
        bc7[] bc7VarArr = MessagesListWidget.X0;
        ((MessagesListWidget) ey1Var.b).x0().G(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
