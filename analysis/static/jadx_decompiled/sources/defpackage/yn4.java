package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yn4 extends hu3 {
    public File X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ao4 Z;
    public ao4 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn4(ao4 ao4Var, Continuation continuation) {
        super(continuation);
        this.Z = ao4Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.f(null, this);
    }
}
