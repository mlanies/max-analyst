package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ape extends u2 {
    public static final ape c = new ape(12, null);

    @Override // defpackage.u2
    public final boolean N1() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
