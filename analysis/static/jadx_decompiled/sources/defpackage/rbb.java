package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* loaded from: classes2.dex */
public final class rbb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbb(Continuation continuation, ProfileAvatarsScreen profileAvatarsScreen) {
        super(2, continuation);
        this.Y = profileAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rbb rbbVar = (rbb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rbbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rbb rbbVar = new rbb(continuation, this.Y);
        rbbVar.X = obj;
        return rbbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        ProfileAvatarsScreen profileAvatarsScreen = this.Y;
        gbb gbbVar = profileAvatarsScreen.w0;
        if (gbbVar.w0.isEmpty() && (!list.isEmpty())) {
            gbbVar.w0 = list;
            gbbVar.p(0, list.size());
        } else {
            wj4 wj4VarE = lz7.e(new b81(3, gbbVar.w0, list));
            gbbVar.w0 = list;
            wj4VarE.a(new y8(gbbVar));
        }
        ProfileAvatarsScreen.w0(profileAvatarsScreen, profileAvatarsScreen.B0().b.getTitle(), profileAvatarsScreen.C0().getCurrentItem());
        return e5f.a;
    }
}
