package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class b75 implements jm7, km7, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ b75(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        x4b x4bVar = (x4b) obj;
        switch (this.a) {
            case 3:
                x4bVar.setPlaybackSpeed(this.b);
                break;
            default:
                x4bVar.g(this.b);
                break;
        }
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((m3b) obj).f(this.b);
                break;
            case 1:
                ((n3b) obj).f(this.b);
                break;
            default:
                ((n3b) obj).f(this.b);
                break;
        }
    }
}
