package defpackage;

import androidx.appcompat.widget.AppCompatCheckBox;

/* loaded from: classes.dex */
public final class yz2 extends AppCompatCheckBox {
    public int s0;

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + this.s0;
    }

    public final int getPaddingBetweenCheckbox() {
        return this.s0;
    }

    public final void setPaddingBetweenCheckbox(int i) {
        this.s0 = i;
        invalidate();
        requestLayout();
    }
}
