package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import ru.ok.tamtam.internal.MalformedPacketException;

/* loaded from: classes2.dex */
public final class yoa {
    public static final byte[] h = new byte[0];
    public final byte a;
    public final byte b;
    public final short c;
    public final short d;
    public final byte e;
    public final byte[] f;
    public final int g;

    public yoa(byte b, short s, short s2, byte[] bArr, int i) {
        this.a = (byte) 10;
        this.b = b;
        this.c = s;
        this.d = s2;
        this.e = (byte) 0;
        this.f = bArr;
        this.g = i;
    }

    public static yoa a(dle dleVar, byte b, short s) {
        byte[] byteArray;
        int size = ((HashMap) dleVar.b).size();
        HashMap map = (HashMap) dleVar.b;
        if (size > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                lz7.R(map, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            byteArray = h;
        }
        byte[] bArr = byteArray;
        return new yoa(b, s, dleVar.N(), bArr, map.size() > 0 ? bArr.length : 0);
    }

    public final byte[] b(short s) {
        int i = this.g;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 10);
        byteBufferAllocate.put(this.a);
        byteBufferAllocate.put(this.b);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putShort(this.d);
        byteBufferAllocate.putInt(i);
        if (i > 0) {
            byteBufferAllocate.put(this.f);
        }
        return byteBufferAllocate.array();
    }

    public final byte[] c(short s) {
        int i = this.g;
        if (i < 32) {
            return b(s);
        }
        int iMaxCompressedLength = nd7.u().fastCompressor().maxCompressedLength(i);
        byte[] bArr = new byte[iMaxCompressedLength];
        int iCompress = nd7.u().fastCompressor().compress(this.f, 0, this.g, bArr, 0, iMaxCompressedLength);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iCompress + 10);
        byteBufferAllocate.put(this.a);
        byteBufferAllocate.put(this.b);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putShort(this.d);
        byteBufferAllocate.putInt((((i / iCompress) + 1) << 24) | iCompress);
        if (iCompress > 0) {
            byteBufferAllocate.put(bArr, 0, iCompress);
        }
        return byteBufferAllocate.array();
    }

    public final String toString() {
        String strB = sla.b(this.d);
        StringBuilder sb = new StringBuilder("Packet{ver=");
        sb.append((int) this.a);
        sb.append(", cmd=");
        sb.append((int) this.b);
        sb.append(", seq=");
        sb.append((int) this.c);
        sb.append(", opcode=");
        sb.append(strB);
        sb.append(", cof=");
        sb.append((int) this.e);
        sb.append(", payloadLength=");
        return zr6.j(sb, this.g, "}");
    }

    public yoa(byte[] bArr) throws MalformedPacketException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap.remaining() >= 10) {
            int iPosition = byteBufferWrap.position();
            byte b = byteBufferWrap.get();
            this.a = b;
            if (b >= 5 && 10 >= b) {
                this.b = byteBufferWrap.get();
                this.c = byteBufferWrap.getShort();
                this.d = byteBufferWrap.getShort();
                int i = byteBufferWrap.getInt();
                this.e = (byte) (i >> 24);
                int i2 = i & 16777215;
                this.g = i2;
                if (i2 > 0) {
                    this.f = new byte[i2];
                    return;
                } else {
                    this.f = h;
                    return;
                }
            }
            byteBufferWrap.position(iPosition);
            int iMin = Math.min(10, byteBufferWrap.remaining());
            byte[] bArr2 = new byte[iMin];
            if (iMin > 0) {
                byteBufferWrap.get(bArr2);
            }
            throw new MalformedPacketException();
        }
        int iRemaining = byteBufferWrap.remaining();
        byte[] bArr3 = new byte[iRemaining];
        if (iRemaining > 0) {
            byteBufferWrap.get(bArr3);
        }
        throw new MalformedPacketException();
    }
}
