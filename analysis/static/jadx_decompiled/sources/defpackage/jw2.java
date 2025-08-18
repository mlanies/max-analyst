package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nx2 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw2(nx2 nx2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jw2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nx2 nx2Var = this.Y;
            j52 j52Var = (j52) nx2Var.y0.getValue();
            this.X = 1;
            obj = j52Var.a(this.Z, nx2Var.c, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((g52) obj2) != g52.A0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(br7.j((g52) it.next()));
        }
        return arrayList2;
    }
}
