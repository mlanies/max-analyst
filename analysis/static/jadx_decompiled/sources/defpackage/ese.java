package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.devmenu.ThemeRoomBottomSheet;

/* loaded from: classes.dex */
public final class ese extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ThemeRoomBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ese(Continuation continuation, ThemeRoomBottomSheet themeRoomBottomSheet) {
        super(2, continuation);
        this.Y = themeRoomBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ese eseVar = (ese) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        eseVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ese eseVar = new ese(continuation, this.Y);
        eseVar.X = obj;
        return eseVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jse jseVar = (jse) this.X;
        if (!(jseVar instanceof jse)) {
            throw new NoWhenBranchMatchedException();
        }
        ThemeRoomBottomSheet themeRoomBottomSheet = this.Y;
        mr0.G(themeRoomBottomSheet);
        themeRoomBottomSheet.s0(true);
        wha whaVar = new wha(themeRoomBottomSheet);
        whaVar.h("Новая тема: " + jseVar.a);
        whaVar.i();
        return e5f.a;
    }
}
