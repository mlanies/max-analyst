package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ydf implements q16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ sj3 c;

    public /* synthetic */ ydf(Runnable runnable, sj3 sj3Var, int i) {
        this.a = i;
        this.b = runnable;
        this.c = sj3Var;
    }

    @Override // defpackage.q16
    public final void b(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                bef befVar = (bef) bundle.getParcelable("VideoCompressionModeDialog:result:key");
                if (befVar == null) {
                    return;
                }
                if (befVar.equals(zdf.a)) {
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                if (!(befVar instanceof aef)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.c.accept(((aef) befVar).a);
                return;
            default:
                okf okfVar = (okf) bundle.getParcelable("VideoQualityPickerDialog:result:key");
                if (okfVar == null) {
                    return;
                }
                if (okfVar.equals(mkf.a)) {
                    Runnable runnable2 = this.b;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                if (!(okfVar instanceof nkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.c.accept(((nkf) okfVar).a);
                return;
        }
    }
}
