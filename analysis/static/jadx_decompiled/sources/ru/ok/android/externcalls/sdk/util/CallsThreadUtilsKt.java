package ru.ok.android.externcalls.sdk.util;

import defpackage.ce;
import defpackage.drd;
import defpackage.ho1;
import defpackage.iq1;
import defpackage.k56;
import defpackage.muc;
import defpackage.nqd;
import defpackage.q1a;
import defpackage.qj3;
import defpackage.rj3;
import defpackage.sqd;
import defpackage.zl4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T", "Lkotlin/Function0;", "Lrj3;", "onSuccess", "Ljava/lang/Runnable;", "onError", "Lzl4;", "executeOnIoThread", "(Lk56;Lrj3;Ljava/lang/Runnable;)Lzl4;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallsThreadUtilsKt {
    public static final <T> zl4 executeOnIoThread(k56 k56Var, final rj3 rj3Var, final Runnable runnable) {
        drd drdVarI = new q1a(1, new ho1(2, k56Var)).m(muc.b()).i(ce.a());
        iq1 iq1Var = new iq1(new qj3() { // from class: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt.executeOnIoThread.2
            @Override // defpackage.qj3
            public final void accept(T t) {
                rj3Var.accept(t);
            }
        }, 2, new qj3() { // from class: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt.executeOnIoThread.3
            @Override // defpackage.qj3
            public final void accept(Throwable th) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        drdVarI.k(iq1Var);
        return iq1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOnIoThread$lambda$0(k56 k56Var, sqd sqdVar) {
        try {
            ((nqd) sqdVar).a(k56Var.invoke());
        } catch (Throwable th) {
            ((nqd) sqdVar).onError(th);
        }
    }
}
