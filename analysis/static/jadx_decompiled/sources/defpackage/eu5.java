package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class eu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Collection Y;
    public final /* synthetic */ nu5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu5(AbstractCollection abstractCollection, nu5 nu5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = abstractCollection;
        this.Z = nu5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((eu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new eu5((AbstractCollection) this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ContextScope contextScopeA = j1e.a(this.b);
            Collection collection = this.Y;
            ArrayList arrayList = new ArrayList(z53.S(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(j47.h(contextScopeA, null, new du5(it.next(), null, this.Z), 3));
            }
            this.X = 1;
            obj = pag.c(arrayList, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return x53.e0((Iterable) obj);
    }
}
