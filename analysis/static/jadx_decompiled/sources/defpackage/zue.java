package defpackage;

import javax.net.ssl.SSLException;

/* loaded from: classes2.dex */
public final /* synthetic */ class zue implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tve b;

    public /* synthetic */ zue(tve tveVar, int i) {
        this.a = i;
        this.b = tveVar;
    }

    @Override // defpackage.k56
    public final Object invoke() throws SSLException {
        switch (this.a) {
            case 0:
                Runnable delegatedTask = this.b.a.getDelegatedTask();
                if (delegatedTask != null) {
                    delegatedTask.run();
                    break;
                }
                break;
            case 1:
                this.b.a.beginHandshake();
                break;
            default:
                Runnable delegatedTask2 = this.b.a.getDelegatedTask();
                if (delegatedTask2 != null) {
                    delegatedTask2.run();
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
