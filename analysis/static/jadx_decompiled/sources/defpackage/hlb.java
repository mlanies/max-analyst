package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class hlb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hlb hlbVar = (hlb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hlbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hlb hlbVar = new hlb(continuation, this.Y);
        hlbVar.X = obj;
        return hlbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7VarArr = ProfileScreen.D0;
        hdc adapter = this.Y.q0().getAdapter();
        qlb qlbVar = adapter instanceof qlb ? (qlb) adapter : null;
        if (qlbVar != null) {
            qlbVar.E(list);
        }
        return e5f.a;
    }
}
