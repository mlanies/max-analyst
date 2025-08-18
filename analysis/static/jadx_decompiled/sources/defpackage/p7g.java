package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p7g {
    public final void a(WorkRequest workRequest) {
        List listSingletonList = Collections.singletonList(workRequest);
        s7g s7gVar = (s7g) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new g7g(s7gVar, null, h65.b, listSingletonList).l();
    }

    public abstract pma b(String str, int i, mta mtaVar);
}
