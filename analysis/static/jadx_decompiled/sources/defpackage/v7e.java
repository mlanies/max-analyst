package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v7e extends ffe implements g66 {
    public /* synthetic */ List X;
    public /* synthetic */ List Y;
    public /* synthetic */ List Z;
    public /* synthetic */ ynd s0;

    @Override // defpackage.g66
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v7e v7eVar = new v7e(5, (Continuation) obj5);
        v7eVar.X = (List) obj;
        v7eVar.Y = (List) obj2;
        v7eVar.Z = (List) obj3;
        v7eVar.s0 = (ynd) obj4;
        return v7eVar.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = this.X;
        List list2 = this.Y;
        List list3 = this.Z;
        ynd yndVar = this.s0;
        j7e j7eVar = new j7e();
        j7eVar.a = list;
        j7eVar.b = list2;
        j7eVar.c = list3;
        j7eVar.d = yndVar;
        return j7eVar;
    }
}
