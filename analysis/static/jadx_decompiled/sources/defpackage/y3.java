package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class y3 extends ClickableSpan {
    public final int a;
    public final l4 b;
    public final int c;

    public y3(int i, l4 l4Var, int i2) {
        this.a = i;
        this.b = l4Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
