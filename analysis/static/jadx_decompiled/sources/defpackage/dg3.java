package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes2.dex */
public final /* synthetic */ class dg3 implements InputFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ dg3(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (!eg3.b.a(charSequence)) {
                    break;
                }
                break;
            default:
                bc7[] bc7VarArr = sv8.Q0;
                break;
        }
        return "";
    }
}
