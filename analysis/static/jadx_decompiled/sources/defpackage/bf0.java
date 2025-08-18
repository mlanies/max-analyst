package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class bf0 extends hu3 {
    public mec X;
    public int Y;
    public /* synthetic */ Object Z;
    public List o;
    public final /* synthetic */ BacklogWorker s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(BacklogWorker backlogWorker, Continuation continuation) {
        super(continuation);
        this.s0 = backlogWorker;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.c(null, 0, this);
    }
}
