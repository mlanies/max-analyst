package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class zw5 extends qw8 {
    public final /* synthetic */ int a;
    public Serializable b;

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ax5[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Serializable, long[]] */
    public zw5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = nd7.c;
                this.cachedSize = -1;
                return;
            case 2:
                if (ax5.i == null) {
                    synchronized (y37.b) {
                        try {
                            if (ax5.i == null) {
                                ax5.i = new ax5[0];
                            }
                        } finally {
                        }
                    }
                }
                this.b = ax5.i;
                this.cachedSize = -1;
                return;
            case 3:
                this.b = "";
                this.cachedSize = -1;
                return;
            default:
                this.b = nd7.d;
                this.cachedSize = -1;
                return;
        }
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.b;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = (long[]) this.b;
                    if (i >= jArr2.length) {
                        return iK + jArr2.length;
                    }
                    iK += y43.k(jArr2[i]);
                    i++;
                }
                break;
            case 1:
                int[] iArr = (int[]) this.b;
                int i2 = 0;
                if (iArr == null || iArr.length <= 0) {
                    return 0;
                }
                int iG = 0;
                while (true) {
                    int[] iArr2 = (int[]) this.b;
                    if (i2 >= iArr2.length) {
                        return iG + iArr2.length;
                    }
                    iG += y43.g(iArr2[i2]);
                    i2++;
                }
                break;
            case 2:
                ax5[] ax5VarArr = (ax5[]) this.b;
                int i3 = 0;
                if (ax5VarArr == null || ax5VarArr.length <= 0) {
                    return 0;
                }
                int i4 = 0;
                while (true) {
                    ax5[] ax5VarArr2 = (ax5[]) this.b;
                    if (i3 >= ax5VarArr2.length) {
                        return i4;
                    }
                    ax5 ax5Var = ax5VarArr2[i3];
                    if (ax5Var != null) {
                        i4 = y43.i(1, ax5Var) + i4;
                    }
                    i3++;
                }
                break;
            default:
                if (((String) this.b).equals("")) {
                    return 0;
                }
                return y43.l(1, (String) this.b);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r4v13, types: [int[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [ax5[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.Serializable, java.lang.Object, long[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Serializable, java.lang.Object, long[]] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable, java.lang.Object] */
    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        switch (this.a) {
            case 0:
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        break;
                    } else if (iS == 8) {
                        int iW = nd7.w(x43Var, 8);
                        long[] jArr = (long[]) this.b;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iW + length;
                        ?? r4 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, r4, 0, length);
                        }
                        while (length < i - 1) {
                            r4[length] = x43Var.q();
                            x43Var.s();
                            length++;
                        }
                        r4[length] = x43Var.q();
                        this.b = r4;
                    } else if (iS == 10) {
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i2 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i2++;
                        }
                        x43Var.t(iC);
                        long[] jArr2 = (long[]) this.b;
                        int length2 = jArr2 == null ? 0 : jArr2.length;
                        int i3 = i2 + length2;
                        ?? r5 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr2, 0, r5, 0, length2);
                        }
                        while (length2 < i3) {
                            r5[length2] = x43Var.q();
                            length2++;
                        }
                        this.b = r5;
                        x43Var.d(iE);
                    } else if (!x43Var.u(iS)) {
                        break;
                    }
                }
            case 1:
                while (true) {
                    int iS2 = x43Var.s();
                    if (iS2 == 0) {
                        break;
                    } else if (iS2 == 8) {
                        int iW2 = nd7.w(x43Var, 8);
                        int[] iArr = (int[]) this.b;
                        int length3 = iArr == null ? 0 : iArr.length;
                        int i4 = iW2 + length3;
                        ?? r42 = new int[i4];
                        if (length3 != 0) {
                            System.arraycopy(iArr, 0, r42, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            r42[length3] = x43Var.p();
                            x43Var.s();
                            length3++;
                        }
                        r42[length3] = x43Var.p();
                        this.b = r42;
                    } else if (iS2 == 10) {
                        int iE2 = x43Var.e(x43Var.p());
                        int iC2 = x43Var.c();
                        int i5 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.p();
                            i5++;
                        }
                        x43Var.t(iC2);
                        int[] iArr2 = (int[]) this.b;
                        int length4 = iArr2 == null ? 0 : iArr2.length;
                        int i6 = i5 + length4;
                        ?? r52 = new int[i6];
                        if (length4 != 0) {
                            System.arraycopy(iArr2, 0, r52, 0, length4);
                        }
                        while (length4 < i6) {
                            r52[length4] = x43Var.p();
                            length4++;
                        }
                        this.b = r52;
                        x43Var.d(iE2);
                    } else if (!x43Var.u(iS2)) {
                        break;
                    }
                }
            case 2:
                while (true) {
                    int iS3 = x43Var.s();
                    if (iS3 == 0) {
                        break;
                    } else if (iS3 == 10) {
                        int iW3 = nd7.w(x43Var, 10);
                        ax5[] ax5VarArr = (ax5[]) this.b;
                        int length5 = ax5VarArr == null ? 0 : ax5VarArr.length;
                        int i7 = iW3 + length5;
                        ?? r43 = new ax5[i7];
                        if (length5 != 0) {
                            System.arraycopy(ax5VarArr, 0, r43, 0, length5);
                        }
                        while (length5 < i7 - 1) {
                            ax5 ax5Var = new ax5();
                            r43[length5] = ax5Var;
                            x43Var.j(ax5Var);
                            x43Var.s();
                            length5++;
                        }
                        ax5 ax5Var2 = new ax5();
                        r43[length5] = ax5Var2;
                        x43Var.j(ax5Var2);
                        this.b = r43;
                    } else if (!x43Var.u(iS3)) {
                        break;
                    }
                }
            default:
                while (true) {
                    int iS4 = x43Var.s();
                    if (iS4 == 0) {
                        break;
                    } else if (iS4 == 10) {
                        this.b = x43Var.r();
                    } else if (!x43Var.u(iS4)) {
                        break;
                    }
                }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.b;
                if (jArr != null && jArr.length > 0) {
                    int i = 0;
                    while (true) {
                        long[] jArr2 = (long[]) this.b;
                        if (i >= jArr2.length) {
                            break;
                        } else {
                            y43Var.x(1, jArr2[i]);
                            i++;
                        }
                    }
                }
                break;
            case 1:
                int[] iArr = (int[]) this.b;
                if (iArr != null && iArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = (int[]) this.b;
                        if (i2 >= iArr2.length) {
                            break;
                        } else {
                            y43Var.w(1, iArr2[i2]);
                            i2++;
                        }
                    }
                }
                break;
            case 2:
                ax5[] ax5VarArr = (ax5[]) this.b;
                if (ax5VarArr != null && ax5VarArr.length > 0) {
                    int i3 = 0;
                    while (true) {
                        ax5[] ax5VarArr2 = (ax5[]) this.b;
                        if (i3 >= ax5VarArr2.length) {
                            break;
                        } else {
                            ax5 ax5Var = ax5VarArr2[i3];
                            if (ax5Var != null) {
                                y43Var.y(1, ax5Var);
                            }
                            i3++;
                        }
                    }
                }
                break;
            default:
                if (!((String) this.b).equals("")) {
                    y43Var.E(1, (String) this.b);
                    break;
                }
                break;
        }
    }
}
