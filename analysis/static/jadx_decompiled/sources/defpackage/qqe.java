package defpackage;

import android.graphics.drawable.Drawable;
import android.text.DynamicLayout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class qqe {
    public static final ArrayList a;

    static {
        List listM0 = ys.m0(DynamicLayout.class.getDeclaredClasses());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM0) {
            if (SpanWatcher.class.isAssignableFrom((Class) obj)) {
                arrayList.add(obj);
            }
        }
        a = arrayList;
    }

    public static final ecf a(TextView textView) {
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable instanceof ecf) {
            return (ecf) drawable;
        }
        return null;
    }

    public static final void b(TextView textView, Object obj) {
        int spanEnd;
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            textView.invalidate();
            return;
        }
        int spanStart = spannable.getSpanStart(obj);
        if (spanStart != -1 && (spanEnd = spannable.getSpanEnd(obj)) >= spanStart) {
            CharSequence text2 = textView.getText();
            Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), SpanWatcher.class) : null;
            if (spans == null) {
                spans = new SpanWatcher[0];
            }
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) spans;
            if (spanWatcherArr.length == 0) {
                return;
            }
            for (SpanWatcher spanWatcher : spanWatcherArr) {
                ArrayList arrayList = a;
                if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                    spanWatcher.onSpanChanged(spannable, obj, spanStart, spanEnd, spanStart, spanEnd);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()) == spanWatcher.getClass()) {
                            break;
                        }
                    }
                    spanWatcher.onSpanChanged(spannable, obj, spanStart, spanEnd, spanStart, spanEnd);
                }
            }
        }
    }

    public static final boolean c(TextView textView) {
        int i;
        ecf ecfVarA = a(textView);
        return (ecfVarA == null || (i = ecfVarA.a) == 0 || i24.I(e(textView)) == i) ? false : true;
    }

    public static final void d(TextView textView, ecf ecfVar) {
        int i;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ecfVar, (Drawable) null);
        textView.setCompoundDrawablePadding((ecfVar == null || (i = ecfVar.a) == 0) ? 0 : tu0.G(h4f.f(i) * fk4.d().getDisplayMetrics().density));
    }

    public static final float e(TextView textView) {
        return textView.getPaint().getTextSize() / textView.getResources().getDisplayMetrics().density;
    }
}
