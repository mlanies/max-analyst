package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import one.me.android.OneMeApplication;
import ru.ok.android.externcalls.sdk.Conversation;

/* loaded from: classes2.dex */
public final /* synthetic */ class jw3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ jw3(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (Conversation.State) this.b.get();
            case 1:
                AtomicReference atomicReference = this.b;
                int i = OneMeApplication.s0;
                long jNanoTime = System.nanoTime();
                eca ecaVar = (eca) jyc.a.getAccessor().c(eca.class);
                ecaVar.getClass();
                hm9.n("OneMeInitialDataStorage", "load");
                List list = (List) j47.f0(hz4.a, new dca(ecaVar, null));
                boolean z = false;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                if (zBooleanValue && zBooleanValue2) {
                    z = true;
                }
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, "OneMeInitialDataStorage", ey8.j("load finished ", z), null);
                }
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    us7 us7Var = us7.X;
                    int i2 = ft4.o;
                    ir6Var2.d(us7Var, "InitialDataTask", "initialDataStorage().load() by ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
                }
                atomicReference.set(Boolean.valueOf(z));
                return e5f.a;
            case 2:
                int i3 = OneMeApplication.s0;
                Boolean bool = (Boolean) this.b.get();
                bool.booleanValue();
                return bool;
            default:
                zl4 zl4Var = (zl4) this.b.getAndSet(iz4.a);
                if (zl4Var != null) {
                    zl4Var.g();
                }
                return e5f.a;
        }
    }
}
