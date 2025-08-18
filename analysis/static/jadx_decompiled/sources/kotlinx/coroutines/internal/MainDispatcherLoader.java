package kotlinx.coroutines.internal;

import defpackage.at;
import defpackage.cx7;
import defpackage.l6d;
import defpackage.ni3;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "<init>", "()V", "Lcx7;", "loadMainDispatcher", "()Lcx7;", "", "FAST_SERVICE_LOADER_ENABLED", "Z", "dispatcher", "Lcx7;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class MainDispatcherLoader {
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;
    public static final MainDispatcherLoader INSTANCE;
    public static final cx7 dispatcher;

    static {
        MainDispatcherLoader mainDispatcherLoader = new MainDispatcherLoader();
        INSTANCE = mainDispatcherLoader;
        SystemPropsKt.systemProp("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = mainDispatcherLoader.loadMainDispatcher();
    }

    private MainDispatcherLoader() {
    }

    private final cx7 loadMainDispatcher() {
        Object next;
        cx7 cx7VarTryCreateDispatcher;
        try {
            List listI0 = l6d.i0(new ni3(new at(6, ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator())));
            Iterator it = listI0.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory != null && (cx7VarTryCreateDispatcher = MainDispatchersKt.tryCreateDispatcher(mainDispatcherFactory, listI0)) != null) {
                return cx7VarTryCreateDispatcher;
            }
            return MainDispatchersKt.createMissingDispatcher$default(null, null, 3, null);
        } catch (Throwable th) {
            return MainDispatchersKt.createMissingDispatcher$default(th, null, 2, null);
        }
    }
}
