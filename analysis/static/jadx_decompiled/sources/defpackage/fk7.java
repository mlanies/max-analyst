package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class fk7 implements dk7 {
    public final /* synthetic */ kk7 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fk7(kk7 kk7Var, Object obj) {
        this.a = kk7Var;
        this.b = obj;
    }

    @Override // defpackage.dk7
    public void b(View view, String str) {
        this.a.b(view, str, lk7.Y, (ClickableSpan) this.b);
    }
}
