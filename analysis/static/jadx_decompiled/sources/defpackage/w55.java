package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w55 extends MediaDataSource {
    public long a;
    public final /* synthetic */ b65 b;

    public w55(b65 b65Var) {
        this.b = b65Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            b65 b65Var = this.b;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + b65Var.a.available()) {
                    return -1;
                }
                b65Var.d(j);
                this.a = j;
            }
            if (i2 > b65Var.a.available()) {
                i2 = b65Var.a.available();
            }
            int i3 = b65Var.read(bArr, i, i2);
            if (i3 >= 0) {
                this.a += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }
}
