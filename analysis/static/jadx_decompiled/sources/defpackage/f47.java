package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public final class f47 implements TextWatcher {
    public int X;
    public int Y;
    public final boolean Z;
    public final zua a;
    public boolean c;
    public dt o;
    public boolean b = false;
    public int s0 = 0;
    public int t0 = 0;

    public f47(zua zuaVar, String str, int i, int i2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.a = zuaVar;
        b(i, str);
        this.Z = true;
        this.Y = i2;
    }

    public final String a(CharSequence charSequence) {
        this.o.f();
        String str = "+" + this.X;
        boolean z = this.Z;
        if (z || (charSequence.length() > 0 && charSequence.charAt(0) != '0')) {
            charSequence = str + ((Object) charSequence);
        }
        int length = charSequence.length();
        char c = 0;
        String strI = "";
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                if (c != 0) {
                    strI = this.o.i(c);
                }
                c = cCharAt;
            }
        }
        if (c != 0) {
            strI = this.o.i(c);
        }
        String strTrim = strI.trim();
        if (z || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            strTrim = strTrim.length() > str.length() ? strTrim.charAt(str.length()) == ' ' ? strTrim.substring(str.length() + 1) : strTrim.substring(str.length()) : "";
        }
        return TextUtils.isEmpty(strTrim) ? "" : strTrim;
    }

    @Override // android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        try {
            if (this.b) {
                return;
            }
            int selectionEnd = Selection.getSelectionEnd(editable);
            int i = 0;
            for (int i2 = 0; i2 < editable.length(); i2++) {
                if (PhoneNumberUtils.isNonSeparator(editable.charAt(i2))) {
                    i++;
                }
            }
            int i3 = this.Y;
            if (i > i3) {
                int i4 = i - i3;
                int iMax = Math.max(this.s0 + this.t0, 1) - 1;
                this.b = true;
                while (iMax < editable.length() && i4 > 0) {
                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(iMax))) {
                        editable.delete(iMax, iMax + 1);
                        i4--;
                    } else {
                        iMax++;
                    }
                }
                this.b = false;
                return;
            }
            if (this.c) {
                this.c = editable.length() != 0;
                return;
            }
            boolean z = selectionEnd == editable.length();
            String strA = a(editable);
            if (!strA.equals(editable.toString())) {
                if (!z) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < editable.length() && i6 < selectionEnd; i6++) {
                        if (PhoneNumberUtils.isNonSeparator(editable.charAt(i6))) {
                            i5++;
                        }
                    }
                    selectionEnd = 0;
                    int i7 = 0;
                    while (true) {
                        if (selectionEnd >= strA.length()) {
                            selectionEnd = 0;
                            break;
                        } else {
                            if (i7 == i5) {
                                break;
                            }
                            if (PhoneNumberUtils.isNonSeparator(strA.charAt(selectionEnd))) {
                                i7++;
                            }
                            selectionEnd++;
                        }
                    }
                } else {
                    selectionEnd = strA.length();
                }
            }
            if (!z) {
                while (true) {
                    int i8 = selectionEnd - 1;
                    if (i8 > 0 && !PhoneNumberUtils.isNonSeparator(strA.charAt(i8))) {
                        selectionEnd--;
                    }
                }
            }
            try {
                this.b = true;
                editable.replace(0, editable.length(), strA, 0, strA.length());
                this.b = false;
                Selection.setSelection(editable, selectionEnd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(int i, String str) {
        this.X = i;
        zua zuaVar = this.a;
        zuaVar.getClass();
        dt dtVar = new dt(zuaVar, str);
        this.o = dtVar;
        dtVar.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b || this.c || i2 <= 0) {
            return;
        }
        for (int i4 = i; i4 < i + i2; i4++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                this.c = true;
                this.o.f();
                return;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.s0 = i;
        this.t0 = i3;
        if (this.b || this.c || i3 <= 0) {
            return;
        }
        for (int i4 = i; i4 < i + i3; i4++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                this.c = true;
                this.o.f();
                return;
            }
        }
    }
}
