package defpackage;

import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class xx8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ xx8(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        String str = this.b;
        switch (this.a) {
            case 0:
                return str;
            default:
                bc7[] bc7VarArr = ShareDataPickerScreen.D0;
                return new spa(null, 2, null, null, str != null ? br7.f(new kpa("link_source", str)) : null, 13);
        }
    }
}
