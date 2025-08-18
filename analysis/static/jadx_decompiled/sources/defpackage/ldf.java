package defpackage;

import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class ldf extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mdf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldf(mdf mdfVar, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.o = mdfVar;
                super(9, bool);
                break;
            case 2:
                Boolean bool2 = Boolean.TRUE;
                this.o = mdfVar;
                super(9, bool2);
                break;
            case 3:
                Boolean bool3 = Boolean.TRUE;
                this.o = mdfVar;
                super(9, bool3);
                break;
            default:
                this.o = mdfVar;
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        Drawable drawableB;
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!tpa.f((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    mdf mdfVar = this.o;
                    BoringLayout.Metrics metrics = mdfVar.getMetrics();
                    TextPaint textPaint = mdf.E0;
                    metrics.width = tu0.G(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(mdfVar.v0);
                    mdfVar.A0 = mdfVar.a.a(charSequence, textPaint, metrics.width, 1, false, TextUtils.TruncateAt.END);
                    mdfVar.invalidate();
                    mdfVar.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    this.o.invalidate();
                    break;
                }
                break;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    this.o.invalidate();
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    mdf mdfVar2 = this.o;
                    if (zBooleanValue) {
                        drawableB = kt3.b(mdfVar2.getContext(), woc.l2);
                        int i = mdfVar2.c;
                        drawableB.setBounds(0, 0, i, i);
                        drawableB.setTint(mdfVar2.getDrawableColor());
                    } else {
                        drawableB = null;
                    }
                    mdfVar2.z0 = drawableB;
                    mdfVar2.requestLayout();
                    mdfVar2.invalidate();
                    break;
                }
                break;
        }
    }
}
