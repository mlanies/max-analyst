package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class at4 implements r24 {
    public static final at4 a = new at4();

    @Override // defpackage.r24
    public final long L(z24 z24Var) throws IOException {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
    }

    @Override // defpackage.r24
    public final void close() {
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        return null;
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
