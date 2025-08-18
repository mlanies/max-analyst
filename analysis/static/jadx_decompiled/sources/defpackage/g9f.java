package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class g9f extends OutputStream {
    public static final /* synthetic */ int b = 0;
    public final OutputStream a;

    public g9f(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        boolean zC = oz7.c(i);
        OutputStream outputStream = this.a;
        if (zC) {
            outputStream.write(i);
            return;
        }
        outputStream.write(37);
        int i2 = (i >> 4) & 15;
        outputStream.write(i2 <= 9 ? i2 + 48 : i2 + 55);
        int i3 = i & 15;
        outputStream.write(i3 <= 9 ? i3 + 48 : i3 + 55);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        OutputStream outputStream;
        int i3 = i2 + i;
        int i4 = i;
        while (true) {
            outputStream = this.a;
            if (i >= i3) {
                break;
            }
            byte b2 = bArr[i];
            if (!oz7.c(b2)) {
                if (i > i4) {
                    outputStream.write(bArr, i4, i - i4);
                }
                outputStream.write(37);
                int i5 = (b2 >> 4) & 15;
                outputStream.write(i5 <= 9 ? i5 + 48 : i5 + 55);
                int i6 = b2 & 15;
                outputStream.write(i6 <= 9 ? i6 + 48 : i6 + 55);
                i4 = i + 1;
            }
            i++;
        }
        if (i4 < i3) {
            outputStream.write(bArr, i4, i3 - i4);
        }
    }
}
