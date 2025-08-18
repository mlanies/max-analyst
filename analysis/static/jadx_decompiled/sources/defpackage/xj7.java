package defpackage;

import one.me.android.deeplink.LinkInterceptorWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class xj7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkInterceptorWidget b;

    public /* synthetic */ xj7(LinkInterceptorWidget linkInterceptorWidget, int i) {
        this.a = i;
        this.b = linkInterceptorWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        LinkInterceptorWidget linkInterceptorWidget = this.b;
        switch (this.a) {
            case 0:
                int i = LinkInterceptorWidget.o;
                return new rg1(new khe(new xj7(linkInterceptorWidget, 1)), new l5g(linkInterceptorWidget, 0));
            default:
                int i2 = LinkInterceptorWidget.o;
                return linkInterceptorWidget.getRouter();
        }
    }
}
