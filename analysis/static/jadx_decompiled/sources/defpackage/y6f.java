package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class y6f implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7f b;

    public /* synthetic */ y6f(d7f d7fVar, int i) {
        this.a = i;
        this.b = d7fVar;
    }

    @Override // defpackage.f6
    public final void run() {
        d7f d7fVar = this.b;
        switch (this.a) {
            case 0:
                hm9.m("c7f", "getUploadFromRepository: upload not found in cache,  uploadData=%s", d7fVar);
                break;
            default:
                hm9.k("c7f", "removeUploadFromRepository: finished for data=" + d7fVar);
                break;
        }
    }
}
