package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xqc {
    public final /* synthetic */ int a = 0;
    public final int b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public xqc(n64 n64Var) {
        this.d = n64Var;
        int i = n64Var.c;
        this.b = i;
        this.e = new yaf(32);
        qy qyVar = new qy(i, 4, 0L);
        this.f = qyVar;
        this.g = qyVar;
        this.h = qyVar;
    }

    public static qy e(qy qyVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= qyVar.c) {
            qyVar = (qy) qyVar.X;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (qyVar.c - j));
            vc vcVar = (vc) qyVar.o;
            byteBuffer.put(vcVar.a, ((int) (j - qyVar.b)) + vcVar.b, iMin);
            i -= iMin;
            j += iMin;
            if (j == qyVar.c) {
                qyVar = (qy) qyVar.X;
            }
        }
        return qyVar;
    }

    public static qy f(qy qyVar, long j, byte[] bArr, int i) {
        while (j >= qyVar.c) {
            qyVar = (qy) qyVar.X;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (qyVar.c - j));
            vc vcVar = (vc) qyVar.o;
            System.arraycopy(vcVar.a, ((int) (j - qyVar.b)) + vcVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == qyVar.c) {
                qyVar = (qy) qyVar.X;
            }
        }
        return qyVar;
    }

    public static qy g(qy qyVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= qyVar.c) {
            qyVar = (qy) qyVar.X;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (qyVar.c - j));
            wc wcVar = (wc) qyVar.o;
            byteBuffer.put(wcVar.a, ((int) (j - qyVar.b)) + wcVar.b, iMin);
            i -= iMin;
            j += iMin;
            if (j == qyVar.c) {
                qyVar = (qy) qyVar.X;
            }
        }
        return qyVar;
    }

    public static qy h(qy qyVar, long j, byte[] bArr, int i) {
        while (j >= qyVar.c) {
            qyVar = (qy) qyVar.X;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (qyVar.c - j));
            wc wcVar = (wc) qyVar.o;
            System.arraycopy(wcVar.a, ((int) (j - qyVar.b)) + wcVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == qyVar.c) {
                qyVar = (qy) qyVar.X;
            }
        }
        return qyVar;
    }

    public static qy i(qy qyVar, o54 o54Var, mx1 mx1Var, yaf yafVar) {
        int iA;
        if (o54Var.f(1073741824)) {
            long j = mx1Var.b;
            yafVar.E(1);
            qy qyVarF = f(qyVar, j, yafVar.a, 1);
            long j2 = j + 1;
            byte b = yafVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & Byte.MAX_VALUE;
            rz3 rz3Var = o54Var.c;
            byte[] bArr = (byte[]) rz3Var.a;
            if (bArr == null) {
                rz3Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            qyVar = f(qyVarF, j2, (byte[]) rz3Var.a, i);
            long j3 = j2 + i;
            if (z) {
                yafVar.E(2);
                qyVar = f(qyVar, j3, yafVar.a, 2);
                j3 += 2;
                iA = yafVar.A();
            } else {
                iA = 1;
            }
            int[] iArr = (int[]) rz3Var.d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = (int[]) rz3Var.e;
            if (iArr2 == null || iArr2.length < iA) {
                iArr2 = new int[iA];
            }
            if (z) {
                int i2 = iA * 6;
                yafVar.E(i2);
                qyVar = f(qyVar, j3, yafVar.a, i2);
                j3 += i2;
                yafVar.H(0);
                for (int i3 = 0; i3 < iA; i3++) {
                    iArr[i3] = yafVar.A();
                    iArr2[i3] = yafVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = mx1Var.a - ((int) (j3 - mx1Var.b));
            }
            vze vzeVar = (vze) mx1Var.c;
            int i4 = maf.a;
            byte[] bArr2 = vzeVar.b;
            byte[] bArr3 = (byte[]) rz3Var.a;
            rz3Var.f = iA;
            rz3Var.d = iArr;
            rz3Var.e = iArr2;
            rz3Var.b = bArr2;
            rz3Var.a = bArr3;
            int i5 = vzeVar.a;
            rz3Var.c = i5;
            int i6 = vzeVar.c;
            rz3Var.g = i6;
            int i7 = vzeVar.d;
            rz3Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) rz3Var.i;
            cryptoInfo.numSubSamples = iA;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (maf.a >= 24) {
                va8 va8Var = (va8) rz3Var.j;
                va8Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) va8Var.c;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) va8Var.b).setPattern(pattern);
            }
            long j4 = mx1Var.b;
            int i8 = (int) (j3 - j4);
            mx1Var.b = j4 + i8;
            mx1Var.a -= i8;
        }
        if (!o54Var.f(268435456)) {
            o54Var.x(mx1Var.a);
            return e(qyVar, mx1Var.b, o54Var.o, mx1Var.a);
        }
        yafVar.E(4);
        qy qyVarF2 = f(qyVar, mx1Var.b, yafVar.a, 4);
        int iY = yafVar.y();
        mx1Var.b += 4;
        mx1Var.a -= 4;
        o54Var.x(iY);
        qy qyVarE = e(qyVarF2, mx1Var.b, o54Var.o, iY);
        mx1Var.b += iY;
        int i9 = mx1Var.a - iY;
        mx1Var.a = i9;
        ByteBuffer byteBuffer = o54Var.Z;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            o54Var.Z = ByteBuffer.allocate(i9);
        } else {
            o54Var.Z.clear();
        }
        return e(qyVarE, mx1Var.b, o54Var.Z, mx1Var.a);
    }

    public static qy j(qy qyVar, p54 p54Var, mx1 mx1Var, wpa wpaVar) {
        int iA;
        if (p54Var.f(1073741824)) {
            long j = mx1Var.b;
            wpaVar.D(1);
            qy qyVarH = h(qyVar, j, wpaVar.a, 1);
            long j2 = j + 1;
            byte b = wpaVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & Byte.MAX_VALUE;
            rz3 rz3Var = p54Var.o;
            byte[] bArr = (byte[]) rz3Var.a;
            if (bArr == null) {
                rz3Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            qyVar = h(qyVarH, j2, (byte[]) rz3Var.a, i);
            long j3 = j2 + i;
            if (z) {
                wpaVar.D(2);
                qyVar = h(qyVar, j3, wpaVar.a, 2);
                j3 += 2;
                iA = wpaVar.A();
            } else {
                iA = 1;
            }
            int[] iArr = (int[]) rz3Var.d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = (int[]) rz3Var.e;
            if (iArr2 == null || iArr2.length < iA) {
                iArr2 = new int[iA];
            }
            if (z) {
                int i2 = iA * 6;
                wpaVar.D(i2);
                qyVar = h(qyVar, j3, wpaVar.a, i2);
                j3 += i2;
                wpaVar.G(0);
                for (int i3 = 0; i3 < iA; i3++) {
                    iArr[i3] = wpaVar.A();
                    iArr2[i3] = wpaVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = mx1Var.a - ((int) (j3 - mx1Var.b));
            }
            wze wzeVar = (wze) mx1Var.c;
            int i4 = oaf.a;
            byte[] bArr2 = wzeVar.b;
            byte[] bArr3 = (byte[]) rz3Var.a;
            rz3Var.f = iA;
            rz3Var.d = iArr;
            rz3Var.e = iArr2;
            rz3Var.b = bArr2;
            rz3Var.a = bArr3;
            int i5 = wzeVar.a;
            rz3Var.c = i5;
            int i6 = wzeVar.c;
            rz3Var.g = i6;
            int i7 = wzeVar.d;
            rz3Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) rz3Var.i;
            cryptoInfo.numSubSamples = iA;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (oaf.a >= 24) {
                h7b h7bVar = (h7b) rz3Var.j;
                h7bVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) h7bVar.c;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) h7bVar.b).setPattern(pattern);
            }
            long j4 = mx1Var.b;
            int i8 = (int) (j3 - j4);
            mx1Var.b = j4 + i8;
            mx1Var.a -= i8;
        }
        if (!p54Var.f(268435456)) {
            p54Var.x(mx1Var.a);
            return g(qyVar, mx1Var.b, p54Var.X, mx1Var.a);
        }
        wpaVar.D(4);
        qy qyVarH2 = h(qyVar, mx1Var.b, wpaVar.a, 4);
        int iY = wpaVar.y();
        mx1Var.b += 4;
        mx1Var.a -= 4;
        p54Var.x(iY);
        qy qyVarG = g(qyVarH2, mx1Var.b, p54Var.X, iY);
        mx1Var.b += iY;
        int i9 = mx1Var.a - iY;
        mx1Var.a = i9;
        ByteBuffer byteBuffer = p54Var.s0;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            p54Var.s0 = ByteBuffer.allocate(i9);
        } else {
            p54Var.s0.clear();
        }
        return g(qyVarG, mx1Var.b, p54Var.s0, mx1Var.a);
    }

    public void a(qy qyVar) {
        if (((vc) qyVar.o) == null) {
            return;
        }
        n64 n64Var = (n64) this.d;
        synchronized (n64Var) {
            qy qyVar2 = qyVar;
            while (qyVar2 != null) {
                try {
                    vc[] vcVarArr = (vc[]) n64Var.g;
                    int i = n64Var.f;
                    n64Var.f = i + 1;
                    vc vcVar = (vc) qyVar2.o;
                    vcVar.getClass();
                    vcVarArr[i] = vcVar;
                    n64Var.e--;
                    qyVar2 = (qy) qyVar2.X;
                    if (qyVar2 == null || ((vc) qyVar2.o) == null) {
                        qyVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            n64Var.notifyAll();
        }
        qyVar.o = null;
        qyVar.X = null;
    }

    public void b(qy qyVar) {
        if (((wc) qyVar.o) == null) {
            return;
        }
        n64 n64Var = (n64) this.d;
        synchronized (n64Var) {
            qy qyVar2 = qyVar;
            while (qyVar2 != null) {
                try {
                    wc[] wcVarArr = (wc[]) n64Var.g;
                    int i = n64Var.f;
                    n64Var.f = i + 1;
                    wc wcVar = (wc) qyVar2.o;
                    wcVar.getClass();
                    wcVarArr[i] = wcVar;
                    n64Var.e--;
                    qyVar2 = (qy) qyVar2.X;
                    if (qyVar2 == null || ((wc) qyVar2.o) == null) {
                        qyVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            n64Var.notifyAll();
        }
        qyVar.o = null;
        qyVar.X = null;
    }

    public final void c(long j) {
        switch (this.a) {
            case 0:
                if (j == -1) {
                    return;
                }
                while (true) {
                    qy qyVar = (qy) this.f;
                    if (j < qyVar.c) {
                        if (((qy) this.g).b < qyVar.b) {
                            this.g = qyVar;
                            return;
                        }
                        return;
                    }
                    n64 n64Var = (n64) this.d;
                    vc vcVar = (vc) qyVar.o;
                    synchronized (n64Var) {
                        vc[] vcVarArr = (vc[]) n64Var.g;
                        int i = n64Var.f;
                        n64Var.f = i + 1;
                        vcVarArr[i] = vcVar;
                        n64Var.e--;
                        n64Var.notifyAll();
                    }
                    qy qyVar2 = (qy) this.f;
                    qyVar2.o = null;
                    qy qyVar3 = (qy) qyVar2.X;
                    qyVar2.X = null;
                    this.f = qyVar3;
                }
            default:
                if (j == -1) {
                    return;
                }
                while (true) {
                    qy qyVar4 = (qy) this.f;
                    if (j < qyVar4.c) {
                        if (((qy) this.g).b < qyVar4.b) {
                            this.g = qyVar4;
                            return;
                        }
                        return;
                    }
                    n64 n64Var2 = (n64) this.d;
                    wc wcVar = (wc) qyVar4.o;
                    synchronized (n64Var2) {
                        wc[] wcVarArr = (wc[]) n64Var2.g;
                        int i2 = n64Var2.f;
                        n64Var2.f = i2 + 1;
                        wcVarArr[i2] = wcVar;
                        n64Var2.e--;
                        n64Var2.notifyAll();
                    }
                    qy qyVar5 = (qy) this.f;
                    qyVar5.o = null;
                    qy qyVar6 = (qy) qyVar5.X;
                    qyVar5.X = null;
                    this.f = qyVar6;
                }
        }
    }

    public final int d(int i) {
        vc vcVar;
        wc wcVar;
        switch (this.a) {
            case 0:
                qy qyVar = (qy) this.h;
                if (((vc) qyVar.o) == null) {
                    n64 n64Var = (n64) this.d;
                    synchronized (n64Var) {
                        try {
                            int i2 = n64Var.e + 1;
                            n64Var.e = i2;
                            int i3 = n64Var.f;
                            if (i3 > 0) {
                                vc[] vcVarArr = (vc[]) n64Var.g;
                                int i4 = i3 - 1;
                                n64Var.f = i4;
                                vcVar = vcVarArr[i4];
                                vcVar.getClass();
                                ((vc[]) n64Var.g)[n64Var.f] = null;
                            } else {
                                vc vcVar2 = new vc(0, new byte[n64Var.c]);
                                vc[] vcVarArr2 = (vc[]) n64Var.g;
                                if (i2 > vcVarArr2.length) {
                                    n64Var.g = (vc[]) Arrays.copyOf(vcVarArr2, vcVarArr2.length * 2);
                                }
                                vcVar = vcVar2;
                            }
                        } finally {
                        }
                    }
                    qy qyVar2 = new qy(this.b, 4, ((qy) this.h).c);
                    qyVar.o = vcVar;
                    qyVar.X = qyVar2;
                }
                return Math.min(i, (int) (((qy) this.h).c - this.c));
            default:
                qy qyVar3 = (qy) this.h;
                if (((wc) qyVar3.o) == null) {
                    n64 n64Var2 = (n64) this.d;
                    synchronized (n64Var2) {
                        try {
                            int i5 = n64Var2.e + 1;
                            n64Var2.e = i5;
                            int i6 = n64Var2.f;
                            if (i6 > 0) {
                                wc[] wcVarArr = (wc[]) n64Var2.g;
                                int i7 = i6 - 1;
                                n64Var2.f = i7;
                                wcVar = wcVarArr[i7];
                                wcVar.getClass();
                                ((wc[]) n64Var2.g)[n64Var2.f] = null;
                            } else {
                                wc wcVar2 = new wc(0, new byte[n64Var2.c]);
                                wc[] wcVarArr2 = (wc[]) n64Var2.g;
                                if (i5 > wcVarArr2.length) {
                                    n64Var2.g = (wc[]) Arrays.copyOf(wcVarArr2, wcVarArr2.length * 2);
                                }
                                wcVar = wcVar2;
                            }
                        } finally {
                        }
                    }
                    qy qyVar4 = new qy(this.b, 5, ((qy) this.h).c);
                    qyVar3.o = wcVar;
                    qyVar3.X = qyVar4;
                }
                return Math.min(i, (int) (((qy) this.h).c - this.c));
        }
    }

    public xqc(n64 n64Var, byte b) {
        this.d = n64Var;
        int i = n64Var.c;
        this.b = i;
        this.e = new wpa(32);
        qy qyVar = new qy(i, 5, 0L);
        this.f = qyVar;
        this.g = qyVar;
        this.h = qyVar;
    }
}
