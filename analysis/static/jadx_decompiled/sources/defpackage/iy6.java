package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iy6 extends ffe implements a66 {
    public ConcurrentHashMap X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ fz6 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy6(fz6 fz6Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = fz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((iy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        iy6 iy6Var = new iy6(this.s0, continuation);
        iy6Var.Z = obj;
        return iy6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        zme zmeVar;
        ConcurrentHashMap concurrentHashMap;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Z;
            String str = fz6.E0;
            zme zmeVar2 = new zme("fetchAlbums");
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            List<u76> list = u76.e;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (u76 u76Var : list) {
                fz6 fz6Var = this.s0;
                arrayList.add(j47.T(sx3Var, ((w9a) fz6Var.c).b(), null, new hy6(u76Var, fz6Var, zmeVar2, concurrentHashMap2, null), 2));
            }
            this.Z = zmeVar2;
            this.X = concurrentHashMap2;
            this.Y = 1;
            if (pag.s(arrayList, this) == tx3Var) {
                return tx3Var;
            }
            zmeVar = zmeVar2;
            concurrentHashMap = concurrentHashMap2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            concurrentHashMap = this.X;
            zmeVar = (zme) this.Z;
            od2.a0(obj);
        }
        zmeVar.getClass();
        return x53.D0(concurrentHashMap.values());
    }
}
