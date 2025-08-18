package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k02 {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public k02(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i2;
    }

    public final void a(char c) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                i02 i02Var = (i02) arrayList.get(size);
                int i = i02Var.c;
                if (i != length) {
                    return;
                }
                i02Var.c = i - 1;
            }
        }
    }

    public final xz3 c(int i) {
        float f;
        int i2 = this.e + this.f;
        int i3 = 32 - i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i4 >= arrayList.size()) {
                break;
            }
            CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i4);
            int i5 = maf.a;
            if (charSequenceSubSequence.length() > i3) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i3);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
            i4++;
        }
        SpannableString spannableStringD = d();
        int i6 = maf.a;
        int length = spannableStringD.length();
        CharSequence charSequenceSubSequence2 = spannableStringD;
        if (length > i3) {
            charSequenceSubSequence2 = spannableStringD.subSequence(0, i3);
        }
        spannableStringBuilder.append(charSequenceSubSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i3 - spannableStringBuilder.length();
        int i7 = i2 - length2;
        int i8 = i != Integer.MIN_VALUE ? i : (this.g != 2 || (Math.abs(i7) >= 3 && length2 >= 0)) ? (this.g != 2 || i7 <= 0) ? 0 : 2 : 1;
        if (i8 != 1) {
            if (i8 == 2) {
                i2 = 32 - length2;
            }
            f = ((i2 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        float f2 = f;
        int i9 = this.d;
        if (i9 > 7) {
            i9 -= 17;
        } else if (this.g == 1) {
            i9 -= this.h - 1;
        }
        return new xz3(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i9, 1, Integer.MIN_VALUE, f2, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i5 >= arrayList.size()) {
                break;
            }
            i02 i02Var = (i02) arrayList.get(i5);
            boolean z2 = i02Var.b;
            int i7 = i02Var.a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = m02.L0[i7];
                }
                z = z3;
            }
            int i8 = i02Var.c;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((i02) arrayList.get(i5)).c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
