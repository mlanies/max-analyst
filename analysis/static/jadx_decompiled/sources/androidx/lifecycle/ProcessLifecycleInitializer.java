package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.eg7;
import defpackage.jo7;
import defpackage.nz4;
import defpackage.p9b;
import defpackage.q9b;
import defpackage.sg7;
import defpackage.tg7;
import defpackage.x07;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lx07;", "Leh7;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements x07 {
    @Override // defpackage.x07
    public final List a() {
        return nz4.a;
    }

    @Override // defpackage.x07
    public final Object b(Context context) {
        if (!((HashSet) jo7.i(context).b).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!tg7.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new sg7());
        }
        q9b q9bVar = q9b.s0;
        q9bVar.getClass();
        q9bVar.X = new Handler();
        q9bVar.Y.d(eg7.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new p9b(q9bVar));
        return q9bVar;
    }
}
