package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* loaded from: classes2.dex */
public final class ww8 implements Closeable, Flushable {
    public static final boolean s0;
    public MessageBuffer X;
    public int Y = 0;
    public CharsetEncoder Z;
    public final int a;
    public final int b;
    public final boolean c;
    public final MessageBufferOutput o;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i >= 14 && i < 21) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        s0 = z;
    }

    public ww8(OutputStreamBufferOutput outputStreamBufferOutput, tw8 tw8Var) {
        this.o = outputStreamBufferOutput;
        this.a = tw8Var.a;
        this.b = tw8Var.b;
        this.c = tw8Var.o;
    }

    public final void S(int i) {
        if (i < 32) {
            m0((byte) (i | (-96)));
            return;
        }
        if (this.c && i < 256) {
            n0((byte) -39, (byte) i);
        } else if (i < 65536) {
            q0((byte) -38, (short) i);
        } else {
            o0(i, (byte) -37);
        }
    }

    public final void U(String str) {
        if (str.length() <= 0) {
            S(0);
            return;
        }
        if (s0 || str.length() < this.a) {
            e0(str);
            return;
        }
        if (str.length() < 256) {
            d((str.length() * 6) + 3);
            int iA = a(this.Y + 2, str);
            if (iA >= 0) {
                if (this.c && iA < 256) {
                    MessageBuffer messageBuffer = this.X;
                    int i = this.Y;
                    this.Y = i + 1;
                    messageBuffer.putByte(i, (byte) -39);
                    MessageBuffer messageBuffer2 = this.X;
                    int i2 = this.Y;
                    this.Y = i2 + 1;
                    messageBuffer2.putByte(i2, (byte) iA);
                    this.Y += iA;
                    return;
                }
                if (iA >= 65536) {
                    throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                }
                MessageBuffer messageBuffer3 = this.X;
                int i3 = this.Y;
                messageBuffer3.putMessageBuffer(i3 + 3, messageBuffer3, i3 + 2, iA);
                MessageBuffer messageBuffer4 = this.X;
                int i4 = this.Y;
                this.Y = i4 + 1;
                messageBuffer4.putByte(i4, (byte) -38);
                this.X.putShort(this.Y, (short) iA);
                this.Y = this.Y + 2 + iA;
                return;
            }
        } else if (str.length() < 65536) {
            d((str.length() * 6) + 5);
            int iA2 = a(this.Y + 3, str);
            if (iA2 >= 0) {
                if (iA2 < 65536) {
                    MessageBuffer messageBuffer5 = this.X;
                    int i5 = this.Y;
                    this.Y = i5 + 1;
                    messageBuffer5.putByte(i5, (byte) -38);
                    this.X.putShort(this.Y, (short) iA2);
                    this.Y = this.Y + 2 + iA2;
                    return;
                }
                if (iA2 >= 4294967296L) {
                    throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                }
                MessageBuffer messageBuffer6 = this.X;
                int i6 = this.Y;
                messageBuffer6.putMessageBuffer(i6 + 5, messageBuffer6, i6 + 3, iA2);
                MessageBuffer messageBuffer7 = this.X;
                int i7 = this.Y;
                this.Y = i7 + 1;
                messageBuffer7.putByte(i7, (byte) -37);
                this.X.putInt(this.Y, iA2);
                this.Y = this.Y + 4 + iA2;
                return;
            }
        }
        e0(str);
    }

    public final int a(int i, String str) throws CharacterCodingException {
        if (this.Z == null) {
            CharsetEncoder charsetEncoderNewEncoder = vw8.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.Z = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.Z.reset();
        MessageBuffer messageBuffer = this.X;
        ByteBuffer byteBufferSliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i, messageBuffer.size() - i);
        int iPosition = byteBufferSliceAsByteBuffer.position();
        CoderResult coderResultEncode = this.Z.encode(CharBuffer.wrap(str), byteBufferSliceAsByteBuffer, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
        if (coderResultEncode.isUnderflow() && !coderResultEncode.isOverflow() && this.Z.flush(byteBufferSliceAsByteBuffer).isUnderflow()) {
            return byteBufferSliceAsByteBuffer.position() - iPosition;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageBufferOutput messageBufferOutput = this.o;
        try {
            flush();
        } finally {
            messageBufferOutput.close();
        }
    }

    public final void d(int i) {
        MessageBuffer messageBuffer = this.X;
        MessageBufferOutput messageBufferOutput = this.o;
        if (messageBuffer == null) {
            this.X = messageBufferOutput.next(i);
        } else if (this.Y + i >= messageBuffer.size()) {
            this.o.writeBuffer(this.Y);
            this.X = null;
            this.Y = 0;
            this.X = messageBufferOutput.next(i);
        }
    }

    public final void e0(String str) throws IOException {
        byte[] bytes = str.getBytes(vw8.a);
        S(bytes.length);
        int length = bytes.length;
        MessageBuffer messageBuffer = this.X;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i = this.Y;
            if (size - i >= length && length <= this.b) {
                this.X.putBytes(i, bytes, 0, length);
                this.Y += length;
                return;
            }
        }
        flush();
        this.o.add(bytes, 0, length);
    }

    @Override // java.io.Flushable
    public final void flush() {
        int i = this.Y;
        if (i > 0) {
            this.o.writeBuffer(i);
            this.X = null;
            this.Y = 0;
        }
        this.o.flush();
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        }
        if (i < 16) {
            m0((byte) (i | (-112)));
        } else if (i < 65536) {
            q0((byte) -36, (short) i);
        } else {
            o0(i, (byte) -35);
        }
    }

    public final void m(int i) {
        if (i < -32) {
            if (i < -32768) {
                o0(i, (byte) -46);
                return;
            } else if (i < -128) {
                q0((byte) -47, (short) i);
                return;
            } else {
                n0((byte) -48, (byte) i);
                return;
            }
        }
        if (i < 128) {
            m0((byte) i);
            return;
        }
        if (i < 256) {
            n0((byte) -52, (byte) i);
        } else if (i < 65536) {
            q0((byte) -51, (short) i);
        } else {
            o0(i, (byte) -50);
        }
    }

    public final void m0(byte b) {
        d(1);
        MessageBuffer messageBuffer = this.X;
        int i = this.Y;
        this.Y = i + 1;
        messageBuffer.putByte(i, b);
    }

    public final void n(long j) {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    p0(j, (byte) -45);
                    return;
                } else {
                    o0((int) j, (byte) -46);
                    return;
                }
            }
            if (j < -128) {
                q0((byte) -47, (short) j);
                return;
            } else {
                n0((byte) -48, (byte) j);
                return;
            }
        }
        if (j < 128) {
            m0((byte) j);
            return;
        }
        if (j < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            if (j < 256) {
                n0((byte) -52, (byte) j);
                return;
            } else {
                q0((byte) -51, (short) j);
                return;
            }
        }
        if (j < 4294967296L) {
            o0((int) j, (byte) -50);
        } else {
            p0(j, (byte) -49);
        }
    }

    public final void n0(byte b, byte b2) {
        d(2);
        MessageBuffer messageBuffer = this.X;
        int i = this.Y;
        this.Y = i + 1;
        messageBuffer.putByte(i, b);
        MessageBuffer messageBuffer2 = this.X;
        int i2 = this.Y;
        this.Y = i2 + 1;
        messageBuffer2.putByte(i2, b2);
    }

    public final void o(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        }
        if (i < 16) {
            m0((byte) (i | (-128)));
        } else if (i < 65536) {
            q0((byte) -34, (short) i);
        } else {
            o0(i, (byte) -33);
        }
    }

    public final void o0(int i, byte b) {
        d(5);
        MessageBuffer messageBuffer = this.X;
        int i2 = this.Y;
        this.Y = i2 + 1;
        messageBuffer.putByte(i2, b);
        this.X.putInt(this.Y, i);
        this.Y += 4;
    }

    public final void p0(long j, byte b) {
        d(9);
        MessageBuffer messageBuffer = this.X;
        int i = this.Y;
        this.Y = i + 1;
        messageBuffer.putByte(i, b);
        this.X.putLong(this.Y, j);
        this.Y += 8;
    }

    public final void q0(byte b, short s) {
        d(3);
        MessageBuffer messageBuffer = this.X;
        int i = this.Y;
        this.Y = i + 1;
        messageBuffer.putByte(i, b);
        this.X.putShort(this.Y, s);
        this.Y += 2;
    }
}
