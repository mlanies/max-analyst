package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface l43 extends Closeable, ru6, HasExtraData {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    ru6 getImageInfo();

    pqb getQualityInfo();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
