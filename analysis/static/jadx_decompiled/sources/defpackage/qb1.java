package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class qb1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5[] b;

    public /* synthetic */ qb1(mn5[] mn5VarArr, int i) {
        this.a = i;
        this.b = mn5VarArr;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new uj3[this.b.length];
            case 1:
                return new List[this.b.length];
            case 2:
                return new Object[this.b.length];
            case 3:
                return new uj3[this.b.length];
            case 4:
                return new kba[this.b.length];
            default:
                return new rya[this.b.length];
        }
    }
}
