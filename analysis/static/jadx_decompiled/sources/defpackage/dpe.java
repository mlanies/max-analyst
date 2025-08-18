package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class dpe {
    public float c;
    public float d;
    public final WeakReference f;
    public voe g;
    public final TextPaint a = new TextPaint(1);
    public final k03 b = new k03(1, this);
    public boolean e = true;

    public dpe(cpe cpeVar) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(cpeVar);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void c(voe voeVar, Context context) {
        if (this.g != voeVar) {
            this.g = voeVar;
            if (voeVar != null) {
                TextPaint textPaint = this.a;
                k03 k03Var = this.b;
                voeVar.f(context, textPaint, k03Var);
                cpe cpeVar = (cpe) this.f.get();
                if (cpeVar != null) {
                    textPaint.drawableState = cpeVar.getState();
                }
                voeVar.e(context, textPaint, k03Var);
                this.e = true;
            }
            cpe cpeVar2 = (cpe) this.f.get();
            if (cpeVar2 != null) {
                cpeVar2.a();
                cpeVar2.onStateChange(cpeVar2.getState());
            }
        }
    }
}
