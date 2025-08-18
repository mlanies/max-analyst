package androidx.work;

import android.content.Context;
import defpackage.bm7;
import defpackage.dcd;
import defpackage.fm7;
import defpackage.gm7;
import defpackage.gwe;
import defpackage.h76;

/* loaded from: classes.dex */
public abstract class Worker extends gm7 {
    public dcd a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract fm7 b();

    @Override // defpackage.gm7
    public final bm7 getForegroundInfoAsync() {
        dcd dcdVar = new dcd();
        getBackgroundExecutor().execute(new h76((Object) this, (Object) dcdVar, false, 29));
        return dcdVar;
    }

    @Override // defpackage.gm7
    public final bm7 startWork() {
        this.a = new dcd();
        getBackgroundExecutor().execute(new gwe(6, this));
        return this.a;
    }
}
