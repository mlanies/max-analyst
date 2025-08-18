package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class oc5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ oc5(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.f6
    public final void run() {
        boolean z = this.c;
        long j = this.b;
        switch (this.a) {
            case 0:
                hm9.m("sc5", "markAsFavorite: complete for setId=%d favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
                break;
            default:
                hm9.m("md5", "markAsFavorite: complete for stickerId=%d favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
                break;
        }
    }
}
