package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class y43 {
    public final ByteBuffer a;

    public y43(byte[] bArr, int i, int i2) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        this.a = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int a(int i) {
        return m(i) + 1;
    }

    public static int b(int i, byte[] bArr) {
        return j(bArr.length) + bArr.length + m(i);
    }

    public static int c(int i) {
        return m(i) + 8;
    }

    public static int d(int i, int i2, Object obj) {
        switch (i2) {
            case 1:
                return c(i);
            case 2:
                return e(i);
            case 3:
                return h(i, ((Long) obj).longValue());
            case 4:
                long jLongValue = ((Long) obj).longValue();
                return k(jLongValue) + m(i);
            case 5:
                return f(i, ((Integer) obj).intValue());
            case 6:
                return m(i) + 8;
            case 7:
                return m(i) + 4;
            case 8:
                return a(i);
            case 9:
                return l(i, (String) obj);
            case 10:
                return ((qw8) obj).getSerializedSize() + (m(i) * 2);
            case 11:
                return i(i, (qw8) obj);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return b(i, (byte[]) obj);
            case 13:
                return n(i, ((Integer) obj).intValue());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int iIntValue = ((Integer) obj).intValue();
                return j(iIntValue) + m(i);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return m(i) + 4;
            case 16:
                return m(i) + 8;
            case LangUtils.HASH_SEED /* 17 */:
                int iIntValue2 = ((Integer) obj).intValue();
                return j((iIntValue2 >> 31) ^ (iIntValue2 << 1)) + m(i);
            case 18:
                long jLongValue2 = ((Long) obj).longValue();
                return k((jLongValue2 >> 63) ^ (jLongValue2 << 1)) + m(i);
            default:
                throw new IllegalArgumentException(zr6.h(i2, "Unknown type: "));
        }
    }

    public static int e(int i) {
        return m(i) + 4;
    }

    public static int f(int i, int i2) {
        return g(i2) + m(i);
    }

    public static int g(int i) {
        if (i >= 0) {
            return j(i);
        }
        return 10;
    }

    public static int h(int i, long j) {
        return k(j) + m(i);
    }

    public static int i(int i, qw8 qw8Var) {
        int iM = m(i);
        int serializedSize = qw8Var.getSerializedSize();
        return j(serializedSize) + serializedSize + iM;
    }

    public static int j(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int k(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int l(int i, String str) {
        int iM = m(i);
        int iQ = q(str);
        return j(iQ) + iQ + iM;
    }

    public static int m(int i) {
        return j(i << 3);
    }

    public static int n(int i, int i2) {
        return j(i2) + m(i);
    }

    public static int o(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int length = charSequence.length();
        int i4 = i2 + i;
        int i5 = 0;
        while (i5 < length && (i3 = i5 + i) < i4 && (cCharAt = charSequence.charAt(i5)) < 128) {
            bArr[i3] = (byte) cCharAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i6 = i + i5;
        while (i5 < length) {
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt2 < 128 && i6 < i4) {
                bArr[i6] = (byte) cCharAt2;
                i6++;
            } else if (cCharAt2 < 2048 && i6 <= i4 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt2 >>> 6) | 960);
                i6 += 2;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i6 > i4 - 3) {
                    if (i6 > i4 - 4) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i6);
                    }
                    int i8 = i5 + 1;
                    if (i8 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i8);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i6 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i9 = i6 + 3;
                            bArr[i6 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i6 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i5 = i8;
                        } else {
                            i5 = i8;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                    sb.append(i5 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                bArr[i6] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i10 = i6 + 2;
                bArr[i6 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i6 += 3;
                bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i5++;
        }
        return i6;
    }

    public static void p(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(o(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    int i2 = i + 1;
                    if (i2 != charSequence.length()) {
                        char cCharAt2 = charSequence.charAt(i2);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i = i2;
                        } else {
                            i = i2;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                    sb.append(i - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i++;
        }
    }

    public static int q(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new IllegalArgumentException(zr6.h(i2, "Unpaired surrogate at index "));
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public final void A(int i) throws CodedOutputByteBufferNano$OutOfSpaceException {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() < 4) {
            throw new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.putInt(i);
    }

    public final void B(long j) throws CodedOutputByteBufferNano$OutOfSpaceException {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() < 8) {
            throw new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.putLong(j);
    }

    public final void C(int i) throws CodedOutputByteBufferNano$OutOfSpaceException {
        while ((i & (-128)) != 0) {
            z((i & 127) | 128);
            i >>>= 7;
        }
        z(i);
    }

    public final void D(long j) throws CodedOutputByteBufferNano$OutOfSpaceException {
        while (((-128) & j) != 0) {
            z((((int) j) & 127) | 128);
            j >>>= 7;
        }
        z((int) j);
    }

    public final void E(int i, String str) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 2);
        ByteBuffer byteBuffer = this.a;
        try {
            int iJ = j(str.length());
            if (iJ != j(str.length() * 3)) {
                C(q(str));
                p(str, byteBuffer);
                return;
            }
            int iPosition = byteBuffer.position();
            if (byteBuffer.remaining() < iJ) {
                throw new CodedOutputByteBufferNano$OutOfSpaceException(iPosition + iJ, byteBuffer.limit());
            }
            byteBuffer.position(iPosition + iJ);
            p(str, byteBuffer);
            int iPosition2 = byteBuffer.position();
            byteBuffer.position(iPosition);
            C((iPosition2 - iPosition) - iJ);
            byteBuffer.position(iPosition2);
        } catch (BufferOverflowException e) {
            CodedOutputByteBufferNano$OutOfSpaceException codedOutputByteBufferNano$OutOfSpaceException = new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
            codedOutputByteBufferNano$OutOfSpaceException.initCause(e);
            throw codedOutputByteBufferNano$OutOfSpaceException;
        }
    }

    public final void F(int i, int i2) throws CodedOutputByteBufferNano$OutOfSpaceException {
        C((i << 3) | i2);
    }

    public final void G(int i, int i2) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 0);
        C(i2);
    }

    public final void r(int i, boolean z) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 0);
        z(z ? 1 : 0);
    }

    public final void s(int i, byte[] bArr) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 2);
        C(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() < length) {
            throw new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    public final void t(int i, double d) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 1);
        B(Double.doubleToLongBits(d));
    }

    public final void u(int i, int i2, Object obj) throws IOException {
        switch (i2) {
            case 1:
                t(i, ((Double) obj).doubleValue());
                return;
            case 2:
                v(i, ((Float) obj).floatValue());
                return;
            case 3:
                x(i, ((Long) obj).longValue());
                return;
            case 4:
                long jLongValue = ((Long) obj).longValue();
                F(i, 0);
                D(jLongValue);
                return;
            case 5:
                w(i, ((Integer) obj).intValue());
                return;
            case 6:
                long jLongValue2 = ((Long) obj).longValue();
                F(i, 1);
                B(jLongValue2);
                return;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                F(i, 5);
                A(iIntValue);
                return;
            case 8:
                r(i, ((Boolean) obj).booleanValue());
                return;
            case 9:
                E(i, (String) obj);
                return;
            case 10:
                F(i, 3);
                ((qw8) obj).writeTo(this);
                F(i, 4);
                return;
            case 11:
                y(i, (qw8) obj);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                s(i, (byte[]) obj);
                return;
            case 13:
                G(i, ((Integer) obj).intValue());
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int iIntValue2 = ((Integer) obj).intValue();
                F(i, 0);
                C(iIntValue2);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int iIntValue3 = ((Integer) obj).intValue();
                F(i, 5);
                A(iIntValue3);
                return;
            case 16:
                long jLongValue3 = ((Long) obj).longValue();
                F(i, 1);
                B(jLongValue3);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                int iIntValue4 = ((Integer) obj).intValue();
                F(i, 0);
                C((iIntValue4 << 1) ^ (iIntValue4 >> 31));
                return;
            case 18:
                long jLongValue4 = ((Long) obj).longValue();
                F(i, 0);
                D((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                return;
            default:
                throw new IOException(zr6.h(i2, "Unknown type: "));
        }
    }

    public final void v(int i, float f) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 5);
        A(Float.floatToIntBits(f));
    }

    public final void w(int i, int i2) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 0);
        if (i2 >= 0) {
            C(i2);
        } else {
            D(i2);
        }
    }

    public final void x(int i, long j) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 0);
        D(j);
    }

    public final void y(int i, qw8 qw8Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        F(i, 2);
        C(qw8Var.getCachedSize());
        qw8Var.writeTo(this);
    }

    public final void z(int i) throws CodedOutputByteBufferNano$OutOfSpaceException {
        byte b = (byte) i;
        ByteBuffer byteBuffer = this.a;
        if (!byteBuffer.hasRemaining()) {
            throw new CodedOutputByteBufferNano$OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b);
    }
}
