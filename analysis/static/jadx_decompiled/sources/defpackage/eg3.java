package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class eg3 extends EditText implements kre {
    public static final qec b = new qec("[0-9]*");
    public static final dg3 c = new dg3(0);
    public boolean a;

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || !this.a) {
            return;
        }
        postInvalidateDelayed(1500L);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setBackground(new ColorDrawable(qp4.u0.j(this).b().a.h));
        Drawable textCursorDrawable = getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(fkaVar.getText().j));
        }
        setTextColor(fkaVar.getText().e);
    }

    public final void setSecure(boolean z) {
        this.a = z;
        if (!z) {
            removeTextChangedListener(PasswordTransformationMethod.getInstance());
            setTransformationMethod(SingleLineTransformationMethod.getInstance());
            setInputType(2);
        } else {
            setTransformationMethod(PasswordTransformationMethod.getInstance());
            setInputType(524306);
            removeTextChangedListener(PasswordTransformationMethod.getInstance());
            addTextChangedListener(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        setSecure(this.a);
        super.setText(charSequence, bufferType);
    }
}
