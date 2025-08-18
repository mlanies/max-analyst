package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class n9c implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9c b;

    public /* synthetic */ n9c(p9c p9cVar, int i) {
        this.a = i;
        this.b = p9cVar;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                h9c h9cVar = (h9c) obj;
                p9c p9cVar = this.b;
                return new qa3(new ib3(new o28(p9cVar.b(), 2, new y98(p9cVar, 26, h9cVar)), 2, l9c.a(h9cVar, 0L)), 2, new n9c(p9cVar, 1));
            default:
                e9c e9cVar = (e9c) obj;
                p9c p9cVar2 = this.b;
                e9cVar.c = ((hyc) p9cVar2.b).n();
                return new qa3(p9cVar2.b(), 2, new yt8(26, e9cVar));
        }
    }
}
