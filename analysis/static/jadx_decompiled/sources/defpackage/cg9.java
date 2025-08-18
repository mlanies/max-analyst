package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cg9 extends ffe implements a66 {
    public Set X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ eg9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg9(long j, eg9 eg9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = eg9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cg9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cg9(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Set setG0;
        Set set;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        eg9 eg9Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            long j = this.Z;
            if (j == -1) {
                return e5fVar;
            }
            Set set2 = ((yf9) eg9Var.f.getValue()).a;
            if (set2.isEmpty()) {
                setG0 = Collections.singleton(new Long(j));
            } else if (set2.contains(new Long(j))) {
                setG0 = x53.G0(set2);
                setG0.remove(new Long(j));
            } else {
                Long l = new Long(j);
                LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(set2.size() + 1));
                linkedHashSet.addAll(set2);
                linkedHashSet.add(l);
                setG0 = linkedHashSet;
            }
            this.X = setG0;
            this.Y = 1;
            Serializable serializableC = setG0.isEmpty() ? nz4.a : setG0.size() == 1 ? eg9Var.c(((l29) eg9Var.c.getValue()).d(((Number) x53.f0(setG0)).longValue()), this) : eg9Var.b(setG0, this);
            if (serializableC == tx3Var) {
                return tx3Var;
            }
            Set set3 = setG0;
            obj = serializableC;
            set = set3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = this.X;
            od2.a0(obj);
        }
        eg9Var.f.m(null, new yf9((List) obj, set));
        return e5fVar;
    }
}
