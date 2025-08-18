package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class qg8 implements Runnable {
    public final /* synthetic */ sg8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ wd6 b;
    public final /* synthetic */ zf8 c;
    public final /* synthetic */ Collection o;

    public /* synthetic */ qg8(sg8 sg8Var, wd6 wd6Var, zf8 zf8Var, ArrayList arrayList, int i) {
        this.a = i;
        this.X = sg8Var;
        this.b = wd6Var;
        this.c = zf8Var;
        this.o = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A(this.X, this.c, (ArrayList) this.o);
                break;
            default:
                this.b.A(this.X, this.c, (ArrayList) this.o);
                break;
        }
    }
}
