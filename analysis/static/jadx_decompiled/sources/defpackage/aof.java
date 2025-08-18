package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class aof implements View.OnAttachStateChangeListener, TextWatcher {
    public final WeakReference a;

    public aof(TextView textView) {
        this.a = new WeakReference(textView);
        if (textView.isAttachedToWindow()) {
            a(textView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(TextView textView) {
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), znf.class) : null;
        if (spans == null) {
            spans = new znf[0];
        }
        for (Object obj : spans) {
            yl5 yl5Var = (yl5) ((znf) obj);
            Drawable drawable = yl5Var.getDrawable();
            WeakHashMap weakHashMap = yl5Var.Y;
            if (weakHashMap.put(textView, e5f.a) == null || drawable.getCallback() == null) {
                drawable.setCallback(new wl5(yl5Var, weakHashMap));
                drawable.invalidateSelf();
                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                if (animatable != null) {
                    animatable.start();
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextView textView = (TextView) this.a.get();
        if (textView != null) {
            a(textView);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a((TextView) view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), znf.class) : null;
        if (spans == null) {
            spans = new znf[0];
        }
        for (Object obj : spans) {
            ((yl5) ((znf) obj)).c(textView);
        }
    }
}
