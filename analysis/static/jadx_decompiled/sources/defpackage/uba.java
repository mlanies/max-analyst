package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class uba {
    public final Context a;
    public final ida b;

    public uba(Context context, ida idaVar) {
        this.a = context;
        this.b = idaVar;
    }

    public final CharSequence a(String str, List list, boolean z, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            CharSequence charSequenceU = "";
            ida idaVar = this.b;
            if (i >= length) {
                if (!z) {
                    return "";
                }
                if (!(!(strArr.length == 0))) {
                    return "";
                }
                CharSequence charSequenceE = idaVar.j.e(str);
                if (strArr.length != 0) {
                    return TextUtils.concat(charSequenceE, " ", strArr[0]);
                }
                throw new NoSuchElementException("Array is empty.");
            }
            String str2 = strArr[i];
            if (str2 != null && str2.length() != 0 && ema.x(str2, list)) {
                CharSequence charSequenceE2 = idaVar.j.e(str);
                if (ema.x(str2.toString(), list)) {
                    String string = str2.toString();
                    charSequenceU = ema.u(string, jyc.a.r().d(string.toString(), list), qp4.u0.b(this.a).i());
                }
                return TextUtils.concat(charSequenceE2, " ", charSequenceU);
            }
            i++;
        }
    }
}
