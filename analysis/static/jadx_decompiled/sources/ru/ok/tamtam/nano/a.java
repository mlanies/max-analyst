package ru.ok.tamtam.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import defpackage.nd7;
import defpackage.qw8;
import defpackage.x43;
import defpackage.y43;
import defpackage.zw5;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class a extends qw8 {
    public static volatile a[] m;
    public String a = "";
    public String b = "";
    public String c = "";
    public long[] d;
    public long[] e;
    public String[] f;
    public boolean g;
    public Protos.MessageElements h;
    public long i;
    public zw5 j;
    public zw5 k;
    public zw5 l;

    public a() {
        long[] jArr = nd7.d;
        this.d = jArr;
        this.e = jArr;
        this.f = nd7.f;
        this.g = false;
        this.h = null;
        this.i = 0L;
        this.j = null;
        this.k = null;
        this.l = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        long[] jArr;
        long[] jArr2;
        int i = 0;
        int iL = !this.a.equals("") ? y43.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            iL += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iL += y43.l(3, this.c);
        }
        long[] jArr3 = this.d;
        if (jArr3 != null && jArr3.length > 0) {
            int i2 = 0;
            int iK = 0;
            while (true) {
                jArr2 = this.d;
                if (i2 >= jArr2.length) {
                    break;
                }
                iK += y43.k(jArr2[i2]);
                i2++;
            }
            iL = iL + iK + jArr2.length;
        }
        long[] jArr4 = this.e;
        if (jArr4 != null && jArr4.length > 0) {
            int i3 = 0;
            int iK2 = 0;
            while (true) {
                jArr = this.e;
                if (i3 >= jArr.length) {
                    break;
                }
                iK2 += y43.k(jArr[i3]);
                i3++;
            }
            iL = iL + iK2 + jArr.length;
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            int iJ = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    i4++;
                    int iQ = y43.q(str);
                    iJ = y43.j(iQ) + iQ + iJ;
                }
                i++;
            }
            iL = iL + iJ + i4;
        }
        if (this.g) {
            iL += y43.a(7);
        }
        Protos.MessageElements messageElements = this.h;
        if (messageElements != null) {
            iL += y43.i(8, messageElements);
        }
        long j = this.i;
        if (j != 0) {
            iL += y43.h(9, j);
        }
        zw5 zw5Var = this.j;
        if (zw5Var != null) {
            iL += y43.i(10, zw5Var);
        }
        zw5 zw5Var2 = this.k;
        if (zw5Var2 != null) {
            iL += y43.i(11, zw5Var2);
        }
        zw5 zw5Var3 = this.l;
        return zw5Var3 != null ? iL + y43.i(12, zw5Var3) : iL;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            switch (iS) {
                case 0:
                    break;
                case 10:
                    this.a = x43Var.r();
                    break;
                case 18:
                    this.b = x43Var.r();
                    break;
                case 26:
                    this.c = x43Var.r();
                    break;
                case 32:
                    int iW = nd7.w(x43Var, 32);
                    long[] jArr = this.d;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iW + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = x43Var.q();
                        x43Var.s();
                        length++;
                    }
                    jArr2[length] = x43Var.q();
                    this.d = jArr2;
                    break;
                case 34:
                    int iE = x43Var.e(x43Var.p());
                    int iC = x43Var.c();
                    int i2 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.q();
                        i2++;
                    }
                    x43Var.t(iC);
                    long[] jArr3 = this.d;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = x43Var.q();
                        length2++;
                    }
                    this.d = jArr4;
                    x43Var.d(iE);
                    break;
                case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                    int iW2 = nd7.w(x43Var, 40);
                    long[] jArr5 = this.e;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    int i4 = iW2 + length3;
                    long[] jArr6 = new long[i4];
                    if (length3 != 0) {
                        System.arraycopy(jArr5, 0, jArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        jArr6[length3] = x43Var.q();
                        x43Var.s();
                        length3++;
                    }
                    jArr6[length3] = x43Var.q();
                    this.e = jArr6;
                    break;
                case 42:
                    int iE2 = x43Var.e(x43Var.p());
                    int iC2 = x43Var.c();
                    int i5 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.q();
                        i5++;
                    }
                    x43Var.t(iC2);
                    long[] jArr7 = this.e;
                    int length4 = jArr7 == null ? 0 : jArr7.length;
                    int i6 = i5 + length4;
                    long[] jArr8 = new long[i6];
                    if (length4 != 0) {
                        System.arraycopy(jArr7, 0, jArr8, 0, length4);
                    }
                    while (length4 < i6) {
                        jArr8[length4] = x43Var.q();
                        length4++;
                    }
                    this.e = jArr8;
                    x43Var.d(iE2);
                    break;
                case 50:
                    int iW3 = nd7.w(x43Var, 50);
                    String[] strArr = this.f;
                    int length5 = strArr == null ? 0 : strArr.length;
                    int i7 = iW3 + length5;
                    String[] strArr2 = new String[i7];
                    if (length5 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length5);
                    }
                    while (length5 < i7 - 1) {
                        strArr2[length5] = x43Var.r();
                        x43Var.s();
                        length5++;
                    }
                    strArr2[length5] = x43Var.r();
                    this.f = strArr2;
                    break;
                case 56:
                    this.g = x43Var.f();
                    break;
                case 66:
                    if (this.h == null) {
                        this.h = new Protos.MessageElements();
                    }
                    x43Var.j(this.h);
                    break;
                case 72:
                    this.i = x43Var.q();
                    break;
                case 82:
                    if (this.j == null) {
                        this.j = new zw5(0);
                    }
                    x43Var.j(this.j);
                    break;
                case 90:
                    if (this.k == null) {
                        this.k = new zw5(2);
                    }
                    x43Var.j(this.k);
                    break;
                case 98:
                    if (this.l == null) {
                        this.l = new zw5(1);
                    }
                    x43Var.j(this.l);
                    break;
                default:
                    if (!x43Var.u(iS)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (!this.a.equals("")) {
            y43Var.E(1, this.a);
        }
        if (!this.b.equals("")) {
            y43Var.E(2, this.b);
        }
        if (!this.c.equals("")) {
            y43Var.E(3, this.c);
        }
        long[] jArr = this.d;
        int i = 0;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.d;
                if (i2 >= jArr2.length) {
                    break;
                }
                y43Var.x(4, jArr2[i2]);
                i2++;
            }
        }
        long[] jArr3 = this.e;
        if (jArr3 != null && jArr3.length > 0) {
            int i3 = 0;
            while (true) {
                long[] jArr4 = this.e;
                if (i3 >= jArr4.length) {
                    break;
                }
                y43Var.x(5, jArr4[i3]);
                i3++;
            }
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    y43Var.E(6, str);
                }
                i++;
            }
        }
        boolean z = this.g;
        if (z) {
            y43Var.r(7, z);
        }
        Protos.MessageElements messageElements = this.h;
        if (messageElements != null) {
            y43Var.y(8, messageElements);
        }
        long j = this.i;
        if (j != 0) {
            y43Var.x(9, j);
        }
        zw5 zw5Var = this.j;
        if (zw5Var != null) {
            y43Var.y(10, zw5Var);
        }
        zw5 zw5Var2 = this.k;
        if (zw5Var2 != null) {
            y43Var.y(11, zw5Var2);
        }
        zw5 zw5Var3 = this.l;
        if (zw5Var3 != null) {
            y43Var.y(12, zw5Var3);
        }
    }
}
