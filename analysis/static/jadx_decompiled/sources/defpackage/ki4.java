package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ki4 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5[] b;

    public /* synthetic */ ki4(mn5[] mn5VarArr, int i) {
        this.a = i;
        this.b = mn5VarArr;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) throws Throwable {
        switch (this.a) {
            case 0:
                mn5[] mn5VarArr = this.b;
                Object objH = oag.h(on5Var, new qb1(mn5VarArr, 1), new ji4(3, null, 0), continuation, mn5VarArr);
                if (objH != tx3.a) {
                    break;
                }
                break;
            case 1:
                mn5[] mn5VarArr2 = this.b;
                Object objH2 = oag.h(on5Var, new qb1(mn5VarArr2, 2), new ji4(3, null, 1), continuation, mn5VarArr2);
                if (objH2 != tx3.a) {
                    break;
                }
                break;
            case 2:
                mn5[] mn5VarArr3 = this.b;
                Object objH3 = oag.h(on5Var, new qb1(mn5VarArr3, 4), new ji4(3, null, 2), continuation, mn5VarArr3);
                if (objH3 != tx3.a) {
                    break;
                }
                break;
            default:
                mn5[] mn5VarArr4 = this.b;
                Object objH4 = oag.h(on5Var, new qb1(mn5VarArr4, 5), new ji4(3, null, 3), continuation, mn5VarArr4);
                if (objH4 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
