package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class l9a extends hu3 {
    public Object X;
    public MessageModel Y;
    public MessageModel Z;
    public Object o;
    public MessageModel s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ m9a v0;
    public int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9a(m9a m9aVar, Continuation continuation) {
        super(continuation);
        this.v0 = m9aVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.u0 = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.v0.e(null, this);
    }
}
