package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.msgpack.core.MessageInsufficientBufferException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessageNeverUsedFormatException;
import org.msgpack.core.MessagePackException;
import org.msgpack.core.MessageSizeException;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeException;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class gy8 implements Closeable {
    public static final MessageBuffer z0 = MessageBuffer.wrap(new byte[0]);
    public final int X;
    public final int Y;
    public final MessageBufferInput Z;
    public final boolean a;
    public final boolean b;
    public final CodingErrorAction c;
    public final CodingErrorAction o;
    public int t0;
    public int v0;
    public StringBuilder w0;
    public CharsetDecoder x0;
    public CharBuffer y0;
    public MessageBuffer s0 = z0;
    public final MessageBuffer u0 = MessageBuffer.allocate(8);

    public gy8(ArrayBufferInput arrayBufferInput, uw8 uw8Var) {
        this.Z = arrayBufferInput;
        this.a = uw8Var.a;
        this.b = uw8Var.b;
        this.c = uw8Var.c;
        this.o = uw8Var.o;
        this.X = uw8Var.X;
        this.Y = uw8Var.Z;
    }

    public static MessageIntegerOverflowException U(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((i & Integer.MAX_VALUE) + 2147483648L));
    }

    public static MessageIntegerOverflowException e0(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    public static MessagePackException r0(String str, byte b) {
        av8 av8Var = av8.W0[b & 255];
        if (av8Var == av8.NEVER_USED) {
            return new MessageNeverUsedFormatException(zr6.i("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String strS = h4f.s(av8Var.a());
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, strS.substring(0, 1) + strS.substring(1).toLowerCase(), Byte.valueOf(b)));
    }

    public final n1 A0() {
        BigInteger bigIntegerValueOf;
        double d;
        z85 z85Var;
        z85 z85Var2;
        av8 av8VarN = n();
        int i = 0;
        switch (au1.s(av8VarN.a())) {
            case 0:
                readByte();
                return gx6.a;
            case 1:
                return u0() ? nw6.b : nw6.c;
            case 2:
                if (av8VarN != av8.UINT64) {
                    return new ax6(w0());
                }
                byte b = readByte();
                if (wmd.w(b)) {
                    bigIntegerValueOf = BigInteger.valueOf(b);
                } else {
                    switch (b) {
                        case -52:
                            bigIntegerValueOf = BigInteger.valueOf(readByte() & 255);
                            break;
                        case -51:
                            bigIntegerValueOf = BigInteger.valueOf(readShort() & 65535);
                            break;
                        case -50:
                            int i2 = readInt();
                            if (i2 >= 0) {
                                bigIntegerValueOf = BigInteger.valueOf(i2);
                                break;
                            } else {
                                bigIntegerValueOf = BigInteger.valueOf((i2 & Integer.MAX_VALUE) + 2147483648L);
                                break;
                            }
                        case -49:
                            long j = readLong();
                            if (j >= 0) {
                                bigIntegerValueOf = BigInteger.valueOf(j);
                                break;
                            } else {
                                bigIntegerValueOf = BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63);
                                break;
                            }
                        case -48:
                            bigIntegerValueOf = BigInteger.valueOf(readByte());
                            break;
                        case -47:
                            bigIntegerValueOf = BigInteger.valueOf(readShort());
                            break;
                        case -46:
                            bigIntegerValueOf = BigInteger.valueOf(readInt());
                            break;
                        case -45:
                            bigIntegerValueOf = BigInteger.valueOf(readLong());
                            break;
                        default:
                            throw r0("Integer", b);
                    }
                }
                return new kw6(bigIntegerValueOf);
            case 3:
                byte b2 = readByte();
                if (b2 == -54) {
                    d = m0(4).getFloat(this.v0);
                } else {
                    if (b2 != -53) {
                        throw r0("Float", b2);
                    }
                    d = m0(8).getDouble(this.v0);
                }
                return new rw6(d);
            case 4:
                return new qx6(p0(y0()));
            case 5:
                return new mw6(p0(t0()));
            case 6:
                int iS0 = s0();
                uaf[] uafVarArr = new uaf[iS0];
                while (i < iS0) {
                    uafVarArr[i] = A0();
                    i++;
                }
                return iS0 == 0 ? hw6.b : new hw6(uafVarArr);
            case 7:
                int iX0 = x0() * 2;
                uaf[] uafVarArr2 = new uaf[iX0];
                while (i < iX0) {
                    uafVarArr2[i] = A0();
                    uafVarArr2[i + 1] = A0();
                    i += 2;
                }
                return iX0 == 0 ? fx6.b : new fx6(uafVarArr2);
            case 8:
                byte b3 = readByte();
                switch (b3) {
                    case -57:
                        MessageBuffer messageBufferM0 = m0(2);
                        z85Var = new z85(messageBufferM0.getByte(this.v0) & 255, messageBufferM0.getByte(this.v0 + 1));
                        return new tw6(z85Var.a, p0(z85Var.b));
                    case -56:
                        MessageBuffer messageBufferM02 = m0(3);
                        z85Var2 = new z85(messageBufferM02.getShort(this.v0) & 65535, messageBufferM02.getByte(this.v0 + 2));
                        z85Var = z85Var2;
                        return new tw6(z85Var.a, p0(z85Var.b));
                    case -55:
                        MessageBuffer messageBufferM03 = m0(5);
                        int i3 = messageBufferM03.getInt(this.v0);
                        if (i3 < 0) {
                            throw new MessageSizeException();
                        }
                        z85Var2 = new z85(i3, messageBufferM03.getByte(this.v0 + 4));
                        z85Var = z85Var2;
                        return new tw6(z85Var.a, p0(z85Var.b));
                    default:
                        switch (b3) {
                            case -44:
                                z85Var2 = new z85(1, readByte());
                                z85Var = z85Var2;
                                return new tw6(z85Var.a, p0(z85Var.b));
                            case -43:
                                z85Var = new z85(2, readByte());
                                return new tw6(z85Var.a, p0(z85Var.b));
                            case -42:
                                z85Var = new z85(4, readByte());
                                return new tw6(z85Var.a, p0(z85Var.b));
                            case -41:
                                z85Var = new z85(8, readByte());
                                return new tw6(z85Var.a, p0(z85Var.b));
                            case -40:
                                z85Var = new z85(16, readByte());
                                return new tw6(z85Var.a, p0(z85Var.b));
                            default:
                                throw r0("Ext", b3);
                        }
                }
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public final void S() throws IOException {
        MessageBuffer next = this.Z.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.s0.size();
        this.s0 = next;
        this.t0 = 0;
    }

    public final String a(int i) throws CharacterCodingException {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        if (this.c == codingErrorAction && this.o == codingErrorAction && this.s0.hasArray()) {
            String str = new String(this.s0.array(), this.s0.arrayOffset() + this.t0, i, vw8.a);
            this.t0 += i;
            return str;
        }
        try {
            CharBuffer charBufferDecode = this.x0.decode(this.s0.sliceAsByteBuffer(this.t0, i));
            this.t0 += i;
            return charBufferDecode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.s0 = z0;
        this.t0 = 0;
        this.Z.close();
    }

    public final boolean m() throws IOException {
        while (this.s0.size() <= this.t0) {
            MessageBuffer next = this.Z.next();
            if (next == null) {
                return false;
            }
            this.s0.size();
            this.s0 = next;
            this.t0 = 0;
        }
        return true;
    }

    public final MessageBuffer m0(int i) throws IOException {
        int size = this.s0.size();
        int i2 = this.t0;
        int i3 = size - i2;
        if (i3 >= i) {
            this.v0 = i2;
            this.t0 = i2 + i;
            return this.s0;
        }
        MessageBuffer messageBuffer = this.u0;
        if (i3 > 0) {
            messageBuffer.putMessageBuffer(0, this.s0, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            S();
            int size2 = this.s0.size();
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, this.s0, 0, i);
                this.t0 = i;
                this.v0 = 0;
                return messageBuffer;
            }
            messageBuffer.putMessageBuffer(i3, this.s0, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    public final av8 n() {
        if (!m()) {
            throw new MessageInsufficientBufferException();
        }
        return av8.W0[this.s0.getByte(this.t0) & 255];
    }

    public final int n0() {
        return readShort() & 65535;
    }

    public final void o(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.c == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.o == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    public final int o0() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new MessageSizeException();
    }

    public final byte[] p0(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int size = this.s0.size();
            int i3 = this.t0;
            int i4 = size - i3;
            if (i4 >= i) {
                this.s0.getBytes(i3, bArr, i2, i);
                this.t0 += i;
                return bArr;
            }
            this.s0.getBytes(i3, bArr, i2, i4);
            i2 += i4;
            i -= i4;
            this.t0 += i4;
            S();
        }
    }

    public final void q0(int i) throws IOException {
        while (true) {
            int size = this.s0.size();
            int i2 = this.t0;
            int i3 = size - i2;
            if (i3 >= i) {
                this.t0 = i2 + i;
                return;
            } else {
                this.t0 = i2 + i3;
                i -= i3;
                S();
            }
        }
    }

    public final byte readByte() {
        int size = this.s0.size();
        int i = this.t0;
        if (size > i) {
            byte b = this.s0.getByte(i);
            this.t0++;
            return b;
        }
        S();
        if (this.s0.size() <= 0) {
            return readByte();
        }
        byte b2 = this.s0.getByte(0);
        this.t0 = 1;
        return b2;
    }

    public final int readInt() {
        return m0(4).getInt(this.v0);
    }

    public final long readLong() {
        return m0(8).getLong(this.v0);
    }

    public final short readShort() {
        return m0(2).getShort(this.v0);
    }

    public final int s0() {
        byte b = readByte();
        if ((b & (-16)) == -112) {
            return b & 15;
        }
        if (b == -36) {
            return n0();
        }
        if (b == -35) {
            return o0();
        }
        throw r0("Array", b);
    }

    public final int t0() {
        int iN0;
        byte b = readByte();
        if ((b & (-32)) == -96) {
            return b & 31;
        }
        int iN02 = -1;
        switch (b) {
            case -60:
                iN0 = readByte() & 255;
                break;
            case -59:
                iN0 = n0();
                break;
            case -58:
                iN0 = o0();
                break;
            default:
                iN0 = -1;
                break;
        }
        if (iN0 >= 0) {
            return iN0;
        }
        if (this.a) {
            switch (b) {
                case -39:
                    iN02 = readByte() & 255;
                    break;
                case -38:
                    iN02 = n0();
                    break;
                case -37:
                    iN02 = o0();
                    break;
            }
            if (iN02 >= 0) {
                return iN02;
            }
        }
        throw r0("Binary", b);
    }

    public final boolean u0() {
        byte b = readByte();
        if (b == -62) {
            return false;
        }
        if (b == -61) {
            return true;
        }
        throw r0("boolean", b);
    }

    public final int v0() {
        byte b = readByte();
        if (wmd.w(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int i = readInt();
                if (i >= 0) {
                    return i;
                }
                throw U(i);
            case -49:
                long j = readLong();
                if (j < 0 || j > 2147483647L) {
                    throw e0(j);
                }
                return (int) j;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long j2 = readLong();
                if (j2 < -2147483648L || j2 > 2147483647L) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j2));
                }
                return (int) j2;
            default:
                throw r0("Integer", b);
        }
    }

    public final long w0() {
        byte b = readByte();
        if (wmd.w(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int i = readInt();
                return i < 0 ? (i & Integer.MAX_VALUE) + 2147483648L : i;
            case -49:
                long j = readLong();
                if (j >= 0) {
                    return j;
                }
                throw e0(j);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw r0("Integer", b);
        }
    }

    public final int x0() {
        byte b = readByte();
        if ((b & (-16)) == -128) {
            return b & 15;
        }
        if (b == -34) {
            return n0();
        }
        if (b == -33) {
            return o0();
        }
        throw r0("Map", b);
    }

    public final int y0() {
        int iN0;
        byte b = readByte();
        if ((b & (-32)) == -96) {
            return b & 31;
        }
        int iN02 = -1;
        switch (b) {
            case -39:
                iN0 = readByte() & 255;
                break;
            case -38:
                iN0 = n0();
                break;
            case -37:
                iN0 = o0();
                break;
            default:
                iN0 = -1;
                break;
        }
        if (iN0 >= 0) {
            return iN0;
        }
        if (this.b) {
            switch (b) {
                case -60:
                    iN02 = readByte() & 255;
                    break;
                case -59:
                    iN02 = n0();
                    break;
                case -58:
                    iN02 = o0();
                    break;
            }
            if (iN02 >= 0) {
                return iN02;
            }
        }
        throw r0("String", b);
    }

    public final void z() {
        int iN0;
        int iN02;
        int i = 1;
        while (i > 0) {
            byte b = readByte();
            switch (av8.W0[b & 255].ordinal()) {
                case 1:
                    iN0 = b & 15;
                    iN02 = iN0 * 2;
                    i += iN02;
                    i--;
                case 2:
                    i += b & 15;
                    i--;
                case 3:
                    q0(b & 31);
                    i--;
                case 4:
                case 6:
                default:
                    i--;
                case 5:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                case 7:
                case 28:
                    q0(readByte() & 255);
                    i--;
                case 8:
                case 29:
                    q0(n0());
                    i--;
                case 9:
                case 30:
                    q0(o0());
                    i--;
                case 10:
                    q0((readByte() & 255) + 1);
                    i--;
                case 11:
                    q0(n0() + 1);
                    i--;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    q0(o0() + 1);
                    i--;
                case 13:
                case LangUtils.HASH_SEED /* 17 */:
                case 21:
                    q0(4);
                    i--;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                case 18:
                case 22:
                    q0(8);
                    i--;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                case 19:
                    q0(1);
                    i--;
                case 16:
                case 20:
                    q0(2);
                    i--;
                case 23:
                    q0(2);
                    i--;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    q0(3);
                    i--;
                case 25:
                    q0(5);
                    i--;
                case 26:
                    q0(9);
                    i--;
                case 27:
                    q0(17);
                    i--;
                case 31:
                    iN02 = n0();
                    i += iN02;
                    i--;
                case 32:
                    iN02 = o0();
                    i += iN02;
                    i--;
                case 33:
                    iN0 = n0();
                    iN02 = iN0 * 2;
                    i += iN02;
                    i--;
                case 34:
                    iN0 = o0();
                    iN02 = iN0 * 2;
                    i += iN02;
                    i--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0154, code lost:
    
        return r8.w0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String z0() {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy8.z0():java.lang.String");
    }
}
