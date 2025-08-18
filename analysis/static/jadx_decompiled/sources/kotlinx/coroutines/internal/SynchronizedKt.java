package kotlinx.coroutines.internal;

import defpackage.k56;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007*\f\b\u0007\u0010\b\"\u00020\u00012\u00020\u0001¨\u0006\t"}, d2 = {"T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "synchronizedImpl", "(Ljava/lang/Object;Lk56;)Ljava/lang/Object;", "SynchronizedObject", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class SynchronizedKt {
    public static /* synthetic */ void SynchronizedObject$annotations() {
    }

    public static final <T> T synchronizedImpl(Object obj, k56 k56Var) {
        T t;
        synchronized (obj) {
            t = (T) k56Var.invoke();
        }
        return t;
    }
}
