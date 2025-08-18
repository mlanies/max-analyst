package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class hi extends AppCompatEditText {
    public boolean t0;
    public sj[] u0;

    public hi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new gi(0, this);
        super.setLayerType(1, null);
    }

    public final boolean getAnimojiEnabled() {
        return this.t0;
    }

    public final sj[] getCachedSpans$animoji_release() {
        return this.u0;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sj[] sjVarArr = this.u0;
        if (sjVarArr == null || sjVarArr.length <= 0) {
            return;
        }
        sjVarArr[0].getClass();
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = qh.b;
        if (z) {
            qh.a.getClass();
        }
        super.onDraw(canvas);
        if (z) {
            qh.a.getClass();
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        sj[] sjVarArr;
        Spanned spanned;
        if (qh.c == null || !this.t0) {
            return;
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            sj[] sjVarArr2 = this.u0;
            if (sjVarArr2 != null && sjVarArr2.length > 0) {
                sjVarArr2[0].getClass();
                throw null;
            }
            kp.w(spannable, sj.class, 0, spannable.length());
        }
        try {
            vw4.a().h(charSequence);
        } catch (Throwable unused) {
        }
        fj fjVar = qh.c;
        if (charSequence != null && charSequence.length() != 0 && (charSequence instanceof Spannable)) {
            List listA = fjVar.a(charSequence);
            boolean zIsEmpty = listA.isEmpty();
            if (a() != zIsEmpty) {
                setEmojiCompatEnabled(zIsEmpty);
            }
            Spannable spannable2 = (Spannable) charSequence;
            ArrayList arrayList = new ArrayList();
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
            fp3.c(spannable2, arrayList, fjVar);
            fp3.D(charSequence);
        }
        if (charSequence != null) {
            int length = charSequence.length();
            try {
                spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
            } catch (Throwable unused2) {
            }
            Object[] spans = spanned != null ? spanned.getSpans(0, length, sj.class) : null;
            sjVarArr = (sj[]) spans;
        } else {
            sjVarArr = null;
        }
        this.u0 = sjVarArr;
        if (sjVarArr == null || sjVarArr.length <= 0) {
            return;
        }
        sjVarArr[0].getClass();
        throw null;
    }

    public final void setAnimojiEnabled(boolean z) {
        if (this.t0 != z) {
            Editable text = getText();
            if (text != null) {
                onTextChanged(text, 0, text.length(), text.length());
            }
            this.t0 = z;
        }
    }

    public final void setCachedSpans$animoji_release(sj[] sjVarArr) {
        this.u0 = sjVarArr;
    }

    @Override // android.view.View
    public final void setLayerType(int i, Paint paint) {
        super.setLayerType(1, paint);
    }
}
