package defpackage;

import android.os.Trace;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l9b {
    public final k9b a;

    public l9b(k9b k9bVar) {
        this.a = k9bVar;
    }

    public final void a(l9f... l9fVarArr) {
        int i;
        k9b k9bVar = this.a;
        k9bVar.getClass();
        Trace.beginSection(c37.F("CX:unbind"));
        try {
            kq0.e();
            ay1 ay1Var = k9bVar.d;
            if (ay1Var == null) {
                i = 0;
            } else {
                yg2 yg2Var = ay1Var.f;
                if (yg2Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i = ((l0f) yg2Var.c).b;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            k9bVar.c.n(y53.M(Arrays.copyOf(l9fVarArr, l9fVarArr.length)));
        } finally {
            Trace.endSection();
        }
    }
}
