package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;

/* loaded from: classes2.dex */
public final class bw9 extends hu3 {
    public final /* synthetic */ NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw9(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker notificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker, Continuation continuation) {
        super(continuation);
        this.X = notificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.doWork(this);
    }
}
