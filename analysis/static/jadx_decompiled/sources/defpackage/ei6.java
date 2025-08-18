package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class ei6 extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei6(int i, k56 k56Var) {
        super(0);
        this.a = i;
        this.b = k56Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                try {
                    return (List) this.b.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return nz4.a;
                }
            default:
                return (ynf) this.b.invoke();
        }
    }
}
