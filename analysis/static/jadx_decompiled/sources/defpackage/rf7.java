package defpackage;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class rf7 extends OutputStream {
    public long a;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.a += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
