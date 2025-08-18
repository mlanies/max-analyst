package defpackage;

/* loaded from: classes.dex */
public final class xk0 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;

    public /* synthetic */ xk0(int i) {
        this.a = i;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
                sb.append(this.b);
                sb.append(", mFlexLinePosition=");
                sb.append(this.d);
                sb.append(", mPosition=");
                sb.append(this.e);
                sb.append(", mOffset=");
                sb.append(this.f);
                sb.append(", mScrollingOffset=");
                sb.append(this.g);
                sb.append(", mLastScrollDelta=");
                sb.append(this.h);
                sb.append(", mItemDirection=");
                sb.append(this.i);
                sb.append(", mLayoutDirection=");
                return au1.h(sb, this.j, '}');
            default:
                return super.toString();
        }
    }
}
