package defpackage;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class tfd extends AppCompatTextView {
    public final /* synthetic */ ufd u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfd(Context context, AttributeSet attributeSet, ufd ufdVar) {
        super(context, attributeSet);
        this.u0 = ufdVar;
        setId(pga.g);
        setLayoutParams(new ti3(-2, -2));
        i4f.j.b(this, du4.b);
        setPadding(0, 0, 0, 0);
        setMaxLines(2);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ufd ufdVar = this.u0;
        if (ufdVar.W0 != jfd.Y) {
            getPaint().setShader(null);
            return;
        }
        Matrix titleGradientMatrix = ufdVar.getTitleGradientMatrix();
        titleGradientMatrix.reset();
        titleGradientMatrix.setScale(i, i2);
        titleGradientMatrix.postTranslate(0.0f, 0.0f);
        Shader shader = getPaint().getShader();
        LinearGradient linearGradient = shader instanceof LinearGradient ? (LinearGradient) shader : null;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(ufdVar.getTitleGradientMatrix());
        }
    }
}
