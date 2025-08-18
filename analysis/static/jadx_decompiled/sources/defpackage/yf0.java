package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.ShortcutBadger;

/* loaded from: classes.dex */
public final class yf0 extends ffe implements a66 {
    public /* synthetic */ int X;
    public final /* synthetic */ zf0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(zf0 zf0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = zf0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yf0 yf0Var = (yf0) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yf0Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yf0 yf0Var = new yf0(this.Y, continuation);
        yf0Var.X = ((Number) obj).intValue();
        return yf0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int i = this.X;
        if (i >= 0) {
            ShortcutBadger.applyCount(this.Y.a, i);
        }
        return e5f.a;
    }
}
