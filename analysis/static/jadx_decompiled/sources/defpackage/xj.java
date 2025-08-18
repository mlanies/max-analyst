package defpackage;

import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieDrawableUtils;

/* loaded from: classes2.dex */
public final class xj extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zj Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(zj zjVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zjVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xj xjVar = (xj) n((a3f) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xjVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xj xjVar = new xj(this.Y, continuation);
        xjVar.X = obj;
        return xjVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        a3f a3fVar = (a3f) this.X;
        long jLongValue = ((Number) a3fVar.a).longValue();
        String str = (String) a3fVar.b;
        String str2 = (String) a3fVar.c;
        zj zjVar = this.Y;
        String str3 = zjVar.s0;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str3, zr6.l(z7b.j("handleAnimoji #", jLongValue, ", ", str), ", ", str2), null);
        }
        if (str != null && str.length() != 0) {
            String str4 = zjVar.s0;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, str4, zr6.l(z7b.j("handleLottie #", jLongValue, ", ", str), ", ", str2), null);
            }
            fi fiVar = zjVar.o;
            int i = zjVar.a;
            fiVar.getClass();
            ei eiVar = new ei(jLongValue, i);
            RLottieDrawable rLottieDrawable = (RLottieDrawable) fiVar.a.computeIfAbsent(eiVar, new di(0, new m8(i, 1, str)));
            rLottieDrawable.scaleByCanvas = true;
            if (rLottieDrawable.isLoadingFailed()) {
                RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, true);
            }
            rLottieDrawable.addDrawableLoadListener(new wj(zjVar, str2));
        } else if (str2 != null && str2.length() != 0) {
            zjVar.c(str2);
        }
        return e5f.a;
    }
}
