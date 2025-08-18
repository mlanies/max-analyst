package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class cf0 extends ffe implements a66 {
    public final /* synthetic */ mec X;
    public final /* synthetic */ List Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(mec mecVar, List list, Continuation continuation) {
        super(2, continuation);
        this.X = mecVar;
        this.Y = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cf0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cf0(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return Boolean.valueOf(((BacklogWorker) this.X.a).e().g().contains(this.Y));
    }
}
