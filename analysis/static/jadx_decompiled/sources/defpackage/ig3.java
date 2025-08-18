package defpackage;

/* loaded from: classes2.dex */
public final class ig3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg3 b;
    public final /* synthetic */ gg3 c;

    public /* synthetic */ ig3(jg3 jg3Var, gg3 gg3Var, int i) {
        this.a = i;
        this.b = jg3Var;
        this.c = gg3Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m56 onAnimationEnded = this.b.getOnAnimationEnded();
                if (onAnimationEnded != null) {
                    onAnimationEnded.invoke(this.c);
                }
                break;
            case 1:
                m56 onAnimationEnded2 = this.b.getOnAnimationEnded();
                if (onAnimationEnded2 != null) {
                    onAnimationEnded2.invoke(this.c);
                }
                break;
            default:
                jg3 jg3Var = this.b;
                jg3Var.L0();
                m56 onAnimationEnded3 = jg3Var.getOnAnimationEnded();
                if (onAnimationEnded3 != null) {
                    onAnimationEnded3.invoke(this.c);
                }
                break;
        }
        return e5f.a;
    }
}
