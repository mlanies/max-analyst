package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yu7 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv7 b;

    public /* synthetic */ yu7(mv7 mv7Var, int i) {
        this.a = i;
        this.b = mv7Var;
    }

    @Override // defpackage.on5
    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                final List list = (List) obj;
                final mv7 mv7Var = this.b;
                final int i = 0;
                Object objC = ema.C(new k56() { // from class: xu7
                    @Override // defpackage.k56
                    public final Object invoke() throws InterruptedException {
                        switch (i) {
                            case 0:
                                mv7Var.X.put(list);
                                break;
                            default:
                                mv7Var.Z.put(list);
                                break;
                        }
                        return e5f.a;
                    }
                }, continuation);
                if (objC != tx3.a) {
                    break;
                }
                break;
            default:
                final List list2 = (List) obj;
                final mv7 mv7Var2 = this.b;
                final int i2 = 1;
                Object objC2 = ema.C(new k56() { // from class: xu7
                    @Override // defpackage.k56
                    public final Object invoke() throws InterruptedException {
                        switch (i2) {
                            case 0:
                                mv7Var2.X.put(list2);
                                break;
                            default:
                                mv7Var2.Z.put(list2);
                                break;
                        }
                        return e5f.a;
                    }
                }, continuation);
                if (objC2 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
