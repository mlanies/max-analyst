package defpackage;

import android.graphics.Typeface;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class am5 extends TextView {
    @Override // android.view.View
    public final boolean isSelected() {
        return getEllipsize() == TextUtils.TruncateAt.MARQUEE || super.isSelected();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int compoundPaddingEnd = getCompoundPaddingEnd() + getCompoundPaddingStart();
        int measuredWidth = getMeasuredWidth();
        if (!(getLayout() instanceof BoringLayout)) {
            Layout layout = getLayout();
            float spacingAdd = layout.getSpacingAdd() * 2;
            int lineCount = layout.getLineCount();
            int iMax = 0;
            for (int i3 = 0; i3 < lineCount; i3++) {
                int iCeil = (int) Math.ceil((layout.getLineRight(i3) - layout.getLineLeft(i3)) + spacingAdd);
                boolean z = layout.getEllipsisCount(i3) > 0;
                iMax = Math.max(iMax, iCeil);
                if (z) {
                    break;
                }
            }
            measuredWidth = Math.min(iMax, layout.getEllipsizedWidth()) + compoundPaddingEnd;
        }
        Typeface typeface = getTypeface();
        if (typeface != null ? typeface.isItalic() : false) {
            measuredWidth = rh4.c(1, fk4.d().getDisplayMetrics().density, measuredWidth);
        }
        if (measuredWidth != getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, View.MeasureSpec.getMode(i)), i2);
        }
    }
}
