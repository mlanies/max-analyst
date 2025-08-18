package defpackage;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class gta {
    public final vi4 a;
    public final boolean b;

    public gta(Context context) throws IOException {
        vi4 vi4VarQ = lz7.q(context);
        this.a = vi4VarQ;
        this.b = vi4VarQ.compareTo(vi4.o) >= 0;
    }

    public final String toString() {
        return x9e.b0("\n        PerformanceConfig(\n            perfClass=" + this.a + ",\n        )\n    ");
    }
}
