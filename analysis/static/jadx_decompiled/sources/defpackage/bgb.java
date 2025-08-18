package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final class bgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgb(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bgb bgbVar = (bgb) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bgbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bgb bgbVar = new bgb(this.Y, continuation);
        bgbVar.X = obj;
        return bgbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.X.E((List) this.X);
        return e5f.a;
    }
}
