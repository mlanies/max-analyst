package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes2.dex */
public final class mse extends CharacterStyle implements UpdateAppearance, kre {
    public final m56 a;
    public int b;

    public mse(fka fkaVar, m56 m56Var) {
        this.a = m56Var;
        this.b = ((Number) m56Var.invoke(fkaVar)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mse) && this.b == ((mse) obj).b;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.b) * 31) + mse.class.hashCode();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.b = ((Number) this.a.invoke(fkaVar)).intValue();
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(this.b);
        }
    }
}
