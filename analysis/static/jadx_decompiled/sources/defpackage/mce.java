package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.UpdateAppearance;
import android.view.View;

/* loaded from: classes2.dex */
public final class mce extends ClickableSpan implements UpdateAppearance, kre {
    public static final /* synthetic */ int X = 0;
    public final rce a;
    public final a66 b;
    public int c;
    public int o;

    public mce(k56 k56Var, rce rceVar, a66 a66Var) {
        this.a = rceVar;
        this.b = a66Var;
        this.c = ((fka) k56Var.invoke()).f().c;
        this.o = ((fka) k56Var.invoke()).f().c;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.invoke(view, this.a);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.c = fkaVar.f().c;
        this.o = fkaVar.f().c;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.c);
        textPaint.bgColor = s63.i(this.o, 80);
        textPaint.setUnderlineText(false);
    }
}
