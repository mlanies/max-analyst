package defpackage;

import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class j29 extends mw7 {
    public final /* synthetic */ je7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j29(int i, je7 je7Var) {
        super(i);
        this.g = je7Var;
    }

    @Override // defpackage.mw7
    public final Object a(Object obj) {
        a3f a3fVar = (a3f) obj;
        int iIntValue = ((Number) a3fVar.a).intValue();
        float fFloatValue = ((Number) a3fVar.b).floatValue();
        ((Boolean) a3fVar.c).getClass();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAntiAlias(true);
        textPaint.setColor(iIntValue);
        textPaint.setTextSize(fFloatValue);
        textPaint.linkColor = qp4.u0.b(((w6a) ((os0) this.g.getValue())).a).i().a().d(true).d.b;
        return textPaint;
    }
}
