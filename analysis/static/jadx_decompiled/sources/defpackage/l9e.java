package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes2.dex */
public final class l9e extends CharacterStyle implements yz7, UpdateAppearance {
    public final /* synthetic */ int a;
    public final int b;

    public l9e(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 4;
                break;
            default:
                this.b = 7;
                break;
        }
    }

    @Override // defpackage.uw3
    public final uw3 copy() {
        switch (this.a) {
            case 0:
                return new l9e(0);
            default:
                return new l9e(1);
        }
    }

    @Override // defpackage.yz7
    public final int getType() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setStrikeThruText(true);
                break;
            default:
                textPaint.setUnderlineText(true);
                break;
        }
    }
}
