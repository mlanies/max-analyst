package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.location.live.LiveLocationWorker;

/* loaded from: classes2.dex */
public final class in7 extends hu3 {
    public String X;
    public LiveLocationWorker Y;
    public /* synthetic */ Object Z;
    public LiveLocationWorker o;
    public final /* synthetic */ LiveLocationWorker s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in7(LiveLocationWorker liveLocationWorker, Continuation continuation) {
        super(continuation);
        this.s0 = liveLocationWorker;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.doWork(this);
    }
}
