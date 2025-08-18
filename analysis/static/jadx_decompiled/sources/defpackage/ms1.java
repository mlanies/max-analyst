package defpackage;

import java.util.UUID;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ms1 extends ffe implements a66 {
    public final /* synthetic */ m5d X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms1(m5d m5dVar, Continuation continuation) {
        super(2, continuation);
        this.X = m5dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ms1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ms1(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String string = UUID.randomUUID().toString();
        k4a k4aVar = (k4a) ((pk) ((je7) this.X.b).getValue());
        return new Long(k4a.v(k4aVar, new ei7(((p7b) k4aVar.y()).a.o(), string)));
    }
}
