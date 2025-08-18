package defpackage;

/* loaded from: classes2.dex */
public final class ux4 {
    public final sy4 a;

    public ux4(sy4 sy4Var) {
        this.a = sy4Var;
    }

    public final ty4 a(CharSequence charSequence, int i, int i2) {
        int i3;
        sy4 sy4Var = this.a;
        if (sy4Var != null) {
            int i4 = i;
            int i5 = 0;
            int i6 = 0;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            while (i5 >= 0) {
                long[] jArr = (long[]) sy4Var.b;
                if (i5 >= jArr.length || i4 >= i2) {
                    break;
                }
                char cCharAt = charSequence.charAt(i4);
                int i11 = i5 + 1;
                sy4 sy4Var2 = sy4Var;
                int i12 = (((int) jArr[i5]) + i11) - 1;
                while (true) {
                    if (i11 > i12) {
                        i3 = -(i11 + 1);
                        break;
                    }
                    i3 = ((i12 - i11) >>> 1) + i11;
                    char c = (char) (jArr[i3] & 65535);
                    if (c >= cCharAt) {
                        if (c <= cCharAt) {
                            break;
                        }
                        i12 = i3 - 1;
                    } else {
                        i11 = i3 + 1;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                i6++;
                long j = jArr[i3];
                int i13 = (int) ((j >>> 48) & 65535);
                if (i13 == 65535) {
                    i13 = -1;
                }
                int i14 = (int) ((j >>> 40) & 255);
                if (i14 == 255) {
                    i14 = -1;
                }
                int i15 = (int) ((j >>> 32) & 255);
                if (i15 == 255) {
                    i15 = -1;
                }
                int i16 = (int) ((j >>> 24) & 255);
                if (i16 == 255) {
                    i16 = -1;
                }
                if (i14 != -1 && i15 != -1 && i16 != -1) {
                    i10 += i6;
                    i9 = i16;
                    i7 = i14;
                    i8 = i15;
                    i6 = 0;
                }
                i4++;
                sy4Var = sy4Var2;
                i5 = i13;
            }
            if (i7 != -1 && i8 != -1 && i9 != -1) {
                return new ty4(i7, i8, i9, i10, 0);
            }
        }
        return null;
    }
}
