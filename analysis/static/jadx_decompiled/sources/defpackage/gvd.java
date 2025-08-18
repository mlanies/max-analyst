package defpackage;

import android.text.SpannableString;
import android.text.Spanned;

/* loaded from: classes2.dex */
public final class gvd extends SpannableString {
    public static final /* synthetic */ int a = 0;

    @Override // android.text.SpannableString
    public final boolean equals(Object obj) {
        if (!(obj instanceof Spanned) || !tpa.f(toString(), obj.toString())) {
            return false;
        }
        Spanned spanned = (Spanned) obj;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        Object[] spans2 = getSpans(0, length(), Object.class);
        if (spans2.length != spans.length) {
            return false;
        }
        int length = spans2.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = spans2[i];
            Object obj3 = spans[i];
            if (obj2 == this) {
                if (obj != obj3 || getSpanStart(obj2) != spanned.getSpanStart(obj3) || getSpanEnd(obj2) != spanned.getSpanEnd(obj3) || getSpanFlags(obj2) != spanned.getSpanFlags(obj3)) {
                    return false;
                }
            } else if (!tpa.f(obj2, obj3) || getSpanStart(obj2) != spanned.getSpanStart(obj3) || getSpanEnd(obj2) != spanned.getSpanEnd(obj3) || getSpanFlags(obj2) != spanned.getSpanFlags(obj3)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.text.SpannableString
    public final int hashCode() {
        return wmd.f(this);
    }
}
