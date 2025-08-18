package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class kf0 extends ffe implements a66 {
    public final /* synthetic */ BacklogWorker X;
    public final /* synthetic */ int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf0(BacklogWorker backlogWorker, int i, Continuation continuation) {
        super(2, continuation);
        this.X = backlogWorker;
        this.Y = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kf0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kf0(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return this.X.e().g().getItemsForRunning(this.Y);
    }
}
