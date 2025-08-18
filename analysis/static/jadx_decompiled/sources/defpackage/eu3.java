package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public abstract class eu3 {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static String b(Context context) {
        return context.getAttributionTag();
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
