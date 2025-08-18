package ru.ok.tamtam.android.services;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.qj6;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ok/tamtam/android/services/HeartbeatScheduler$TaskHeartbeatWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lqj6;", "heartbeatLogic", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqj6;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class HeartbeatScheduler$TaskHeartbeatWorker extends SdkCoroutineWorker {
    public final qj6 a;

    public HeartbeatScheduler$TaskHeartbeatWorker(Context context, WorkerParameters workerParameters, qj6 qj6Var) {
        super(context, workerParameters);
        this.a = qj6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
