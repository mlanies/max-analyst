package defpackage;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class kmf extends jy7 {
    public final /* synthetic */ int X;

    public kmf(int i, Class cls, int i2, int i3, int i4) {
        this.X = i4;
        this.a = i;
        this.o = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.jy7
    public final Object c(View view) {
        switch (this.X) {
            case 0:
                return tmf.b(view);
            case 1:
                return vmf.b(view);
            default:
                return Boolean.valueOf(tmf.c(view));
        }
    }

    @Override // defpackage.jy7
    public final void d(View view, Object obj) {
        switch (this.X) {
            case 0:
                tmf.h(view, (CharSequence) obj);
                break;
            case 1:
                vmf.f(view, (CharSequence) obj);
                break;
            default:
                tmf.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.jy7
    public final boolean h(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return true ^ ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }
}
