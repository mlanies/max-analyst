package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.aga;
import defpackage.b7a;
import defpackage.c7a;
import defpackage.fk4;
import defpackage.fka;
import defpackage.hv0;
import defpackage.ix3;
import defpackage.kre;
import defpackage.lz7;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.z6a;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lkre;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "title", "Le5f;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "common_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class OneMeTitleSubtitleButton extends AppCompatTextView implements kre {
    public final ShapeDrawable A0;
    public final RippleDrawable B0;
    public SpannableString u0;
    public SpannableString v0;
    public final TextAppearanceSpan w0;
    public final TextAppearanceSpan x0;
    public final b7a y0;
    public final z6a z0;

    public OneMeTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = new TextAppearanceSpan(context, aga.b);
        this.x0 = new TextAppearanceSpan(context, aga.a);
        c7a c7aVar = c7a.c;
        this.y0 = b7a.a;
        this.z0 = z6a.a;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.A0 = shapeDrawable;
        pq9 pq9Var = qp4.u0;
        this.B0 = new RippleDrawable(ColorStateList.valueOf(pq9Var.j(this).d().a.a.d), shapeDrawable, new ColorDrawable(-65536));
        setGravity(17);
        setMinimumHeight(lz7.r(c7aVar));
        setOutlineProvider(new ix3(lz7.d(c7aVar)));
        float f = 20;
        float f2 = 4;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        onThemeChanged(pq9Var.j(this));
    }

    public final void j(CharSequence charSequence, CharSequence charSequence2) throws IOException {
        SpannableString spannableStringValueOf;
        SpannableString spannableStringValueOf2;
        SpannableString spannableString = null;
        if (charSequence != this.u0) {
            if (charSequence == null || (spannableStringValueOf2 = SpannableString.valueOf(charSequence)) == null) {
                spannableStringValueOf2 = null;
            } else {
                spannableStringValueOf2.setSpan(this.w0, 0, charSequence.length(), 17);
            }
            this.u0 = spannableStringValueOf2;
        }
        if (charSequence2 != this.v0) {
            if (charSequence2 != null && (spannableStringValueOf = SpannableString.valueOf(charSequence2)) != null) {
                spannableStringValueOf.setSpan(this.x0, 0, charSequence2.length(), 17);
                spannableString = spannableStringValueOf;
            }
            this.v0 = spannableString;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence3 = this.u0;
        if (charSequence3 == null) {
            charSequence3 = "";
        }
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(charSequence3);
        SpannableString spannableString2 = this.v0;
        if (spannableString2 != null) {
            spannableStringBuilderAppend.append('\n');
            spannableStringBuilderAppend.append((CharSequence) spannableString2);
        }
        setText(spannableStringBuilderAppend);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        pq9 pq9Var = qp4.u0;
        fka fkaVarJ = pq9Var.j(this);
        boolean zIsEnabled = isEnabled();
        b7a b7aVar = this.y0;
        z6a z6aVar = this.z0;
        setTextColor(lz7.S(fkaVarJ, b7aVar, z6aVar, zIsEnabled));
        hv0 hv0VarC = lz7.c(pq9Var.j(this), b7aVar, z6aVar, isEnabled());
        Paint paint = this.A0.getPaint();
        Integer num = hv0VarC.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(hv0VarC.b);
        RippleDrawable rippleDrawable = this.B0;
        rippleDrawable.setColor(colorStateListValueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void setSubtitle(CharSequence subtitle) throws IOException {
        j(this.u0, subtitle);
    }

    public final void setTitle(CharSequence title) throws IOException {
        j(title, this.v0);
    }
}
