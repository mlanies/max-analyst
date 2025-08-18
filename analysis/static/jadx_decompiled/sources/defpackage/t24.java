package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface t24 extends m24 {
    long G(a34 a34Var);

    void H(z0f z0fVar);

    default Map a() {
        return Collections.emptyMap();
    }

    void close();

    Uri getUri();
}
