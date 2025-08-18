package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class jlb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jlb jlbVar = (jlb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jlbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jlb jlbVar = new jlb(continuation, this.Y);
        jlbVar.X = obj;
        return jlbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlb.o(java.lang.Object):java.lang.Object");
    }
}
