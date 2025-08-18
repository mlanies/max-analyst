package ru.ok.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.ee4;
import defpackage.fk4;
import defpackage.fm9;
import defpackage.g3c;
import defpackage.khe;
import defpackage.ngg;
import defpackage.r2c;
import defpackage.sme;
import defpackage.tu0;
import defpackage.wme;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lwme;", "", "title", "Le5f;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class LongRoundedTitleSubtitleButton extends AppCompatButton implements wme {
    public CharSequence o;
    public CharSequence s0;
    public final TextAppearanceSpan t0;
    public final TextAppearanceSpan u0;

    public LongRoundedTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        sme smeVarR;
        super(context, attributeSet, 0);
        this.t0 = new TextAppearanceSpan(context, r2c.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Title);
        this.u0 = new TextAppearanceSpan(context, r2c.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Subtitle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g3c.LongRoundedTitleSubtitleButton);
        String string = typedArrayObtainStyledAttributes.getString(g3c.LongRoundedTitleSubtitleButton_lrts_title);
        String string2 = typedArrayObtainStyledAttributes.getString(g3c.LongRoundedTitleSubtitleButton_lrts_subtitle);
        b(string == null ? "" : string, string2 == null ? "" : string2);
        typedArrayObtainStyledAttributes.recycle();
        setGravity(17);
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context2 = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context2);
        }
        z(smeVarR);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString spannableStringValueOf;
        SpannableString spannableStringValueOf2;
        CharSequence charSequence3 = this.o;
        SpannableString spannableString = null;
        CharSequence charSequence4 = charSequence3;
        if (charSequence != charSequence3) {
            if (charSequence == null || (spannableStringValueOf2 = SpannableString.valueOf(charSequence)) == null) {
                charSequence4 = null;
            } else {
                spannableStringValueOf2.setSpan(this.t0, 0, charSequence.length(), 17);
                charSequence4 = spannableStringValueOf2;
            }
        }
        this.o = charSequence4;
        CharSequence charSequence5 = this.s0;
        if (charSequence2 != charSequence5) {
            if (charSequence2 != null && (spannableStringValueOf = SpannableString.valueOf(charSequence2)) != null) {
                spannableStringValueOf.setSpan(this.u0, 0, charSequence2.length(), 17);
                spannableString = spannableStringValueOf;
            }
            charSequence5 = spannableString;
        }
        this.s0 = charSequence5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence6 = this.o;
        if (charSequence6 == null) {
            charSequence6 = "";
        }
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(charSequence6);
        CharSequence charSequence7 = this.s0;
        if (charSequence7 != null) {
            spannableStringBuilderAppend.append((CharSequence) "\n").append(charSequence7);
        }
        setText(spannableStringBuilderAppend);
    }

    public final void setSubtitle(CharSequence subtitle) {
        b(this.o, subtitle);
    }

    public final void setTitle(CharSequence title) {
        b(title, this.s0);
    }

    @Override // defpackage.wme
    public final void z(sme smeVar) {
        ngg.f(smeVar, this, tu0.G(42 * fk4.d().getDisplayMetrics().density));
    }
}
