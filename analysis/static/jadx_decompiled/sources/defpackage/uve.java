package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uve extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wve Y;
    public int Z;
    public wve o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uve(wve wveVar, Continuation continuation) {
        super(continuation);
        this.Y = wveVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}
