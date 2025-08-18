package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xo8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ bp8 Z;
    public final /* synthetic */ yn8 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo8(yn8 yn8Var, bp8 bp8Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = bp8Var;
        this.s0 = yn8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xo8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xo8(this.s0, this.Z, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        List<kn8> list = this.Y;
        if (i == 0) {
            od2.a0(obj);
            List listI0 = l6d.i0(new r1f(l6d.Z(new at(2, list), new wz7(3, this.s0)), new g27(13)));
            if (listI0.isEmpty()) {
                return list;
            }
            this.X = 1;
            obj = this.Z.r(listI0, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        Iterable iterable = (Iterable) obj;
        int iZ = mz7.Z(z53.S(iterable, 10));
        if (iZ < 16) {
            iZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
        for (Object obj2 : iterable) {
            linkedHashMap.put(new Long(((kn8) obj2).a), obj2);
        }
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (kn8 kn8Var : list) {
            kn8 kn8Var2 = (kn8) linkedHashMap.get(new Long(kn8Var.a));
            if (kn8Var2 != null) {
                kn8Var = kn8Var2;
            }
            arrayList.add(kn8Var);
        }
        return arrayList;
    }
}
