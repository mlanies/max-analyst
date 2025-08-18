package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface r24 extends l24 {
    long L(z24 z24Var);

    void N(y0f y0fVar);

    default Map a() {
        return Collections.emptyMap();
    }

    void close();

    Uri getUri();
}
