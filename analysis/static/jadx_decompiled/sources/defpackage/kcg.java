package defpackage;

import com.my.tracker.obfuscated.b1;
import com.my.tracker.obfuscated.n;
import com.my.tracker.obfuscated.t;

/* loaded from: classes.dex */
public final /* synthetic */ class kcg implements n {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ kcg(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // com.my.tracker.obfuscated.n
    public final void a(Object obj) {
        int i = this.a;
        t tVar = this.b;
        switch (i) {
            case 0:
                tVar.b((Boolean) obj);
                break;
            case 1:
                tVar.c((Boolean) obj);
                break;
            case 2:
                tVar.a((b1) obj);
                break;
            default:
                tVar.c((b1) obj);
                break;
        }
    }
}
