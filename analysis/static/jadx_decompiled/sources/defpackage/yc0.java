package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yc0 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zc0 Y;
    public int Z;
    public Uri o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(zc0 zc0Var, Continuation continuation) {
        super(continuation);
        this.Y = zc0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(null, this);
    }
}
