package kotlinx.coroutines.internal;

import defpackage.a66;
import defpackage.jx3;
import defpackage.lx3;
import defpackage.pse;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Llx3;", "context", "", "threadContextElements", "(Llx3;)Ljava/lang/Object;", "countOrElement", "updateThreadContext", "(Llx3;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "Le5f;", "restoreThreadContext", "(Llx3;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/Symbol;", "NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlin/Function2;", "Ljx3;", "countAll", "La66;", "Lpse;", "findOne", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ThreadContextKt {
    private static final a66 countAll;
    private static final a66 findOne;
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final a66 updateState = new a();

    static {
        final int i = 1;
        countAll = new a66() { // from class: qse
            @Override // defpackage.a66
            public final Object invoke(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        return ThreadContextKt.findOne$lambda$1((pse) obj, (jx3) obj2);
                    default:
                        return ThreadContextKt.countAll$lambda$0(obj, (jx3) obj2);
                }
            }
        };
        final int i2 = 0;
        findOne = new a66() { // from class: qse
            @Override // defpackage.a66
            public final Object invoke(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        return ThreadContextKt.findOne$lambda$1((pse) obj, (jx3) obj2);
                    default:
                        return ThreadContextKt.countAll$lambda$0(obj, (jx3) obj2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, jx3 jx3Var) {
        if (!(jx3Var instanceof pse)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? jx3Var : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pse findOne$lambda$1(pse pseVar, jx3 jx3Var) {
        if (pseVar != null) {
            return pseVar;
        }
        if (jx3Var instanceof pse) {
            return (pse) jx3Var;
        }
        return null;
    }

    public static final void restoreThreadContext(lx3 lx3Var, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(lx3Var);
        } else {
            ((pse) lx3Var.fold(null, findOne)).restoreThreadContext(lx3Var, obj);
        }
    }

    public static final Object threadContextElements(lx3 lx3Var) {
        return lx3Var.fold(0, countAll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, jx3 jx3Var) {
        if (jx3Var instanceof pse) {
            pse pseVar = (pse) jx3Var;
            threadState.append(pseVar, pseVar.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(lx3 lx3Var, Object obj) {
        if (obj == null) {
            obj = threadContextElements(lx3Var);
        }
        return obj == 0 ? NO_THREAD_ELEMENTS : obj instanceof Integer ? lx3Var.fold(new ThreadState(lx3Var, ((Number) obj).intValue()), updateState) : ((pse) obj).updateThreadContext(lx3Var);
    }
}
