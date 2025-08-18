package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final /* synthetic */ class q12 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ q12() {
        this.a = 0;
        this.b = null;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((u82) obj).h = this.b;
                return e5f.a;
            case 1:
                ((u82) obj).g = this.b;
                return e5f.a;
            case 2:
                Intent intent = (Intent) obj;
                String str = this.b;
                if (str != null) {
                    intent.putExtra("external_callback_param_arg", str);
                }
                return e5f.a;
            case 3:
                mr0.X("watchdog-".concat(this.b), new i55((Runnable) obj, 2));
                return e5f.a;
            case 4:
                mr0.X("watchdog-".concat(this.b), new i55((Runnable) obj, 3));
                return e5f.a;
            default:
                String str2 = (String) obj;
                return Boolean.valueOf(str2.length() > 0 && jyc.a.r().h(str2, this.b));
        }
    }

    public /* synthetic */ q12(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
