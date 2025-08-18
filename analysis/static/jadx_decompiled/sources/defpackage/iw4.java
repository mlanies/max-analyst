package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class iw4 extends h2a {
    public static final Rect x0 = new Rect();
    public static final Pattern y0 = Pattern.compile("[\\.,…\\:\\s]*$", 32);
    public boolean b;
    public boolean c;
    public CharSequence o;
    public int s0;
    public float t0;
    public float u0;
    public Pattern v0;
    public boolean w0;

    public iw4(Context context) {
        super(context, null, 0);
        this.s0 = Integer.MAX_VALUE;
        this.t0 = 1.0f;
        this.v0 = y0;
    }

    private final int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / a("").getLineBottom(0);
    }

    private final int getLinesCount() {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    public final StaticLayout a(CharSequence charSequence) {
        int intrinsicWidth;
        int compoundDrawablePadding;
        Drawable[] compoundDrawables = getCompoundDrawables();
        int intrinsicWidth2 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            compoundDrawablePadding = getCompoundDrawablePadding();
        } else {
            intrinsicWidth = 0;
            compoundDrawablePadding = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            intrinsicWidth2 = drawable2.getIntrinsicWidth();
            compoundDrawablePadding += getCompoundDrawablePadding();
        }
        return new StaticLayout(charSequence, getPaint(), ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - intrinsicWidth) - intrinsicWidth2) - compoundDrawablePadding, Layout.Alignment.ALIGN_NORMAL, this.t0, this.u0, false);
    }

    public final Rect getBottomLineRect() {
        int lineCount = getLayout().getLineCount();
        int i = lineCount - 1;
        Rect rect = x0;
        if (i < 0) {
            rect.setEmpty();
        } else {
            int lineStart = getLayout().getLineStart(i);
            float lineWidth = getLayout().getLineWidth(i);
            rect.top = getLayout().getLineTop(i);
            rect.bottom = getLayout().getLineTop(lineCount);
            rect.left = lineStart;
            rect.right = tu0.G(lineStart + lineWidth);
        }
        return rect;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.s0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        CharSequence charSequenceConcat;
        if (this.b && (charSequenceConcat = this.o) != null) {
            CharSequence charSequenceConcat2 = this.w0 ? TextUtils.concat("…", charSequenceConcat.subSequence(charSequenceConcat.length() - 1, charSequenceConcat.length())) : "…";
            StaticLayout staticLayoutA = a(charSequenceConcat);
            int linesCount = getLinesCount();
            if (linesCount > 0 && staticLayoutA.getLineCount() > linesCount) {
                int lineEnd = staticLayoutA.getLineEnd(linesCount - 1) + 1;
                if (lineEnd >= charSequenceConcat.length()) {
                    lineEnd = charSequenceConcat.length() - 1;
                }
                CharSequence charSequenceSubSequence = charSequenceConcat.subSequence(0, lineEnd);
                while (a(TextUtils.concat(charSequenceSubSequence, charSequenceConcat2)).getLineCount() > linesCount && lineEnd - 1 > 0) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, lineEnd);
                }
                if (charSequenceSubSequence instanceof Spanned) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                    Matcher matcher = this.v0.matcher(charSequenceSubSequence);
                    if (matcher.find()) {
                        spannableStringBuilder.replace(matcher.start(), charSequenceSubSequence.length(), charSequenceConcat2);
                    }
                    charSequenceConcat = spannableStringBuilder;
                } else {
                    charSequenceConcat = TextUtils.concat(this.v0.matcher(charSequenceSubSequence).replaceFirst(""), charSequenceConcat2);
                }
            }
            if (!tpa.f(charSequenceConcat, getText())) {
                this.c = true;
                try {
                    setText(charSequenceConcat);
                } finally {
                    this.c = false;
                }
            }
            this.b = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = true;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if ((this.c || this.o != null) && charSequence != null && charSequence.equals(this.o)) {
            return;
        }
        this.o = charSequence;
        this.b = true;
    }

    public final void setEndPunctuationPattern(Pattern pattern) {
        if (pattern == null) {
            pattern = y0;
        }
        this.v0 = pattern;
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        this.u0 = f;
        this.t0 = f2;
        super.setLineSpacing(f, f2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.s0 = i;
        this.b = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.b = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        this.b = true;
    }

    public final void setSaveLastCharPosition(boolean z) {
        this.w0 = z;
    }
}
