package defpackage;

/* loaded from: classes.dex */
public abstract class dy9 {
    public static final String a = String.valueOf(Integer.MIN_VALUE);
    public static final String b = String.valueOf(Long.MIN_VALUE);
    public static final int[] c = new int[1000];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    c[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
    }

    public static int a(char[] cArr, int i, int i2) {
        int i3 = c[i];
        cArr[i2] = (char) (i3 >> 16);
        int i4 = i2 + 2;
        cArr[i2 + 1] = (char) ((i3 >> 8) & 127);
        int i5 = i2 + 3;
        cArr[i4] = (char) (i3 & 127);
        return i5;
    }

    public static int b(char[] cArr, int i, int i2) {
        int i3 = c[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & 127);
        return i4;
    }

    public static int c(char[] cArr, int i, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = c;
        int i6 = iArr[i5];
        cArr[i2] = (char) (i6 >> 16);
        cArr[i2 + 1] = (char) ((i6 >> 8) & 127);
        cArr[i2 + 2] = (char) (i6 & 127);
        int i7 = iArr[i3 - (i5 * 1000)];
        cArr[i2 + 3] = (char) (i7 >> 16);
        cArr[i2 + 4] = (char) ((i7 >> 8) & 127);
        cArr[i2 + 5] = (char) (i7 & 127);
        int i8 = iArr[i4];
        cArr[i2 + 6] = (char) (i8 >> 16);
        int i9 = i2 + 8;
        cArr[i2 + 7] = (char) ((i8 >> 8) & 127);
        int i10 = i2 + 9;
        cArr[i9] = (char) (i8 & 127);
        return i10;
    }

    public static int d(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = a;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return length + i2;
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return a(cArr, i - (i4 * 1000), b(cArr, i4, i2));
            }
            if (i >= 10) {
                return b(cArr, i, i2);
            }
            cArr[i2] = (char) (i + 48);
            return i2 + 1;
        }
        if (i < 1000000000) {
            int i5 = i / 1000;
            int i6 = i5 / 1000;
            return a(cArr, i - (i5 * 1000), a(cArr, i5 - (i6 * 1000), b(cArr, i6, i2)));
        }
        int i7 = i - 1000000000;
        if (i7 >= 1000000000) {
            i7 = i - 2000000000;
            i3 = i2 + 1;
            cArr[i2] = '2';
        } else {
            i3 = i2 + 1;
            cArr[i2] = '1';
        }
        return c(cArr, i7, i3);
    }

    public static int e(long j, char[] cArr, int i) {
        int iC;
        if (j < 0) {
            if (j > -2147483648L) {
                return d(cArr, (int) j, i);
            }
            if (j == Long.MIN_VALUE) {
                String str = b;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return length + i;
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return d(cArr, (int) j, i);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i2 = (int) j2;
            int[] iArr = c;
            if (i2 >= 1000000) {
                int i3 = i2 / 1000;
                int i4 = i2 - (i3 * 1000);
                int i5 = i3 / 1000;
                int iB = b(cArr, i5, i);
                int i6 = iArr[i3 - (i5 * 1000)];
                cArr[iB] = (char) (i6 >> 16);
                cArr[iB + 1] = (char) ((i6 >> 8) & 127);
                cArr[iB + 2] = (char) (i6 & 127);
                int i7 = iArr[i4];
                cArr[iB + 3] = (char) (i7 >> 16);
                int i8 = iB + 5;
                cArr[iB + 4] = (char) ((i7 >> 8) & 127);
                iC = iB + 6;
                cArr[i8] = (char) (i7 & 127);
            } else if (i2 < 1000) {
                iC = b(cArr, i2, i);
            } else {
                int i9 = i2 / 1000;
                int i10 = i2 - (i9 * 1000);
                int i11 = iArr[i9];
                if (i9 > 9) {
                    if (i9 > 99) {
                        cArr[i] = (char) (i11 >> 16);
                        i++;
                    }
                    cArr[i] = (char) ((i11 >> 8) & 127);
                    i++;
                }
                cArr[i] = (char) (i11 & 127);
                int i12 = iArr[i10];
                cArr[i + 1] = (char) (i12 >> 16);
                int i13 = i + 3;
                cArr[i + 2] = (char) ((i12 >> 8) & 127);
                iC = i + 4;
                cArr[i13] = (char) (i12 & 127);
            }
        } else {
            long j4 = j2 / 1000000000;
            int iB2 = b(cArr, (int) j4, i);
            iC = c(cArr, (int) (j2 - (1000000000 * j4)), iB2);
        }
        return c(cArr, (int) j3, iC);
    }
}
