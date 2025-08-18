package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final class cgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgb(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cgb) n((wm9) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cgb cgbVar = new cgb(this.Y, continuation);
        cgbVar.X = obj;
        return cgbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0190  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgb.o(java.lang.Object):java.lang.Object");
    }
}
