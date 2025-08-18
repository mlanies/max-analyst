package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e3e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ i3e Y;
    public final /* synthetic */ Long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3e(i3e i3eVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.Y = i3eVar;
        this.Z = l;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e3e e3eVar = (e3e) n((kpa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        e3eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        e3e e3eVar = new e3e(this.Y, this.Z, continuation);
        e3eVar.X = obj;
        return e3eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        kpa kpaVar = (kpa) this.X;
        m3e m3eVar = (m3e) kpaVar.a;
        Boolean bool = (Boolean) kpaVar.b;
        i3e i3eVar = this.Y;
        q0e q0eVar = i3eVar.B0;
        boolean zBooleanValue = bool.booleanValue();
        String str = m3eVar.b;
        if (str == null) {
            str = "";
        }
        iqe iqeVar = new iqe(str);
        List list = m3eVar.h;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i3eVar.r((d2e) it.next(), false, this.Z));
        }
        q0eVar.m(null, new w3e(m3eVar.a, iqeVar, m3eVar.c, null, arrayList, zBooleanValue ? 2 : 4, false, false, 200));
        return e5f.a;
    }
}
