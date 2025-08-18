package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.exception.ChatNotFoundException;

/* loaded from: classes2.dex */
public final /* synthetic */ class c82 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p82 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c82(p82 p82Var, long j, int i) {
        this.a = i;
        this.b = p82Var;
        this.c = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                ConcurrentHashMap concurrentHashMap = this.b.f;
                long j = this.c;
                e52 e52Var = (e52) concurrentHashMap.get(Long.valueOf(j));
                if (e52Var != null) {
                    return e52Var;
                }
                throw new ChatNotFoundException(ey8.h(j, "chat not found: "));
            default:
                ConcurrentHashMap concurrentHashMap2 = this.b.g;
                long j2 = this.c;
                e52 e52Var2 = (e52) concurrentHashMap2.get(Long.valueOf(j2));
                if (e52Var2 != null) {
                    return e52Var2;
                }
                throw new ChatNotFoundException(ey8.h(j2, "chat not found: "));
        }
    }
}
