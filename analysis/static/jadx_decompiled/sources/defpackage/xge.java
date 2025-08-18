package defpackage;

/* loaded from: classes2.dex */
public final class xge implements wge {
    public m56 a;
    public k56 b;

    @Override // defpackage.wge
    public final k56 getOnRequestInterceptTouchEvent() {
        return this.b;
    }

    @Override // defpackage.wge
    public final m56 getOnTouch() {
        return this.a;
    }

    @Override // defpackage.wge
    public final void setOnRequestInterceptTouchEvent(k56 k56Var) {
        this.b = k56Var;
    }

    @Override // defpackage.wge
    public final void setOnTouch(m56 m56Var) {
        this.a = m56Var;
    }
}
