package kotlinx.coroutines.internal;

import defpackage.j47;
import defpackage.lx3;
import defpackage.m56;
import defpackage.wmd;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f**\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000e"}, d2 = {"E", "Lkotlin/Function1;", "Le5f;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "callUndeliveredElementCatchingException", "(Lm56;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Llx3;", "context", "callUndeliveredElement", "(Lm56;Ljava/lang/Object;Llx3;)V", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class OnUndeliveredElementKt {
    public static final <E> void callUndeliveredElement(m56 m56Var, E e, lx3 lx3Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException = callUndeliveredElementCatchingException(m56Var, e, null);
        if (undeliveredElementExceptionCallUndeliveredElementCatchingException != null) {
            wmd.v(lx3Var, undeliveredElementExceptionCallUndeliveredElementCatchingException);
        }
    }

    public static final <E> UndeliveredElementException callUndeliveredElementCatchingException(m56 m56Var, E e, UndeliveredElementException undeliveredElementException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            m56Var.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            j47.e(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException callUndeliveredElementCatchingException$default(m56 m56Var, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(m56Var, obj, undeliveredElementException);
    }
}
