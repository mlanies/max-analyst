package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final class dgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgb(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dgb) n((jgb) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dgb dgbVar = new dgb(this.Y, continuation);
        dgbVar.X = obj;
        return dgbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jgb jgbVar = (jgb) this.X;
        if (!(jgbVar instanceof jgb)) {
            throw new NoWhenBranchMatchedException();
        }
        jqe jqeVar = jgbVar.a;
        ProfileEditScreen profileEditScreen = this.Y;
        CharSequence charSequenceB = jqeVar.b(profileEditScreen.getContext());
        e5f e5fVar = e5f.a;
        if (charSequenceB == null) {
            return e5fVar;
        }
        wha whaVar = new wha(profileEditScreen);
        whaVar.e(nia.a);
        whaVar.h(charSequenceB);
        whaVar.f(pia.a);
        whaVar.c(new eia(0, 0, jgbVar.b, 3));
        whaVar.d(jgbVar.c);
        whaVar.i();
        return e5fVar;
    }
}
