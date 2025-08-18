package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public interface cfe {
    void a();

    default e5f b() {
        return e5f.a;
    }

    Object c(float f, long j, long j2, Continuation continuation);

    default Object d(Continuation continuation) {
        return e5f.a;
    }

    void e(boolean z, boolean z2);

    Object f(File file, Continuation continuation);

    String getDownloadContext();
}
