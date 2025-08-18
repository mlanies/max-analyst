package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final class c5e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5e(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.Y = stickersScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        c5e c5eVar = (c5e) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        c5eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        c5e c5eVar = new c5e(continuation, this.Y);
        c5eVar.X = obj;
        return c5eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        m7e m7eVar = (m7e) this.X;
        bc7[] bc7VarArr = StickersScreen.v0;
        StickersScreen stickersScreen = this.Y;
        cla claVarN0 = stickersScreen.n0();
        CharSequence charSequenceB = m7eVar.a.b(stickersScreen.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        claVarN0.setTitle(charSequenceB);
        String str = m7eVar.b;
        if (str != null) {
            stickersScreen.n0().setSubtitle(str);
        }
        return e5f.a;
    }
}
