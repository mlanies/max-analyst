package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class yx4 implements xx4 {
    public final String a;

    public /* synthetic */ yx4(String str) {
        this.a = str;
    }

    public static String a(long j) {
        return j == Long.MAX_VALUE ? "Long.MAX_VALUE" : j == Long.MIN_VALUE ? "Long.MIN_VALUE" : j < 0 ? String.valueOf(j) : String.format(Locale.ENGLISH, "%td.%tm/%tH:%tM:%tS", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j), Long.valueOf(j), Long.valueOf(j), Long.valueOf(j)}, 5));
    }

    public void b(String str) {
        hm9.n(this.a, str);
    }

    @Override // defpackage.xx4
    public Object h() {
        return this;
    }

    @Override // defpackage.xx4
    public boolean k(CharSequence charSequence, int i, int i2, b4f b4fVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        b4fVar.c = (b4fVar.c & 3) | 4;
        return false;
    }
}
