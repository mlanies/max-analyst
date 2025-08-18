package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mrc extends hu3 {
    public final /* synthetic */ qrc X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrc(qrc qrcVar, Continuation continuation) {
        super(continuation);
        this.X = qrcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(null, false, this);
    }
}
