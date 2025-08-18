package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ic2 implements sj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ic2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.sj3
    public final void accept(Object obj) {
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                jc2 jc2Var = (jc2) obj2;
                jc2Var.getClass();
                hm9.m("jc2", "ValidateMessagesTimeUseCase found some items for delete, size = %d", Integer.valueOf(collection.size()));
                jc2Var.h.b(new tb2(jc2Var, this.b, collection, 1));
                break;
            default:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((vlc) obj2).g((lna) it.next(), this.b);
                }
                break;
        }
    }
}
