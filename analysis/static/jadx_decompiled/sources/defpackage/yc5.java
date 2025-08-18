package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class yc5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yc5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                k4a k4aVar = (k4a) ((dd5) this.c).a;
                return Long.valueOf(ome.d(k4aVar.z(), new zt(5, ((p7b) k4aVar.y()).a.o(), this.b), false, 0, 12));
            default:
                return ((o2e) ((md5) this.c).b.get()).d(Collections.singletonList(Long.valueOf(this.b)));
        }
    }
}
