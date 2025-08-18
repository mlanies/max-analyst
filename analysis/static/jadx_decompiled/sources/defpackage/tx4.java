package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public interface tx4 {
    boolean a(int i, CharSequence charSequence);

    default CharSequence b(int i, CharSequence charSequence) {
        return e(charSequence);
    }

    List c(CharSequence charSequence);

    default CharSequence d(long j, String str, String str2, CharSequence charSequence, int i) {
        return "";
    }

    CharSequence e(CharSequence charSequence);

    default List f(CharSequence charSequence) {
        return Collections.emptyList();
    }

    boolean g(CharSequence charSequence);
}
