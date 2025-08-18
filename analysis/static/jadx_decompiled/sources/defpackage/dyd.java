package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dyd extends hu3 {
    public String X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ eyd Z;
    public eyd o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyd(eyd eydVar, Continuation continuation) {
        super(continuation);
        this.Z = eydVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(0L, null, this);
    }
}
