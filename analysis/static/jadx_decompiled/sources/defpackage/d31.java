package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.exception.ChatNotFoundException;

/* loaded from: classes.dex */
public final class d31 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ l31 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d31(long j, l31 l31Var, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = l31Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d31 d31Var = (d31) n((e52) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d31Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d31 d31Var = new d31(this.Y, this.Z, continuation);
        d31Var.X = obj;
        return d31Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e52 e52Var = (e52) this.X;
        if (e52Var != null) {
            l31 l31Var = this.Z;
            j47.T(l31Var.a, ((w9a) ((kke) l31Var.f.getValue())).a(), null, new c31(l31Var, e52Var, null), 2);
            return e5f.a;
        }
        throw new ChatNotFoundException("chat not found for id =#" + this.Y);
    }
}
