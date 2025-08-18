package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class k82 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k82(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Long l = (Long) obj;
        switch (this.a) {
            case 0:
                e52 e52Var = (e52) obj2;
                if (((gi9) this.c).d(l.longValue())) {
                    ((ArrayList) this.b).add(e52Var);
                    break;
                }
                break;
            case 1:
                e52 e52Var2 = (e52) obj2;
                if (((Collection) this.c).contains(l)) {
                    ((ArrayList) this.b).add(e52Var2);
                    break;
                }
                break;
            default:
                uj3 uj3Var = (uj3) obj2;
                if (((Collection) this.c).contains(l)) {
                    ((Map) this.b).put(l, uj3Var);
                    break;
                }
                break;
        }
    }
}
