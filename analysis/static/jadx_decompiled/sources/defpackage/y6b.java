package defpackage;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y6b {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public y6b(PrecomputedText.Params params) {
        this.a = params.getTextPaint();
        this.b = params.getTextDirection();
        this.c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y6b)) {
            return false;
        }
        y6b y6bVar = (y6b) obj;
        if (this.c == y6bVar.c && this.d == y6bVar.d) {
            TextPaint textPaint = this.a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = y6bVar.a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.b == y6bVar.b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.b);
        sb.append(", breakStrategy=" + this.c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }
}
