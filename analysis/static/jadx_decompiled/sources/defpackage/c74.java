package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class c74 implements km7, ri8 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c74(Object obj, float f) {
        this.b = obj;
        this.a = f;
    }

    @Override // defpackage.ri8
    public void b(oh8 oh8Var) {
        ((si8) this.b).f.s.setPlaybackSpeed(this.a);
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ((gd) obj).n0((fd) this.b, this.a);
    }
}
