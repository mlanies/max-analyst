package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.HTTP;

/* loaded from: classes.dex */
public abstract class w9e extends eae {
    public static /* synthetic */ int A0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return x0(i, charSequence, str, z);
    }

    public static final int B0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iV0 = v0(charSequence);
        if (i > iV0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (nd7.o(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iV0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean C0(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!nd7.E(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char D0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(v0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int E0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = v0(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int iV0 = v0(charSequence);
        if (i > iV0) {
            i = iV0;
        }
        while (-1 < i) {
            if (nd7.o(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int F0(String str, CharSequence charSequence, int i) {
        int iV0 = (i & 2) != 0 ? v0(charSequence) : 0;
        return !(charSequence instanceof String) ? y0(charSequence, str, iV0, 0, false, true) : ((String) charSequence).lastIndexOf(str, iV0);
    }

    public static r1f G0(CharSequence charSequence) {
        return R0(charSequence, new String[]{HTTP.CRLF, "\n", "\r"}, false, 6);
    }

    public static String H0(String str, int i, char c) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static kh4 I0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        N0(i);
        return new kh4(charSequence, 0, i, new fae(Arrays.asList(strArr), z, 1));
    }

    public static final boolean J0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!nd7.o(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String K0(String str, String str2) {
        return T0(str2, str) ? str.substring(str2.length()) : str;
    }

    public static String L0(String str, String str2) {
        return t0(str2, str) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static StringBuilder M0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            throw new IndexOutOfBoundsException(wg0.h("End index (", i2, ") is less than start index (", i, ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void N0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List O0(int i, CharSequence charSequence, String str, boolean z) {
        N0(i);
        int length = 0;
        int iX0 = x0(0, charSequence, str, z);
        if (iX0 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iX0).toString());
            length = str.length() + iX0;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iX0 = x0(length, charSequence, str, z);
        } while (iX0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List P0(CharSequence charSequence, char[] cArr) {
        boolean z = false;
        if (cArr.length == 1) {
            return O0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        N0(0);
        kh4<j37> kh4Var = new kh4(charSequence, 0, 0, new fae(cArr, z, 0));
        ArrayList arrayList = new ArrayList(z53.S(new zs(3, kh4Var), 10));
        for (j37 j37Var : kh4Var) {
            arrayList.add(charSequence.subSequence(j37Var.a, j37Var.b + 1).toString());
        }
        return arrayList;
    }

    public static List Q0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return O0(0, charSequence, str, z);
            }
        }
        kh4<j37> kh4VarI0 = I0(charSequence, strArr, z, 0);
        ArrayList arrayList = new ArrayList(z53.S(new zs(3, kh4VarI0), 10));
        for (j37 j37Var : kh4VarI0) {
            arrayList.add(charSequence.subSequence(j37Var.a, j37Var.b + 1).toString());
        }
        return arrayList;
    }

    public static r1f R0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return new r1f(I0(charSequence, strArr, z, 0), new c0(9, charSequence));
    }

    public static boolean S0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && nd7.o(charSequence.charAt(0), c, false);
    }

    public static boolean T0(String str, CharSequence charSequence) {
        return ((charSequence instanceof String) && (str instanceof String)) ? eae.o0((String) charSequence, str, false) : J0(charSequence, 0, str, 0, str.length(), false);
    }

    public static String U0(String str, String str2) {
        int iA0 = A0(str, str2, 0, false, 6);
        return iA0 == -1 ? str : str.substring(str2.length() + iA0, str.length());
    }

    public static String V0(String str) {
        int iE0 = E0(str, '.', 0, 6);
        return iE0 == -1 ? str : str.substring(iE0 + 1, str.length());
    }

    public static String W0(String str, String str2) {
        int iA0 = A0(str, str2, 0, false, 6);
        return iA0 == -1 ? str : str.substring(0, iA0);
    }

    public static CharSequence X0(int i, CharSequence charSequence) {
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String Y0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String Z0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static Boolean a1(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence b1(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zE = nd7.E(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zE) {
                    break;
                }
                length--;
            } else if (zE) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean p0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (A0(charSequence, (String) charSequence2, 0, z, 2) < 0) {
                return false;
            }
        } else if (y0(charSequence, charSequence2, 0, charSequence.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean q0(CharSequence charSequence, char c) {
        return z0(charSequence, c, 0, false, 2) >= 0;
    }

    public static String r0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static boolean s0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && nd7.o(charSequence.charAt(v0(charSequence)), c, false);
    }

    public static boolean t0(String str, CharSequence charSequence) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : J0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static Character u0(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static int v0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static Character w0(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final int x0(int i, CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? y0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int y0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        h37 h37Var;
        if (z2) {
            int iV0 = v0(charSequence);
            if (i > iV0) {
                i = iV0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            h37Var = new h37(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            h37Var = new j37(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = h37Var.c;
        int i4 = h37Var.b;
        int i5 = h37Var.a;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!eae.l0(0, i5, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!J0(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int z0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return (z || !(charSequence instanceof String)) ? B0(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }
}
