package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class x18 extends AppCompatTextView {
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (kq0.E(tsb.textAppearanceLineHeightEnabled, context, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, z2c.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {z2c.MaterialTextAppearance_android_lineHeight, z2c.MaterialTextAppearance_lineHeight};
            int iR = -1;
            for (int i2 = 0; i2 < 2 && iR < 0; i2++) {
                iR = ju0.r(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iR >= 0) {
                setLineHeight(iR);
            }
        }
    }
}
