package defpackage;

/* loaded from: classes.dex */
public final class s02 {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ s02(byte[] bArr, int i, int i2, byte b) {
        this.a = i2;
        this.b = bArr;
        this.e = i;
    }

    public void a() {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.a) {
            case 1:
                int i5 = this.c;
                np8.f(i5 >= 0 && (i5 < (i = this.e) || (i5 == i && this.d == 0)));
                break;
            case 2:
                int i6 = this.c;
                fm9.k(i6 >= 0 && (i6 < (i2 = this.e) || (i6 == i2 && this.d == 0)));
                break;
            case 3:
                int i7 = this.d;
                np8.f(i7 >= 0 && (i7 < (i3 = this.c) || (i7 == i3 && this.e == 0)));
                break;
            default:
                int i8 = this.d;
                fm9.k(i8 >= 0 && (i8 < (i4 = this.c) || (i8 == i4 && this.e == 0)));
                break;
        }
    }

    public int b() {
        switch (this.a) {
        }
        return ((this.e - this.c) * 8) - this.d;
    }

    public void c() {
        switch (this.a) {
            case 1:
                if (this.d != 0) {
                    this.d = 0;
                    this.c++;
                    a();
                    break;
                }
                break;
            default:
                if (this.d != 0) {
                    this.d = 0;
                    this.c++;
                    a();
                    break;
                }
                break;
        }
    }

    public boolean d(int i) {
        switch (this.a) {
            case 3:
                int i2 = this.d;
                int i3 = i / 8;
                int i4 = i2 + i3;
                int i5 = (this.e + i) - (i3 * 8);
                if (i5 > 7) {
                    i4++;
                    i5 -= 8;
                }
                while (true) {
                    i2++;
                    if (i2 <= i4 && i4 < this.c) {
                        if (r(i2)) {
                            i4++;
                            i2 += 2;
                        }
                    }
                }
                int i6 = this.c;
                if (i4 >= i6) {
                    if (i4 != i6 || i5 != 0) {
                    }
                }
                break;
            default:
                int i7 = this.d;
                int i8 = i / 8;
                int i9 = i7 + i8;
                int i10 = (this.e + i) - (i8 * 8);
                if (i10 > 7) {
                    i9++;
                    i10 -= 8;
                }
                while (true) {
                    i7++;
                    if (i7 <= i9 && i9 < this.c) {
                        if (r(i7)) {
                            i9++;
                            i7 += 2;
                        }
                    }
                }
                int i11 = this.c;
                if (i9 >= i11) {
                    if (i9 != i11 || i10 != 0) {
                    }
                }
                break;
        }
        return true;
    }

    public boolean e() {
        switch (this.a) {
            case 3:
                int i = this.d;
                int i2 = this.e;
                int i3 = 0;
                while (this.d < this.c && !h()) {
                    i3++;
                }
                boolean z = this.d == this.c;
                this.d = i;
                this.e = i2;
                if (!z && d((i3 * 2) + 1)) {
                    break;
                }
                break;
            default:
                int i4 = this.d;
                int i5 = this.e;
                int i6 = 0;
                while (this.d < this.c && !h()) {
                    i6++;
                }
                boolean z2 = this.d == this.c;
                this.d = i4;
                this.e = i5;
                if (!z2 && d((i6 * 2) + 1)) {
                    break;
                }
                break;
        }
        return true;
    }

    public int f() {
        switch (this.a) {
            case 1:
                np8.f(this.d == 0);
                break;
            default:
                fm9.k(this.d == 0);
                break;
        }
        return this.c;
    }

    public int g() {
        switch (this.a) {
        }
        return (this.c * 8) + this.d;
    }

    public boolean h() {
        switch (this.a) {
            case 1:
                boolean z = (this.b[this.c] & (128 >> this.d)) != 0;
                s();
                return z;
            case 2:
                boolean z2 = (this.b[this.c] & (128 >> this.d)) != 0;
                s();
                return z2;
            case 3:
                boolean z3 = (this.b[this.d] & (128 >> this.e)) != 0;
                s();
                return z3;
            case 4:
                boolean z4 = (this.b[this.d] & (128 >> this.e)) != 0;
                s();
                return z4;
            case 5:
                boolean z5 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                t(1);
                return z5;
            default:
                boolean z6 = (((this.b[this.d] & 255) >> this.e) & 1) == 1;
                t(1);
                return z6;
        }
    }

    public int i(int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.d;
                    if (i3 <= 8) {
                        byte[] bArr = this.b;
                        int i4 = this.c;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((bArr[i4] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.d = 0;
                            this.c = i4 + 1;
                        }
                        a();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.d = i6;
                    byte[] bArr2 = this.b;
                    int i7 = this.c;
                    this.c = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
            case 2:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.d;
                    if (i9 <= 8) {
                        byte[] bArr3 = this.b;
                        int i10 = this.c;
                        int i11 = ((-1) >>> (32 - i)) & (i8 | ((bArr3[i10] & 255) >> (8 - i9)));
                        if (i9 == 8) {
                            this.d = 0;
                            this.c = i10 + 1;
                        }
                        a();
                        return i11;
                    }
                    int i12 = i9 - 8;
                    this.d = i12;
                    byte[] bArr4 = this.b;
                    int i13 = this.c;
                    this.c = i13 + 1;
                    i8 |= (bArr4[i13] & 255) << i12;
                }
            case 3:
                this.e += i;
                int i14 = 0;
                while (true) {
                    int i15 = this.e;
                    if (i15 <= 8) {
                        byte[] bArr5 = this.b;
                        int i16 = this.d;
                        int i17 = ((-1) >>> (32 - i)) & (i14 | ((bArr5[i16] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.e = 0;
                            this.d = i16 + (r(i16 + 1) ? 2 : 1);
                        }
                        a();
                        return i17;
                    }
                    int i18 = i15 - 8;
                    this.e = i18;
                    byte[] bArr6 = this.b;
                    int i19 = this.d;
                    i14 |= (bArr6[i19] & 255) << i18;
                    if (!r(i19 + 1)) {
                        i = 1;
                    }
                    this.d = i19 + i;
                }
            case 4:
                this.e += i;
                int i20 = 0;
                while (true) {
                    int i21 = this.e;
                    if (i21 <= 8) {
                        byte[] bArr7 = this.b;
                        int i22 = this.d;
                        int i23 = ((-1) >>> (32 - i)) & (i20 | ((bArr7[i22] & 255) >> (8 - i21)));
                        if (i21 == 8) {
                            this.e = 0;
                            this.d = i22 + (r(i22 + 1) ? 2 : 1);
                        }
                        a();
                        return i23;
                    }
                    int i24 = i21 - 8;
                    this.e = i24;
                    byte[] bArr8 = this.b;
                    int i25 = this.d;
                    i20 |= (bArr8[i25] & 255) << i24;
                    if (!r(i25 + 1)) {
                        i = 1;
                    }
                    this.d = i25 + i;
                }
            case 5:
                int i26 = this.d;
                int iMin = Math.min(i, 8 - this.e);
                int i27 = i26 + 1;
                byte[] bArr9 = this.b;
                int i28 = ((bArr9[i26] & 255) >> this.e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i28 |= (bArr9[i27] & 255) << iMin;
                    iMin += 8;
                    i27++;
                }
                int i29 = i28 & ((-1) >>> (32 - i));
                t(i);
                return i29;
            default:
                int i30 = this.d;
                int iMin2 = Math.min(i, 8 - this.e);
                int i31 = i30 + 1;
                byte[] bArr10 = this.b;
                int i32 = ((bArr10[i30] & 255) >> this.e) & (255 >> (8 - iMin2));
                while (iMin2 < i) {
                    i32 |= (bArr10[i31] & 255) << iMin2;
                    iMin2 += 8;
                    i31++;
                }
                int i33 = i32 & ((-1) >>> (32 - i));
                t(i);
                return i33;
        }
    }

    public void j(int i, byte[] bArr) {
        switch (this.a) {
            case 1:
                int i2 = i >> 3;
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr2 = this.b;
                    int i4 = this.c;
                    int i5 = i4 + 1;
                    this.c = i5;
                    byte b = bArr2[i4];
                    int i6 = this.d;
                    byte b2 = (byte) (b << i6);
                    bArr[i3] = b2;
                    bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
                }
                int i7 = i & 7;
                if (i7 != 0) {
                    byte b3 = (byte) (bArr[i2] & (255 >> i7));
                    bArr[i2] = b3;
                    int i8 = this.d;
                    if (i8 + i7 > 8) {
                        byte[] bArr3 = this.b;
                        int i9 = this.c;
                        this.c = i9 + 1;
                        bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                        this.d = i8 - 8;
                    }
                    int i10 = this.d + i7;
                    this.d = i10;
                    byte[] bArr4 = this.b;
                    int i11 = this.c;
                    bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
                    if (i10 == 8) {
                        this.d = 0;
                        this.c = i11 + 1;
                    }
                    a();
                    break;
                }
                break;
            default:
                int i12 = i >> 3;
                for (int i13 = 0; i13 < i12; i13++) {
                    byte[] bArr5 = this.b;
                    int i14 = this.c;
                    int i15 = i14 + 1;
                    this.c = i15;
                    byte b4 = bArr5[i14];
                    int i16 = this.d;
                    byte b5 = (byte) (b4 << i16);
                    bArr[i13] = b5;
                    bArr[i13] = (byte) (((255 & bArr5[i15]) >> (8 - i16)) | b5);
                }
                int i17 = i & 7;
                if (i17 != 0) {
                    byte b6 = (byte) (bArr[i12] & (255 >> i17));
                    bArr[i12] = b6;
                    int i18 = this.d;
                    if (i18 + i17 > 8) {
                        byte[] bArr6 = this.b;
                        int i19 = this.c;
                        this.c = i19 + 1;
                        bArr[i12] = (byte) (b6 | ((bArr6[i19] & 255) << i18));
                        this.d = i18 - 8;
                    }
                    int i20 = this.d + i17;
                    this.d = i20;
                    byte[] bArr7 = this.b;
                    int i21 = this.c;
                    bArr[i12] = (byte) (((byte) (((255 & bArr7[i21]) >> (8 - i20)) << (8 - i17))) | bArr[i12]);
                    if (i20 == 8) {
                        this.d = 0;
                        this.c = i21 + 1;
                    }
                    a();
                    break;
                }
                break;
        }
    }

    public long k(int i) {
        if (i <= 32) {
            int i2 = i(i);
            int i3 = oaf.a;
            return i2 & 4294967295L;
        }
        int i4 = i(i - 32);
        int i5 = i(32);
        int i6 = oaf.a;
        return (i5 & 4294967295L) | ((i4 & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        switch (this.a) {
            case 1:
                np8.f(this.d == 0);
                System.arraycopy(this.b, this.c, bArr, 0, i);
                this.c += i;
                a();
                break;
            default:
                fm9.k(this.d == 0);
                System.arraycopy(this.b, this.c, bArr, 0, i);
                this.c += i;
                a();
                break;
        }
    }

    public int m() {
        switch (this.a) {
            case 3:
                int i = 0;
                while (!h()) {
                    i++;
                }
                return ((1 << i) - 1) + (i > 0 ? i(i) : 0);
            default:
                int i2 = 0;
                while (!h()) {
                    i2++;
                }
                return ((1 << i2) - 1) + (i2 > 0 ? i(i2) : 0);
        }
    }

    public int n() {
        switch (this.a) {
            case 3:
                int iM = m();
                return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
            default:
                int iM2 = m();
                return ((iM2 + 1) / 2) * (iM2 % 2 == 0 ? -1 : 1);
        }
    }

    public void o(int i, byte[] bArr) {
        switch (this.a) {
            case 1:
                this.b = bArr;
                this.c = 0;
                this.d = 0;
                this.e = i;
                break;
            default:
                this.b = bArr;
                this.c = 0;
                this.d = 0;
                this.e = i;
                break;
        }
    }

    public void p(wpa wpaVar) {
        o(wpaVar.c, wpaVar.a);
        q(wpaVar.b * 8);
    }

    public void q(int i) {
        switch (this.a) {
            case 1:
                int i2 = i / 8;
                this.c = i2;
                this.d = i - (i2 * 8);
                a();
                break;
            default:
                int i3 = i / 8;
                this.c = i3;
                this.d = i - (i3 * 8);
                a();
                break;
        }
    }

    public boolean r(int i) {
        switch (this.a) {
            case 3:
                if (2 <= i && i < this.c) {
                    byte[] bArr = this.b;
                    if (bArr[i] != 3 || bArr[i - 2] != 0 || bArr[i - 1] != 0) {
                    }
                }
                break;
            default:
                if (2 <= i && i < this.c) {
                    byte[] bArr2 = this.b;
                    if (bArr2[i] != 3 || bArr2[i - 2] != 0 || bArr2[i - 1] != 0) {
                    }
                }
                break;
        }
        return true;
    }

    public void s() {
        switch (this.a) {
            case 1:
                int i = this.d + 1;
                this.d = i;
                if (i == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                break;
            case 2:
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                break;
            case 3:
                int i3 = this.e + 1;
                this.e = i3;
                if (i3 == 8) {
                    this.e = 0;
                    int i4 = this.d;
                    this.d = i4 + (r(i4 + 1) ? 2 : 1);
                }
                a();
                break;
            default:
                int i5 = this.e + 1;
                this.e = i5;
                if (i5 == 8) {
                    this.e = 0;
                    int i6 = this.d;
                    this.d = i6 + (r(i6 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 1:
                int i4 = i / 8;
                int i5 = this.c + i4;
                this.c = i5;
                int i6 = (i - (i4 * 8)) + this.d;
                this.d = i6;
                if (i6 > 7) {
                    this.c = i5 + 1;
                    this.d = i6 - 8;
                }
                a();
                break;
            case 2:
                int i7 = i / 8;
                int i8 = this.c + i7;
                this.c = i8;
                int i9 = (i - (i7 * 8)) + this.d;
                this.d = i9;
                if (i9 > 7) {
                    this.c = i8 + 1;
                    this.d = i9 - 8;
                }
                a();
                break;
            case 3:
                int i10 = this.d;
                int i11 = i / 8;
                int i12 = i10 + i11;
                this.d = i12;
                int i13 = (i - (i11 * 8)) + this.e;
                this.e = i13;
                if (i13 > 7) {
                    this.d = i12 + 1;
                    this.e = i13 - 8;
                }
                while (true) {
                    i10++;
                    if (i10 > this.d) {
                        a();
                        break;
                    } else if (r(i10)) {
                        this.d++;
                        i10 += 2;
                    }
                }
            case 4:
                int i14 = this.d;
                int i15 = i / 8;
                int i16 = i14 + i15;
                this.d = i16;
                int i17 = (i - (i15 * 8)) + this.e;
                this.e = i17;
                if (i17 > 7) {
                    this.d = i16 + 1;
                    this.e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 > this.d) {
                        a();
                        break;
                    } else if (r(i14)) {
                        this.d++;
                        i14 += 2;
                    }
                }
            case 5:
                int i18 = i / 8;
                int i19 = this.d + i18;
                this.d = i19;
                int i20 = (i - (i18 * 8)) + this.e;
                this.e = i20;
                boolean z = true;
                if (i20 > 7) {
                    this.d = i19 + 1;
                    this.e = i20 - 8;
                }
                int i21 = this.d;
                if (i21 < 0 || (i21 >= (i2 = this.c) && (i21 != i2 || this.e != 0))) {
                    z = false;
                }
                np8.f(z);
                break;
            default:
                int i22 = i / 8;
                int i23 = this.d + i22;
                this.d = i23;
                int i24 = (i - (i22 * 8)) + this.e;
                this.e = i24;
                boolean z2 = true;
                if (i24 > 7) {
                    this.d = i23 + 1;
                    this.e = i24 - 8;
                }
                int i25 = this.d;
                if (i25 < 0 || (i25 >= (i3 = this.c) && (i25 != i3 || this.e != 0))) {
                    z2 = false;
                }
                fm9.k(z2);
                break;
        }
    }

    public void u(int i) {
        switch (this.a) {
            case 1:
                np8.f(this.d == 0);
                this.c += i;
                a();
                break;
            default:
                fm9.k(this.d == 0);
                this.c += i;
                a();
                break;
        }
    }

    public s02(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = oaf.f;
                break;
            default:
                this.b = maf.f;
                break;
        }
    }

    public s02(int i, int i2, int i3, byte[] bArr) {
        this.a = i3;
        switch (i3) {
            case 4:
                this.b = bArr;
                this.d = i;
                this.c = i2;
                this.e = 0;
                a();
                break;
            default:
                this.b = bArr;
                this.d = i;
                this.c = i2;
                this.e = 0;
                a();
                break;
        }
    }

    public s02(int i, byte[] bArr) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = bArr;
                this.c = bArr.length;
                break;
            default:
                this.b = bArr;
                this.c = bArr.length;
                break;
        }
    }

    public s02(int i, int i2) {
        this.a = 0;
        this.c = i;
        this.d = i2;
        this.b = new byte[(i2 * 2) - 1];
        this.e = 0;
    }
}
