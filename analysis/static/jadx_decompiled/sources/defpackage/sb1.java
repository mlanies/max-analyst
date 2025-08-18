package defpackage;

import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sb1 implements mn5 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ sb1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) throws Throwable {
        switch (this.a) {
            case 0:
                mn5[] mn5VarArr = (mn5[]) this.b;
                Object objH = oag.h(on5Var, new qb1(mn5VarArr, 0), new rb1(null, (sx3) this.c, (List) this.o, (vb1) this.X), continuation, mn5VarArr);
                if (objH != tx3.a) {
                    break;
                }
                break;
            case 1:
                Object objD = ((mn5) this.b).d(new p32(on5Var, (Comparator) this.c, (nx2) this.o, (Long) this.X, 2), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            case 2:
                Object objD2 = ((mn5) this.b).d(new p32(on5Var, (q27) this.c, (je7) this.o, (je7) this.X, 3), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
            case 3:
                Object objD3 = ((mn5) this.b).d(new p32(on5Var, (c67) this.c, (je7) this.o, (je7) this.X, 4), continuation);
                if (objD3 != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD4 = ((mn5) this.b).d(new p32(on5Var, (Comparator) this.c, (eya) this.o, (Long) this.X, 5), continuation);
                if (objD4 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
