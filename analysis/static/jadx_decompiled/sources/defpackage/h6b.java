package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h6b extends LinearLayout {
    public final boolean a;

    public h6b(Context context, boolean z) {
        super(context);
        this.a = z;
        setElevation(fk4.d().getDisplayMetrics().density * 12.0f);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
        setOrientation(1);
        float f = 4;
        setPadding(getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingRight(), tu0.G(f * fk4.d().getDisplayMetrics().density));
        v3c.y(new r1b(context, (Continuation) null, 3), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fka getCurrentTheme() {
        boolean z = this.a;
        pq9 pq9Var = qp4.u0;
        return z ? pq9Var.p(this).c : pq9Var.j(this);
    }
}
