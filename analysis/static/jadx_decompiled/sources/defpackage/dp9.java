package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class dp9 extends yh7 {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp9(Context context, int i) {
        super(context);
        this.p = i;
    }

    @Override // defpackage.yh7
    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.yh7
    public int h() {
        switch (this.p) {
            case 0:
                return -1;
            default:
                return super.h();
        }
    }
}
