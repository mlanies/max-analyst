package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;

/* loaded from: classes2.dex */
public final class rj6 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ HeartbeatScheduler$TaskHeartbeatWorker Y;
    public int Z;
    public HeartbeatScheduler$TaskHeartbeatWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj6(HeartbeatScheduler$TaskHeartbeatWorker heartbeatScheduler$TaskHeartbeatWorker, Continuation continuation) {
        super(continuation);
        this.Y = heartbeatScheduler$TaskHeartbeatWorker;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.doWork(this);
    }
}
