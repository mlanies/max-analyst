package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class u69 extends ffe implements a66 {
    public MessageModel X;
    public boolean Y;
    public int Z;
    public final /* synthetic */ MessagesListWidget s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ View u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u69(MessagesListWidget messagesListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.s0 = messagesListWidget;
        this.t0 = j;
        this.u0 = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((u69) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new u69(this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u69.o(java.lang.Object):java.lang.Object");
    }
}
