package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class i34 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ j34 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i34(j34 j34Var, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.o = j34Var;
                super(9, bool);
                break;
            default:
                this.o = j34Var;
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!tpa.f((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    j34 j34Var = this.o;
                    BoringLayout.Metrics metrics = j34Var.getMetrics();
                    TextPaint textPaint = j34.E0;
                    metrics.width = tu0.G(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(j34Var.v0);
                    j34Var.z0 = BoringLayout.make(charSequence, textPaint, metrics.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metrics, false);
                    j34Var.invalidate();
                    j34Var.requestLayout();
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    j34 j34Var2 = this.o;
                    j34Var2.d(j34Var2.x0);
                    j34Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
