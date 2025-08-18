package androidx.core.widget;

import android.view.ActionMode;
import android.widget.TextView;
import defpackage.c54;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(TextView textView, int i) {
        c54.m(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback b(ActionMode.Callback callback) {
        return callback instanceof TextViewCompat$OreoCallback ? ((TextViewCompat$OreoCallback) callback).getWrappedCallback() : callback;
    }
}
