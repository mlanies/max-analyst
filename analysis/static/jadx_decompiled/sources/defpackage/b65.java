package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b65 extends x55 {
    public b65(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }

    public final void d(long j) throws IOException {
        int i = this.c;
        if (i > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= i;
        }
        a((int) j);
    }

    public b65(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
