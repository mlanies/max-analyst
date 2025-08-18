package ru.ok.messages.views.widgets;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

/* loaded from: classes2.dex */
public class EllipsizingEndTextView extends AnimojiTextView {
    public static final Pattern E0 = Pattern.compile("[\\.,…;\\:\\s]*$", 32);
    public float A0;
    public float B0;
    public Pattern C0;
    public boolean D0;
    public boolean w0;
    public boolean x0;
    public CharSequence y0;
    public int z0;

    public EllipsizingEndTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0 = 1.0f;
        this.B0 = 0.0f;
        super.setEllipsize(null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxLines});
        setMaxLines(typedArrayObtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
        setEndPunctuationPattern(E0);
    }

    private int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / l("").getLineBottom(0);
    }

    private int getLinesCount() {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    @Override // android.widget.TextView
    @SuppressLint({"Override"})
    public int getMaxLines() {
        return this.z0;
    }

    public final StaticLayout l(CharSequence charSequence) {
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
        return new StaticLayout(charSequence, getPaint(), ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - intrinsicWidth) - intrinsicWidth2) - compoundDrawablePadding, Layout.Alignment.ALIGN_NORMAL, this.A0, this.B0, false);
    }

    @Override // ru.ok.tamtam.animoji.views.AnimojiTextView, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w0) {
            CharSequence charSequenceConcat = "…";
            if (this.D0) {
                CharSequence charSequence = this.y0;
                charSequenceConcat = TextUtils.concat("…", charSequence.subSequence(charSequence.length() - 1, this.y0.length()));
            }
            CharSequence charSequence2 = this.y0;
            StaticLayout staticLayoutL = l(charSequence2);
            int linesCount = getLinesCount();
            CharSequence charSequenceConcat2 = charSequence2;
            if (linesCount > 0) {
                charSequenceConcat2 = charSequence2;
                if (staticLayoutL.getLineCount() > linesCount) {
                    int lineEnd = staticLayoutL.getLineEnd(linesCount - 1) + 1;
                    if (lineEnd >= this.y0.length()) {
                        lineEnd = this.y0.length() - 1;
                    }
                    CharSequence charSequenceSubSequence = this.y0.subSequence(0, lineEnd);
                    while (l(TextUtils.concat(charSequenceSubSequence, charSequenceConcat)).getLineCount() > linesCount && lineEnd - 1 > 0) {
                        charSequenceSubSequence = charSequenceSubSequence.subSequence(0, lineEnd);
                    }
                    if (charSequenceSubSequence instanceof SpannedString) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                        Matcher matcher = this.C0.matcher(charSequenceSubSequence);
                        charSequenceConcat2 = spannableStringBuilder;
                        if (matcher.find()) {
                            spannableStringBuilder.replace(matcher.start(), ((SpannedString) charSequenceSubSequence).length(), charSequenceConcat);
                            charSequenceConcat2 = spannableStringBuilder;
                        }
                    } else {
                        charSequenceConcat2 = TextUtils.concat(this.C0.matcher(charSequenceSubSequence).replaceFirst(""), charSequenceConcat);
                    }
                }
            }
            if (!TextUtils.equals(charSequenceConcat2, getText())) {
                this.x0 = true;
                try {
                    setText(charSequenceConcat2);
                } finally {
                    this.x0 = false;
                }
            }
            this.w0 = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.w0 = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if ((this.x0 || this.y0 != null) && charSequence.equals(this.y0)) {
            return;
        }
        this.y0 = charSequence;
        this.w0 = true;
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.C0 = pattern;
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        this.B0 = f;
        this.A0 = f2;
        super.setLineSpacing(f, f2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.z0 = i;
        this.w0 = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.w0 = true;
    }

    public void setSaveLastCharPosition(boolean z) {
        this.D0 = z;
    }
}
