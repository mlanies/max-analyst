package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.ThemeRoomBottomSheet;

/* loaded from: classes.dex */
public final class dse extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ThemeRoomBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dse(Continuation continuation, ThemeRoomBottomSheet themeRoomBottomSheet) {
        super(2, continuation);
        this.Y = themeRoomBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dse dseVar = (dse) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dseVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dse dseVar = new dse(continuation, this.Y);
        dseVar.X = obj;
        return dseVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.z0.E((List) this.X);
        return e5f.a;
    }
}
