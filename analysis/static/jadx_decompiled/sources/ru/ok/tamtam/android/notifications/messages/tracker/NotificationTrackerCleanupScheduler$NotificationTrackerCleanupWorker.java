package ru.ok.tamtam.android.notifications.messages.tracker;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.jyc;
import defpackage.nx3;
import defpackage.q33;
import defpackage.qx9;
import defpackage.w9a;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ru/ok/tamtam/android/notifications/messages/tracker/NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lqx9;", "notificationsTracker", "Lq33;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqx9;Lq33;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker extends SdkCoroutineWorker {
    public final qx9 a;
    public final q33 b;
    public final nx3 c;

    public NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(Context context, WorkerParameters workerParameters, qx9 qx9Var, q33 q33Var) {
        super(context, workerParameters);
        this.a = qx9Var;
        this.b = q33Var;
        this.c = ((w9a) ((jyc) getTamComponent()).s()).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.bw9
            if (r0 == 0) goto L13
            r0 = r9
            bw9 r0 = (defpackage.bw9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            bw9 r0 = new bw9
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r9)
            goto L61
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.od2.a0(r9)
            q33 r9 = r8.b
            hyc r9 = (defpackage.hyc) r9
            long r4 = r9.n()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            r6 = 7
            long r6 = r9.toMillis(r6)
            long r4 = r4 - r6
            r0.Y = r3
            qx9 r8 = r8.a
            kke r9 = r8.a
            w9a r9 = (defpackage.w9a) r9
            nx3 r9 = r9.b()
            ox9 r2 = new ox9
            r3 = 0
            r2.<init>(r4, r8, r3)
            java.lang.Object r8 = defpackage.j47.t0(r9, r2, r0)
            if (r8 != r1) goto L5c
            goto L5e
        L5c:
            e5f r8 = defpackage.e5f.a
        L5e:
            if (r8 != r1) goto L61
            return r1
        L61:
            em7 r8 = defpackage.fm7.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* renamed from: getCoroutineContext, reason: from getter */
    public final nx3 getC() {
        return this.c;
    }
}
