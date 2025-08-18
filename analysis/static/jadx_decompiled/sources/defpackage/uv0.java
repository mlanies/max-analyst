package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class uv0 extends FilterOutputStream {
    public final /* synthetic */ int a;
    public final OutputStream b;
    public ByteOrder c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv0(OutputStream outputStream, ByteOrder byteOrder, int i) {
        super(outputStream);
        this.a = i;
        this.b = outputStream;
        this.c = byteOrder;
    }

    public void a(int i) throws IOException {
        this.b.write(i);
    }

    public final void d(int i) throws IOException {
        switch (this.a) {
            case 0:
                ByteOrder byteOrder = this.c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.b;
                if (byteOrder != byteOrder2) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((i >>> 24) & 255);
                        outputStream.write((i >>> 16) & 255);
                        outputStream.write((i >>> 8) & 255);
                        outputStream.write(i & 255);
                        break;
                    }
                } else {
                    outputStream.write(i & 255);
                    outputStream.write((i >>> 8) & 255);
                    outputStream.write((i >>> 16) & 255);
                    outputStream.write((i >>> 24) & 255);
                    break;
                }
                break;
            default:
                ByteOrder byteOrder3 = this.c;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.b;
                if (byteOrder3 != byteOrder4) {
                    if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                        outputStream2.write((i >>> 24) & 255);
                        outputStream2.write((i >>> 16) & 255);
                        outputStream2.write((i >>> 8) & 255);
                        outputStream2.write(i & 255);
                        break;
                    }
                } else {
                    outputStream2.write(i & 255);
                    outputStream2.write((i >>> 8) & 255);
                    outputStream2.write((i >>> 16) & 255);
                    outputStream2.write((i >>> 24) & 255);
                    break;
                }
                break;
        }
    }

    public final void g(short s) throws IOException {
        switch (this.a) {
            case 0:
                ByteOrder byteOrder = this.c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.b;
                if (byteOrder != byteOrder2) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((s >>> 8) & 255);
                        outputStream.write(s & 255);
                        break;
                    }
                } else {
                    outputStream.write(s & 255);
                    outputStream.write((s >>> 8) & 255);
                    break;
                }
                break;
            default:
                ByteOrder byteOrder3 = this.c;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.b;
                if (byteOrder3 != byteOrder4) {
                    if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                        outputStream2.write((s >>> 8) & 255);
                        outputStream2.write(s & 255);
                        break;
                    }
                } else {
                    outputStream2.write(s & 255);
                    outputStream2.write((s >>> 8) & 255);
                    break;
                }
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.a) {
            case 0:
                this.b.write(bArr);
                break;
            default:
                this.b.write(bArr);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                this.b.write(bArr, i, i2);
                break;
            default:
                this.b.write(bArr, i, i2);
                break;
        }
    }
}
