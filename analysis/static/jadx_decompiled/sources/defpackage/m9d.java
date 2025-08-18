package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class m9d extends e9d {
    public h7b D0;

    @Override // defpackage.e9d, defpackage.g9d
    public final long z(long j, e52 e52Var) throws InterruptedException {
        ti5 ti5Var;
        l20 l20VarA;
        long jZ;
        h7b h7bVar = this.D0;
        si5 si5Var = si5.a;
        if (h7bVar != null) {
            ((CountDownLatch) h7bVar.b).await(MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS);
            ti5Var = (ti5) ((AtomicReference) h7bVar.c).get();
            if (ti5Var == null) {
                ti5Var = si5Var;
            }
        } else {
            ti5Var = null;
        }
        if (tpa.f(ti5Var, si5Var)) {
            jZ = super.z(j, e52Var);
        } else {
            cu8 cu8VarQ = o().q(j);
            if (cu8VarQ == null || (l20VarA = cu8VarQ.a(g20.o)) == null) {
                return 0L;
            }
            n().u(cu8VarQ, l20VarA.r, d20.o);
            jZ = 0;
        }
        this.D0 = null;
        return jZ;
    }
}
