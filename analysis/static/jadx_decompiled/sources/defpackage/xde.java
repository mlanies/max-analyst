package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface xde extends Closeable {
    k36 getReadableDatabase();

    k36 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
