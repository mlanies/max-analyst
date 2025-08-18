package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* loaded from: classes2.dex */
public final class ixa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ixa ixaVar = (ixa) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ixaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ixa ixaVar = new ixa(this.Y, continuation);
        ixaVar.X = obj;
        return ixaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixa.o(java.lang.Object):java.lang.Object");
    }
}
