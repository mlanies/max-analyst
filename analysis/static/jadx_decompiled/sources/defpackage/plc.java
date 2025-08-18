package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class plc extends hu3 {
    public Object X;
    public bu8 Y;
    public bu8 Z;
    public Object o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ vlc t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plc(vlc vlcVar, Continuation continuation) {
        super(continuation);
        this.t0 = vlcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.h(null, this);
    }
}
